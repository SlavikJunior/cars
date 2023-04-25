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

        CarAdapter adapter = new CarAdapter(this, cars);

        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {

        cars = new ArrayList<>();

        cars.add(new Car("Porsche Cayenne", "среднеразмерный кроссовер премиум класса", "300 км/ч", R.drawable.cayenne));
        cars.add(new Car("Infiniti FX37", "кроссовер класса люкс, объединивший в себе внешность спорткара и внедорожника", "233 км/ч", R.drawable.fx_37s));
        cars.add(new Car("Nissan Skyline GT-R 34", "среднеразмерный спортивный автомобиль с более чем 50-летней историей производства", "315 км/ч", R.drawable.r34));

    }

}