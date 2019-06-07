package sp.senac.lokcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

    }

    public void abrirmenu(View view) {
        switch (view.getId()){
            case R.id.entrar: startActivity(new Intent(getApplicationContext(),Menu_Cliente.class));
                break;
        }

    }
}
