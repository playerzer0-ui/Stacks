public class BoundedStacks extends Stacks{

    private final int maxCapacity;

    public BoundedStacks(){

        maxCapacity = 10;
    }

    public BoundedStacks(int maxCapacity) {

        if(maxCapacity <= 0){
            throw new IllegalArgumentException();
        }
        this.maxCapacity = maxCapacity;
    }

    public void push(String value){
        Node newNode = new Node(value);
        if(isFull()){
            throw new IllegalArgumentException();
        }
        else{
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    public boolean isFull(){
        return size == maxCapacity;
    }

}
