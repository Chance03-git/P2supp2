import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
