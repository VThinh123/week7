/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class ManageEastAsiaCountries {
    private List<EastAsiaCountries> countries = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addCountryInformation(EastAsiaCountries country) throws Exception {
        CountryValidator.validate(country);
        countries.add(country);
    }

    public EastAsiaCountries getRecentlyEnteredInformation() throws Exception {
        if (countries.isEmpty()) {
            throw new Exception("No country information available");
        }
        return countries.get(countries.size() - 1);
    }

    public EastAsiaCountries[] searchInformationByName(String name) throws Exception {
        List<EastAsiaCountries> result = new ArrayList<>();
        for (EastAsiaCountries country : countries) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                result.add(country);
            }
        }
        if (result.isEmpty()) {
            throw new Exception("No country found with name: " + name);
        }
        return result.toArray(new EastAsiaCountries[0]);
    }

    public EastAsiaCountries[] sortInformationByAscendingOrder() throws Exception {
        if (countries.isEmpty()) {
            throw new Exception("No country information available");
        }
        
        List<EastAsiaCountries> sortedList = new ArrayList<>(countries);
        Collections.sort(sortedList, Comparator.comparing(EastAsiaCountries::getCountryName));
        
        return sortedList.toArray(new EastAsiaCountries[0]);
    }

    public void run() {
        int choice;
        do {
            CountryDisplay.displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            try {
                switch (choice) {
                    case 1:
                        inputCountries();
                        break;
                    case 2:
                        displayRecentCountry();
                        break;
                    case 3:
                        searchCountryByName();
                        break;
                    case 4:
                        displaySortedCountries();
                        break;
                    case 5:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (choice != 5);
    }

    private void inputCountries() throws Exception {
        System.out.println("Enter information for 11 East Asia countries:");
        for (int i = 0; i < 11; i++) {
            System.out.println("Country " + (i + 1) + ":");
            
            System.out.print("Enter code of country: ");
            String code = scanner.nextLine();
            
            System.out.print("Enter name of country: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter total Area: ");
            float area = scanner.nextFloat();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Enter terrain of country: ");
            String terrain = scanner.nextLine();
            
            EastAsiaCountries country = new EastAsiaCountries(code, name, area, terrain);
            addCountryInformation(country);
            
            System.out.println("Country added successfully!\n");
        }
    }

    private void displayRecentCountry() throws Exception {
        EastAsiaCountries country = getRecentlyEnteredInformation();
        System.out.println("Recently entered country information:");
        CountryDisplay.displayCountry(country);
    }

    private void searchCountryByName() throws Exception {
        System.out.print("Enter the name you want to search for: ");
        String name = scanner.nextLine();
        
        EastAsiaCountries[] foundCountries = searchInformationByName(name);
        System.out.println("Search results:");
        CountryDisplay.displayCountries(foundCountries);
    }

    private void displaySortedCountries() throws Exception {
        EastAsiaCountries[] sortedCountries = sortInformationByAscendingOrder();
        System.out.println("Countries sorted by name (ascending):");
        CountryDisplay.displayCountries(sortedCountries);
    }
}