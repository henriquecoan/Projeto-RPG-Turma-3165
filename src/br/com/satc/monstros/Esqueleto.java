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
public class Esqueleto extends monstros{

    public Esqueleto(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setDrop(15);
        this.setDescricao("Um Esqueleto equipado com um arco e flecha");
    this.setExp(30);
    this.setLvl(2);
    this.setNome("Esqueleton");
    this.setForca(4);
    this.setAgilidade(3);
    this.setVitalidade(11);
    this.setInteligencia(5);
    this.setDestreza(3);
    this.setSorte(4);
    }

     
    public void atacar(Personagem personagem) {
          System.out.println("O Esqueleto deu um ataque básico:");
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
