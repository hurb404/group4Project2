public class ElementRiddle {
    private String element;

    public ElementRiddle(String element) {
        this.element = "";  // The element is not properly filled
    }

    public String getRiddle(String inputElement) {
        if (inputElement.equals(element)) {
            return "In nature's green embrace I hide, thrice in life, not in pride. Seek my visage in the leafy tide, a cybernetic beast resides inside.";
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
