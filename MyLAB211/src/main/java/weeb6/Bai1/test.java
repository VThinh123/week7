/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb6.Bai1;

import java.util.Scanner;
import static week4.Utils.isNumber;

/**
 *
 * @author LENOVO LEGION
 */
public class test {

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add contact");
            System.out.println("2. Show all contact");
            System.out.println("3. Delete contact by ID");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter full name");
                    String fullname = sc.nextLine();
                    System.out.println("Enter group");
                    String group = sc.nextLine();
                    System.out.println("Enter address");
                    String address = sc.nextLine();

                    while (true) {
                        System.out.println("Enter phone");
                        String phone = sc.nextLine();
                        if (manager.addContact(fullname, group, address, phone)) {
                            System.out.println("Successful");
                            break;
                        }
                    }
                    break;
                case 2:
                    manager.displayAll();
                    break;
                case 3:
                    System.out.println("Enter id");
                    String id = sc.nextLine();
                    if(isNumber(id)){
                        int ID = Integer.parseInt(id);
                        if (manager.deleteContact(ID)) {
                        System.out.println("Successful");
                        break;
                    } else {
                        System.out.println("Fall");
                    }
                    }
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
