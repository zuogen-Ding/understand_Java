package club.banyuan.homework.homework.mode;

public class EvilMode {
    private EvilMode() {}

    private static EvilMode evilMode=new EvilMode();

    public  EvilMode getEvilMode(){
        return evilMode;
    }
}
