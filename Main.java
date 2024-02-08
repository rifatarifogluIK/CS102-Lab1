import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int input = 0;
        String newLine = "";

        while (input != 5) {
            System.out.print("1-Find minimum\n2-Find maximum\n3-Get differences from avarages\n4-Find sum of odd-indexes\n4-Find sum of even-indexes\n5-Exit\nChoice:");
            input = in.nextInt();
            newLine = in.nextLine();

            if(input == 1){
                
            }else if(input == 2){

            }else if(input == 3){
                
            }else if(input == 4){
                
            }else if(input == 5){
                System.out.println("Exiting...");
            }else{
                System.out.println("Please give a valid integer!");
            }
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
