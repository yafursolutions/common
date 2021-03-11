package com.yafursolutions;

public class MaxAndMinNumberInArray {


    public static void main(String[] args) {

        int[] arr = {100, 10, 200, 150, 77};

        int maxNumber = arr[0];
        int minNumber = arr[0];

        for(int i=1; i<arr.length; i++) {

            if(arr[i] > maxNumber) {
                maxNumber = arr[i];
            }else if(arr[i] < minNumber) {
                minNumber = arr[i];
            }

        }

        System.out.println("Max Number: " + maxNumber);
        System.out.println("Min Number: " + minNumber);

    }
}
