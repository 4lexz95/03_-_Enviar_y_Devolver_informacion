package alex.example.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import alex.example.a03_enviarydevolverinformacion.modelos.Direccion;

public class CreateDirActivity extends AppCompatActivity {

    private EditText txtcalle;
    private EditText txtciudad;
    private EditText txtnumero;
    private Button btnCrear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_dir);
        inicializavistas();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Direccion direccion = new Direccion(
                        txtcalle.getText().toString(),
                        Integer.parseInt(txtnumero.getText().toString()),
                        txtciudad.getText().toString()
                );
                Bundle bundle = new Bundle();
                bundle.putSerializable("DIR", direccion);
                Intent intent = new Intent();
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();


            }
        });


    }

    private void inicializavistas() {
        txtcalle = findViewById(R.id.txtcallecreardirMain);
        txtciudad = findViewById(R.id.txtciudadcreatedir);
        txtnumero = findViewById(R.id.txtnumerocreatedir);
        btnCrear = findViewById(R.id.btncrearCreateDir);


    }
}