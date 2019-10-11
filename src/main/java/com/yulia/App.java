package com.yulia;
import com.yulia.array.Array;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        run();
    }

    private static void run(){
        int [] mas = {11, 3, 14, 16, 7};
        Array array = new Array(mas);
        array.sortArray();
        array.printArray();
    }
}
