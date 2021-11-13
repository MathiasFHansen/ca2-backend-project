package dtos;

public class CatImageDTO {
    String catImageUrl;

    public CatImageDTO() {
    }

    public CatImageDTO(String catImageUrl) { this.catImageUrl = catImageUrl; }

    public String getCatImageUrl() { return catImageUrl; }

    public void setCatImageUrl(String catImageUrl) { this.catImageUrl = catImageUrl; }
}
