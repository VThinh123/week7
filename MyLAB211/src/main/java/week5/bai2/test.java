/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.bai2;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class test {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("*** Reservation Management ***");
            System.out.println("1. Create new reservation");
            System.out.println("2. Update reservation");
            System.out.println("3. Delete reservation");
            System.out.println("4. Print Flight Information");
            System.out.println("5. Print all");
            System.out.println("6. Exit");
            System.out.print("You choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    manager.createReservation();
                    break;
                case 2:
                    // Cập nhật thông tin
                    break;
                case 3:
                    // Xóa thông tin
                    break;
                case 4:
                    // In thông tin chuyến bay
                    break;
                case 5:
                    // In tất cả thông tin
                    break;
                case 6:
                    System.out.println("BYE AND SEE YOU NEXT TIME");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
