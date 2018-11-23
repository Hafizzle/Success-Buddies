package com.hafizzle.relentlessbuddies.Objects;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class Sprint {

    private Drawable sprintImage;
    private String sprintName;
    private String owner;
    private String buddyOne;
    private String buddyTwo;

    public Sprint(String sprintName, String owner) {
        this.sprintName = sprintName;
        this.owner = owner;
    }

    public Sprint(String sprintName, String owner, String buddyOne) {
        this.sprintName = sprintName;
        this.owner = owner;
        this.buddyOne = buddyOne;
    }

    public Sprint(String sprintName, String owner, String buddyOne, String buddyTwo) {
        this.sprintName = sprintName;
        this.owner = owner;
        this.buddyOne = buddyOne;
        this.buddyTwo = buddyTwo;
    }

    public Drawable getSprintImage() {
        return sprintImage;
    }

    public void setSprintImage(Drawable sprintImage) {
        this.sprintImage = sprintImage;
    }


    public String getSprintName() {
        return sprintName;
    }

    public void setSprintName(String sprintName) {
        this.sprintName = sprintName;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBuddyOne() {
        return buddyOne;
    }

    public void setBuddyOne(String buddyOne) {
        this.buddyOne = buddyOne;
    }

    public String getBuddyTwo() {
        return buddyTwo;
    }

    public void setBuddyTwo(String buddyTwo) {
        this.buddyTwo = buddyTwo;
    }
}
