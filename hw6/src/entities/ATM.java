package entities;


import entities.exceptions.InsufficientFundsException;
import entities.exceptions.InvalidWithdrawalAmountException;

import java.util.HashMap;
import java.util.Map;

public class ATM {
    private static int[] DENOMINATIONS = new int[]{500, 200, 100, 50, 20, 10, 5, 2, 1};

    private Map<Integer, Integer> banknotes; // Номинал банкнот и количество
    private int minWithdrawalAmount;
    private int maxBanknotesToDispense;


    public ATM(int minWithdrawalAmount, int maxBanknotesToDispense) {
        this.minWithdrawalAmount = minWithdrawalAmount;
        this.maxBanknotesToDispense = maxBanknotesToDispense;
        this.banknotes = new HashMap<>();
    }

    public int getAtmBalance(){
        int balance = 0;

        for (var denomination : DENOMINATIONS)
        {
            balance += banknotes.getOrDefault(denomination, 0) * denomination;
        }

        return balance;
    }

    public void loadMoney(int denomination, int count) {
        banknotes.put(denomination, banknotes.getOrDefault(denomination, 0) + count);
    }

    public void inputMoney(Map<Integer, Integer> money) {
        for (Map.Entry<Integer, Integer> entry : money.entrySet()) {
            banknotes.put(entry.getKey(), banknotes.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }
    }

    public Map<Integer, Integer> withdrawMoney(int amount)
            throws InsufficientFundsException, InvalidWithdrawalAmountException {
        if (amount % minWithdrawalAmount != 0) {
            throw new InvalidWithdrawalAmountException("Amount must be a multiple of " + minWithdrawalAmount);
        }

        int remainingAmount = amount;
        Map<Integer, Integer> withdrawal = new HashMap<>();

        //проходимся по каждому номиналу
        for (int denomination : DENOMINATIONS) {
            //достаем из банкомата информацию по существующим банкнотам
            int availableBanknotes = banknotes.getOrDefault(denomination, 0);
            int banknotesToDispense = Math.min(remainingAmount / denomination, availableBanknotes);

            if (banknotesToDispense > 0) {
                withdrawal.put(denomination, banknotesToDispense);
                banknotes.put(denomination, availableBanknotes - banknotesToDispense);
                remainingAmount -= denomination * banknotesToDispense;
            }

            if (remainingAmount == 0) {
                break;
            }
        }

        if (remainingAmount != 0) {
            throw new InsufficientFundsException("Not enough banknotes to dispense the requested amount");
        }

        return withdrawal;
    }


    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("ATM Balance: ").append(getAtmBalance()).append("\n");
        info.append("Minimum Withdrawal Amount: ").append(minWithdrawalAmount).append("\n");
        info.append("Maximum Banknotes to Dispense: ").append(maxBanknotesToDispense).append("\n");
        return info.toString();
    }

    public Map<Integer, Integer> getBanknotes() {
        return banknotes;
    }

    public void setBanknotes(Map<Integer, Integer> banknotes) {
        this.banknotes = banknotes;
    }

    public int getMinWithdrawalAmount() {
        return minWithdrawalAmount;
    }

    public void setMinWithdrawalAmount(int minWithdrawalAmount) {
        this.minWithdrawalAmount = minWithdrawalAmount;
    }

    public int getMaxBanknotesToDispense() {
        return maxBanknotesToDispense;
    }

    public void setMaxBanknotesToDispense(int maxBanknotesToDispense) {
        this.maxBanknotesToDispense = maxBanknotesToDispense;
    }
}