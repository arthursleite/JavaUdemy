package application;

import entities.Department;
import entities.Worker;
import entitites.enums.WorkerLevel;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.print("Enter work data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.println("Level: ");
        String workerLevel = sc.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
        
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + i + " data: ");
        }
    }

}
