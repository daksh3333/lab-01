package com.example.lab1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Cat cat = new Cat("Lucy");      //specific instances of classes
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        ArrayList<Pet> petList = new ArrayList<Pet>();      //polymorphism

// Can store both Cat and Dog objects
// since they both inherit from Pet
        petList.add(scorpion);      //is-a pet
        petList.add(cat);
        petList.add(dog);

        ArrayList<Pettable> pettablePets = new ArrayList<>();       //poly
        pettablePets.add(cat);      //is pettable
        pettablePets.add(dog);

    }
}