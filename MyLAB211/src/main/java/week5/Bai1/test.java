/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.Bai1;

/**
 *
 * @author LENOVO LEGION
 */
public class test {
    public static void main(String[] args) {
        CourseManagerment courseManagerment = new CourseManagerment();
        OnlineCourse onlineCourse1 = new OnlineCourse();
        OnlineCourse onlineCourse2 = new OnlineCourse();
        onlineCourse1.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse1);
        
        onlineCourse2.InputAll(); 
        courseManagerment.addOnlineCourse(onlineCourse2);
        
        courseManagerment.showOnlineCourse();
    }
}
