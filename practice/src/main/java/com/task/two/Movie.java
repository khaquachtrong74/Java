package com.task.two;

public class Movie {
    private String title;
    private String genre;// type
    private int duration;

    public Movie(String title, String genre, int duration) {
        this.duration = duration;
        this.genre = genre;
        this.title = title;
    }

   

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Titile: ").append(this.title);
        stringBuilder.append("\nGenre: ").append(this.genre);
        stringBuilder.append("\nDuration: ").append(this.duration);
        return stringBuilder.toString();
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
