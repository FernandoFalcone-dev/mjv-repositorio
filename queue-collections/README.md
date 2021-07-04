# Interface Queue Java Collections ☕

Usada para manter os elementos que estão prestes a ser processados na ordem **FIFO(First In First Out)**,
esta interface está presente no pacote *java.util* a partir da versão 1.5, onde sua principal documentação pode ser encontrada [aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html).

Esta interface *extends* da interface Collection e é herdada pela interface Deque. Sua hierarquia pode ser vista na imagem abaixo:
<img alt="Queue-hierarquia" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200903183026/Queue-Deque-PriorityQueue-In-Java.png" height="350" widht="250" align="middle">

## Características :loud_sound:

- Lista ordenada de objetos 
- Uso limitado para inserir elementos no final da lista e excluir elementos do início
- Por ser uma interface, necessita de uma classe concreta para a declaração
- Além das operações básicas da Collection, as filas fornecem operações adicionais de inserção, extração e inspeção.

#### Obs.: A partirr do Java 1.5, com a entrada dos Genéricos, é possível restringir o tipo de objeto que será armazendado na Fila (PriorityQueue)

## Métodos Úteis

- Insert:
    - **add(e)**: Insere o elemento especificado nesta fila se for possível fazê-lo imediatamente sem violar as restrições de capacidade, retornando true em caso de sucesso e lançando um IllegalStateException se não houver espaço disponível no momento.
    Exemplo:
    ```java
    import java.util.PriorityQueue;
    import java.util.Queue;

    public class QueueExample {
        public static void main(String[] args) throws Exception {

                Queue<String> pq = new PriorityQueue<>();
        
                pq.add("Cachorro");
                pq.add("Gato");
                pq.add("Besouro");
        
                System.out.println(pq);
            
        }
    }
    ```
    OUTPUT:
    `[Besouro, Gato, Cachorro]`

    - **offer(e)**: Insere o elemento especificado nesta fila se for possível fazer isso imediatamente, sem violar as restrições de capacidade.

- Remove:
    - **remove()**: Recupera e remove o elemento do início da fila.

    - **pool()**: Recupera e remove do início desta fila ou retorna null se a fila estiver vazia.

- Examine:
    - **element()**: Recupera, mas não remove, o elemento do início da fila.
    - **peek()**: Recupera, mas não remove, o primeiro elemento da fila ou retorna null se a fila estiver vazia.