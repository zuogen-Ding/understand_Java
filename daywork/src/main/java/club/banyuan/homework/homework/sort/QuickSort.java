package club.banyuan.homework.homework.sort;

import java.util.Arrays;

public class QuickSort {
    public static void sort(int low, int high, int[] arr) {
        int temp = arr[low];
        while (low!=high) {
            if (arr[high]<=temp) {
                arr[low]=arr[high];
                low++;
                if(low!=high) {
                    if (arr[low] >= temp) {
                        arr[high] = arr[low];
                        high--;
                    } else {
                        low++;
                    }
                }
            }else {
                high--;
            }
        }

    }


    public static void main(String[] args) {
        int[] arr ={21,34,24,32,33,54,46,78};
        sort(0,7,arr);
        System.out.println(Arrays.toString(arr));
    }
}
