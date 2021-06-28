/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herenciatarea;

/**
 *
 * @author HP_All_in_One
 */
public class Gato extends Animal{
   
    private String nombreMascota;
    private String raza;
    private int Peso;
    private boolean conDesparacitacion;
    private boolean conPulgas;

    public Gato() {
    }

    public Gato(String nombreMascota, String raza, int Peso, boolean conDesparacitacion, boolean conPulgas, int numeroPatas, boolean sangreCaliente, boolean pluricelular) {
        super(numeroPatas, sangreCaliente, pluricelular);
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.Peso = Peso;
        this.conDesparacitacion = conDesparacitacion;
        this.conPulgas = conPulgas;
    }

    public Gato(String nombreMascota, String raza, int Peso, boolean conDesparacitacion, boolean conPulgas) {
        this.nombreMascota = nombreMascota;
        this.raza = raza;
        this.Peso = Peso;
        this.conDesparacitacion = conDesparacitacion;
        this.conPulgas = conPulgas;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int Peso) {
        this.Peso = Peso;
    }

    public boolean isConDesparacitacion() {
        return conDesparacitacion;
    }

    public void setConDesparacitacion(boolean conDesparacitacion) {
        this.conDesparacitacion = conDesparacitacion;
    }

    public boolean isConPulgas() {
        return conPulgas;
    }

    public void setConPulgas(boolean conPulgas) {
        this.conPulgas = conPulgas;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato {" + "nombreMascota=" + nombreMascota + ", raza=" + raza + ", Peso=" + Peso + ", conDesparacitacion=" + conDesparacitacion + ", conPulgas=" + conPulgas + '}';
    }
   
   public void emitirSonido(){
       System.out.println("Miauauauauauauauauauauauauau!!");
   }         
       
}
