/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.bai1;

public class CountryValidator {
    public static void validate(EastAsiaCountries country) throws Exception {
        if (country.getCountryCode() == null || country.getCountryCode().isEmpty()) {
            throw new Exception("Country code cannot be empty");
        }
        if (country.getCountryName() == null || country.getCountryName().isEmpty()) {
            throw new Exception("Country name cannot be empty");
        }
        if (country.getTotalArea() <= 0) {
            throw new Exception("Total area must be greater than 0");
        }
        if (country.getCountryTerrain() == null || country.getCountryTerrain().isEmpty()) {
            throw new Exception("Terrain cannot be empty");
        }
    }
}