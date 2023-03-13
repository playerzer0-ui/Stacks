public class ToDoList2 {
    public static void main(String[] args) {
        BoundedStacks x = new BoundedStacks(4);
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
        x.push("7");
        x.push("8");
        x.push("9");
        x.push("10000");
        System.out.println(x);
        System.out.println(x.isFull());

    }
}
