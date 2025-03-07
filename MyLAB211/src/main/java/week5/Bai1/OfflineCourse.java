/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.Bai1;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LENOVO LEGION
 */
public class OfflineCourse extends Course {

    private LocalDate begin;
    private LocalDate end;
    private String campus;

    public OfflineCourse() {
        super();
        this.begin = null;
        this.end = null;
        this.campus = "";
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public void InputAll() {
        Scanner sc = new Scanner(System.in);
        super.InputAll();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

        while (true) {
            System.out.println("Enter day begin(dd/mm/yyyy): ");
            this.begin = LocalDate.parse(sc.nextLine(), formatter);
            System.out.println("Enter day end(dd/mm/yyyy): ");
            this.end = LocalDate.parse(sc.nextLine(), formatter);
            if (end.isAfter(begin)) {
                break;
            }
            System.out.println("End must be after begin! Pls enter again:");
        }

        while (true) {
            System.out.print("Campus: ");
            this.campus = sc.nextLine().trim();
            if (!this.campus.isEmpty()) {
                break;
            }
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "OfflineCourse{" + "begin=" + begin + ", end=" + end + ", campus=" + campus + '}';
    }

}
