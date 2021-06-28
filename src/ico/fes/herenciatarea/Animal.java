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
public class Animal {
    
    private int numeroPatas;
    private boolean sangreCaliente;
    private boolean pluricelular;

    public Animal() {
    }

    public Animal(int numeroPatas, boolean sangreCaliente, boolean pluricelular) {
        this.numeroPatas = numeroPatas;
        this.sangreCaliente = sangreCaliente;
        this.pluricelular = pluricelular;
    }

    public boolean isPluricelular() {
        return pluricelular;
    }

    public void setPluricelular(boolean pluricelular) {
        this.pluricelular = pluricelular;
    }

    public boolean isSangreCaliente() {
        return sangreCaliente;
    }

    public void setSangreCaliente(boolean sangreCaliente) {
        this.sangreCaliente = sangreCaliente;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", sangreCaliente=" + sangreCaliente + ", pluricelular=" + pluricelular + '}';
    }
    
    
    public void emitirSonido(){
        System.out.println("Escuchar cualquier sonido de animales salvajes en el zooologico...");
    
}

}