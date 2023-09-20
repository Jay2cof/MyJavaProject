import java.util.Arrays;

public class ArrayActivityClass {
    public static void main(String[] args) {

        int[] array = {4, 5, 7, 414, 78, 3, 9, 44, 35, 78, 90, 34, 33, 75, 98, 455, 357};

        // Separate even and odd numbers
        int[] evenNum = new int[array.length];
        int[] oddNum = new int[array.length];
        int evenArr = 0;
        int oddArr = 0;

        for (int num : array) {
            if (num % 2 == 0) {
                evenNum[evenArr++] = num;    // Add even number to evenNum
            }
            else {
                oddNum[oddArr++] = num;      // Add odd number to oddNum
            }
        }

        // Print even numbers
        System.out.println("Even numbers: ");
        for (int i = 0; i < evenArr; i++) {
            System.out.print(evenNum[i] + ", ");
        }
        System.out.println();



        // Print odd numbers
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddArr; i++) {
            System.out.print(oddNum[i] + ", ");

            System.out.println();
        }

        // sorting of the element in an array.

        int[] arrays = {4, 5, 7, 414, 78, 3, 9, 44, 35, 78, 90, 34, 33, 75, 98, 455, 357};
        System.out.println("The original array is: ");
        for (int num : arrays){
            System.out.println(num + ", ");
        }
        Arrays.sort(arrays);
        System.out.println("Sorted in ascending order: ");
        for (int num : arrays){
            System.out.print(num + ", ");


        }

        //for (int i = 0; i < array.length; i++){
        //    System.out.print(array[i] + ", ");
        //}

    }
}
