package org.prac4;

public abstract class AutomataFinito {

    private int numEstados;
    private boolean[] finales;
    private int tamAlfabeto;
    //private int estActual;

    public AutomataFinito(int num, int alfabeto){

    }

    public AutomataFinito(int num, int alfabeto, boolean[] finales){
        this.numEstados=num;
        this.tamAlfabeto=alfabeto;
        this.finales=finales;
    }

    private void marcarFinal(int estado){

    }

    private void setFinales(boolean[] estadosFinales){

    }

    private int getNumEstados(){
        return this.numEstados;
    }

    private boolean[] getFinales(){
        return this.finales;
    }

    private boolean esEstadoFinal(int estado){
        return false;
    }

    public abstract int transicion(int estado, int letra);

}
