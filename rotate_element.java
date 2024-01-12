import java.util.*;
public class rotate_element {
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int rotationSteps = 2; // Number of positions to rotate

        // Check if rotation is needed
        if (rotationSteps > array.length) {
            System.out.println("Invalid rotation steps.");
            return;
        }

        // Create a new array for rotated elements
        int[] rotatedArray = new int[array.length];

        // Copy elements to the rotated array in a rotated order
        for (int i = 0; i < array.length; i++) {
            int newPosition = (i - rotationSteps + array.length) % array.length;
            rotatedArray[newPosition] = array[i];
        }

        // Display the rotated array
        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
    }
}

