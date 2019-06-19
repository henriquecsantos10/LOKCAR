package sp.senac.lokcar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Info_veiculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_info_veiculo);
    }

    public void abrirmenu(View view) {
        switch (view.getId()) {
            case R.id.confirmar:
                startActivity(new Intent(getApplicationContext(), Menu_Cliente.class));
        }
    }
}
