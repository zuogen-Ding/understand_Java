package club.banyuan.homework.homework.mode;

public class SafeSlackerMode {
    private SafeSlackerMode() {}
    private static volatile SafeSlackerMode safeSlackerMode;
    public static SafeSlackerMode getSafeSlackerMode(){
        if(safeSlackerMode==null){
            synchronized (SafeSlackerMode.class){
                if(safeSlackerMode==null){
                    safeSlackerMode=new SafeSlackerMode();
                }
            }
        }
        return safeSlackerMode;
    }
}
