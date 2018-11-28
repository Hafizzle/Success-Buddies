package com.hafizzle.successbuddies.Adapters;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hafizzle.successbuddies.Objects.Sprint;
import com.hafizzle.successbuddies.R;

import java.util.ArrayList;

public class SprintAdapter extends RecyclerView.Adapter<SprintAdapter.ViewHolder>{

    private static final String TAG = "SprintAdapter";
    ArrayList<Sprint> sprints = new ArrayList<>();
    private Context context;


    public SprintAdapter(ArrayList<Sprint> sprints, Context context) {
        this.sprints = sprints;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sprint_cardview, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        holder.sprintImage.setImageDrawable(sprints.get(position).getSprintImage());
        holder.sprintName.setText(sprints.get(position).getSprintName());
        holder.owner.setText(sprints.get(position).getOwner());
        holder.buddyOne.setText(sprints.get(position).getBuddyOne());
        holder.buddyTwo.setText(sprints.get(position).getBuddyTwo());

    }

    @Override
    public int getItemCount() {
        return sprints.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView sprintImage;
        TextView sprintName;
        TextView owner;
        TextView buddyOne;
        TextView buddyTwo;

        public ViewHolder(View itemView) {
            super(itemView);

            sprintImage = itemView.findViewById(R.id.sprintImage);
            sprintName = itemView.findViewById(R.id.sprintName);
            owner = itemView.findViewById(R.id.owner);
            buddyOne = itemView.findViewById(R.id.buddyOne);
            buddyTwo = itemView.findViewById(R.id.buddyTwo);
        }
    }


}

