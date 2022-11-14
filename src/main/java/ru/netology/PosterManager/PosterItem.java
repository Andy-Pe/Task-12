package ru.netology.PosterManager;

public class PosterItem {
    private int id;
    private int movieId;
    private String movieName;
    private int releaseDate;
    private String genre;

    public PosterItem(int id, int movieId, String movieName, int releaseDate, String genre) {
        this.id = id;
        this.movieId = movieId;
        this.movieName = movieName;
        this.releaseDate = releaseDate;
        this.genre = genre;
    }
}
