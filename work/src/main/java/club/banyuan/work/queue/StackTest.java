package club.banyuan.work.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest extends Stack {
    static Queue queue1 = new LinkedList();
    static Queue queue2 = new LinkedList();
    static Object[] objects = null;

    public StackTest() {
        super();
    }

    @Override
    public Object push(Object item) {
        queue1.offer(item);
        objects = new Object[queue1.size()];
        for (int i = 0; i < objects.length; i++) objects[i] = queue1.poll();
        for (int i = 0; i < objects.length; i++) queue1.offer(objects[i]);
        queue2.clear();
        for (int i = objects.length - 1; i > -1; i--) queue2.offer(objects[i]);
        return item;
    }

    @Override
    public synchronized Object pop() {
        Object o;
        o = queue2.peek();
        queue2.poll();
        queue1.clear();
        objects = new Object[queue2.size()];
        for (int i = 0; i < objects.length; i++) objects[i] = queue2.poll();
        for (int i = 0; i < objects.length; i++) queue2.offer(objects[i]);
        for (int i = objects.length - 1; i > -1; i--) queue1.offer(objects[i]);
        return o;

    }

    @Override
    public synchronized Object peek() {
        Object o;
        o = queue2.peek();
        return o;
    }

    @Override
    public boolean empty() {
        if (queue2.size() == 0) return true;
        return false;
    }

    @Override
    public synchronized int search(Object o) {
        int index=-1;
        for (int i = 0; i < objects.length; i++) {
            objects[i] = queue2.poll();
            if(o==objects[i])index=i;
        }
        for (int i = 0; i < objects.length; i++) queue2.offer(objects[i]);
        return index;
    }

    @Override
    public String toString() {
        return queue1.toString();

    }
}
