package club.banyuan.homework.extends1;

public class Cuboid extends Rectangle{
    private  int height;

    public Cuboid() {
    }

    public Cuboid(int length, int width, int height) {
        super(length, width);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void Bulk(){
        int a=getLength();
        int b=getWidth();
        int c=getHeight();
        System.out.println("体积是"+(a*b*c));
    }

}
