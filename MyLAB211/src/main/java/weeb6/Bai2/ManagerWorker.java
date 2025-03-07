/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb6.Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO LEGION
 */
public class ManagerWorker {
    private List<Worker> workers = new ArrayList<>();

    public boolean addWorker(Worker wr){
        for(Worker w: workers){
            if(w.getCode().equals(wr.getCode()) || wr.getCode().equals(" ")){
                System.out.println("Code already exit");
                return false;
            }
            if(wr.getAge() <=18 && wr.getAge()>= 50){
                System.out.println("Error age");
                return false;
            }
            if(wr.getSalary() <= 0){
                System.out.println("Error salary");
                return false;
            }
        }
        workers.add(wr);
        System.out.println("Add success");
        return true;
    }
    
    public boolean increaseSalary(String code, double upSalary){
        for(Worker w: workers){
            if(w.getCode().equals(code) && upSalary > 0){
               w.setSalary(upSalary);
               return true;
            }
        }
        return false;
    }
    
    public boolean decreaseSalary(String code, double deSalary){
               for(Worker w: workers){
            if(w.getCode().equals(code) && deSalary > 0){
               w.setSalary(deSalary);
               return true;
            }
        }
        return false; 
    }
    public void showWorkers(){
        for(Worker w : workers){
            System.out.println(w.toString());
        }
    }
    
    
}
