import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuickSort {

    /**
     * Sorts an array using the QuickSort algorithm.
     * 
     * @param array The array to be sorted.
     */
    public static void sort(int[] array) {
        if (array == null || array.length <= 1) {
            return; // Already sorted
        }
        quickSort(array, 0, array.length - 1);
    }
    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);  // Sort the left partition
            quickSort(array, pivotIndex + 1, high); // Sort the right partition
        }
    }
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];  // Choose the last element as the pivot
        int i = low - 1;          // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high); // Move the pivot to its correct position
        return i + 1;
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

public static class QuickSortTest {

    @Test
    void testSortEmptyArray() {
        int[] array = {};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{}, array);
    }

    @Test
    void testSortSingleElementArray() {
        int[] array = {5};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{5}, array);
    }

    @Test
    void testSortAlreadySortedArray() {
        int[] array = {1, 2, 3, 4, 5};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testSortUnsortedArray() {
        int[] array = {5, 1, 4, 2, 3};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void testSortArrayWithDuplicates() {
        int[] array = {4, 2, 4, 3, 2};
        QuickSort.sort(array);
        assertArrayEquals(new int[]{2, 2, 3, 4, 4}, array);
    }
}
