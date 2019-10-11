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
        Array array = new Array();
        array.inputArray();
        array.sortArray();
        array.printArray();
    }
}
