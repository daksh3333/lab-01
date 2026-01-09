package com.example.lab1;
import java.util.Date;

public class SadMood extends Mood {     //subclass of Mood
    public SadMood(){
        super();                        //default data of Mood
    }

    public SadMood(Date date){
        super(date);
    }

    @Override
    public String getMoodString(){
        return "Sad :(";                //string of sad class
    }
}
