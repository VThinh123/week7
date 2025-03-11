/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.bai2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReservationManager {
    private List<Reservation> reservations = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void createReservation() {
        System.out.println("*** Create new reservation ***");

        // Nhập bookingID
        String bookingID;
        while (true) {
            System.out.print("ID: ");
            bookingID = scanner.nextLine();
            if (bookingID.matches("\\d{6}") && isUniqueID(bookingID)) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        // Nhập customerName
        String customerName;
        while (true) {
            System.out.print("Name: ");
            customerName = scanner.nextLine();
            if (customerName.matches("[a-zA-Z\\s]+")) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        // Nhập phoneNumber
        String phoneNumber;
        while (true) {
            System.out.print("Phone: ");
            phoneNumber = scanner.nextLine();
            if (phoneNumber.matches("\\d{12}")) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        // Nhập roomNumber
        String roomNumber;
        while (true) {
            System.out.print("RoomNumber: ");
            roomNumber = scanner.nextLine();
            if (roomNumber.matches("\\d{4}")) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        // Nhập bookingDate
        LocalDate bookingDate;
        while (true) {
            System.out.print("BookingDate (dd/MM/yyyy): ");
            String dateInput = scanner.nextLine();
            bookingDate = LocalDate.parse(dateInput, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            if (bookingDate.isAfter(LocalDate.now())) {
                break;
            }
            System.out.println("Data input is invalid");
        }

        // Nhập thông tin chuyến bay (nếu có)
        FlightInformation flightInformation = null;
        System.out.print("Need airport pick up? (Y/N): ");
        String needPickUp = scanner.nextLine();
        if (needPickUp.equalsIgnoreCase("Y")) {
            System.out.print("Flight: ");
            String flightNumber = scanner.nextLine();
            System.out.print("Seat: ");
            String seatNumber = scanner.nextLine();

            LocalDateTime timePickUp;
            while (true) {
                System.out.print("TimePickUp (dd/MM/yyyy HH:mm a): ");
                String timeInput = scanner.nextLine();
                timePickUp = LocalDateTime.parse(timeInput, java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm a"));
                if (timePickUp.isAfter(LocalDateTime.now()) && timePickUp.isBefore(bookingDate.atStartOfDay())) {
                    break;
                }
                System.out.println("Data input is invalid");
            }

            flightInformation = new FlightInformation(flightNumber, seatNumber, timePickUp);
        }

        // Tạo đối tượng Reservation và thêm vào danh sách
        Reservation reservation = new Reservation(bookingID, customerName, phoneNumber, roomNumber, bookingDate, flightInformation);
        reservations.add(reservation);
        System.out.println("Information saved successfully.");
    }

    private boolean isUniqueID(String bookingID) {
        for (Reservation reservation : reservations) {
            if (reservation.getBookingID().equals(bookingID)) {
                return false;
            }
        }
        return true;
    }
}