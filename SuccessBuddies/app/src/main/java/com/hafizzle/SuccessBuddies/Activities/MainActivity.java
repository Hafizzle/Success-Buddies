package com.hafizzle.SuccessBuddies.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hafizzle.SuccessBuddies.Adapters.SprintAdapter;
import com.hafizzle.SuccessBuddies.Objects.Sprint;
import com.hafizzle.SuccessBuddies.R;

import java.util.ArrayList;

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
