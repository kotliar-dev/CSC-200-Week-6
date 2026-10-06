public class StackClassTester {
    public static void main(String[] args) {
        String[] catNames = {
                "Simba", "Oliver", "Malenkiy kot", "Benjamin", "Makaroshka", "Plushka", "Ronald"
        };

        StackClass<String> stack = new StackClass<>(catNames);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack);

        stack.push("Ronald");
        System.out.println(stack);

    }
}
