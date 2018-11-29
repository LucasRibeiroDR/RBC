/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

/**
 *
 * @author LucasDR
 */
public class main {
    public static void main(String[] args) {
        DataAccess teste = new DataAccess();
        teste.setBase("base.csv");
        teste.setPesos("pesos.csv");
        teste.setAtributos("atributos.csv");
        Base at = teste.getBaseCompleta().getBase().get(1);
        System.out.println(at.getAtbValues().get(5).toString());
    }
}
