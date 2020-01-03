package club.banyuan.homework.homework.sort;

import java.util.Arrays;

public class BinarySearch {
    public static void binarySearch(int num, int[] nums) {
        int max = nums.length ;
        int min=0;
        int temp=(max+min)/2;
        while (num != nums[temp]) {
            if (num < nums[temp]) {
                max = temp;
            } else {
                min = temp;
            }
            temp=(max+min)/2;
        }
        System.out.println(temp);
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
        binarySearch(1,arr);
    }
}
