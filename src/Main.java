

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        int[][] arraysToSort = {
                {},
                {1, 2, 5, 3, 1, 7, 9, 1, 12, 83, 1, 5, 3, 2},
                {1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1},
                {2, 2, 2, 2},
                {1, 2},
                {2, 1}
        };


        printArrays(arraysToSort);
        System.out.println("");
        printInfo();
        sortAllArrays(arraysToSort);
        System.out.println("");
        printArrays(arraysToSort);

    }

    public static void printArrays(int[][] array){
        for(int[] x : array ){
            System.out.println(Arrays.toString(x));
        }
    }

    public static void sortAllArrays(int[][] array){
        for(int[] x : array)
        BubbleSorting.arrayBubbleSort(x);
    }

    public static void printInfo(){
        System.out.println("Elements in arrays will be sorted from smallest to highest value:");
    }
}


