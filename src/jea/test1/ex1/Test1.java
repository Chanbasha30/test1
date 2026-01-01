package jea.test1.ex1;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 9, 1, 7};
        //before sort
//        Arrays.sort(numbers);

        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sorting the array in ascending orders
        Arrays.sort(numbers);

        System.out.println("Sorted array (ascending): " + Arrays.toString(numbers));
    }
}
