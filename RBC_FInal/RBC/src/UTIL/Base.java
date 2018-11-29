package UTIL;

import java.util.ArrayList;

public class Base {


   
   public static int id = 0;
   private ArrayList<AtbValue> atbValues;
   private int idP;
   private double sg;
   
   public Base(){
       atbValues = new ArrayList<>();
       idP=id;
       id++;
   }
    public ArrayList<AtbValue> getAtbValues() {
        return atbValues;
    }
    public void setAtbValues(ArrayList<AtbValue> baseData) {
        this.atbValues = baseData;
    }
   @Override
    public String toString(){
        return "Caso: "+idP+"  | SG: "+sg;
    }

    public int getId() {
        return idP;
    }
    public void setId(int idP) {
        this.idP = idP;
    }

    public double getSg() {
        return sg;
    }

    public void setSg(double sg) {
        this.sg = sg;
    }
   
   
}
