package club.banyuan.weekTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TestWorker  {
    public static void main(String[] args) {
        Worker worker1=new Worker("zhang3",18,3000);
        Worker worker2=new Worker("li4",25,3500);
        Worker worker3=new Worker("wang5",22,3200);
        Worker worker4=new Worker("zhao6",24,3300);

        List list=new LinkedList();
        list.add(worker1);
        list.add(worker2);
        list.add(worker3);
        list.add(1,worker4);
        list.remove(worker3);
        for (Object o:list) {
            Worker worker=(Worker)o;
            System.out.println(worker.toString());
        }
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            Worker worker=(Worker) iterator.next();
            worker.work();
        }
    }



}
