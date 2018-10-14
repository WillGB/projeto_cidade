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

import java.util.ArrayList;

public class Mundo { //Classe Mundo onde vai gerar o Mundo e os Veículos
    
    Veiculos v = new Veiculos();

    ArrayList <Carro> cr = new ArrayList<>(); //ArrayList Carro
    ArrayList <Caminhao> cm = new ArrayList<>(); //ArrayList Carro
    ArrayList <Moto> mt = new ArrayList<>(); //ArrayList Carro
    ArrayList <Bike> bk = new ArrayList<>(); //ArrayList Carro
    
    //Aqui é feito uma matriz de 30 x 60 para gerar o Mundo onde o programa vai acontecer 
    
    public int mundo [][] = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                             {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}};
    
    //Função que gera 10 veiculos em posições aleatórias
    public void gerarVeiculos() {
        
        for(int i = 0; i < 10; i++) {
            
            cr.add(new Carro((v.setX()+1), (v.setY()+1), 2, "azul",false));
        
            while (mundo[cr.get(i).getX()][cr.get(i).getY()] == 2) {  // Verificar se onde o carro aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele  
                cr.get(i).setX();
                cr.get(i).setY();
            }
            
            cm.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "vermelho", false));
            
            while (mundo[cm.get(i).getX()][cm.get(i).getY()] == 2) { // Verificar se onde o caminhao aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele  
                cm.get(i).setX();
                cm.get(i).setY();
            }
            
            mt.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
            
            while (mundo[mt.get(i).getX()][mt.get(i).getY()] == 2) {// Verificar se onde o carro aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele  
                mt.get(i).setX();
                mt.get(i).setY();
            }
            bk.add(new Bike((v.setX()+1), (v.setY()+1), 3/2, "rosa", false));// Verificar se onde o bicilcleta aparece tem uma fábrica,caso tiver é gerado uma outra posição para ele ser gerado 
            while (mundo[bk.get(i).getX()][bk.get(i).getY()] == 2) {
                bk.get(i).setX();
                bk.get(i).setY();
            }
        }
    }
    
    // Função feita para zerar o mapa e para que os veículos que estão em movimento não deixe pegadas por onde passa e não destruam a matriz
    public void girarMundo() {
        for(int i = 0; i<30; i++) {
            for(int j = 0; j < 60; j++) {
                if(mundo[i][j] != 1 && mundo[i][j] != 2) {
                    mundo[i][j] = 0;
                }
            }
        }
        //Gera novos veículos no Mundo
        for (int a = 0; a < cr.size(); a++) {
            int xa = cr.get(a).getX(); 
            int ya = cr.get(a).getY();
            
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == xa && j == ya) {
                        if(mundo[i][j] == 2) {
                            mundo[i][j] = 2;
                        }
                        else {
                            //Carro
                            mundo[i][j] = 3;
                        }
                    }
                }
            }
        }
        
        for(int a  = 0; a < cm.size(); a++) {
            int ba = cm.get(a).getX();
            int ca = cm.get(a).getY();
            
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == ba && j == ca) {
                        if(mundo[i][j] == 2) {
                            mundo[i][j] = 2;
                        }
                        else {
                            //Caminhão
                            mundo[i][j] = 4;
                        }
                    }
                }
            }
        }
        
        for(int a = 0; a < mt.size(); a ++) {
            int ea = mt.get(a).getX();
            int fa = mt.get(a).getY();
            
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == ea && j == fa) {
                        if(mundo[i][j] == 2) {
                            mundo[i][j] = 2;
                        }
                        else {
                            //Moto
                            mundo[i][j] = 5;
                        }
                    }
                }
            }
        }
        
        for(int a = 0; a < bk.size(); a ++) {
            
            int wa = bk.get(a).getX();
            int sa = bk.get(a).getY();
            
            for(int i = 0; i<30; i++) {
                for(int j = 0; j < 60; j++) {
                    if(i == wa && j == sa) {
                        if(mundo[i][j] == 2) {
                            mundo[i][j] = 2;
                        }
                        else {
                            mundo[i][j] = 6;
                        }
                    }
                }
            }	
        }
    }
    
    //Funçao que coloca cor na Matriz e veículos
    
    public void corMundo() {
        
        int carros = 0;
        int motos = 0;
        int caminhoes = 0;
        int bicicleta = 0;
        
        for(int i = 0; i<30; i++) {
            for(int j = 0; j < 60; j++) {
                if(mundo[i][j] == 1) {
                    System.out.print("\u001b[47m \033[0m"); //Cor da Borda(cinza)
                }
                else if(mundo[i][j] == 0) {
                    System.out.print(" "); // Atribuido nenhuma cor para que fique preto
                }
                else if(mundo[i][j] == 2) {
                    System.out.print("\u001b[42m \033[0m"); //Cor das fábricas (verde)
                }
                else if(mundo[i][j] == 3){
                    System.out.print("\u001b[44m \033[0m"); //Cor dos carros (azul)
                }
                else if(mundo[i][j] == 4){
                    System.out.print("\u001b[41m \033[0m"); // Cor dos caminhões (vermelho)
                }
                else if(mundo[i][j] == 5){
                    System.out.print("\u001b[43;1m \033[0m"); //Cor das motos (amarelo)					
		}
          	else if(mundo[i][j] == 6){
                    System.out.print("\u001b[45;1m \033[0m"); // Cor das bicicletas (rosa)
                }
            }
            
            System.out.println("");
        }
        // Foi feito apenas uma legenda para os veículos
        System.out.print("\u001b[44m \033[0m"); 
        System.out.print(" Carros   ");
        System.out.print("\u001b[43;1m \033[0m");
        System.out.print(" Motos   ");
        System.out.print("\u001b[41m \033[0m");
        System.out.print(" Caminhões   ");
        System.out.print("\u001b[45m \033[0m");
	System.out.println(" Bicicleta ");
        
        
        // Contador dos veículos que mudam a partir de colisões ou quando nascem ao passar em uma fábrica
        for(int a = 0; a < cr.size(); a++) {
            carros++;
        }
        for(int a = 0; a < cm.size(); a++) {
            caminhoes++;
        }
        for(int a = 0; a < mt.size(); a++) {
            motos++;
        }
        for(int a = 0; a < bk.size(); a++) {
            bicicleta++;
        }
        //Print da contador
        System.out.println("Número de Carros: " + carros);
        System.out.println("Número de Motos: " + motos);
	System.out.println("Número de Caminhões: " + caminhoes);
        System.out.println("Número de Bicicletas: " + bicicleta);
    }
   
    //Função feita para colisão dos veículos
    public void bateVeiculos() {
        //Colisão de carro com carro. ambos são removidos
        for (int i = 0; i < cr.size(); i ++) {
            for (int j = 0; j < cr.size(); j++) {
                if(cr.get(j).getX() == cr.get(i).getX() && cr.get(j).getY() == cr.get(i).getY()) {
                    if (i == j) { /// Essa parte verifica se o veículo é ele mesmo, e não o remove
                    
                    }
                    else {
                        cr.remove(cr.get(i));
                    }
                }
            }
        }
        
        //Colisão de caminhão com caminhão onde os dois são removidos
        for (int i = 0; i < cm.size(); i ++) {
            for (int j = 0; j < cm.size(); j++) {
                if(cm.get(j).getX() == cm.get(i).getX() && cm.get(j).getY() == cm.get(i).getY()) {
                    if(i == j) {
                    
                    }
                    else {
                        cm.remove(cm.get(i));
                    }
                }
            }
        }
        //Colisão de moto com moto, ambos são destruídos
        for (int i = 0; i < mt.size(); i ++) {
            for (int j = 0; j < mt.size(); j++) {
                if(mt.get(j).getX() == mt.get(i).getX() && mt.get(j).getY() == mt.get(i).getY()) {
                    if(i == j) {
                        
                    }
                    else {
                        mt.remove(mt.get(i));
                    }
                }
            }
        }
        
        //Colisão de bicicleta com bicicleta, ambos são destrídos
        for (int i = 0; i < bk.size(); i ++) {
            for (int j = 0; j < bk.size(); j++) {
                if(bk.get(j).getX() == bk.get(i).getX() && bk.get(j).getY() == bk.get(i).getY()) {
                    if(i == j) {
                    
                    }
                    else {
                        bk.remove(bk.get(i));
                    }	
                }
            }
        }
        
        //Colisão de carro com caminhão, onde carro é destuído
        for(int i = 0; i < cm.size(); i++) {
            for (int j = 0; j < cr.size(); j++) {
                if(cr.get(j).getX() == cm.get(i).getX() && cr.get(j).getY() == cm.get(i).getY()) {
                    if(cm.size() > cr.size()) {
                    
                    }
                    else {
                        cr.remove(cr.get(j));
                    }
                }
            }
        }
        
        //Colisão de caminhão com moto, onde moto é destuído
        for(int i = 0; i < cm.size(); i++) {
            for (int j = 0; j < mt.size(); j++) {
                if(mt.get(j).getX() == cm.get(i).getX() && mt.get(j).getY() == cm.get(i).getY()) {
                    if(cm.size() > mt.size()) {
                    
                    }
                    else {
                        mt.remove(mt.get(j));
                    }
                }
            }
        }
        
        //Colisão de caminhão com bicicleta, onde bicicleta é destuído
        for(int i = 0; i < cm.size(); i++) {
            for (int j = 0; j < bk.size(); j++) {
                if(bk.get(j).getX() == cm.get(i).getX() && bk.get(j).getY() == cm.get(i).getY()) {
                    if(cm.size() > bk.size()) {
                    
                    }
                    else {
                        bk.remove(bk.get(j));
                    }
                }
            }
        }
        
        //Colisão de carro com moto, onde moto é destuído
        for(int i = 0; i < cr.size(); i++) {
            for (int j = 0; j < mt.size(); j++) {
                if(mt.get(j).getX() == cr.get(i).getX() && mt.get(j).getY() == cr.get(i).getY()) {
                    if(cr.size() > mt.size()) {
                    
                    }
                    else {
                        mt.remove(mt.get(i));
                    }
                }
            }
        }
        
        //Colisão de carro com bicicleta, onde bicilceta é destuído
        for(int i = 0; i < cr.size(); i++) {
            for (int j = 0; j < bk.size(); j++) {
                if(bk.get(j).getX() == cr.get(i).getX() && bk.get(j).getY() == cr.get(i).getY()) {
                    if(cr.size() > bk.size()) {
                    
                    }
                    else {
                        bk.remove(bk.get(i));
                    }
                }
            }
        }
        
        //Colisão de moto com bicilcleta, onde bicicleta é destuído
        for(int i = 0; i < mt.size(); i++) {
            for (int j = 0; j < bk.size(); j++) {
                if(bk.get(j).getX() == mt.get(i).getX() && bk.get(j).getY() == mt.get(i).getY()) {
                    if(mt.size()>bk.size()) {
                        
                    }
                    else {
                        bk.remove(bk.get(i));
                    }
                }
            }
        }
    }
    
    public void attMundo() { //atualizar Mundo e gera o passo a passo dos movimentos dos veículos
        for(int i = 0; i < cr.size(); i++) {
            cr.get(i).movimento(cr.get(i));
        }
        
        for (int i = 0; i < cm.size(); i ++) {
            cm.get(i).movimento(cm.get(i));
        }
        
        for (int i = 0; i < mt.size(); i ++) {
            mt.get(i).movimento(mt.get(i));
        }
        
        for (int i = 0; i < bk.size(); i ++) {
            bk.get(i).movimento(bk.get(i));
        }
        
        geradorVeiculo();
        bateVeiculos();
        girarMundo();
        corMundo();
    }
    
    //Função pra que gerem veículos no momento que passou na fábrica
    public void geradorVeiculo() {
        for(int a = 0; a < cr.size(); a++) {
            int x = cr.get(a).getX();
            int y = cr.get(a).getY();

            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mundo[i][j] == 2 && cr.get(a).getFabrica() == false) {
                            cr.get(a).setFabrica(true);//Caso o veículo já tenha passado na fábrica ele fica inativado até sair da fábrica
                            cr.add(new Carro((v.setX()+1), (v.setY()+1), 2,"azul",false));
                        }
                    }
                }
            }
        }
        
        for(int a = 0; a < cm.size(); a++) {
            int x = cm.get(a).getX();
            int y = cm.get(a).getY();
           
            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mundo[i][j] == 2 && cm.get(a).getFabrica() == false) {
                            cm.get(a).setFabrica(true);
                            cm.add(new Caminhao((v.setX()+1), (v.setY()+1), 1, "vermelho", false));
                        }
                    }
                }
            }
        }
        
        for(int a = 0; a < mt.size(); a++) {
            int x = mt.get(a).getX();
            int y = mt.get(a).getY();
            
            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mundo[i][j] == 2 && mt.get(a).getFabrica() == false) {
                            mt.get(a).setFabrica(true);
                            mt.add(new Moto((v.setX()+1), (v.setY()+1), 3, "amarelo", false));
                        }
                    }
                }
            }
        }
        
        for(int a = 0; a < bk.size(); a++) {
            int x = bk.get(a).getX();
            int y = bk.get(a).getY();
            
            for(int i = 0; i < 30; i ++) {
                for(int j = 0; j < 60; j++) {
                    if(i == x && j == y) {
                        if(mundo[i][j] == 2 && bk.get(a).getFabrica() == false) {
                            bk.get(a).setFabrica(true);
                            bk.add(new Bike((v.setX()+1), (v.setY()+1), 3/2, "rosa", false));
                        }
                    }
                }
            }
        }
    }
}
