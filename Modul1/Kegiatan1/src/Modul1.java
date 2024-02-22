public class Modul1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 25;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Array index out of bounds. Please fix the index to be within the array's length.");
        }
    }
}