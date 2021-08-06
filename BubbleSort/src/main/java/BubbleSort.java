import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> array) {
        if (array == null) {
            return null;
        }
        boolean swapped = true;
        while (swapped) { //if no element swapped in for loop - done.
            swapped = false;
            for (int x = 0; x < array.size() - 1; x++) {
                if (array.get(x) > array.get(x + 1)) {
                    int temp = array.get(x);
                    array.set(x, array.get(x + 1));
                    array.set(x + 1, temp);
                    swapped = true;
                }
            }
        }
        return array;
    }

    public <T extends Number> List<T> sortGenerics(List<T> array) {
        if (array == null) {
            return null;
        }
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int x = 0; x < array.size() - 1; x++) {
                if (array.get(x).doubleValue() > array.get(x + 1).doubleValue()) {
                    T element = array.get(x);
                    T element2 = array.get(x + 1);
                    array.set(x, element2);
                    array.set(x + 1, element);
                    swapped = true;
                }
            }
        }
        return array;
    }

}
