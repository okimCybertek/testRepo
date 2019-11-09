package arrays;

public class biggestNum {
    public static void main(String[] args) {
        int [] arr = {3,30,14,6,50,20};
        int high = arr[0]; // to find biggest num start with first number in the array
        for (int i = 0; i<arr.length; i++) {

            if (arr[i]>high) {
                high = arr[i];
            }
        }
        System.out.println(high);
    }
}
