package club.banyuan.homework;

public class Demos {

    public static void main(String args[]) {
        int x = 4;
        System.out.println("value is " + ((x > 3) ? ++x : --x));
        int total = 0;
        for (int i = 0; i < 4; i++) {
            if (i == 1) continue;
            if (i == 2) break;
            total += i;
        }
        System.out.println(total);
        Boolean b=null;
        Demo a;
    }
}
