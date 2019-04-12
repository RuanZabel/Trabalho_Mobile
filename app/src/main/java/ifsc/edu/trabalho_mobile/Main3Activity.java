package ifsc.edu.trabalho_mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lanchesComprados();


    }

    private void lanchesComprados(){
        double preco = 10;
        TextView totalPagar=(TextView) findViewById(R.id.textValorPag);
        totalPagar.setText(""+preco);

    }
}
