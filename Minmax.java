class Minmax 
{

    
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