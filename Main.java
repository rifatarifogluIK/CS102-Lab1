public class Main {
    public static void main(String[] args){


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
}
