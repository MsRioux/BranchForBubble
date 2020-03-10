// The trees are dying
public class BubbleSort
{

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    } // end method main

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
                    } // end if
                } // emd inner if
            } // end outer if
        } // end method bubblesort

        /* Prints the array */
        void printArray(int arr[])
        {
            for (int num : arr)
            {
                System.out.print(num + "    ");
            } // end for
        } // end method printArray

}//end class BubbleSort
