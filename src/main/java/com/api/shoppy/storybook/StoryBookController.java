package com.api.shoppy.storybook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/shoppy/storybook") //the uri for the storybook data
public class StoryBookController {
 private final StoryBookService storyBookService;

  @Autowired
    public StoryBookController(StoryBookService storyBookService) {
        this.storyBookService = storyBookService;
    }

    // Get all storybooks
    @GetMapping
    public List<StoryBook> getStoryBooks() {
      return storyBookService.getStoryBookList();
    }

    //Get storybook by id
    @GetMapping(path = "{storyBookId}")
    public Optional<StoryBook> getStoryBook(@PathVariable Long storyBookId) {
     return storyBookService.getStoryBook(storyBookId);
    }

    //Add new storybook
    @PostMapping
    public StoryBook addNewStoryBook(@RequestBody StoryBook storyBook) {
      return storyBookService.addNewStoryBook(storyBook);
    }
}
