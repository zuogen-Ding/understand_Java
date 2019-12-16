package club.banyuan.homework.mapdemo1;

import java.util.HashMap;
import java.util.Map;

public class Demo1 {
    public static void main(String[] args) {
        String s="asdjfksdjfkjfaksjdfi jdiajdi";
        char[] cha= s.toCharArray();
        Map map =new HashMap();
        for (int i = 0; i < cha.length; i++) {
            if (map.containsKey(cha[i])){

            }
        }

    }
}
