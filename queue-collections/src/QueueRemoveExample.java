import java.util.LinkedList;
import java.util.Queue;

public class QueueRemoveExample {
    public static void main(String[] args) throws Exception {

            Queue<Integer> queue = new LinkedList<>();
    
            queue.add(1);
            queue.add(2);
            queue.add(3);
            System.out.println(queue);

            System.out.println(queue.element());//recupera o primeiro da fila, o número 1

            queue.remove(); //remove o número 1

            System.out.println(queue.peek()); //recupera o primeiro da fila que agora é o número 2

            queue.remove();
            queue.remove();

            //System.out.println(queue.element()); retornaria uma NoSuchElementException
            System.out.println(queue.peek()); //retorna null
    }
}
