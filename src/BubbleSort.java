public class BubbleSort
{
    //Shannon's branch
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array: ");
        ob.printArray(arr);
    }

    void bubbleSort(int arr[])
        {

        }

        /* Prints the array */
        void printArray(int arr[])
        {
            for (int i =0; i<arr.length;i++)
            {
                System.out.print(" "+arr[i]);
            }//end loop to itterate through array
        }

}//end class BubbleSort
