package com.yulia.array;
import java.util.Arrays;

public class Array {
    private int [] array;

    public Array(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SortArray = " + Arrays.toString(array) ;
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
