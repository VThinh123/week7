/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

/**
 *
 * @author LENOVO LEGION
 */
public class BinarySearch {

    int binarySearch(int[] array, int index) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            //tìm trung tâm
          //
          int mid = left + (right + left) / 2;
          if(array[mid] == index){
              return mid;
          }
          if(array[mid] > index){
              right = mid -1;
          }else{
              left = mid + 1;
          }
        }
        return -1;
    }
}
