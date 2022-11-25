
import java.util.Arrays;
public class ShiftTest {
    public static void main (String[] args) {
        int myArray[] = {1, 8, 10, 12, 6, 4, 19, 67, 87, 34};
        int n = 9;
        System.out.println("Array " + Arrays.toString(myArray));
        ShiftToRight(myArray, n);
    }
        public static void ShiftToRight(int a[], int n) {
        int temp = a[n];   
        for(int i = n; i > 0; i--) {
            a[i] = a[i - 1];
        }
        a[0] = temp;
        System.out.println("NewArray = " + Arrays.toString(a));
    }
}