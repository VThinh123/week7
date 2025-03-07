/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Utilizer {

    static Scanner scanner = new Scanner(System.in);

    public static int checkNumber() {
        while (true) {
            System.out.println("Enter a number: ");
            try {
                int input = Integer.parseInt(scanner.nextLine());
                if (input < 2) 
                throw new IllegalArgumentException("error");
//                continue;
                  return input;

            } catch (Exception e) {

                System.out.println("error ");

            }
        }
    }

}
