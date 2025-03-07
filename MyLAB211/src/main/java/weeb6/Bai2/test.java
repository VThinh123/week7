/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb6.Bai2;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class test {

    public static void main(String[] args) {
        ManagerWorker managerWorkers = new ManagerWorker();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add contact");
            System.out.println("2. Show all contact");
            System.out.println("3. Delete contact by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.println("Enter Code");
                        String code = sc.nextLine();
                        System.out.println("Enter Name");
                        String name = sc.nextLine();
                        System.out.println("Enter age");
                        int age = sc.nextInt();
                        System.out.println("Enter Salary");
                        double salary = sc.nextDouble();
                        System.out.println("");
                        System.out.println("Enter Status");
                        String status = sc.nextLine();
                        System.out.println("Add date work dd/mm/yyyy:");
                        String date = sc.nextLine();
                        Worker workers = new Worker(code, name, age, salary, status, date);
                        if (managerWorkers.addWorker(workers)) {
                            System.out.println("Successful");
                            break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter code to increase salary");
                    String code = sc.nextLine();
                    System.out.println("");
                    System.out.println("Enter amount of salary:");
                    double up = sc.nextDouble();
                    if (managerWorkers.increaseSalary(code, up)) {
                        System.out.println("Increase salary success!");
                        break;
                    } else {
                        System.out.println("Error increase");
                    }
                    break;
                case 3:
                    System.out.println("Enter code to increase salary");
                    String code1 = sc.nextLine();
                    System.out.println("");
                    System.out.println("Enter amount of salary:");
                    double up1 = sc.nextDouble();
                    if (managerWorkers.decreaseSalary(code1, up1)) {
                        System.out.println("Decrease salary success!");
                        break;
                    } else {
                        System.out.println("Error Decrease");
                    }
                    break;
                case 4:
                    managerWorkers.showWorkers();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice > 0 && choice < 5);
    }

}
