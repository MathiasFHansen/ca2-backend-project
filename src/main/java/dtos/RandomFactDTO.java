package dtos;

public class RandomFactDTO {
    String text;

    public RandomFactDTO() {
    }

    public RandomFactDTO(String fact) { this.text = fact; }

    public String getText() { return text; }

    public void setText(String text) { this.text = text; }
}
