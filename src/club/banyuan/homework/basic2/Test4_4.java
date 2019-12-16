package club.banyuan.homework.basic2;

public class Test4_4 {

   // 定义一个数组,数组成员10个,找出数组中最大数连同下标一起输出
   public static void main(String[] args) {
       int[] arr=new int[10];

       for (int i = 0; i < 10; i++) {
           double a = Math.random();
           int b=(int)(a*100);
           arr[i]=b;
       }
        int c = 0;
       for (int i = 0; i <arr.length-1 ; i++) {
           if(arr[i]<arr[i+1]){
               c=arr[i];
           }else{
               c=arr[i+1];
           }

       }

       for (int i = 0; i <arr.length ; i++) {
           if(arr[i]==c){
               System.out.println("最大数"+c+"下标是 "+i);
           }
       }
   }

}
