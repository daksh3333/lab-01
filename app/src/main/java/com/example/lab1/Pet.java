package com.example.lab1;
import java.util.Date;  //Date tool imported
public abstract class Pet {     //abstract allows for specific animal objects
    private String name;    //only Pet class can see name
    private Date birthDate; // only Pet class can see birthday


    public Pet(String name) {       //only know the name
        this.name = name;           //name = name passed
        this.birthDate = new Date();//sets birthday to right now
    }

    public Pet(String name, Date birthDate) {   //know both name and birthday
        this.name = name;
        this.birthDate = birthDate;;
    }

    public String getName() {       //getter
        return name;
    }

    public void setName(String name){      //setter
        this.name = name;
    }

    public Date getBirthDate(){ //getter
        return birthDate;
    }

    public void setBirthDate(Date birthDate){   //setter
        this.birthDate = birthDate;
    }

    public abstract String speak();     //makes subclasses implement sound
}
