public class BubbleSort
{
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {36, 23, 115,212, 42, 12, 42};
        ob.bubbleSongth - i - 1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } // end of if
            } // end of for loop for j
        } // end of for loop for i
    } // end of bubbleSort
    void printArray(int arr[])
    {
        for (int num : arr)
        {
            System.out.print(num + "    ");
        } // end of for loop to print
    } // end of printarray
} // end of class
