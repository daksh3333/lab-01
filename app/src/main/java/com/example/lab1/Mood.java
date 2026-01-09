package com.example.lab1;
import java.util.Date;

public abstract class Mood {        //abstract

    private Date date;              //encapsulation

    public Mood(){
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {     //getter
        return date;
    }

    public void setDate(Date date) {        //setter
        this.date = date;

    }

    public abstract String getMoodString();     //makes subclass return string

}
