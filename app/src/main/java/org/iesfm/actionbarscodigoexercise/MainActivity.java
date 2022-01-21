package org.iesfm.actionbarscodigoexercise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView ivFruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivFruta = (ImageView) findViewById(R.id.ivFrutas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mm_manzana:
                Toast.makeText(this, "Ha seleccionado manzanas.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_lady:
                Toast.makeText(this, "Ha seleccionado manzanas pink lady.", Toast.LENGTH_SHORT).show();
                ivFruta.setImageResource(R.drawable.manzana_pink_lady);
                return true;
            case R.id.mm_golden:
                Toast.makeText(this, "Ha seleccionado manzanas golden.", Toast.LENGTH_SHORT).show();
                ivFruta.setImageResource(R.drawable.manzana_golden);
                return true;
            case R.id.mm_platano:
                Toast.makeText(this, "Ha seleccionado plátanos.", Toast.LENGTH_SHORT).show();
                ivFruta.setImageResource(R.drawable.platano);
                return true;
            case R.id.mm_pera:
                Toast.makeText(this, "Ha seleccionado peras.", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mm_conferencia:
                Toast.makeText(this, "Ha seleccionado peras conferencia.", Toast.LENGTH_SHORT).show();
                ivFruta.setImageResource(R.drawable.pera_conferencia);
                return true;
            case R.id.mm_limonera:
                Toast.makeText(this, "Ha seleccionado peras limoneras.", Toast.LENGTH_SHORT).show();
                ivFruta.setImageResource(R.drawable.pera_limonera);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }
}