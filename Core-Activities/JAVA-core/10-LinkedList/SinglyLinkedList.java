public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {    
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove(){
        if (head == null) {
           return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node node = head;
        while (node.next.next != null) {
            node = node.next;
        }
        node.next = null;
    }

    public void printValues(){
        Node node = head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    public Node find(int value){
        Node node = head;
        while (node != null) {
            if(node.value == value){
                return node;
            }
        }
        return null;
    }

    public void removeAt(int n){
        if(n == 0){
            head = head.next;
            return;
        }
        Node node = head;
        for (int i = 0; i < n - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
    }
}
