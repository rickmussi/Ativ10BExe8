/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativid10exeb;

/**
 *
 * @author Mussi
 */
public class Mutante2 {

    //método retorna o maior elemento do vetor

    public int getMaior(int vetor[]) {
        int maior = vetor[0];
        for (int i = 2; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }
}
