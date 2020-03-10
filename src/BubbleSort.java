import java.util.Arrays;
public class BubbleSort
{

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }

    void bubbleSort(int arr[])
    {

    }

    /* Prints the array  */
    void printArray(int arr[])
    {
        System.out.println(Arrays.toString(arr));
    }

}//end class BubbleSort
