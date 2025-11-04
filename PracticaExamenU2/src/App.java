import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IQueue<Job> queue = new ArrayQueue<>(20);  
        IStack<Job> stack = new ArrayStack<>(20);   
        SinglyLinkedList<Job> log = new SinglyLinkedList<>(); 

        while (true) {
            System.out.print("> ");
            if (!sc.hasNext()) break;

            String cmd = sc.next();

            switch (cmd) {

                case "ADD":
                case "add":
                    if (!sc.hasNext()) {
                        System.out.println("Falta ID de trabajo");
                    } else {
                        String id = sc.next();
                        queue.enqueue(new Job(id));
                    }
                    break;
                
                case "PROCESS":
                case "process":
                    if (!sc.hasNextInt()) {
                        System.out.println("Numero invalido para PROCESS");
                    } else {
                        int n = sc.nextInt();
                        for (int i = 0; i < n && !queue.isEmpty(); i++) {
                            stack.push(queue.dequeue());
                        }
                    }
                    break;

                case "COMMIT":
                case "commit":
                    while (!stack.isEmpty()) {
                        log.addLast(stack.pop());
                    }
                    break;

                case "ROLLBACK":
                case "rollback":
                    if (!sc.hasNextInt()) {
                        System.out.println("Numero invalido para ROLLBACK");
                    } else {
                        int m = sc.nextInt();
                        for (int i = 0; i < m && log.size() > 0; i++) {
                            Job j = log.removeLast();
                            queue.enqueue(j);
                        }
                    }
                    break;

                case "PRINT":
                case "print":
                    printState(queue, stack, log);
                    break;

                case "END":
                case "end":
                    System.out.println("--- ESTADO FINAL ---");
                    printState(queue, stack, log);
                    return;

                default:
                    System.out.println("Comando no reconocido: " + cmd);
            }
        }
    }

    static void printState(IQueue<Job> queue, IStack<Job> stack, SinglyLinkedList<Job> list) {
        System.out.println("QUEUE: " + queue);
        System.out.println("STACK: " + stack);
        System.out.println("BITACORA: " + list);
        System.out.println();
    }
}
