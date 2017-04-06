package com.anncode.aplicacioncontactos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.anncode.recyclerviewfragments.R;

/**
 * Created by anahisalgado on 19/04/16.
 */
public class DetalleContacto extends AppCompatActivity {
    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_LIKES = "like";
    //private TextView tvNombre;
    //private TextView tvTelefono;
    //private TextView tvEmail;

    private ImageView imgFotoDetalle;
    private TextView tvLikesDetalle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle extras      = getIntent().getExtras();
        String url      = extras.getString("KEY_EXTRA_URL");
        String likes    = extras.getString("KEY_EXTRA_LIKES");
        //String email       = extras.getString("email");


        //tvNombre    = (TextView) findViewById(R.id.tvNombre);
        //tvTelefono  = (TextView) findViewById(R.id.tvTelefono);
        //tvEmail     = (TextView) findViewById(R.id.tvEmail);

        tvLikesDetalle     = (TextView) findViewById(R.id.tvLikesDetalle);
        tvLikesDetalle.setText(String.valueOf(likes));
        //tvTelefono.setText(telefono);
        //tvEmail.setText(email);


    }
/*
    public void llamar(View v) {
        String telefono = tvTelefono.getText().toString();
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider x
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        startActivity(new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + telefono)));

    }

    public void enviarMail(View v){
        String email = tvEmail.getText().toString();
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, email);
        emailIntent.setType("message/rfc822");
        startActivity(Intent.createChooser(emailIntent, "Email "));
    }

*/
}
