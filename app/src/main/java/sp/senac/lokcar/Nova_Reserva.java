package sp.senac.lokcar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Nova_Reserva extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_nova__reserva);
    }

    public void abririnfo_veiculo(View view) {
        switch (view.getId()) {
            case R.id.alugar:
                startActivity(new Intent(getApplicationContext(), Info_veiculo.class));
            case R.id.alugar2:
                startActivity(new Intent(getApplicationContext(), Info_veiculo.class));
            case R.id.alugar3:
                startActivity(new Intent(getApplicationContext(), Info_veiculo.class));
            case R.id.alugar4:
                startActivity(new Intent(getApplicationContext(), Info_veiculo.class));
                break;

        }
    }
}

