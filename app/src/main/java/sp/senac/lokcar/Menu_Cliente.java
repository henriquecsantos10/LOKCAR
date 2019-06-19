package sp.senac.lokcar;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Switch;

public class Menu_Cliente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout__menu_cliente);
    }

    public void btn_dados(View view) {
    }

    public void selecionarJanela(View view) {
        switch (view.getId()){
            case R.id.meusdados: startActivity(new Intent(getApplicationContext(),Dados_Cliente_fis.class));
            break;

            case R.id.minhas_reservas: startActivity(new Intent(getApplicationContext(),Linha_M_Reservas.class));
                break;

            case R.id.fazer_nova_reserva: startActivity(new Intent(getApplicationContext(),Nova_Reserva.class));
                break;
        }
    }


}
