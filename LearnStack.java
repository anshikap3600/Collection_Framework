import java.util.Stack;
public class LearnStack {
    public static void main(String[] args){
        Stack<String> animal = new Stack<>();
        animal.push("Cat");
        animal.push("Dog");
        animal.push("Cow");
        animal.push("Lion");
        animal.push("Elephant");
        System.out.println("Stack : " +animal);
        System.out.println(animal.peek());
        System.out.println(animal.pop());
        System.out.println(animal);
        System.out.println(animal.isEmpty());
        System.out.println(animal.search("Dog"));
    }
}
