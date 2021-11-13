package dtos;

public class RandomFactDTO {
    String fact;

    public RandomFactDTO() {
    }

    public RandomFactDTO(String fact) { this.fact = fact; }

    public String getFact() { return fact; }

    public void setFact(String fact) { this.fact = fact; }
}
