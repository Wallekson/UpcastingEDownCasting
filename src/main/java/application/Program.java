package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;


public class Program {

    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex",1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003,"Bob", 1000.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        acc.widhdraw(200.0);
        System.out.println(acc.getBalance());

        Account acc6 = new SavingsAccount(1002, "Maria", 1000.0, 0.01 );
        acc6.widhdraw(200.0);
        System.out.println(acc6.getBalance());

        acc2.widhdraw(200.0);
        System.out.println(acc2.getBalance());

        Account x = new Account(1002, "Alex", 1000.0);
        Account y = new SavingsAccount(1003,"Maria", 1000.0, 0.01 );

        x.widhdraw(50.0);
        y.widhdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());



    }
}
