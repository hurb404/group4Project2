public class Main {
    public static void main(String[] args) {
        ElementRiddle elementRiddle = new ElementRiddle(""); // Element name is missing
        System.out.println(elementRiddle.getRiddle("Radon")); // Provided the correct element name but calling wrong function
    }
}
