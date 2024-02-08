public class Main {
    public static void main(String[] args){

        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 1;
        arr[3] = 0;
        arr[4] = 6;

        System.out.println(sumOfOdd(arr));
        System.out.println(sumOfEven(arr));

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
