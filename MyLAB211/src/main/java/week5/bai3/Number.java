/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5.bai3;

/**
 *
 * @author LENOVO LEGION
 */
public class Number {

    private String value;

    public Number(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Number addTwoNum(Number other) {
        return new Number(addLargeNumber(this.value, other.value));
    }

    public String addLargeNumber(String num1, String num2) {
        int max = Math.max(num1.length(), num2.length());
        num1 = String.format("%" + max + "s", num1).replace(' ', '0');
        num2 = String.format("%" + max + "s", num2).replace(' ', '0');

        StringBuilder result = new StringBuilder();
        int sodu = 0;
        //giả sử 2 số có độ dài bằng nhau
        for (int i = num1.length() - 1; i >= 0; i--) {
            int S1 = num1.charAt(i) - '0';
            int S2 = num2.charAt(i) - '0';
            int sum = S1 + S2 + sodu;
            result.append(sum % 10);
            sodu = sum / 10;
        }
        if (sodu > 0) {
            result.append(sodu);
        }
        return result.reverse().toString();
    }

    public Number MutiplyTwoNum(Number other) {
        return new Number(MutiplyLagreNumber(this.value, other.value));
    }

    public String MutiplyLagreNumber(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int[] result = new int[len1 + len2];
        String tem ="";

        for (int i = len1 - 1; i >= 0; i--) {
            int S1 = num1.charAt(i) - '0';
            for (int j = len2 - 1; j >= 0; j--) {
                int S2 = num2.charAt(j) - '0';
                int mul = S1 * S2;
                
                int index = i+j+1;
                int sum = mul + result[index];
                result[index] = sum % 10;
                result[index-1] += sum / 10;
            }
        }
        for(int i =0; i< result.length; i++){
            tem = tem + result[i];
        }
        return tem;
    }
}
