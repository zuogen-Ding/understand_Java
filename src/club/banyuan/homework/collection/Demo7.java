package club.banyuan.homework.collection;

import java.util.Arrays;

public class Demo7 {

    public static void main(String[] args) {
        String st ="to bo bubble.";
        char[] a= st.toCharArray();
        System.out.println(Arrays.toString(a));
        int count=0;


        for (int i = 0; i <a.length ; i++) {
            int s= a[i];

            if ((s>64&&s<91)||(s>96&&s<123)) {
                count++;
            }else {
                for (int j = 0; j <count/2 ; j++) {
                    char temp=a[i-j-1];
                    a[i-j-1]=a[i-count+j];
                    a[i-count+j]=temp;
                }
                count=0;


            }
        }
        System.out.println(Arrays.toString(a));

    }
}
