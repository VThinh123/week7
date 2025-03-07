/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.Bai1;

import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Course {

    protected String courseID;
    protected String courseName;
    protected int credits;

    public Course() {
        this.courseID = "";
        this.courseName = "";
        this.credits = 0;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void InputAll() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Course ID: ");
            this.courseID = sc.nextLine().trim();
            if (!this.courseID.isEmpty()) break;
            System.out.println("Data input is invalid");
        }
        
        while (true) {
            System.out.print("Course Name: ");
            this.courseName = sc.nextLine().trim();
            if (!this.courseName.isEmpty()) break;
            System.out.println("Data input is invalid");
        }
        
        while (true) {
            System.out.print("Credits: ");
            this.credits = Integer.parseInt(sc.nextLine());
            if (this.credits > 0) break;
            System.out.println("Data input is invalid");
        }
    }

    @Override
    public String toString() {
        return "Course{" + "courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits + '}';
    }

}
