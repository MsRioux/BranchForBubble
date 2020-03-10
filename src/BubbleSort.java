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
            int b = arr.length -1;

            for(int i = 0; i < arr.length; i++)
            {
                for(int i2 = 0; i2 < b; i2++)
                {
                    int temp;

                    if(arr[i2] > arr[i2 + 1])
                    {
                        temp = arr[i2];
                        arr[i2] = arr[i2+1];
                        arr[i2 + 1] = temp;
                    }
                }
                b--;
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
//yessir noah