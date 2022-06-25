package poo02_zapatitos;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Empresa {
    private String nombre;
    private Zapato[] zapatoses;
   // private List<Zapato> listZapatos;
    // Vector<Zapato> vectZapatos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Zapato[] getZapatoses() {
        return zapatoses;
    }

    public void setZapatoses(Zapato[] zapatoses) {
        this.zapatoses = zapatoses;
    }

    /*public List<Zapato> getListZapatos() {
        return listZapatos;
    }

    public void setListZapatos(List<Zapato> listZapatos) {
        this.listZapatos = listZapatos;
    }

    public Vector<Zapato> getVectZapatos() {
        return vectZapatos;
    }

    public void setVectZapatos(Vector<Zapato> vectZapatos) {
        this.vectZapatos = vectZapatos;
    }*/
    
    
    
    
    public void listaModelos() {
        System.out.println("En la empresa " + this.nombre + "tenemos");
        System.out.println(Arrays.toString(this.zapatoses));
        //System.out.println(Arrays.toString(this.listZapatos.toArray()));
    }
    
}
