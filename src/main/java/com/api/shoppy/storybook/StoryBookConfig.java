package com.api.shoppy.storybook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

import static java.util.Calendar.JULY;

@Configuration

public class StoryBookConfig {
    //Pre-populate the database using this class
    @Bean
    CommandLineRunner commandLineRunner (StoryBookRepository storybookRepository){
        //Takes instance of the Interface class
        return args -> {
            //Populate the database with this firstItem object
            StoryBook firstItem = new StoryBook(
                    "Grief Child",
                    "Usman",
                    "Fantasy, Satire",
                    "books",
                    100.00,
                    LocalDate.of(2022, JULY, 3)

            );
           storybookRepository.save(firstItem);
        };
    };

}
