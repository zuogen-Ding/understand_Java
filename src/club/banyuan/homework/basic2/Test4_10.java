package club.banyuan.homework.basic2;

public class Test4_10 {
    public static void main(String[] args) {
        int[] arr1 = new int[30];
        int[] arr2 = new int[10];

        for (int i = 0; i < 30; i++) {
            double a = Math.random();
            int b = (int) (a);
            arr1[i]=b;
        }

        for (int i = 0; i <30 ; i++) {
            if(arr1[i]==i){
                arr2[i]++;
            }
        }

        System.out.println("0出现的次数"+arr2[0]+"1出现的次数"+arr2[1]+"2出现的次数"+arr2[2]+"3出现的次数"+arr2[3]+"4出现的次数"+arr2[4]+"5出现的次数"+arr2[5]+"6出现的次数"+arr2[6]+"7出现的次数"+arr2[7]+"8出现的次数"+arr2[8]+"9出现的次数"+arr2[9]);
    }
}
