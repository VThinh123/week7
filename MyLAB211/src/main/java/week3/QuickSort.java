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
public class QuickSort {
    private int array[];

    public QuickSort() {
        this.array = array;
    }
     void addValue(int value){
        array = new int[value];
        Random rd = new Random();
        for(int i = 0; i<array.length; i++){
            array[i] =rd.nextInt(array.length);
        }
    }
    
    void showArray(){
        for(int i =0; i< array.length; i++){
            System.out.print(array[i]+ ", ");
        }
    }
    
    int partition(int[] a, int l, int r){
        int pivot = a[(l+r) / 2], i = l, j = r;
        //i tìm những phần tử lớn hơn pivot
        //j tìm những phần tử nhỏ hơn pivot
        while(i <= j){
            while(a[i] < pivot)
                i++;
            while(a[j] > pivot)
                j--;
            if(i <= j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    
    
    void quickSort(int[] a, int l, int r){
        int i = partition(a, l, r);
        if(l < i - 1) quickSort(a, l, i - 1);
        if(i<r) quickSort(a, i, r);
    }
        public int[] getArray() {
        return array;
    }
}
