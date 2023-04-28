package org.prac4;

import java.util.List;
import java.util.Map;

public class AnalizadorLexico {

    private int[] cadena;
    private AutomataFinito A;
    private int posActual;
    private Map<Integer,String> tokens;
    private List<Token> historico;

    public AnalizadorLexico(int[] cadena, AutomataFinito A, Map<Integer,String> tokens){
        this.cadena=cadena;
        this.A=A;
        this.posActual=0;
        this.tokens=tokens;
    }

    public boolean hasMoreTokens(){
        return false;
    }

    public Token nextToken(){
        return null;
    }

    public void reset(){

    }

    public void nuevaCadena(int[] cadena){
        this.cadena=cadena;
        this.reset();
    }

    public List<Token> finalizarAnalisis(){
        return null;
    }

}
