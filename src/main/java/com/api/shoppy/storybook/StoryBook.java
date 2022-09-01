package com.api.shoppy.storybook;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "storybook")
public class StoryBook {
//Properties are also column names in the table
    @Id
    @SequenceGenerator(
            name = "storybook_sequence",
            sequenceName = "storybook_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "storybook_sequence"
    )
    private Long storyBookId;
    private String title;
    private String author;
    private String genre;
    private String category;
    private Double price;
    private LocalDate publishedDate;

    //Empty constructor
    public StoryBook() {
    }

     //Constructor for updating
    public StoryBook(
            Long storyBookId,
            String title,
            String author,
            String genre,
            String category,
            Double price,
            LocalDate publishedDate
    ) {
        this.storyBookId = storyBookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.category = category;
        this.price = price;
        this.publishedDate = publishedDate;
    }


    // Constructor for adding a new storyBook
    public StoryBook(
            String title,
            String author,
            String genre,
            String category,
            Double price,
            LocalDate publishedDate) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.category = category;
        this.price = price;
        this.publishedDate = publishedDate;
    }

    public Long getStoryBookId() {
        return storyBookId;
    }

    public void setStoryBookId(Long storyBookId) {
        this.storyBookId = storyBookId;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "StoryBook{" +
                "storyBookId=" + storyBookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", publishedDate=" + publishedDate +
                '}';
    }
}
