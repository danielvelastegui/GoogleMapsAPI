package com.danielvelastegui.mismapas;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        int lugar;
        Bundle getInfo = getIntent().getExtras();
        LatLng lugarUno = new LatLng(-1.241801, -78.628943);
        LatLng lugarDos = new LatLng(-1.246365, -78.658912);
        LatLng lugarTres = new LatLng(-1.392877, -78.426833);
        LatLng lugarCuatro = new LatLng(-0.002301, -78.455766);

        lugar = getInfo.getInt("lugar");

        switch(lugar){
            case 1:
                mMap.addMarker(new MarkerOptions().position(lugarUno).title("La Catedral"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(lugarUno));
                break;
            case 2:
                mMap.addMarker(new MarkerOptions().position(lugarDos).title("Parque La Familia"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(lugarDos));
                break;
            case 3:
                mMap.addMarker(new MarkerOptions().position(lugarTres).title("Banos"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(lugarTres));
                break;
            case 4:
                mMap.addMarker(new MarkerOptions().position(lugarCuatro).title("Mitad del Mundo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(lugarCuatro));
                break;
        }
        // Add a marker in Sydney and move the camera
//        LatLng sydney = new LatLng(-34, 151);
//
//
//        mMap.addMarker(new MarkerOptions().position(lugarUno).title("La Catedral"));
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(lugarUno));
    }
}