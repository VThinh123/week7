/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

public class Intern extends Candidate {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
        super();
    }

    public Intern(String candidateId, String firstName, String lastName, 
                  String birthDate, String address, String phone, 
                  String email, String majors, String semester, 
                  String universityName) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 2);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.println(getFullName() + " | " + getBirthDate().getYear() + " | " + 
                         getAddress() + " | " + getPhone() + " | " + 
                         getEmail() + " | " + getCandidateTypeName());
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University Name: " + universityName);
    }

    // Getter và Setter
    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}