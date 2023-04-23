package com.example.listofcars;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    private List<Car> cars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        setInitialData();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        Caradapter adapter = new CarAdapter(cars, this);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {

        cars = new ArrayList<>();

        cars.add(new Car());

    }

}