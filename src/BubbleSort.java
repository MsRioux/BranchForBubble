public class BubbleSort
{
//this is my branch hope it works
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
        //int[] temp = new int[arr.length];
        int temp = 0;
        for(int i=arr.length-1; i>0; i--)
        {
            for (int j = 0; j<i; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }//end of if
            }//end of nested for loop
        }//end of for loop
    }//end of bubble sort

        /* Prints the array */
        void printArray(int arr[])
        {
            for(int i=0; i<arr.length; i++)
                System.out.print(arr[i] + " ");
        }//end of print array

}//end class BubbleSort
