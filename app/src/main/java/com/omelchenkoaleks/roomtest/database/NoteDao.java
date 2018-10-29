package com.omelchenkoaleks.roomtest.database;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

public interface NoteDao {

    @Query("SELECT * FROM my_notes")
    LiveData<List<Note>> getAllNotes();

    @Insert(onConflict = REPLACE)
    void insertNote(Note note);

    @Delete
    void deleteNote(Note note);
}
