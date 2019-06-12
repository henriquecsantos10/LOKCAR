package sp.senac.lokcar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.ListView;

public class Linha_Minhas_Reservas extends AppCompatActivity {
    ListView listView;
    String[] minhas_reservas = {"minhas_reservas"};

    int[] imagesreserva = {R.drawable.uno, R.drawable.uno};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_linha__mreservas);

        listView = (ListView) findViewById(R.id.ListView);





    }

    private  class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() { return imagesreserva.length;}

        @Override
        public Object getItem(int position) { return null; }

        @Override
        public long getItemId(int position) { return 0; }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            return null;
        }
    }
}
    


