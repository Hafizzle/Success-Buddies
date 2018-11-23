package com.hafizzle.relentlessbuddies.Activities;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.hafizzle.relentlessbuddies.Adapters.SprintAdapter;
import com.hafizzle.relentlessbuddies.Objects.Sprint;
import com.hafizzle.relentlessbuddies.R;

import java.util.ArrayList;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    public void init(){
/*
        TextView helloName = (TextView)findViewById(R.id.helloName);
        //Why the fuck doesn't this text work
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/LFAX.ttf");
        helloName.setTypeface(custom_font);
*/


        ArrayList<Sprint> sprints = new ArrayList<>();
        Sprint sprint = new Sprint("Singing", "Hafiz");
        sprints.add(sprint);
        SprintAdapter sprintAdapter = new SprintAdapter(sprints, this);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        recyclerView.setAdapter(sprintAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }


}
