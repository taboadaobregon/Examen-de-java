package Ejercicio8;

public class Movie extends RentalItem{

    private String director;
    private float duration;

    private int ageRating;

    private char genre;

    public Movie(String itemName, int itemID, String available, String director, float duration, int ageRating, char genre) {
        super(itemName, itemID, available);
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
        this.genre = genre;
    }


}
