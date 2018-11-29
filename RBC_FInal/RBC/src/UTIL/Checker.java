/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author LucasDR
 */
public class Checker {

    public static double similaridadeLocal(int CasoP, int CasoB, int max) {
        if (CasoP == -1 || CasoB == -1) {
            return 0.0;
        }
        int mod = CasoP - CasoB;
        double d = Math.abs((double) mod);
        double valor = 1.0 - d / max;
        return valor;
    }

    public static boolean similaridadeGlobal(ManageData data) {

        //for (int i = 0; i < 2; i++) {
            
        for (int i = 0; i < data.getBase().size(); i++) {
            int pesos = 0;
            double valor = 0;
            for (int j = 2; j < data.getBase().get(i).getAtbValues().size(); j++) {
                AtbValue atb = data.getBase().get(i).getAtbValues().get(j);
                int peso = data.getPesos().get(atb.getAtributo());
                pesos += peso;
                valor += (atb.getSl() * peso);
                //System.out.println(atb.getSl()+ " Var: "+atb.getAtributo());
            }
            
            
            double sg = valor/pesos;
            
            //System.out.println(valor+"   "+pesos);
            System.out.println("Similaridade Global Caso: '"+(i+1)+"' => "+sg);
            data.getBase().get(i).setSg(sg);
        }

        return true;
    }
}
