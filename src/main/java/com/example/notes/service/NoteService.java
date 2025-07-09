package com.example.notes.service;

import com.example.notes.model.Note;
import com.example.notes.repository.NoteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {

    private final NoteRepository repo;

    public NoteService(NoteRepository repo) {
        this.repo = repo;
    }

    public List<Note> findAll() {
        return repo.findAll();
    }

    public Note findById(Long id) {
        return repo.findById(id)
                   .orElseThrow(() -> new EntityNotFoundException("Note not found"));
    }

    public Note save(Note note) {
        return repo.save(note);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
