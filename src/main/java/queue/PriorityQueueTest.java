package queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
                
        final PriorityQueue<Student> queue=new PriorityQueue<>();

        Student p1=new Student(95,"张三");
        Student p2=new Student(89,"李四");
        Student p3=new Student(89,"李四");
        Student p4=new Student(67,"王五");
        Student p5=new Student(92,"赵六");
        queue.add(p1);
        queue.add(p2);
        queue.add(p3);//add 和offer效果一样。
        queue.offer(p4);//add 方法实现，其实就是调用了offer
        queue.offer(p5);

        for (Student Student : queue) {
            System.out.println(Student.toString());
        }
        
        System.out.println("---------------------");
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }       
    }

}