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
public class Bruxa extends monstros{
public String magia;

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
    public Bruxa(int drop, String descricao, int exp, int lvl, String nome, int forca, int agilidade, int vitalidade, int inteligencia, int destreza, int sorte) {
        super(drop, descricao, exp, lvl, nome, forca, agilidade, vitalidade, inteligencia, destreza, sorte);
        this.setDrop(70);
        this.setDescricao("Uma Bruxa equipado com uma Vassoura");
    this.setMagia("Solta uma poderosa bola de fogo que atinge todos os personagens.");
    this.setExp(360);
    this.setLvl(10);
    this.setNome("Bruxa do 71");
    this.setForca(15);
    this.setAgilidade(10);
    this.setVitalidade(25);
    this.setInteligencia(10);
    this.setDestreza(8);
    this.setSorte(8);
    }

     
    public void atacar(Personagem personagem) {
          System.out.println("A Bruxa deu um ataque básico:");
          personagem.receberDano(100);     }

    @Override
    public void bloquear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

   
}
