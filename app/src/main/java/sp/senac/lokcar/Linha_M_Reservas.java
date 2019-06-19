package sp.senac.lokcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Linha_M_Reservas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linha__m__reservas);

        ListView lista = (ListView) findViewById(R.id.Lista_reservas);

        ArrayList<String> minhareserva = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 );
        lista.setAdapter(arrayAdapter);

    }

    private ArrayList<String> preencherDados() {
        ArrayList<String> dados = new ArrayList<String>();
        dados.add("Carro 1");
        dados.add("Carro 2");
        dados.add("Carro 3");
        dados.add("Carro 4");
        return dados;
    }
}
