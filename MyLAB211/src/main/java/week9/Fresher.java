/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;


public class Fresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
        super();
    }

    public Fresher(String candidateId, String firstName, String lastName, 
                   String birthDate, String address, String phone, 
                   String email, String graduationDate, String graduationRank, 
                   String education) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 1);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    @Override
    public void showInfo() {
        System.out.println(getFullName() + " | " + getBirthDate().getYear() + " | " + 
                         getAddress() + " | " + getPhone() + " | " + 
                         getEmail() + " | " + getCandidateTypeName());
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
        System.out.println("Education: " + education);
    }

    // Getter và Setter
    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }
}