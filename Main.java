import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int input = 0;
        String newLine = "";

        int[] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = rand.nextInt(0, 100);
        }

        while (input != 6) {
            System.out.print("1-Find minimum\n2-Find maximum\n3-Get differences from avarages\n4-Find sum of odd-indexes\n5-Find sum of even-indexes\n6-Exit\nChoice:");
            input = in.nextInt();
            newLine = in.nextLine();

            if(input == 1){
                System.out.println(findMax(arr));
            }else if(input == 2){
                System.out.println(findMax(arr));
            }else if(input == 3){
                int[] temp = 
            }else if(input == 4){
                System.out.println(sumOfOdd(arr));
            }else if(input == 5){
                System.out.println(sumOfEven(arr));
            }else if(input == 6){
                System.out.println("Exiting...");
            }else{
                System.out.println("Please give a valid integer!");
            }
        }






        public static int[] findSubstractAverage(int[] array) {
            int average = findAverage(array);
            int[] newArray = new int[array.length];
            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i] - average;
            }
            return newArray;
        }
        
        public static int findAverage(int[] array) {
            int sum;
            for(int elements : array) {
                sum += elements;
            }
            return sum / array.length;
        }
    }
    public static int sumOfOdd(int[] arr) {
        int result = 0;
        int length = arr.length;
        for(int i = 1; i < length; i = i + 2) {
            result += arr[i];
        }
        return result;
    }

    public static int sumOfEven(int[] arr) {
        int result = 0;
        int length = arr.length;
        for(int i = 0; i < length; i = i + 2) {
            result += arr[i];
        }
        return result;
    }

    public static int findMin(int[] array)
    {
        int size = array.length;
        int min = 0;
        for(int i = 0; i < size; i++)
        {
            if(array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    public static int findMax(int[] array)
    {
        int size = array.length;
        int max = 0;
        for(int i = 0; i < size; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
}