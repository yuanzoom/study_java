import java.util.Scanner;

public class T {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 1, 8, 69};
        Sort sort = new Sort();
        sort.bubble(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
    }

}

class Sort {


    public void bubble(int[] arr) {
        int swap;
        int temp = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            temp = 1;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                    temp = 0;
                }
            }
            if (temp == 1) {
                break;
            }

        }
    }
}
