package com.gmbdesign.s39_003_layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
     * desde la vista de proyecto creamos una nueva carpeta layout-land al mismo nivel que layout
     * en ella copiamos el activity-main.xml, mantenemos el mismo nombre, ya que es el que
     * especificamos en el metodo onCreate.
     *
     * Con esto vamos a conseguir tener una vista diseñada especificamente para portrait y otra
     * para landscape
     *
     * tambien podemos crear layout para resoluciones especificas como por ejemplo:
     * layout-sw720dp -> valdría para pantallas con esa resolución o mayor (10")
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
