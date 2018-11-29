package UTIL;

import java.util.HashMap;

public class Atributo {
    private String atributo;
    private HashMap<String, String> valor;
    
    public Atributo(String atributo) {
        this.atributo = atributo;
        valor = new HashMap<>();
    }
    //________________________________________________
    
    public String getAtributo() {
        return atributo;
    }
    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }
    public void addValor(String valor, String nome){ 
        this.valor.put(valor, nome);
        //System.out.println("Valor: "+valor+"     Nome: "+nome);
    }
    public HashMap<String, String> getValor() {
        return valor;
    }
    public void setValor(HashMap<String, String> valor) {
        this.valor = valor;
    }

}
