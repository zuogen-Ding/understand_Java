package club.banyuan.homework.basic2;

//在一个数组中找出最大和最小值，并输出它们的位置

public class Test4_9 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int large=0;
        int small=0;

        for (int i = 0; i < 10; i++) {
            double a = Math.random();
            int b=(int)(a*100);
            arr[i]=b;
        }

        for (int i = 0; i < 9; i++) {
            if(arr[i]<arr[i+1]){
                large=arr[i+1];
                small=arr[i];
            }else {
                large=arr[i];
                small=arr[i+1];
            }
        }

        for (int i = 0; i <10 ; i++) {
            if(arr[i]==small){
                System.out.println("最小值是"+small+"位置下标"+i);
            }else if(arr[i]==large){
                System.out.println("最大值"+large+"位置下标"+i);
            }
        }
    }

}
