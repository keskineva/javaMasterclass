import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        int[] myArray = readIntegers(count);

        System.out.println(findMin(myArray));
        System.out.println(Arrays.toString(myArray));
        reverse(myArray);
        System.out.println(Arrays.toString(myArray));

    }

    public static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] myArray = new int[count];
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            myArray[i] = num;
        }

        return myArray;
    }

    public static int findMin(int[] myArray) {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] <= min) {
                min = myArray[i];
            }
        }
        return min;
    }

    public static void reverse(int[]array){
         int maxIndex = array.length;
         int halfLen = array.length/2;


        for (int i = 0; i < halfLen; i++) {
            int temp =array[i];
            array[i]=array[maxIndex-1];
            array[maxIndex-1] = temp;
        }
    }
}
