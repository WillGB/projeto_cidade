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

import java.util.Random;

public class Caminhao extends Veiculos{ //Classe que gera o Caminhão e que é extendida da classe veículos
	
    Veiculos v = new Veiculos();

    private int mover; //Variável criada para receber um valor de movimento

    //Construtor
    public Caminhao (int x, int y, int velocidade, String cor, boolean fabrica) {
        super(x, y, velocidade, cor, fabrica);
    }
    
    Random aleatorio = new Random(); // Usado para gerar números alatórios para movimentar o Caminhão
    
    //Função para verificar se a moto chegou ao limite do mapa(Matriz) em X e reseta a coordenada para a posição inicial
    public int analisarX(int x) { 
        if (x >= 29) {
            x = 1;
        }
        if(x <= 0) {
            x = 28;
        }
        return x;
    }
    
    
    //Função para verificar se a moto chegou ao limite do mapa(Matriz) em Y e reseta a coordenada para a posição inicial
    public int analisarY(int y) {
        if (y >= 59) {
            y = 1;
        }
        if(y <= 0) {
            y = 58;
        }
        return y;
    }
    
    public void movimento(Caminhao cam) {
        mover = aleatorio.nextInt(4); 
        
        if(mover == 0) {
            int x = cam.getX();
            x = x + 1;
            cam.moveX(analisarX(x));
        }
        
        if(mover == 1) {
            int x = cam.getX();
            x = x - 1;
            cam.moveX(analisarX(x));
        }
        
        if(mover == 2) {
            int y = cam.getY();
            y = y + 1;
            cam.moveY(analisarY(y));
        }
        
        if(mover == 3) {
            int y = cam.getY();
            y = y - 1;
            cam.moveY(analisarY(y));
        }
    }
}
