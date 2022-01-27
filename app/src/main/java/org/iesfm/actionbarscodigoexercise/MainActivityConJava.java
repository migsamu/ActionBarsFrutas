package org.iesfm.actionbarscodigoexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivityConJava extends AppCompatActivity {

    private ImageView ivFrutaJava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_con_java);
        ivFrutaJava = (ImageView) findViewById(R.id.mcj_ivFruta);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        SubMenu manzanas = menu.addSubMenu(Menu.NONE, 1, Menu.NONE, "Manzanas");
        menu.add(Menu.NONE, 2, Menu.NONE, "Platanos");
        SubMenu peras = menu.addSubMenu(Menu.NONE, 3, Menu.NONE, "Peras");

        manzanas.add(Menu.NONE, 11, Menu.NONE, "Golden");
        manzanas.add(Menu.NONE, 12, Menu.NONE, "Pink Lady");
        peras.add(Menu.NONE, 31, Menu.NONE, "Conferencia");
        peras.add(Menu.NONE, 32, Menu.NONE, "Limoneras");
        menu.add(Menu.NONE, 4, Menu.NONE, "Menu xml");

        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case 1:
                Toast.makeText(this, "Ha seleccionado manzanas.", Toast.LENGTH_SHORT).show();
                return true;
            case 12:
                Toast.makeText(this, "Ha seleccionado manzanas pink lady.", Toast.LENGTH_SHORT).show();
                ivFrutaJava.setImageResource(R.drawable.manzana_pink_lady);
                return true;
            case 11:
                Toast.makeText(this, "Ha seleccionado manzanas golden.", Toast.LENGTH_SHORT).show();
                ivFrutaJava.setImageResource(R.drawable.manzana_golden);
                return true;
            case 2:
                Toast.makeText(this, "Ha seleccionado plátanos.", Toast.LENGTH_SHORT).show();
                ivFrutaJava.setImageResource(R.drawable.platano);
                return true;
            case 3:
                Toast.makeText(this, "Ha seleccionado peras.", Toast.LENGTH_SHORT).show();
                return true;
            case 31:
                Toast.makeText(this, "Ha seleccionado peras conferencia.", Toast.LENGTH_SHORT).show();
                ivFrutaJava.setImageResource(R.drawable.pera_conferencia);
                return true;
            case 32:
                Toast.makeText(this, "Ha seleccionado peras limoneras.", Toast.LENGTH_SHORT).show();
                ivFrutaJava.setImageResource(R.drawable.pera_limonera);
                return true;
            case 4:
                Toast.makeText(this, "Ha seleccionado menu oon JAva.", Toast.LENGTH_SHORT).show();
                Intent conXml = new Intent(this, MainActivity.class);
                startActivity(conXml);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}