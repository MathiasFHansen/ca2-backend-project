package dtos;

public class GeekJokeDTO {
    String joke;


    public GeekJokeDTO() {
    }

    public GeekJokeDTO(String catImageUrl) { this.joke = catImageUrl; }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}
