package study.d2025_1_4;

public class Main_快速排序 {

    public static void main(String[] args) {
        int[] arr={2,5,4,6,3};
        Sort(arr,0,4);
        for (int i = 0; i <5 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void Sort(int[] arr,int i,int j) {
        int start = i;
        int end = j;
        if (start > end) {
            return;
        }
        int baseNumber = arr[i];
        while (start != end) {
            while (true) {
                if (end <= start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            while (true) {
                if (start >= end || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        arr[i] = arr[start];
        arr[start] = baseNumber;
        Sort(arr, i, start - 1);
        Sort(arr, start + 1, j);
    }
}
