package club.banyuan.jdbc.pojo;

public class Dept {
    private int d_no;
    private String d_name;
    private String d_location;

    public Dept(String d_name, String d_location) {
        this.d_name = d_name;
        this.d_location = d_location;
    }

    public Dept() {
    }

    public int getD_no() {
        return d_no;
    }

    public void setD_no(int d_no) {
        this.d_no = d_no;
    }

    public String getD_name() {
        return d_name;
    }

    public void setD_name(String d_name) {
        this.d_name = d_name;
    }

    public String getD_location() {
        return d_location;
    }

    public void setD_location(String d_location) {
        this.d_location = d_location;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "d_no=" + d_no +
                ", d_name='" + d_name + '\'' +
                ", d_location='" + d_location + '\'' +
                '}';
    }
}
