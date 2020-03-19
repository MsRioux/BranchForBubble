public class BubbleSort
{
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    } // end of main method
    void bubbleSort(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            for (int j = 0; j < arr.length - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } // end of if
            } // end of for loop for j
        } // end of for loop for i
    } // end of bubbleSort
    void printArray(int arr[])
    {
         
    } // end of printarray
} // end of class
