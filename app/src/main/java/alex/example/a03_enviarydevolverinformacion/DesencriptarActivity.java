package alex.example.a03_enviarydevolverinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import alex.example.a03_enviarydevolverinformacion.modelos.Usuario;

public class DesencriptarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desencriptar);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if (bundle != null){
            // String password = bundle.getString("Pass");
           // String email = bundle.getString("Email");

            //Usuario user = new Usuario(email, password);
            Usuario user = (Usuario) bundle.getSerializable("USER");
            Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show();

        }


    }
}