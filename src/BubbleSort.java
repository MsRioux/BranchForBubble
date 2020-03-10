//Grace Hudgens's Branch
//is it hudgens's or hudgens'?
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
            int temp;
            for(int i = 0; i < arr.length; i++)
            {
                for(int j = 0; j < arr.length; j++)
                {
                    if(arr[i] < arr[j])
                    {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }//end inner for
            }//end outer for
        }//end bubble sort method

        /* Prints the array */
        void printArray(int arr[])
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
}//end class BubbleSort
