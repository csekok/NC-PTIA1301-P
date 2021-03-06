package numbers;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.Random;

public class NewNumbersMain {
    private static final Random RANDOM_GENERATOR = new Random(50);

    /**
     * Task 0: Update the project:
     *          - From menu: Git / "Update Project...", OR
     *          - In right upper corner: blue arrow, OR
     *          - Keyboard shortcut: Ctrl+T
     * In "Update the project" popup click on Ok button.
     */

    /**
     * Task 1: Create a main method.
     * Create a generateArray method to generate a 1-dimensional array: 1 2 3 4 5
     * Call this method and print the return value in main.
     */
    public static void main(String[] args) {
        int[] array = generateArray(true);

        System.out.println(array.length);
        System.out.println(array);

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        int[][] array2 = generateTwoDimensionalArray(true);
        System.out.println(array2.length);
        System.out.println(array2[0].length);
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print((i + 1) + " row: ");
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();

        ArrayList<Integer> list = generateList(true, 5);
        System.out.println(list.size()); // get back the length of the list
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum of the list is " + max);
        System.out.println(list); // print the whole list
        list.add(6); // adding the value of 6 to the list
        list.remove(5); // remove the value from the position 5 of the list
        list.set(0, 10); // change the first value to 10
        System.out.println(list);
        System.out.println(list.contains(60));
        System.out.println(list.indexOf(60));
        System.out.println(list.indexOf(10));

        System.out.println();

        System.out.println(getMaximumOfATwoDimensionalArray(array2));
    }

    public static int getMaximumOfATwoDimensionalArray(int[][] array) {
        int max = 0;
        if (array.length > 0 && array[0].length > 0) {
            max = array[0][0]; // needed because of case when array contains only negative numbers
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }
        }
        return max;
    }

    public static int[] generateArray(boolean random) {
        //int[] array = new int[5];
        int[] array = {1, 2, 3, 4, 5};
        if (random) {
            for (int i = 0; i < array.length; i++) {
                array[i] = RANDOM_GENERATOR.nextInt(100) - 50; // you will get values from -50 to 50
                //RANDOM_GENERATOR.nextInt() % 100 - 50; - another option
            }
        }
        return array;
    }

    /**
     * Task 2: Add a random parameter to generateArray method:
     * - If the value of random parameter is true,
     *   then return with a 5 element array filled with random numbers.
     * - If the value of random parameter is false,
     *   then return with the same array as before.
     * Hint: You can generate random numbers with Random objects.
     * Hint: Use nextInt(bound) method to get integers between 0 and bound value.
     * Call the method with true and false parameters and print the results in main.
     */

    /**
     * Task 3: Create a generateTwoDimensionalArray(random) method to generate a 2-dimensional array:
     * - If the value of random parameter is true,
     *   then return with a 2x3 array filled with random numbers.
     * - If the value of random parameter is false, then return with array of this matrix:
     *     1 2 3
     *     4 5 6
     * Call this method and print the return value in main.
     */
    public static int[][] generateTwoDimensionalArray(boolean random) {
        //int[][] result = new int[2][3];
        int[][] result = {
                {1, 2, 3},
                {4, 5, 6}
        };
        if (random) {
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[i].length; j++) {
                    result[i][j] = RANDOM_GENERATOR.nextInt(100) - 50;
                }
            }
        }
        return result;
    }

    /**
     * Task 4: Create a generateList(random, length) method to generate
     * a 1-dimensional array with dynamic length.
     * - If the value of random parameter is true, then return with a list of random numbers.
     *   The length of this list has to match with length parameter.
     * - If the value of random parameter is false,
     *   then return with a list with the numbers from 1 to value of length parameter.
     * Hint: Use ArrayList.
     */
    public static ArrayList<Integer> generateList(boolean random, int length) {
        ArrayList<Integer> list = new ArrayList<>();
        if (random) {
            for (int i = 0; i < length; i++) {
                list.add(RANDOM_GENERATOR.nextInt(100) - 50);
            }
        } else {
            for (int i = 0; i < length; i++) {
                list.add(1 + i);
            }
        }
        return list;
    }

    /**
     * Task 5: Create a print method to print all element of a list parameter to the console.
     * For example: [1, 2, 3, 4, 5]
     * Extra: Create similar method for 1- and 2-dimensional arrays.
     */

    /**
     * Task 6: Create a selectEvenNumbers method, what return a subset of the list parameter.
     * The subset list has to contains all and only the even numbers.
     * Call this method in main and print a message with the length of subset list or
     * the static "There are no even number in the list" message.
     */

    public static ArrayList<Integer> selectEvenNumbers(ArrayList<Integer> list) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for (int number : list) {
            if (number % 2 == 0) {
                sublist.add(number);
            }
        }
        return sublist;
    }
    public static ArrayList<Integer> selectEvenNumbers(int[][] array) {
        ArrayList<Integer> sublist = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    sublist.add(array[i][j]);
                }
            }
        }
        return sublist;
    }

    /**
     * Task 7: Create an intersection method, what get 2 lists as parameters.
     * The method has to return with a list, what contains all and only those elements,
     * which is in both list parameters.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 8: Create a separateEvenAndOdds method, what create 2 sublist of the list parameter.
     * First sublist has to contains all and only the even numbers, and the second one
     * has to contains all and only the odd numbers.
     * Print to console:
     *     - sublist of even numbers
     *     - sublist of odd numbers
     *     - length of sublist of even numbers
     *     - length of sublist of odd numbers
     *     - length of original list
     * Hint: This method should have no return value, because you should print the values.
     */

    /**
     * Task 9: Create a numberOfOdds(array) method to count how many odd value is in a list.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     */

    /**
     * Task 10: Create a contains(array, value) method to decide the value is in a list or not.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 11: Create a sum(array) method to get the sum of values in a list.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */

    /**
     * Task 12: Create an indexOf(array, value) method to return the index of value in a list.
     * If the list does not contain the value, then return with -1.
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */
    public static int[] indexOf(int[][] array, int value) {
        int[] result = {-1, -1};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == value) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    /**
     * Task 13: Create a union method, what get 2 lists as parameters.
     * The method has to return with a list, what contains all elements of list parameters,
     * but it has to contain all elements only 1 time (eliminate the duplications).
     * Extra: Create same method for 1- and 2-dimensional arrays.
     * Extra: Create same method for lists and arrays with double values.
     */
}
