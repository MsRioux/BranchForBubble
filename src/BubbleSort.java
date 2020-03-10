public class BubbleSort
{
    //test push
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }//end main

    void bubbleSort(int arr[])
        {
            int temp;
            //nested for loops
            //swaps
            //compare 2 ints, if a > b switch
            //right most/highest stays after iteration
            //when done 1st iteration check again (2nd iteration)
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 3; j++)
                {

                }//end nested for loop
            }//end outer for loop

            if (arr[0] > arr[1])
            {
                temp = arr[0];
                arr[0] = arr[1];
                arr[1] = temp;
            }//end if
        }//end bubbleSort

        /* Prints the array */
        void printArray(int arr[])
        {

        }//end array print

}//end class BubbleSort
