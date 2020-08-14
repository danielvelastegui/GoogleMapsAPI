package com.danielvelastegui.mismapas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startMaps(View V){

    }

    public void startLugarUno(View view) {
        Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
        intentMaps.putExtra("lugar", 1);
        startActivity(intentMaps);
        Toast.makeText(this, "Lugar Uno", Toast.LENGTH_SHORT).show();
    }

    public void startLugarDos(View view) {
        Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
        intentMaps.putExtra("lugar", 2);
        startActivity(intentMaps);
        Toast.makeText(this, "Lugar Dos", Toast.LENGTH_SHORT).show();
    }

    public void startLugarTres(View view) {
        Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
        intentMaps.putExtra("lugar", 3);
        startActivity(intentMaps);
        Toast.makeText(this, "Lugar Tres", Toast.LENGTH_SHORT).show();
    }

    public void startLugarCuatro(View view) {
        Intent intentMaps = new Intent(MainActivity.this, MapsActivity.class);
        intentMaps.putExtra("lugar", 4);
        startActivity(intentMaps);
        Toast.makeText(this, "Lugar Cuatro", Toast.LENGTH_SHORT).show();
    }
}