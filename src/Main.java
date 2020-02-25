public class Main {
    public static void main(String[] args) {
        MyPriorityQueueUsingArray obj = new MyPriorityQueueUsingArray(5);
        obj.enqueue(6);
       obj.enqueue(7);
        obj.enqueue(10);
        obj.enqueue(11);
        obj.enqueue(5);
    obj.enqueue(3);
   System.out.println("dequeue== "+obj.dequeue());
        obj.display();
        System.out.println("peek value== "+obj.peek());
        System.out.println(obj.isEmpty());
        System.out.println(obj.size());

    }
}
