package club.banyuan.homework.sorts;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] a = {2, 34, 342, 3534, 523, 45, 2346, 5, 7745, 8, 87, 3};


        for (int i = 0; i <a.length -1; i++) {
            for (int j = a.length-1; j >i ; j--) {
                if(a[j]<=a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }

        }

        System.out.println(Arrays.toString(a));
    }
}
