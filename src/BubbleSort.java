public class BubbleSort
{

    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }//end of main method

    void bubbleSort(int arr[])
        {
            int tempPos;//this is a temporary variable that allows two other variables to swap
            for(int i = 0; i < arr.length; i++)//act as first element
            {
                for(int j = 0; j < arr.length-1; j++)//act as second/consectutive element
                {
                    if(arr[j] > arr[j+1])//checking if the first element is greater than the consecutive element
                    {
                        tempPos = arr[j+1];//this is swapping the consecutive element to be placed where the first element is
                        arr[j+1] = arr[j]; //thus the "second" element will be first
                        arr[j] = tempPos;  //and the "first" will be "second"
                    }//end of if conditional
                }//end of inner for loop
            } //end of outer for loop
        }

        /* Prints the array */
        void printArray(int arr[])
        {
            for(int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i]);
            }
        }

}//end class BubbleSort
