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

public class Veiculos { //Classe feita para os outros veículos herdarem seus atributos e métodos
    
    private int x; // variável inteiro eixo x que ajuda no movimento.
    private int y; // variável inteiro eixo y que ajuda no movimento.
    private int velocidade; // variável que dará velocidade aos veículos.
    private String cor; // variável apenas para passar que cor o veículo vai ter no código.
    private boolean fabrica; // variável que vai dizer se o veículo passou ou não pela fábrica.
    
    Random aleatorio = new Random(); //Essa é uma função Random, ela é utilizada para gerar posições aleatórias no mundo.
    
    
    //Construtor
    public Veiculos(int x, int y, int velocidade, String cor, boolean fabrica) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.cor = cor;
        this.fabrica = fabrica;
    }
    
    /**
     * Construtor da classe Veículo
     */
    
    public Veiculos() {
        x = 0; 
        y = 0; 
        velocidade = 0; 
        fabrica = false; 
        cor = null; 	
    }
    
// Gera um valor aleatório para o eixo X
    public int setX() {
        x = aleatorio.nextInt(28);
        return x;
        
    }
    
    //Cada vaículo tem umm valor específico que é passado para mover no eixo X
    public void moveX(int x) {
        this.x = x;
    }
    //Cada vaículo tem umm valor específico que é passado para mover no eixo Y
    public void moveY(int y) {
        this.y = y;
    }
    
 // Gera um valor aleatório para o eixo Y
    public int setY() {
        y = aleatorio.nextInt(58);
        return y;
    }
    
    //Valor X do Veículo
    public int getX() {
        return x;
    }
    
    //Valor Y do Veículo
    public int getY() {
        return y;
    }
    
    //Velocidade do veículo  sendo que cada um tem o seu
    public int getVelocidade() {
        return velocidade;
    }
    
    //Cor atribuída ao veículo
    public String getCor() {
        return cor;
    }
    
    //Verifica a condição se está ou não passando na fábrica
    
    public void setFabrica(boolean condicao) {
        fabrica = condicao;
    }
    
    //Se está passando na fábrica ou não
    public boolean getFabrica() {
        return fabrica;
    }	
}