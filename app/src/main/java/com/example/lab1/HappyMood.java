package com.example.lab1;
import java.util.Date;

public class HappyMood extends Mood {       //subclass of Mood
    public HappyMood(){
        super();
    }

    public HappyMood(Date date){        //default data of Mood
        super(date);
    }

    @Override
    public String getMoodString(){
        return "Happy :)";              //string of happy class
    }
}
