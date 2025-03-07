/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO LEGION
 */
public class Test {

    private String title;
    private ArrayList<String> option;

    public Test(String td, String[] mc) {
        title = td;
        option = new ArrayList<>();
        for (String s : mc) {
            option.add(s);
        }
    }

    public void display() {
        System.out.println(title);
        System.out.println("--------------------------------");
        for (int i = 0; i < option.size(); i++) {
            System.out.println((i + 1) + "." + option.get(i));
        }
        System.out.println("--------------------------------");
    }

    public void selectOption(int n) {
        switch (n) {
            case 1: {
                BubbleSort bubblerSort = new BubbleSort();
//                Scanner sc = new Scanner(System.in);
//                System.out.println("Enter number of array");
                int number = Utilizer.checkNumber();
                bubblerSort.addValue(number);
                System.out.println("Unsorted array: ");
                bubblerSort.showArray();
                bubblerSort.sort();
                System.out.println("\n");
                System.out.println("Sorted array: ");
                bubblerSort.showArray();
                System.out.println("\n");
                break;
            }
            case 2: {
                QuickSort quickSort = new QuickSort();
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of array");
                int number = Utilizer.checkNumber();
                quickSort.addValue(number);
                int[] a = quickSort.getArray();

                System.out.println("Unsorted array: ");
                quickSort.showArray();
                System.out.println("\n");

                quickSort.quickSort(a, 0, a.length - 1);

                System.out.println("Sorted array: ");
                quickSort.showArray();
                System.out.println("\n");
                break;
            }
            case 3: {
                BinarySearch binarySearch = new BinarySearch();
                QuickSort quickSort = new QuickSort();
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of array");
                int number = Utilizer.checkNumber();
                System.out.println("Enter search value");
                int value = Utilizer.checkNumber();
                //sắp xếp
                quickSort.addValue(number);
                quickSort.quickSort(quickSort.getArray(), 0, quickSort.getArray().length-1);
                System.out.println("Sorted array: ");
                quickSort.showArray();
                System.out.println("\n");
                //tìm kiếm
                int result = binarySearch.binarySearch(quickSort.getArray(), value);
                if (result != -1) {
                    System.out.println("Target " + value + " found at index: " + result);
                } else {
                    System.out.println("Target " + value + " not found in the array.");
                }
                break;
            }
            case 4: {
                MyStack stack = new MyStack();

                //push
                stack.push(1);
                stack.push(2);
                stack.push(3);
                stack.push(4);
                stack.push(5);
                
                //lấy giá trị top không xóa
                System.out.println("Top element: " + stack.get());

                //pop
                stack.pop();
                stack.pop();
                stack.pop();
                break;
            }
        }
    }

    public static void main(String[] args) {
        Test menu = new Test("Menu", new String[]{"Bubble Sort", "Quick Sort", "Binary Search", "Stack","Exit"});
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            menu.display();
            System.out.println("\nEnter your choice");
            choice = sc.nextInt();
            sc.nextLine();
            menu.selectOption(choice);
        } while (choice != 5);
    }
}
