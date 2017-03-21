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
public class Javali extends monstros{

    public Javali(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setDrop(5);
        this.setDescricao("Um Javali equipado com fortes dentes");
    this.setExp(15);
    this.setLvl(1);
    this.setNome("Java Java");
    this.setForca(2);
    this.setAgilidade(2);
    this.setVitalidade(6);
    this.setInteligencia(1);
    this.setDestreza(2);
    this.setSorte(1);
    }

     
    public void atacar(Personagem personagem) {
          System.out.println("O Javali deu um ataque básico:");
          personagem.receberDano(25);     }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
