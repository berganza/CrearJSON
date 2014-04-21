package com.ejemplo.crearjson;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
		/*  Creamos el objeto JSON con el constructor (contamos con diferentes constructores para mapear:
		 "documentación oficial de developer.android")  */
        JSONObject string = new JSONObject(); 
        
        /* Construimos las propiedades del objeto usando los diferentes métodos que se nos proporcionan de manera integrada */
        try {
			string.put("nombre", "Luis");
			string.put("ciudad", "Bilbao");
			string.put("twitter", "@llberganza");
			
			TextView stringJSON = (TextView)findViewById(R.id.stringJSON);
        	
        	stringJSON.setText(string.toString());
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
        
        /*  Una vez tenemos creado el constructor lo vamos recorriendo  */
		/*  Conseguimos la cadena del texto con string.toString  */
        try {
        	
        	/*  Declaramos la variable  */
        	String stringJSON = string.toString();
        	
			/*  Construimos el objeto JSON e implementamos el string  */
        	JSONObject jsonObject = new JSONObject(stringJSON);
        	
        	/*  Rellenamos el JSON  */
        	String nombre = jsonObject.getString("nombre");
        	String ciudad = jsonObject.getString("ciudad");
        	String twitter = jsonObject.getString("twitter");
        	
        	/*  Sacamos el string  */
        	String resultadoJSON = nombre + "\n" + ciudad + "\n" + twitter;
        	
        	TextView datos = (TextView)findViewById(R.id.datos);
        	
        	datos.setText(resultadoJSON);
        	
        	} catch (JSONException e) {
        		Log.i("ERROR","ERROR");
        	}
    }

}