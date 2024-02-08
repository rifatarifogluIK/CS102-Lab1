public class Main {
    public static void main(String[] args){






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
}