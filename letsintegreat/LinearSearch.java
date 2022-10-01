public class LinearSearch {

    // Returns the index at which key is found, if key exists. Else returns -1.
    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
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