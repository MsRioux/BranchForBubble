public class BubbleSort
{
    //add + some + quick + comment
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
            int tempPos;
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr.length-1; j++)
                {
                    if(arr[j] > arr[j+1])
                    {
                        tempPos = arr[j+1];
                        arr[j+1] = arr[j];
                        arr[j] = tempPos;

                    }
                }
            } //end for loop
        }

        /* Prints the array */
        void printArray(int arr[])
        {
            
        }

}//end class BubbleSort
