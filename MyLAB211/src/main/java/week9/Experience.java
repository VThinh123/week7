/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

public class Experience extends Candidate {
    private int expInYear;
    private String proSkill;

    public Experience() {
        super();
    }

    public Experience(String candidateId, String firstName, String lastName, 
                      String birthDate, String address, String phone, 
                      String email, int expInYear, String proSkill) {
        super(candidateId, firstName, lastName, birthDate, address, phone, email, 0);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println(getFullName() + " | " + getBirthDate().getYear() + " | " + 
                         getAddress() + " | " + getPhone() + " | " + 
                         getEmail() + " | " + getCandidateTypeName());
        System.out.println("Years of Experience: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }

    // Getter và Setter
    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }
}