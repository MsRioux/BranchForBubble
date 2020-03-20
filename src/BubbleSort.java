public class BubbleSort
{
    //test push!
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        System.out.println("Yeeeet");
    }

    void bubbleSort(int arr[])
    {
        int temp;
        for (int i= 0; i< arr.length- 1; i++)
        {
            for (int j= 0; j< arr.length- i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        } // end of for loop
    } // end of bubbleSort

    /* Prints the array */
    void printArray(int arr[])
    {
        for(int num = 0; num < arr.length; num++)
        {
            System.out.println(arr[num]);
        }// end of for loop
    }// end of print array

}//end class BubbleSort