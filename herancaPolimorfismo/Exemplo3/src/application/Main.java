package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {
//        Account acc1 = new Account (1001, "Alex", 1000.0);
//        Não é possível instanciar uma classe abstrata
        
//        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
//        Account acc3 = new SavingsAccount(1003, "Bob", 1000.0, 500.0);
//        Essas são possíveis de instanciar
        
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();
        
        list.add(new SavingsAccount(1001, "Alex", 500.00, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.00, 400.0));
        list.add(new SavingsAccount(1004, "Bob", 300.00, 0.01));
        list.add(new BusinessAccount(1005, "Anna", 500.00, 500.0));
        
        double sum = 0.0;
        for (Account acc : list) {
            sum += acc.getBalance();
//            sum += acc.getBalance() == sum = sum + acc.getBalance()
        }
        System.out.printf("Total balance: %.2f%n", sum);
        for (Account acc : list) {
            acc.deposit(10.0);
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }

}
