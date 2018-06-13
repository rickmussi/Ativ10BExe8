/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ativid10exeb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Unopar-006
 */
public class PrincipalTest {

    public PrincipalTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    //Exercicio 8
    @Test
    public void original() {
        int[] vet = {1, 40, 3, 5, 10, 20, 4, 6};
        Original m = new Original();
        int retorno = m.getMaior(vet);
        assertEquals(40, retorno);
    }
    
    @Test
    public void mutante1() {
        int[] vet = {1, 40, 3, 5, 10, 20, 4, 6};
        Mutante1 m = new Mutante1();
        int retorno = m.getMaior(vet);
        assertEquals(40, retorno);
    } 
    
    @Test
    public void mutante2() {
        int[] vet = {1, 40, 3, 5, 10, 20, 4, 6};
        Mutante2 m = new Mutante2();
        int retorno = m.getMaior(vet);
        assertEquals(40, retorno);
    }  
    
    @Test
    public void mutante3() {
        int[] vet = {1, 40, 3, 5, 10, 20, 4, 6};
        Mutante3 m = new Mutante3();
        int retorno = m.getMaior(vet);
        assertEquals(40, retorno);
    } /*Teste mutante 3 - Mutante equivalente pois iniciando i = 0 é 
      executado uma verificação a mais, apensar de se 
      executar uma verificação a mais o resultado 
      permanece o mesmo da classe original, pois a posição 0 do vetor sera testa
      com ela mesma na primeira vez não alterando o resultado
    
    int maior = vetor[0]; 
    if (vetor[i] > maior) {
    
    */
}
