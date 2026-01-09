package com.example.lab1;
import java.util.Date;
public class Cat extends Pet implements Pettable{   //inherits Pet and follows Pettable interface
    public Cat(String name) {   //just name
        super(name);            //sends to parent
    }
    public Cat(String name, Date birthDate){    //name+birth
        super(name, birthDate);                 //sends to parent
    }

    @Override
    public String speak() {
        return "meow";
    }

    @Override
    public void pet() {
    }
}
