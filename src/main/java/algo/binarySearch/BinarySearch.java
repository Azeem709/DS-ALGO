package algo.binarySearch;

public class BinarySearch {

    public static int binSearch(int[] a, int key, int low, int high) {

        if (a.length > 0) {
            int mid = low + high / 2;
            if (key == a[mid])
                return mid;

            if (key < a[mid])
                return binSearch(a, key, low, mid);

            if (key > a[mid])
                return binSearch(a, key, mid, high);
        }


        return -1;
    }
}
