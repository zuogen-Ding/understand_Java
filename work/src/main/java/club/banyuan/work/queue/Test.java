package club.banyuan.work.queue;


import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        StackTest stackTest = new StackTest();
        Stack stack=new Stack();
        System.out.println(stackTest.empty());
        System.out.println("入栈");
        stackTest.push(12);
        stack.push(12);
        stackTest.push(13);
        stack.push(13);
        stackTest.push(14);
        stack.push(14);
        System.out.println("StackTest"+stackTest.toString());
        System.out.println("Stack"+stack);
        System.out.println("取顶值");
        System.out.println(stackTest.peek()+"栈"+stack.peek());
        System.out.println(stackTest.toString()+"-----"+stack);
        System.out.println("出栈");
        System.out.println(stackTest.pop()+"栈"+stack.pop());
        System.out.println(stackTest.toString()+"-----"+stack);

    }
}
