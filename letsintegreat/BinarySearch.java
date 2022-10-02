public class BinarySearch {

    // Returns the index at which key is found, if key exists. Else returns -1.
    public static int search(int[] array, int key) {
        int left = 0;
        int right = array.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main (String args[]) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 7;
        int index = search(array, key);
        if (index == -1) {
            System.out.println(key + " is not in the array.");
        } else {
            System.out.println(key + " is at index " + index);
        }
    }
}