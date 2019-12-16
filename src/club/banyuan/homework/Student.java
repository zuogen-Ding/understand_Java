package collectionDemo;


//学生类,学生编号,学生姓名,学生密码,学生成绩

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private  int stuNum;
    private  String stuName;
    private  int password;
    private  double stuScore;
    //保存写的答案
    private HashMap stuAnswer;

    public Student() {
    }

    public Student(int stuNum, String stuName, int passworg, double stuScore) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.password = passworg;
        this.stuScore = stuScore;
    }


    public int getStuNum() {
        return stuNum;
    }

    public void setStuNum(int stuNum) {
        this.stuNum = stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int passworg) {
        this.password = passworg;
    }

    public double getStuScore() {
        return stuScore;
    }

    public void setStuScore(double stuScore) {
        this.stuScore = stuScore;
    }

    public HashMap getStuAnswer() {
        return stuAnswer;
    }

    //保存答案
    public void ansQuestion(int questNum ,char cha){
        stuAnswer.put(questNum,cha);

    }

    //信息确认
    public  boolean commit(String stuName,int password){
        if (this.stuName==stuName&&this.password==password){
            return true;
        }else {
            return false;
        }
    }

   /* //打印成绩
    public void printScore(){

    }
    */
}
