package club.banyuan.homework.basic3;


/*
3.公司年销售额求和
        某公司按照季度和月份统计的数据如下：单位(万元)
        第一季度：22,66,44
        第二季度：77,33,88
        第三季度：25,45,65
        第四季度：11,66,99
*/

public class Test5_3 {
    public static void main(String[] args) {
        int[] arr1={22,66,44};
        int[] arr2={77,33,88};
        int[] arr3={25,45,65};
        int[] arr4={11,66,99};


        for (int i = 0; i < 3; i++) {
            int sum=arr1[i]+arr2[i]+arr3[i]+arr4[i];
            System.out.println("第"+(i+1)+"年的销售额总和是"+sum);
        }
    }
}
