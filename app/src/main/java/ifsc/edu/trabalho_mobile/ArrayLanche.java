package ifsc.edu.trabalho_mobile;

import java.io.Serializable;
import java.util.ArrayList;

public class ArrayLanche implements Serializable {
    ArrayList<TipoLanche> array =new ArrayList<TipoLanche>();

    public void inserirLanche(TipoLanche lanche){
        array.add(lanche);
    }
    public  ArrayList buscarArray(){
        return array;
    }
}
