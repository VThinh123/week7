/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.Bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO LEGION
 */
public class CourseManagerment {

    private List<OnlineCourse> onlineCourse = new ArrayList<>();

    public void addOnlineCourse(OnlineCourse c) {
        //cần kiểm tra dữ liệu đó có tồn tại trong online course list
        for (OnlineCourse a : onlineCourse) {
            if (a.getCourseID().equals(c.getCourseID())) {
                System.out.println("Course ID is already exit");
                return;
            }
        }
        onlineCourse.add(c);
        System.out.println("add success");
    }

    public int deleteOnlineCourse(String idCourse) {
        // viet code để remove
        int result = 0;
        for (OnlineCourse on : onlineCourse) {
            if (on.getCourseID().equals(idCourse)) {
                onlineCourse.remove(on);
                result = 1;
            }
        }
        return result;
    }

    public void updateOnlineCourse(OnlineCourse idCourse) {
        // viết code để update
        for (int i = 0; i < onlineCourse.size(); i++) {
            if (onlineCourse.get(i).getCourseID().equals(idCourse.courseID)) {
                onlineCourse.set(i, idCourse);
            }
        }
    }

    public void showOnlineCourse() {
        for (OnlineCourse c : onlineCourse) {
            System.out.println("Danh sach hoc sinh");
            System.out.println(c.toString());
        }
    }
}
