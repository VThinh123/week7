/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CandidateManager {
    private List<Candidate> candidates = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createExperienceCandidate();
                    break;
                case 2:
                    createFresherCandidate();
                    break;
                case 3:
                    createInternCandidate();
                    break;
                case 4:
                    searchCandidate();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void displayMenu() {
        System.out.println("\nCANDIDATE MANAGEMENT SYSTEM");
        System.out.println("1. Experience");
        System.out.println("2. Fresher");
        System.out.println("3. Internship");
        System.out.println("4. Searching");
        System.out.println("5. Exit");
        System.out.print("(Please choose 1 to Create Experience Candidate, 2 to Create Fresher Candidate, ");
        System.out.println("3 to Internship Candidate, 4 to Searching and 5 to Exit program).");
        System.out.print("Enter your choice: ");
    }

    private void createExperienceCandidate() {
        System.out.println("\nCreating Experience Candidate:");
        String candidateId = inputCandidateId();
        String firstName = inputFirstName();
        String lastName = inputLastName();
        String birthDate = inputBirthDate();
        String address = inputAddress();
        String phone = inputPhone();
        String email = inputEmail();
        
        System.out.print("Enter years of experience (0-100): ");
        int expInYear = scanner.nextInt();
        scanner.nextLine();
        while (!Validator.validateExpInYear(expInYear)) {
            System.out.println("Invalid years of experience. Please enter a value between 0 and 100.");
            System.out.print("Enter years of experience (0-100): ");
            expInYear = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.print("Enter professional skill: ");
        String proSkill = scanner.nextLine();

        Experience experience = new Experience(candidateId, firstName, lastName, 
                                             birthDate, address, phone, email, 
                                             expInYear, proSkill);
        candidates.add(experience);
        System.out.println("Experience candidate created successfully!");
        askToContinue();
    }

    private void createFresherCandidate() {
        System.out.println("\nCreating Fresher Candidate:");
        String candidateId = inputCandidateId();
        String firstName = inputFirstName();
        String lastName = inputLastName();
        String birthDate = inputBirthDate();
        String address = inputAddress();
        String phone = inputPhone();
        String email = inputEmail();
        
        System.out.print("Enter graduation date (yyyy): ");
        String graduationDate = scanner.nextLine();
        while (!Validator.validateBirthDate(graduationDate)) {
            System.out.println("Invalid graduation date. Please enter a valid year (4 digits).");
            System.out.print("Enter graduation date (yyyy): ");
            graduationDate = scanner.nextLine();
        }
        
        System.out.print("Enter graduation rank (Excellence/Good/Fair/Poor): ");
        String graduationRank = scanner.nextLine();
        while (!Validator.validateGraduationRank(graduationRank)) {
            System.out.println("Invalid rank. Please enter one of: Excellence, Good, Fair, Poor");
            System.out.print("Enter graduation rank: ");
            graduationRank = scanner.nextLine();
        }
        
        System.out.print("Enter education: ");
        String education = scanner.nextLine();

        Fresher fresher = new Fresher(candidateId, firstName, lastName, 
                                    birthDate, address, phone, email, 
                                    graduationDate, graduationRank, education);
        candidates.add(fresher);
        System.out.println("Fresher candidate created successfully!");
        askToContinue();
    }

    private void createInternCandidate() {
        System.out.println("\nCreating Intern Candidate:");
        String candidateId = inputCandidateId();
        String firstName = inputFirstName();
        String lastName = inputLastName();
        String birthDate = inputBirthDate();
        String address = inputAddress();
        String phone = inputPhone();
        String email = inputEmail();
        
        System.out.print("Enter majors: ");
        String majors = scanner.nextLine();
        
        System.out.print("Enter semester: ");
        String semester = scanner.nextLine();
        
        System.out.print("Enter university name: ");
        String universityName = scanner.nextLine();

        Intern intern = new Intern(candidateId, firstName, lastName, 
                                 birthDate, address, phone, email, 
                                 majors, semester, universityName);
        candidates.add(intern);
        System.out.println("Intern candidate created successfully!");
        askToContinue();
    }

    private void searchCandidate() {
        if (candidates.isEmpty()) {
            System.out.println("No candidates available to search.");
            return;
        }

        System.out.println("\nList of candidate:");
        displayAllCandidates();

        System.out.print("\nInput Candidate name (First name or Last name): ");
        String searchName = scanner.nextLine().toLowerCase();

        System.out.print("Input type of candidate (0: Experience, 1: Fresher, 2: Intern): ");
        int searchType = scanner.nextInt();
        scanner.nextLine();

        System.out.println("\nThe candidates found:");
        boolean found = false;
        for (Candidate candidate : candidates) {
            if ((candidate.getFirstName().toLowerCase().contains(searchName) || 
                 candidate.getLastName().toLowerCase().contains(searchName)) &&
                (searchType == candidate.getCandidateType())) {
                candidate.showInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No candidates found matching the criteria.");
        }
    }

    private void displayAllCandidates() {
        System.out.println("==================EXPERIENCE CANDIDATE=====================");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == 0) {
                System.out.println(candidate.getFullName());
            }
        }

        System.out.println("=========FRESHER CANDIDATE=====================");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == 1) {
                System.out.println(candidate.getFullName());
            }
        }

        System.out.println("=========INTERN CANDIDATE=====================");
        for (Candidate candidate : candidates) {
            if (candidate.getCandidateType() == 2) {
                System.out.println(candidate.getFullName());
            }
        }
    }

    private void askToContinue() {
        System.out.print("Do you want to continue (Y/N)? ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("N")) {
            displayAllCandidates();
        }
    }

    // Các phương thức nhập dữ liệu chung
    private String inputCandidateId() {
        System.out.print("Enter candidate ID: ");
        return scanner.nextLine();
    }

    private String inputFirstName() {
        System.out.print("Enter first name: ");
        return scanner.nextLine();
    }

    private String inputLastName() {
        System.out.print("Enter last name: ");
        return scanner.nextLine();
    }

    private String inputBirthDate() {
        System.out.print("Enter birth date (yyyy): ");
        String birthDate = scanner.nextLine();
        while (!Validator.validateBirthDate(birthDate)) {
            System.out.println("Invalid birth date. Please enter a valid year (4 digits, 1900-current year).");
            System.out.print("Enter birth date (yyyy): ");
            birthDate = scanner.nextLine();
        }
        return birthDate;
    }

    private String inputAddress() {
        System.out.print("Enter address: ");
        return scanner.nextLine();
    }

    private String inputPhone() {
        System.out.print("Enter phone (min 10 digits): ");
        String phone = scanner.nextLine();
        while (!Validator.validatePhone(phone)) {
            System.out.println("Invalid phone number. Please enter at least 10 digits.");
            System.out.print("Enter phone (min 10 digits): ");
            phone = scanner.nextLine();
        }
        return phone;
    }

    private String inputEmail() {
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        while (!Validator.validateEmail(email)) {
            System.out.println("Invalid email format. Please enter a valid email (e.g., annguyen@fpt.edu.vn)");
            System.out.print("Enter email: ");
            email = scanner.nextLine();
        }
        return email;
    }
}