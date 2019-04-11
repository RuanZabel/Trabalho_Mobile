package ifsc.edu.trabalho_mobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    private ArrayLanche array;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        array = new ArrayLanche();
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void escolherSaborPizza(View view) {

        Spinner sabor=(Spinner) findViewById(R.id.saborPiz);
        TipoLanche lanche =new TipoLanche();
        lanche.colocarNome("Pizza");
        lanche.colocarPreco(32.50);
        lanche.colocarSabor(sabor.getSelectedItem().toString());
        array.inserirLanche(lanche);

    }

    public void comprarLanche(View view) {
        Button botao = (Button) findViewById(R.id.btcompra);
        botao.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
            }

        });
    }

    public void comprarXsalada(View view) {
        Spinner sabor=(Spinner) findViewById(R.id.tipoLanche);
        TipoLanche lanche =new TipoLanche();
        lanche.colocarNome("Lanche");
        lanche.colocarPreco(10.00);
        lanche.colocarSabor(sabor.getSelectedItem().toString());
        array.inserirLanche(lanche);
    }

    public void compraPorcao(View view) {
        Spinner sabor=(Spinner) findViewById(R.id.tipoPorcao);
        TipoLanche lanche =new TipoLanche();
        lanche.colocarNome("Porção");
        lanche.colocarPreco(11.00);
        lanche.colocarSabor(sabor.getSelectedItem().toString());
        array.inserirLanche(lanche);
    }
}
