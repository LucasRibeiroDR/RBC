/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTIL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

public class ManageData {

    private HashMap<String, Integer> pesos;
    private ArrayList<Base> base;
    private ArrayList<Atributo> atributos;

    public ManageData() {
        pesos = new HashMap<>();
        base = new ArrayList<>();
        atributos = new ArrayList<>();
    }

    public HashMap<String, Integer> getPesos() {
        return pesos;
    }

    public void setPesos(HashMap<String, Integer> pesos) {
        this.pesos = pesos;
    }

    public ArrayList<Base> getBase() {
        return base;
    }

    public void setBase(ArrayList<Base> base) {
        this.base = base;
    }

    public ArrayList<Atributo> getAtributos() {
        return atributos;
    }

    public void setAtributos(ArrayList<Atributo> atributos) {
        this.atributos = atributos;
    }

    public void sort() {
        Collections.sort(base, new Comparator() {
            public int compare(Object o1, Object o2) {
                Base p1 = (Base) o1;
                Base p2 = (Base) o2;
                return p1.getSg() > p2.getSg() ? -1 : (p1.getSg() < p2.getSg() ? +1 : 0);
            }
        });
    }

    public void reSort() {
        Collections.sort(base, new Comparator() {
            public int compare(Object o1, Object o2) {
                Base p1 = (Base) o1;
                Base p2 = (Base) o2;
                return p1.getId() > p2.getId() ? -1 : (p1.getId() < p2.getId() ? +1 : 0);
            }
        });
    }
}
