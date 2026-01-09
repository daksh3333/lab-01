package com.example.lab1;
import java.util.Date;
public class Scorpion extends Pet{      //pets but not pettable
    public Scorpion(String name) {
        super(name);                    //sends Pet class the name
    }

    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);         //sends Pet class the name and birthday
    }

    @Override
    public String speak() {
        return "hiss";
    }

}

