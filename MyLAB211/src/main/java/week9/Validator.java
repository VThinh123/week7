/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;


import java.time.LocalDate;
import java.util.regex.Pattern;

public class Validator {
    public static boolean validateBirthDate(String birthDate) {
        try {
            int year = Integer.parseInt(birthDate);
            int currentYear = LocalDate.now().getYear();
            return birthDate.length() == 4 && year >= 1900 && year <= currentYear;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean validatePhone(String phone) {
        return phone.matches("\\d{10,}");
    }

    public static boolean validateEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return Pattern.matches(emailRegex, email);
    }

    public static boolean validateExpInYear(int expInYear) {
        return expInYear >= 0 && expInYear <= 100;
    }

    public static boolean validateGraduationRank(String rank) {
        return rank.equals("Excellence") || rank.equals("Good") || 
               rank.equals("Fair") || rank.equals("Poor");
    }
}
