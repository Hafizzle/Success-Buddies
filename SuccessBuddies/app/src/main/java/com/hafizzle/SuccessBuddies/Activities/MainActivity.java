package com.hafizzle.successbuddies.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hafizzle.successbuddies.Adapters.SprintAdapter;
import com.hafizzle.successbuddies.Objects.Sprint;
import com.hafizzle.successbuddies.R;

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
