public class BubbleSort
{

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
        System.out.println("Some quick comment");
    }


    void bubbleSort(int arr[])
        {
            int len = arr.length;
            for(int i = 0; i < arr.length/2; i++)
            {
                for(int a = 0; a < len; a++)
                {
                    if(arr[a] > arr[a+1])
                    {
                        int temp = arr[a+1];
                        arr[a+1] = arr[a];
                        arr[a] = temp;
                    }
                }
                len-=2;
            }
        }


        /* Prints the array */
        void printArray(int arr[])
        {

        }

}//end class BubbleSort
