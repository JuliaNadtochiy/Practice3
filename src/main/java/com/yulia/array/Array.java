package com.yulia.array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private int [] array;

    public void setArray(int[] array) {
        this.array = array;
    }

    public Array() {
    }

    @Override
    public String toString() {
        return "SortArray = " + Arrays.toString(array) ;
    }

    public void inputArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array: ");
        String str = in.nextLine();
        String strArray[] = str.split(" ");
        int array[] = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        setArray(array);
    }

    public void sortArray(){
        boolean isSorted = false;
        int tmp;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }
    }

    public void printArray(){
        System.out.println(toString());
    }
}
