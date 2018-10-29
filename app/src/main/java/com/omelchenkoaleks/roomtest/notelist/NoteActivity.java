package com.omelchenkoaleks.roomtest.notelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.omelchenkoaleks.roomtest.R;
import com.omelchenkoaleks.roomtest.database.Note;

import java.util.ArrayList;

public class NoteActivity extends AppCompatActivity implements View.OnLongClickListener {

    private NoteViewModel viewModel;
    private RecyclerView recyclerView;
    private NoteAdapter noteAdapter;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.note_list);
        noteAdapter = new NoteAdapter(new ArrayList<Note>(), this);
        linearLayoutManager = new LinearLayoutManager(NoteActivity.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(noteAdapter);


    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
