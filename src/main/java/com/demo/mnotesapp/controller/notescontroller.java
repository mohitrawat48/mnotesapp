package com.demo.mnotesapp.controller;

import com.demo.mnotesapp.entity.Note;
import com.demo.mnotesapp.service.intrface.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class notescontroller {

    @Autowired
    NotesService notesService;

    @GetMapping("/{id}")
    public ResponseEntity<Note> getNote(@PathVariable(name = "id") Long id){
        return new ResponseEntity<Note>(notesService.GetNote(id), HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Note>> getNotes(){
        return new ResponseEntity<List<Note>>(notesService.GetAllNotes(), HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Note> addNote(@RequestBody Note note){
        return new ResponseEntity<Note>(notesService.addNote(note), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteNote(@PathVariable(name = "id") Long id){
        notesService.DeleteNote(id);
        return ResponseEntity.ok(null);
    }
}
