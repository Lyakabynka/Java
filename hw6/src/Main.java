import entities.ATM;
import entities.Bank;
import entities.exceptions.ATMNotFoundException;
import entities.exceptions.InsufficientFundsException;
import entities.exceptions.InvalidWithdrawalAmountException;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<ATM> atms = new ArrayList<>();
        ATM atm = new ATM(5, 100);
        atms.add(atm);

        Bank bank = new Bank(atms); // Создание банка

        System.out.println(bank);

        // Загрузка денег в банкоматы
        Map<Integer, Integer> atmMoney = new HashMap<>();
        atmMoney.put(200, 15);
        atmMoney.put(50, 30);
        atmMoney.put(100, 25);
        atmMoney.put(10, 50);
        atmMoney.put(500, 10);
        bank.loadATM(0, atmMoney);

        // Пример снятия денег с банкомата
        try {
            Map<Integer, Integer> withdrawal = bank.withdraw(0,1);
            System.out.println("Withdrawn money: " + withdrawal);
        } catch (InsufficientFundsException |
                 InvalidWithdrawalAmountException |
                 ATMNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Вывод общего баланса банка
        System.out.println(bank.toString());
    }
}