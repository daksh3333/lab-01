package com.example.lab1;
import java.util.Date;
public class Dog extends Pet implements Pettable{       //inherits Pet and follows Pettable interface
    public Dog(String name) {       //just name
        super(name);                //sends to parent
    }
    public Dog(String name, Date birthDate){        //name+birth
        super(name, birthDate);                     //sends to parent
    }

    @Override
    public String speak() {
        return "bark";
    }

    @Override
    public void pet() {
    }
}