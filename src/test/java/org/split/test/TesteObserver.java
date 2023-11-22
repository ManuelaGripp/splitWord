package org.split.test;
import org.junit.Test;
import org.split.clases.Observador;
import org.split.clases.Observavel;

import static org.junit.Assert.*;
public class TesteObserver {

    @Test
    public void testeAddInscrito(){
        Observavel splitWord = new Observavel();
        Observador obs1 = new Observador(1);
        splitWord.registraObservador(obs1);
        assertFalse(splitWord.getClientes().isEmpty());
    }
    @Test
    public void testeContaNumeroPalavras(){
        Observavel splitWord = new Observavel();
        splitWord.splitWord("Testando o numero de palavras dessa frase");
        assertEquals(7, splitWord.getAllWords());
    }
    @Test
    public void testeContaNumeroPalavrasPares(){
        Observavel splitWord = new Observavel();
        splitWord.splitWord("Testando o numero de palavras pares dessa frase");
        assertEquals(4, splitWord.getPairsWords());
    }
    @Test
    public void testeContaNumeroPalavrasLetraMaiuscula(){
        Observavel splitWord = new Observavel();
        splitWord.splitWord("Testando o Numero de palavras Começão Com letra maiusculas DESSA frase");
        assertEquals(5, splitWord.getUpperCaseWords());
    }




}
