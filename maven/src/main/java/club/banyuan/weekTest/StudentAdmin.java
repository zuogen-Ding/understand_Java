package club.banyuan.weekTest;

import java.util.List;

public class StudentAdmin {

    Student student;

    //打印功能菜单
    public void menu() {

    }


    //设置新学生的编号

    public void intindex(int num) {
        student.setNum(num);

    }


    //打印所有学生信息
    public void print(List list) {
        for (Object o : list) {
            Student student = (Student) o;
            System.out.println(o.toString());
        }
    }


    //添加学生
    public void create(int num, String name, int age) {
        intindex(num);
        student.setName(name);
        student.setAge(age);
        Tools.list.add(student);
    }


    //查找
    public String select(int num) {
        String st = null;
        for (int i = 0; i < Tools.list.size(); i++) {
            Student s = (Student) Tools.list.get(i);
            if (num == s.getNum()) {
                st = student.toString();
            }
        }

        return st;
    }

    //根据编号更新学生

    public void update(int num, String name, int age) {
        for (int i = 0; i < Tools.list.size(); i++) {
            Student s = (Student) Tools.list.get(i);
            if (num == s.getNum()) {
                s.setName(name);
                s.setAge(age);
            }
        }

    }


    //根据编号删除
    public void delete(int num) {
        int it = 0;
        for (int i = 0; i < Tools.list.size(); i++) {
            Student s = (Student) Tools.list.get(i);
            if (num == s.getNum()) {
                it = i;
            }
        }
        Tools.list.remove(it);
    }

    //根据编号录入成绩
    public void input(int num, int py, int java, int lx, int sql) {
        for (int i = 0; i < Tools.list.size(); i++) {
            Student s = (Student) Tools.list.get(i);
            if (num == s.getNum()) {
                s.setPython(py);
                s.setJava(java);
                s.setLinux(lx);
                s.setSql(sql);
            }
        }
    }

    //按某门成绩排序
    public void courseSort(int num, String s) {

        for (int i = 0; i < Tools.list.size(); i++) {
            for (int j = 0; j < Tools.list.size() - 1 - i; j++) {
                Student s1 = (Student) Tools.list.get(j);
                Student s2 = (Student) Tools.list.get(j + 1);
                if (s.equals("Python") || s.equals("python")) {
                    int a1 = s1.getPython();
                    int a2 = s2.getPython();
                    if (a1 < a2) {
                        Student o = s2;
                        Tools.list.remove(j+1);
                        Tools.list.add(j + 1, s1);
                        Tools.list.remove(j);
                        Tools.list.add(j, o);
                    }
                    for (Object o : Tools.list) {
                        Student student = (Student) o;
                        System.out.println(student.toString());
                    }
                }
                if (s.equals("Java") || s.equals("java")) {
                    int a1 = s1.getJava();
                    int a2 = s2.getJava();
                    if (a1 < a2) {
                        Student o = s2;
                        Tools.list.remove(j+1);
                        Tools.list.add(j + 1, s1);
                        Tools.list.remove(j);
                        Tools.list.add(j, o);
                    }
                    for (Object o : Tools.list) {
                        Student student = (Student) o;
                        System.out.println(student.toString());
                    }
                }

                if (s.equals("Linux") || s.equals("linux")) {
                    int a1 = s1.getLinux();
                    int a2 = s2.getLinux();
                    if (a1 < a2) {
                        Student o = s2;
                        Tools.list.remove(j+1);
                        Tools.list.add(j + 1, s1);
                        Tools.list.remove(j);
                        Tools.list.add(j, o);
                    }
                    for (Object o : Tools.list) {
                        Student student = (Student) o;
                        System.out.println(student.toString());
                    }
                }
                if (s.equals("sql") || s.equals("SQL")) {
                    int a1 = s1.getSql();
                    int a2 = s2.getSql();
                    if (a1 < a2) {
                        Student o = s2;
                        Tools.list.remove(j+1);
                        Tools.list.add(j + 1, s1);
                        Tools.list.remove(j);
                        Tools.list.add(j, o);
                    }
                    for (Object o : Tools.list) {
                        Student student = (Student) o;
                        System.out.println(student.toString());
                    }
                }
            }
        }

    }

    //总成绩排序
    public void courseSort() {
        for (int i = 0; i < Tools.list.size(); i++) {
            for (int j = 0; j < Tools.list.size() - 1 - i; j++) {
                Student s1 = (Student) Tools.list.get(j);
                Student s2 = (Student) Tools.list.get(j + 1);
                int a1 = s1.getSum();
                int a2 = s2.getSum();
                if (a1 < a2) {
                    Student o = s2;
                    Tools.list.remove(j+1);
                    Tools.list.add(j + 1, s1);
                    Tools.list.remove(j);
                    Tools.list.add(j, o);
                }
                for (Object o : Tools.list) {
                    Student student = (Student) o;
                    System.out.println(student.toString());
                }
            }
        }
    }

}
