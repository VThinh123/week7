/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.bai1;

public class CountryDisplay {
    public static void displayCountry(EastAsiaCountries country) {
        country.display();
    }

    public static void displayCountries(EastAsiaCountries[] countries) {
        for (EastAsiaCountries country : countries) {
            displayCountry(country);
        }
    }

    public static void displayMenu() {
        System.out.println("\nMENU");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.print("Please choose an option: ");
    }
}
