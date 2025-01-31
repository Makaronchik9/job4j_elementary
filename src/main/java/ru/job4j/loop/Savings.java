package ru.job4j.loop;

public class Savings {
    public static int years(double goal, double annualDeposit, double percent) {
        double balance = 0;
        int years = 0;

        do {
            balance += annualDeposit;
            balance += balance * (percent / 100);
            years++;
        } while (balance < goal);

        return years;
    }
}

