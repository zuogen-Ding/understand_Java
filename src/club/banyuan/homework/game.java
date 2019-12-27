package club.banyuan.homework;

public class game {
    public static void main(String[] args) {

        //总牌组
        String[] arrs={"Aa","Ab","Ac","Ad","2a","2b","2c","2d","3a","3b","3c","3d","4a","4b","4c","4d","5a","5b","5c","5d","6a","6b","6c","6d","7a","7b","7c","7d","8a","8b","8c","8d","9a","9b","9c","9d","10a","10b","10c","10d","ja","jb","jc","jd","qa","qb","qc","qd","ka","kb","kc","kd","joa","j0b"};
        String[] arrs1={"Aa","Ab","Ac","Ad","2a","2b","2c","2d","3a","3b","3c","3d","4a","4b","4c","4d","5a","5b","5c","5d","6a","6b","6c","6d","7a","7b","7c","7d","8a","8b","8c","8d","9a","9b","9c","9d","10a","10b","10c","10d","ja","jb","jc","jd","qa","qb","qc","qd","ka","kb","kc","kd","joa","j0b"};

        //定义长度为三的数组放地主的3牌的下标,总的里对应的位为null
        int[] arr=new int[3];
        for (int i = 0; i < 3; i++) {
            double a =Math.random();
            int b=(int)(a*53);

            arr[i]=b;
            arrs[b]=null;
        }


        int[] arr1=new  int[17];
        int[] arr2=new  int[17];
        int[] arr3=new  int[17];

        //在遍历总数组
        for (int i = 0; i <17 ; i++) {

                double a =Math.random();
                int b=(int)(a*53);
            if(arrs[b]!=null){
                arr1[1]=b;
                arrs[b]=null;
            }
        }
        for (int i = 0; i <17 ; i++) {

                double a =Math.random();
                int b=(int)(a*53);
            if(arrs[b]!=null){
                arr2[1]=b;
                arrs[b]=null;
            }
        }
        for (int i = 0; i <17 ; i++) {

                double a =Math.random();
                int b=(int)(a*53);
            if(arrs[b]!=null){
                arr3[1]=b;
                arrs[b]=null;
            }
        }







        //读取
        for (int i = 0; i <17 ; i++) {

                int a=arr1[i];
                System.out.print(arrs1[a]);
                System.out.println("");

        }
                for (int i = 0; i <17 ; i++) {

                int b=arr2[i];
                System.out.print(arrs1[b]);
                    System.out.println("");


        }
                for (int i = 0; i <17 ; i++) {

                int c=arr3[i];
                System.out.print(arrs1[c]);
                    System.out.println("");
        }

    }
}
