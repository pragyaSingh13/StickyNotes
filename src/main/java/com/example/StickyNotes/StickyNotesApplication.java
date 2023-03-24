package com.example.StickyNotes;

import Controller.HomeController;
import Repository.NoteRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan("Repository.NoteRepo")

public class StickyNotesApplication {

	public static void main(String[] args) {
		SpringApplication.run(StickyNotesApplication.class, args);
	}

}
