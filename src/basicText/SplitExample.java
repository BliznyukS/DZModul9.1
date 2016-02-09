package basicText;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SplitExample {
    public static void main(String[] args) {
        System.out.println("Enter numbers using comma delimiter");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        String[] splittedStringArray = inputString.split(",");
        int[] intArray = new int[splittedStringArray.length];

        for (int i = 0; i < splittedStringArray.length; i++)
            intArray [i] = Integer.valueOf(splittedStringArray[i]);


        System.out.println(Arrays.toString(splittedStringArray)
                .replace("[", "")
                .replace("]", ""));

        System.out.println("Parsed elements of user input are:");
        for (int i : intArray) {
            System.out.println(i);
        }
    }
}
