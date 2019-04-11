package ifsc.edu.trabalho_mobile;

import java.util.ArrayList;

public class ArrayLanche {
    ArrayList<TipoLanche> array =new ArrayList<TipoLanche>();

    public void inserirLanche(TipoLanche lanche){
        array.add(lanche);
    }
    public  ArrayList buscarArray(){
        return array;
    }
}
