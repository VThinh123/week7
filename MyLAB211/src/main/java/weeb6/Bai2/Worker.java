/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package weeb6.Bai2;

/**
 *
 * @author LENOVO LEGION
 */
public class Worker {
    private String code;
    private String name;
    private int age;
    private double salary;
    private String status;
    private String date;

    public Worker(String code, String name, int age, double salary, String status, String date) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    @Override
    public String toString() {
        return "Worker{" + "code=" + code + ", name=" + name + ", age=" + age + ", salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }

    
    
}
