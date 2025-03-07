/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class ManagerStudents {

    private List<Students> studentsList = new ArrayList<>();

    private boolean checkStudents(Students st) {
        //viet code
        //kiem tra sv da co ten trong danh sach chuaw, neu chua thi tra ve true con co thi tra ve false
        for(Students st0 : studentsList){
            if(st0.getID().equalsIgnoreCase(st.getID())){
                if(st0.getSemester().equalsIgnoreCase(st0.getSemester())){
                    if(st0.getCourse().equalsIgnoreCase(st0.getCourse())){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean addStudents(Students st) {
        Scanner sc = new Scanner(System.in);
        if(studentsList.size()>= 3){
            System.out.println("Do you want to add? (yes/no)");
            String ans = sc.nextLine().trim().toLowerCase();
            if(!ans.equals("yes")){
                System.out.println("Back to main screen");
                return false;
            }
        }
        if (checkStudents(st)) {
            studentsList.add(st);
            return true;
        }
        System.out.println("Students already exist in list");
        return false;
    }
    
    public void showStudents(){
        for(Students st : studentsList){
            System.out.println(st.toString());
        }
    }
    
    public List<Students> findStudents(String Name){
        //viet code dua ten hoc sinh tim duoc vao list
        List<Students> findList = new ArrayList<>();
        for(Students st : studentsList){
            if(st.getName().equalsIgnoreCase(Name)){
                findList.add(st);
            }
        }
        
        return findList;
    }
    
    public int deleteStudent(String id){
        //viet code de xoa
        int result = 0;
        for(Students st : studentsList){
            if(st.getID().equalsIgnoreCase(id)){
                studentsList.remove(st);
                result = 1;
            }
        }
        return result;
    }
    
    public int updateStudent(Students st){
        for(int i = 0; i< studentsList.size(); i++){
            if(studentsList.get(i).getID().equalsIgnoreCase(st.getID())){
                studentsList.set(i, st);
                return 1;
            }
        }
        return 0;
    }
    
    public void sortStudents(){
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students st1, Students st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });
    }
    
    public void reportStudent(){
        Map<String, Integer> report = new HashMap<>();
        for(Students st : studentsList){
        
            String key = st.getID()+ "|" + st.getName() + st.getCourse();
            report.put(key, report.getOrDefault(key, 0)+1);
        }
        for(Map.Entry<String, Integer> entry : report.entrySet()){
            System.out.println(entry.getKey()+ "|" + entry.getValue());
        }
    }
}
