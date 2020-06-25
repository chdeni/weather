package com.chdeni.weather;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    String[] cities = {"Москва", "Самара", "Вологда", "Волгоград", "Саратов", "Воронеж"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String instanceState;
        if (savedInstanceState == null)
        {
            instanceState = "Первый запуск";
        }
        else
        {
            instanceState = "Повторный запуск";
        }
        Toast.makeText(getApplicationContext(), instanceState + " - onCreate()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", instanceState + " - onCreate()");

        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, cities);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        ImageButton button2 = findViewById(R.id.imageButton5);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setContentView(R.layout.activity_main2);
            }
        });
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Toast.makeText(getApplicationContext(), "onStart()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onStart()");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        Toast.makeText(getApplicationContext(), "Повторный запуск! - onRestoreInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "Повторный запуск! - onRestoreInstanceState()");
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "onResume()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onResume()");
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(getApplicationContext(), "onPause()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onPause()");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle saveInstanceState)
    {
        super.onSaveInstanceState(saveInstanceState);
        Toast.makeText(getApplicationContext(), "onSaveInstanceState()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onSaveInstanceState()");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(getApplicationContext(), "onStop()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onStop()");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "onRestart()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onRestart()");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "onDestroy()", Toast.LENGTH_SHORT).show();
        Log.d("MySCREEN", "onDestroy()");
    }
}