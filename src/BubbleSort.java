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
            for(int i = 0; i < arr.length; i++)
            {
                for(int i2 = 0; i2 < arr.length; i++)
                {
                    int temp = 0;

                    if(arr[i] > arr[i + 1])
                    {
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i + 1] = temp;
                    }
                }
            }

        }

        /* Prints the array */
        void printArray(int arr[])
        {

        }

}//end class BubbleSort
//yessir noah