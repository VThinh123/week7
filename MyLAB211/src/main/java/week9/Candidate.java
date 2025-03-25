/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public abstract class Candidate {
    private String candidateId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate() {
    }

    public Candidate(String candidateId, String firstName, String lastName, 
                    String birthDate, String address, String phone, 
                    String email, int candidateType) {
        this.candidateId = candidateId;
        this.firstName = firstName;
        this.lastName = lastName;
        setBirthDate(birthDate);
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    // Abstract method để các lớp con triển khai
    public abstract void showInfo();

    // Getter và Setter
    public String getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(String candidateId) {
        this.candidateId = candidateId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy");
        this.birthDate = LocalDate.parse(birthDate, formatter);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCandidateTypeName() {
        switch (candidateType) {
            case 0: return "Experience";
            case 1: return "Fresher";
            case 2: return "Intern";
            default: return "Unknown";
        }
    }
}