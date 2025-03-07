/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Random;

/**
 *
 * @author LENOVO LEGION
 */
public class bubbleSortOnClass {
        private int array[];

    public bubbleSortOnClass(int[] array) {
        this.array = array;
    }
    public void addValue(){
        Random random = new Random();
        for(int i =0; i<array.length; i++){
            this.array[i] = random.nextInt(this.array.length);
        }
    }
    
    void sort() {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int y = 0; y < n - 1 - i; y++) {
                if (array[y] > array[y + 1]) {
                    int temp = array[y];
                    array[y] = array[y + 1];
                    array[y + 1] = temp;
                }
            }
        }
    }
}
