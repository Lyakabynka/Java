package entities;

import entities.exceptions.ATMNotFoundException;
import entities.exceptions.InsufficientFundsException;
import entities.exceptions.InvalidWithdrawalAmountException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;

public class Bank {
    private ArrayList<ATM> atms;

    public Bank(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    public void addATM(ATM atm) {
        atms.add(atm);
    }

    public Map<Integer, Integer> withdraw(int atmIndex, int amount)
            throws InvalidWithdrawalAmountException, InsufficientFundsException, ATMNotFoundException {
        try {
            return atms.get(atmIndex).withdrawMoney(amount);
        }
        catch(IndexOutOfBoundsException ex)
        {
            throw new ATMNotFoundException("ATM with given index was not found.");
        }
    }

    public void loadATM(int atmIndex, Map<Integer, Integer> money) {
        atms.get(atmIndex).inputMoney(money);
    }

    public int getTotalBankBalance() {
        int totalBalance = 0;
        for (ATM atm : atms) {
            totalBalance += atm.getAtmBalance();
        }
        return totalBalance;
    }

    public ArrayList<ATM> getAtms() {
        return atms;
    }

    public void setAtms(ArrayList<ATM> atms) {
        this.atms = atms;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder("Bank Information:\n");
        info.append("<=========================>").append('\n');
        for (int i = 0; i < atms.size(); i++) {
            info.append("ATM ").append(i).append(":\n").append(atms.get(i).toString());
            info.append("<------------------------->").append('\n');
        }
        info.append("Total bank balance: ").append(getTotalBankBalance()).append('\n');
        info.append("<=========================>").append('\n');
        return info.toString();
    }
}
