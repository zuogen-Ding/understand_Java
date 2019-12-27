package club.banyuan.homework.collectionDemo3;

import java.util.ArrayList;

public class Question {
    private int questNum;
    private String questName;
    private  String  optionA;
    private  String  optionB;
    private  String  optionC;
    private  String  optionD;
    private  char    result;
    //保存题目


    public Question() {
    }

    public Question(int questNum, String questName, String optionA, String optionB, String optionC, String optionD, char result) {
        this.questNum = questNum;
        this.questName = questName;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.result = result;
    }


    public int getQuestNum() {
        return questNum;
    }

    public void setQuestNum(int questNum) {
        this.questNum = questNum;
    }

    public String getQuestName() {
        return questName;
    }

    public void setQuestName(String questName) {
        this.questName = questName;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public char getResult() {
        return result;
    }

    public void setResult(char result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questNum=" + questNum +
                ", questName='" + questName + '\'' +
                ", optionA='" + optionA + '\'' +
                ", optionB='" + optionB + '\'' +
                ", optionC='" + optionC + '\'' +
                ", optionD='" + optionD + '\'' +
                '}';
    }

    //加题
    public void addQuest(Question question){
        Tools.questions.add(question);
    }

    //答案
    public void addAnswer(Question question){
        Tools.answer.put(question.getQuestNum(),question.getResult());
    }
}
