package com.demo.mnotesapp;

import com.demo.mnotesapp.entity.Note;
import com.demo.mnotesapp.service.intrface.NotesService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class mnotesappApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder
														 application) {
		return application.sources(mnotesappApplication.class);
	}

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext context = SpringApplication.run(mnotesappApplication.class, args);

		Note note = new Note();
		note.setNotecontent("My First Note");

		NotesService notesService = context.getBean(NotesService.class);
		notesService.addNote(note);
	}
}
