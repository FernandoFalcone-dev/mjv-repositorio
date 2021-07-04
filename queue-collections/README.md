# Interface Queue -  Java Collections ☕

Usada para manter os elementos que estão prestes a ser processados na ordem **FIFO(First In First Out)**,
esta interface está presente no pacote *java.util* a partir da versão 1.5, onde sua principal documentação pode ser encontrada [aqui](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html).

Esta interface *extends* da interface Collection e é herdada pela interface Deque. Sua hierarquia pode ser vista na imagem abaixo:
<img alt="Queue-hierarquia" src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/20200903183026/Queue-Deque-PriorityQueue-In-Java.png" height="350" widht="250" align="middle">

## Características :loud_sound:

- Lista ordenada de objetos 
- Uso limitado para inserir elementos no final da lista e excluir elementos do início
- Por ser uma interface, necessita de uma classe concreta para a declaração
- Além das operações básicas da Collection, as filas fornecem operações adicionais de inserção, extração e inspeção.

#### :warning: Obs.: A partirr do Java 1.5, com a entrada dos Genéricos, é possível restringir o tipo de objeto que será armazendado na Fila (PriorityQueue) 

## Métodos Úteis :exclamation::heavy_exclamation_mark:

- Insert:
    - **add(e)**: Insere o elemento especificado nesta fila se for possível fazê-lo imediatamente sem violar as restrições de capacidade, retornando true em caso de sucesso e lançando um IllegalStateException se não houver espaço disponível no momento.

    - **offer(e)**: Insere o elemento especificado nesta fila se for possível fazer isso imediatamente, sem violar as restrições de capacidade.
    Exemplo:
    ```java
    import java.util.LinkedList;
    import java.util.Queue;

    public class QueueInsertExample {
        public static void main(String[] args) throws Exception {

                Queue<Integer> queue = new LinkedList<>();
        
                queue.add(1);
                queue.add(2);
                queue.add(3);
        
                System.out.println(queue);

                queue.offer(4);
                queue.offer(5);

                System.out.println(queue);
                /*Add e Offer se comportam de forma semelhante adicionando os números ao fim da fila na ordem que são inseridos no código*/
        }
    }
    ```
    OUTPUT:
    ```
    [1, 2, 3]
    [1, 2, 3, 4, 5]
    ```

- Remove:
    - **remove()**: Recupera e remove o elemento do início da fila.

    - **pool()**: Recupera e remove do início desta fila ou retorna null se a fila estiver vazia.
    Exemplo:
    ```java
    import java.util.LinkedList;
    import java.util.Queue;

    public class QueueRemoveExample {
        public static void main(String[] args) throws Exception {

                Queue<Integer> queue = new LinkedList<>();
        
                queue.add(1);
                queue.add(2);
                
                queue.remove(); //remove o número 1
                queue.remove(); //remove o número 2
                System.out.println(queue); //retorna null []
                //queue.remove(); retornaria uma NoSuchElementException
                queue.poll(); //mantém o retorno null []
        }
    }
    ```
    OUTPUT:
    `[]`
    
- Examine:
    - **element()**: Recupera, mas não remove, o elemento do início da fila.
    - **peek()**: Recupera, mas não remove, o primeiro elemento da fila ou retorna null se a fila estiver vazia.
    Exemplo:
    ```java
    import java.util.LinkedList;
    import java.util.Queue;

    public class QueueExamineExample {
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
    ```
    OUTPUT:
    ```
    [1, 2, 3]
    1
    2
    null
    ```

## Outros métodos
- Herdados da Interface ***java.util.Collection***: addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, parallelStream, remove, removeAll, removeIf, retainAll, size, spliterator, stream, toArray, toArray
- Herdados da interface ***java.lang.Iterable***: forEach

## Fontes:
- [GeeksForGeeks](https://www.geeksforgeeks.org/queue-interface-java/)
- [Oracle Docs](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html#element--)
- [Baeldung](https://www.baeldung.com/java-queue)

### Indicação:
- [Loiane Groner - Estrutura de Dados: Queue](https://www.youtube.com/watch?v=gtSoQs7TSnQ&t=265s)