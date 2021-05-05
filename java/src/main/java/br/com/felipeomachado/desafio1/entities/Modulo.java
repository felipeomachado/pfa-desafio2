package br.com.felipeomachado.desafio1.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "modulo")
public class Modulo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String nome;

    public Modulo() {
    }

    public Modulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Modulo{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
