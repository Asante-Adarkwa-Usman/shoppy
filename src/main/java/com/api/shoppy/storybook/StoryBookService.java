package com.api.shoppy.storybook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StoryBookService {
    //Implement the business logic here
    private final StoryBookRepository storyBookRepository;   //Decoupling

    @Autowired
    public StoryBookService(StoryBookRepository storyBookRepository) {
        this.storyBookRepository = storyBookRepository;
    }

    /**
     *
      * @return This returns a list of all storybook items
     */



    //Fetch all storybooks
    public List<StoryBook> getStoryBookList() {
        return storyBookRepository.findAll();
    }

    //Find StoryBook by Id
    public Optional<StoryBook> getStoryBook(Long storyBookId) {
       Optional<StoryBook> storyBookOptional = storyBookRepository.findById(storyBookId);
       if (!storyBookOptional.isPresent()) {
           throw new IllegalArgumentException("Item with id " + storyBookId + " not found");
       }
       return storyBookRepository.findById(storyBookId);
    }

    //Add a new storybook
    public StoryBook addNewStoryBook(StoryBook storyBook) {
        Optional<StoryBook> storyBookOptional = storyBookRepository.findStoryBookByTitle(storyBook.getTitle());

        if (storyBookOptional.isPresent()) {
            throw new IllegalArgumentException("Item with title " + storyBook.getTitle() + " already exists");
        }

        StoryBook savedStoryBook = storyBookRepository.save(storyBook);
        return savedStoryBook;

    }


}
