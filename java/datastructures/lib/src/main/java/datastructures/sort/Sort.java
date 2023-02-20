package datastructures.sort;

public class Sort {
  public int[] insertionSort(int[] arr)
  {
    for (int i = 0; i < arr.length; i++)
    {
      int j = i -1;
      int temp = arr[i];

      while (j >= 0 && temp <  arr[j])
      {
        arr[j+1] = arr[j];
        j--;

      }
      arr[j+1]=temp;
    }

    return arr;

  }
}