package sp.senac.lokcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;

public class Linha_Minhas_Reservas extends AppCompatActivity {
    ListView listView;
    String[] minhas_reservas ={"minhas_reservas"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linha__mreservas);


    }



}
