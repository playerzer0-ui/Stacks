public class ToDoList {
    public static void main(String[] args) {
        Stacks x = new Stacks();
        x.push("1");
        x.push("2");
        x.push("3");
        x.push("4");
        x.push("5");
        x.push("6");
        x.push("7");
        x.push("8");
        x.push("9");
        x.push("10000");
        System.out.println(x);
        System.out.println(x.size());
        System.out.println("first element: " + x.peek());

        while(!x.isEmpty()){
            System.out.println(x.pop());
        }


    }
}
