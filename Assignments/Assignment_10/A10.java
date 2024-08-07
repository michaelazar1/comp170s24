public class FinalAssignment {
    /* This merges the arrays into a single one */
     public static int[] merge(int[] left, int[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int[] mergedArray = new int[leftLength + rightLength];
        
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0
        /* This serves to merge the elements from the left and right arrays in sorted order */
        while (leftIndex < leftLength && rightIndex < rightLength) {
             if (left[leftIndex] <= right[rightIndex]) {
                mergedArray[mergedIndex++] = left[leftIndex++];
            } else {
                mergedArray[mergedIndex++] = right[rightIndex++];
            }
        }

        /* This copies any remaining elements from the left array */
        while (leftIndex < leftLength) {
            mergedArray[mergedIndex++] = left[leftIndex++];
        }
         /* This copies any remaining elements from the right array */
        while (rightIndex < rightLength) {
            mergedArray[mergedIndex++] = right[rightIndex++];
        }

        return mergedArray;
     }

    /* This reverses the string */
      public static String reverse(String inputString) {
        int stringLength = inputString.length();
        StringBuilder reversedString = new StringBuilder();

        // Add characters from the end of the string to the beginning
        for (int index = stringLength - 1; index >= 0; index--) {
            reversedString.append(inputString.charAt(index));
        }

        return reversedString.toString();
    }
    /* This is to sort the integer array in ascending order */
    public static int[] simpleSort(int[] array) {
        int arraylength = array.length;

        // Go through all elements in the array
        for (int currentIndex = 0; currentIndex < arrayLength - 1; currentIndex++) {
            int smallestElementIndex = currentIndex;

            // Find the index of the smallest element in the part that is unsorted 
            for (int nextIndex = currentIndex + 1; nextIndex < arrayLength; nextIndex++) {
                if (array[nextIndex] < array[smallestElementIndex]) {
                    smallestElementIndex = nextIndex;
                }
            }

            int temp = array[smallestElementIndex];
            array[smallestElementIndex] = array[currentIndex];
            array[currentIndex] = temp;
        }

        return array;
    }

    /* This tests the merge method */
    public static void main(String [] args) {
        int[] array1 = {1, 2, 8, 9};
        int[] array2 = {0, 5, 6, 7};
        int[] mergedArray = merge(array1, array2);
        System.out.println("Merged array: " + java.util.Arrays.toString(mergedArray));
    /* This tests the reverse method */
        String originalString = "Hello";
        String reversedString = reverse(originalString);
        System.out.println("Reversed string: " + reversedString);

        int[] unsortedArray = {10, 8, 5, 6, 2};
        int[] sortedArray = simpleSort(unsortedArray);
        System.out.println("Sorted array: " + java.util.Arrays.toString(sortedArray));
    }
}
