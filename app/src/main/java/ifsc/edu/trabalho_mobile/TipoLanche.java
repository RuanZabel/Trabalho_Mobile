package ifsc.edu.trabalho_mobile;

import java.io.Serializable;

public class TipoLanche {
    private String tipo = "";
    private double preco = 0;
    private String sabor = "";

    public void colocarPreco(double preco){
        this.preco = preco;
    }
    public double buscarPreco(){
        return  this.preco;
    }
    public void colocarNome(String nome){
        this.tipo = nome;
    }
    public String buscarTipo(){
        return tipo;
    }
    public void colocarSabor(String sabor){
        this.sabor = sabor;
    }
    public String buscarSabor(){
        return sabor;
    }
}
