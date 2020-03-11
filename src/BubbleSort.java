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
        int bubble = arr.length - 1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int b = 0; b < arr.length-1; b++)
            {
                int temp;
                if(arr[b] > arr[b+1])
                {
                    temp = arr[b];
                    arr[b] = arr[b+1];
                    arr[b+1] = temp;
                }
            }
            bubble--;
        }
    }

    /* Prints the array */
    void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

}//end class BubbleSort

//howdy partner