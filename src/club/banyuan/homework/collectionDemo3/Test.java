package club.banyuan.homework.collectionDemo3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student =new Student();
        student.setStuName("王五");
        student.setStuNum(1);
        student.setPassword(12345);

        Question question1=new Question();
        question1.setQuestNum(1);
        question1.setQuestName("第一题");
        question1.setOptionA("A.你好");
        question1.setOptionB("B.你不好");
        question1.setOptionC("C.你哼好");
        question1.setOptionD("D.嫩好");
        question1.setResult('A');
        question1.addAnswer(question1);
        question1.addQuest(question1);

        Question question2=new Question();
        question2.setQuestNum(1);
        question2.setQuestName("第一题");
        question2.setOptionA("A.你好");
        question2.setOptionB("B.你不好");
        question2.setOptionC("C.你哼好");
        question2.setOptionD("D.嫩好");
        question2.setResult('C');
        question2.addAnswer(question2);
        question2.addQuest(question2);


        System.out.println("请输入姓名");
        Scanner scanner1=new Scanner(System.in);
        String name=scanner1.next();
        System.out.println("请输入密码");
        Scanner scanner2=new Scanner(System.in);
        int password=scanner2.nextInt();
        if (student.commit(name,password)){
            for (Object object:Tools.questions) {
                Question q =(Question)object;
                System.out.println(Tools.questions);
                System.out.println("请输入答案");

                Scanner sc=new Scanner(System.in);
                char cha=sc.next().charAt(0);

                if(Tools.answer.get(q.getQuestNum()).equals(cha)){
                    student.setStuScore(student.getStuScore()+10);
                }

            }
        }else {
            System.out.println("请输入正确的姓名和密码");
        }
    }
}
