package com.example.ejercicio28;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner listaFrutas;
    ListView simpleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleList = (ListView)findViewById(R.id.vistalista);



        String countryList[] = {"India", "China", "australia", "Portugle", "America", "NewZealand"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);



    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.principal, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){
            case R.id.menu1:

                Intent paso2=new Intent(getApplicationContext(),Pantalla2.class);


                Intent intent = new Intent(getApplicationContext(),Pantalla2.class);
                Bundle bundle = new Bundle();

                bundle.putString("nombre", "soy ugb");
                bundle.putString("SegundoNombre", "Antonio");
                bundle.putString("PrimerApellido", "Amaya");
                bundle.putString("SegundoApellido", "Villalta");


                bundle.putBoolean("key_2", true);
                intent.putExtras(bundle);
                startActivity(intent);



                return true;
            case R.id.menu4:
                Toast.makeText(getApplicationContext(),"Item",Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




}