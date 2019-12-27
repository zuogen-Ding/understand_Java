package club.banyuan.homework.addFunction;

public class Test {

    public static void main(String[] args) {
        App app=new App();
        AddFuc addFuc=new AddFuc(app);
        App a=(App) addFuc.getProxy();
        a.function1();
    }
}
