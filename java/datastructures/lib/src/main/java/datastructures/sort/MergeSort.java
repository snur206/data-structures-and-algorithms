package datastructures.sort;

public class MergeSort {
  public void MergeSort(int[] arr) {
    int n = arr.length;

    if (n > 1) {
      int mid = n / 2;
      int[] left = new int[mid];
      System.arraycopy(arr, 0, left, 0, mid);
      int[] right = new int[(int) Math.ceil(n / 2.0)];
      System.arraycopy(arr, mid, right, 0, (int) Math.ceil(n / 2.0));
      MergeSort(left);
      MergeSort(right);
      merge(left, right, arr);
    }
  }

  public static void merge(int[] left, int[] right, int[] arr) {
    int i = 0;
    int j = 0;
    int k = 0;

    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
      } else {
        arr[k] = right[j];
        j++;
      }
      k++;
    }
    if (i == left.length) {
      System.arraycopy(right, j, arr, k, right.length - j);
    } else {
      System.arraycopy(left, i, arr, k, left.length - i);
    }
  }
}
