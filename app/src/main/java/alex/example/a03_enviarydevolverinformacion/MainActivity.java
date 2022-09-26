package alex.example.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import alex.example.a03_enviarydevolverinformacion.modelos.Usuario;

public class MainActivity extends AppCompatActivity {

    private EditText txtPass;
    private Button btnDesencriptar;
    private EditText txtemail;
    private Button btncrearDir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incializarvariables();

        btnDesencriptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String password = txtPass.getText().toString();
                String email = txtemail.getText().toString();
                Intent intent = new Intent(MainActivity.this, DesencriptarActivity.class);
                //mochila que dentro lleva lo que quieras
                Bundle bundle = new Bundle();
                bundle.putSerializable("USER",new Usuario(email, password));
                //bundle.putString("PASS",password);
                //bundle.putString("Email",email);

                intent.putExtras(bundle);
                startActivity(intent);

btncrearDir.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        
    }
});
            }
        });

    }

    private void incializarvariables() {
        txtPass = findViewById(R.id.txtPasswordMain);
        btnDesencriptar = findViewById(R.id.btnDesencriptarMain);
        txtemail = findViewById(R.id.txtPasswordMain);
        btncrearDir = findViewById(R.id.btncrearCreateDir);
    }

}