import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) throws Exception {

            Queue<String> pq = new PriorityQueue<>();
    
            pq.offer("Cachorro");
            pq.offer("Gato");
            pq.offer("Besouro");
    
            System.out.println(pq);    
            
            pq.offer("Pássaro");

            System.out.println(pq);

            pq.remove("Gato");

            System.out.println(pq);
    }
}
