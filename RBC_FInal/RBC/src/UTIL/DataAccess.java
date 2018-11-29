package UTIL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author LucasDR
 */
public class DataAccess {

    private ManageData baseCompleta;
    private ArrayList<String> atrbName;
    private int x;
    public DataAccess() {
        baseCompleta = new ManageData();
        atrbName = new ArrayList<>();
        x=0;
    }

    public void setBase(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine();
            String atb[] = linha.split(";");
            while (linha != null) {
                Base b = new Base();
                String aux[];
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                for (int i = 0; i < aux.length; i++) {
                    b.getAtbValues().add(new AtbValue(atb[i], aux[i]));
                }
                getBaseCompleta().getBase().add(b);
            }
            for (int i = 0; i < getBaseCompleta().getBase().size(); i++) {
                //baseCompleta.getBase().get(i).toStringA();
                //System.out.println(baseCompleta.getBase().get(i) + "        QUANTIA:   " + (i + 1));
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }

    public void setPesos(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                String aux[];
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                getBaseCompleta().getPesos().put(aux[0], Integer.parseInt(aux[1]));
                //System.out.println(baseCompleta.getPesos().get(aux[0]));
            }
            for (int i = 0; i < getBaseCompleta().getPesos().size(); i++) {

            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }

    public void setAtributos(String path) {
        try {
            FileReader arq = new FileReader(path);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                String aux[];
                Atributo at=null;
                linha = lerArq.readLine();
                if (linha == null) {
                    break;
                }
                aux = linha.split(";");
                if("-".equals(aux[0])){ 
                    int n = getBaseCompleta().getAtributos().size();
                    getBaseCompleta().getAtributos().get(n-1).addValor(aux[1],aux[2]);
                    //System.out.println(baseCompleta.getAtributos().get(n-1).getValor().get(aux[1]));
                    getAtrbName().add(aux[1]);
                    //System.out.println("Atributo: "+baseCompleta.getAtributos().get(n-1).getAtributo()+"  |Valor: "+aux[1]+"| Nome: "+aux[2]);
                }else{      
                    
                    at = new Atributo(aux[0]);
                    getBaseCompleta().getAtributos().add(at);int n = getBaseCompleta().getAtributos().size();
                    getBaseCompleta().getAtributos().get(n-1).addValor(aux[1],aux[2]);           
                    //System.out.println(baseCompleta.getAtributos().get(n-1).getValor().get(aux[1])); 
                    getAtrbName().add(aux[1]);
                    //System.out.println("Atributo: "+baseCompleta.getAtributos().get(n-1).getAtributo()+"  |Valor: "+aux[1]+"| Nome: "+aux[2]);
                }   
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
    }
    
    public ManageData getBaseCompleta() {
        return baseCompleta;
    }

    public ArrayList<String> getAtrbName() {
        return atrbName;
    }

    public void setAtrbName(ArrayList<String> atrbName) {
        this.atrbName = atrbName;
    }
}
