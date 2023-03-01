import java.util.EmptyStackException;

public class Stacks {

    protected Node first;
    protected int size;

    public Stacks(){
        first = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public String peek(){
        if(size == 0){
            throw new EmptyStackException();
        }
        return first.data;
    }

    public void push(String value){
        Node newNode = new Node(value);
        if(first == null){
            first = newNode;
        }
        else{
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public String pop(){
        Node removed;
        if(first == null){
            throw new EmptyStackException();
        }
        else{
            removed = first;
            first = first.next;
        }
        size--;
        return removed.data;
    }



    protected static class Node {
        protected String data;
        protected Node next;

        public Node(String data){
            this.data = data;
            next = null;
        }

        public boolean hasNext(){
            return next == null;
        }
    }

    @Override
    public String toString() {
        if(first == null){
            return "[]";
        }
        String output = "[";
        Node current = first;
        while (current.next != null){
            output += "'" + current.data + "'" + ", ";
            current = current.next;
        }
        return output + "'" + current.data + "'" + "]";
    }
}
