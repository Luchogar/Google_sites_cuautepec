package mx.grupogarcia.favorite_sites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goCarmen(View v){
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("direccion", "carmen");
        startActivity(i);
    }
    public void goChiquihuite(View v){
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("direccion", "chiquihuite");
        startActivity(i);
    }
    public void goPreciosa(View v){
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("direccion", "preciosa");
        startActivity(i);
    }
    public void goUacm(View v){
        Intent i=new Intent(this,MapsActivity.class);
        i.putExtra("direccion", "uacm");
        startActivity(i);
    }

}
