package mx.grupogarcia.favorite_sites;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.widget.Switch;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public String direccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        Bundle parametros = getIntent().getExtras();
        direccion = parametros.getString("direccion");

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

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));


        switch(direccion){
            case "carmen":

                LatLng carmen = new LatLng(19.55065359274727, -99.14788858440556);
                mMap.addMarker(new MarkerOptions().position(carmen).title("Marcador en Deportivo"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(carmen));

                break;

            case "chiquihuite":

                LatLng chiquihuite = new LatLng(19.53552791111555, -99.12902729061284);
                mMap.addMarker(new MarkerOptions().position(chiquihuite).title("Marcador en Chiquihuite"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(chiquihuite));

                break;

            case "preciosa":

                LatLng preciosa = new LatLng(19.5578013995124, -99.13575427082219);
                mMap.addMarker(new MarkerOptions().position(preciosa).title("Marcador en Iglesia"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(preciosa));

                break;

            case "uacm":

                LatLng uacm = new LatLng(19.555749091326057, -99.14183752086797);
                mMap.addMarker(new MarkerOptions().position(uacm).title("Marcador en UACM"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(uacm));

                break;
    }


        Toast.makeText(this, "Estas ubicado en: " + direccion, Toast.LENGTH_LONG).show();

    }
}

