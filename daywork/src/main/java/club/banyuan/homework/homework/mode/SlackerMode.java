package club.banyuan.homework.homework.mode;

public class SlackerMode {
    private SlackerMode() {}
    private static SlackerMode slackerMode;
    public static SlackerMode getSlackerMode(){
        if(slackerMode==null){
            slackerMode=new SlackerMode();
        }
        return slackerMode;
    }
}
