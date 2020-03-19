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
    }

    void bubbleSort(int arr[])
    {
        for(int j = 0; j < 100; j++) 
        {
			for(int i = 0; i < arr.length-1; i++) 
			{
				if(arr[i] < arr[i+1]) 
				{
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
    	}
    }

        /* Prints the array */
    void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
    }

}//end class BubbleSort
