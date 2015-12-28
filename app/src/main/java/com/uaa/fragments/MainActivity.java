package com.uaa.fragments;

import android.content.res.Configuration;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //obtenemos el manejador de fragmentos
        FragmentManager fragmentManager = getSupportFragmentManager();

        //para hacer cambios a los fragmentos es necesario iniciar transacciones (añadir, remover y reemplazar fragmentos)
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //obtenemos la configuracion del sistema
        Configuration configInfo = getResources().getConfiguration();

        //si el dispositivo se encuentra en modo lanscape se mostrará el fragmento "Fragment_landscape"
        //en caso contrario se mostrará "Fragment_portrait"
        if(configInfo.orientation == Configuration.ORIENTATION_LANDSCAPE){
            FragmentLandscape fragmentLandscape = new FragmentLandscape();
            fragmentTransaction.replace(android.R.id.content, fragmentLandscape);
        } else{
            FragmentPortrait fragmentPortrait = new FragmentPortrait();
            fragmentTransaction.replace(android.R.id.content, fragmentPortrait);
        }

        //siempre es necesario comitear la transacción
        fragmentTransaction.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
