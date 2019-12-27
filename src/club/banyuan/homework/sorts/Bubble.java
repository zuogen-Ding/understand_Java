package club.banyuan.homework.sorts;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] a = {2, 34, 342, 3534, 523, 45, 2346, 5, 7745, 8, 87, 3};

        //冒泡排序

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
