/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.monstros;

import br.com.satc.personagens.Personagem;
import java.util.Random;

/**
 *
 * @author Edutec
 */
public class Rat extends monstros{

    public Rat(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setDrop(5);
        this.setDescricao("Um Rato equipado com a peste negra");
    this.setExp(9);
    this.setLvl(1);
    this.setNome("Rato da Peste");
    this.setForca(1);
    this.setAgilidade(2);
    this.setVitalidade(5);
    this.setInteligencia(1);
    this.setDestreza(2);
    this.setSorte(1);
    }

     
    public void atacar(Personagem personagem) {
          System.out.println("O rato deu um ataque básico:");
          personagem.receberDano(10);     }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}

