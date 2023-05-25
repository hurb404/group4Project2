public class ElementRiddle {
    private String element;

    public ElementRiddle(String element) {
        this.element = "";  // The element is not properly filled
    }

    public String getRiddle(String inputElement) {
        if (inputElement.equals(element)) {
            return "I stride with power and grace, fear not my artificial face. Seek my image where you rest, in the place you know best.";
        }
        return "Element not found";
    }

    public String getFalseRiddle(String inputElement) {
        if (inputElement.equals(element)) {
            return "The answer you seek is not here, look beyond the surface, clear.";
        }
        return "Element not found";
    }
}
