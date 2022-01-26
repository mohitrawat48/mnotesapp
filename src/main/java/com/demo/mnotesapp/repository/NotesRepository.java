package com.demo.mnotesapp.repository;

import com.demo.mnotesapp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotesRepository extends JpaRepository<Note,Long> {
}
