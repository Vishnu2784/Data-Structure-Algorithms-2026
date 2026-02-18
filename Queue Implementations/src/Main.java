//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws  Exception{

    ArrayQueue queue=new ArrayQueue(5);
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);

    System.out.println("Queue SIze");
    queue.size();
    System.out.println("Queue peek");

    queue.peek();
    System.out.println("Queue dequeue");
    queue.dequeue();
    System.out.println("Queue Display");
    queue.display();
    System.out.println("Queue Size");
    queue.size();



}
