package entities;

public class Book {
    private String title;
    private String author;
    private int publishDate;
    private String genre;
    private int pages;

    public Book(String title, String author, int publishDate, String genre, int pages) {
        this.title = title;
        this.author = author;
        this.publishDate = publishDate;
        this.genre = genre;
        this.pages = pages;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: ").append(title).append("\n");
        sb.append("Author: ").append(author).append("\n");
        sb.append("Publish Date: ").append(publishDate).append("\n");
        sb.append("Genre: ").append(genre).append("\n");
        sb.append("Pages: ").append(pages).append("\n");
        return sb.toString();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
