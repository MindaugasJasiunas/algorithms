import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {
    private final BubbleSort bubbleSort= new BubbleSort();

    @DisplayName("sort() 5,1,4,2,8")
    @Test
    void sort() {
        assertEquals(Arrays.asList(1,2,4,5,8), bubbleSort.sort(Arrays.asList(5,1,4,2,8)));
    }

    @DisplayName("sort() 1,2,3,4,5")
    @Test
    void sort_notChange() {
        assertEquals(Arrays.asList(1,2,3,4,5), bubbleSort.sort(Arrays.asList(1,2,3,4,5)));
    }

    @DisplayName("sort() null")
    @Test
    void sort_null() {
        assertEquals(null, bubbleSort.sort(null));
    }

    @DisplayName("sort() empty list")
    @Test
    void sort_empty() {
        assertEquals(Collections.emptyList(), bubbleSort.sort(Collections.emptyList()));
    }

    @DisplayName("sortGenerics() with Integer")
    @Test
    void sortGenerics_integer() {
        assertEquals(Arrays.asList(1,2,4,5,8), bubbleSort.sortGenerics(Arrays.asList(5,1,4,2,8)));
    }


    @DisplayName("sortGenerics() with Double")
    @Test
    void sortGenerics_double() {
        assertEquals(Arrays.asList(1.1,2.1,4.2,5.5,8.8), bubbleSort.sortGenerics(Arrays.asList(1.1,5.5,8.8,4.2,2.1)));
    }

    @DisplayName("sortGenerics() with Float")
    @Test
    void sortGenerics_float() {
        assertEquals(Arrays.asList(-2.1f,1.1f,4.2f,5.5f,8.8f), bubbleSort.sortGenerics(Arrays.asList(1.1f,5.5f,8.8f,4.2f,-2.1f)));
    }

    @DisplayName("sortGenerics() null")
    @Test
    void sortGenerics_null() {
        assertEquals(null, bubbleSort.sortGenerics(null));
    }

    @DisplayName("sortGenerics() empty list")
    @Test
    void sortGenerics_empty() {
        assertEquals(Collections.emptyList(), bubbleSort.sortGenerics(Collections.emptyList()));
    }
}