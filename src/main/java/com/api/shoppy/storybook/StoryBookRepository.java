package com.api.shoppy.storybook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StoryBookRepository extends JpaRepository<StoryBook, Long> {
  //JPA - Java Persistent Api
  //It takes the entity class name and the datatype  of the storyBookId

    //Write a query to findStoryBookByTitle
    @Query("SELECT s from StoryBook s WHERE s.title = ?1") //JPQL - Java Persistent Query Language
    List<StoryBook> findStoryBookByTitle(String storyBookTitle);

}
