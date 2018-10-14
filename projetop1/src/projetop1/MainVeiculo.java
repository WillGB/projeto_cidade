/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package projetop1;

/**
 *
 * @author will
 */

public class MainVeiculo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Mundo m = new Mundo();
        
        //Gera o Mundo com os Veículos
        
        m.gerarVeiculos(); 
        m.corMundo(); 
        
        int i = 0;
        
        //Laço de repetição para o mapa ser atualizado e os veiculos se moverem respeitando as condições da classe Mundo
        
        while (i == 0) {
            m.attMundo(); 
            Thread.sleep(400);  
        }
    }
}