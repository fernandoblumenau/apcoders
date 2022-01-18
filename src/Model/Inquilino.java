/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Fernando Marcos Rodrigues
 * Classe Model para Entidade Inquilino
 */
public class Inquilino {
    
   private Integer codInquilino;
   private String nome;
   private Date dataNascimento;
   private char sexo;
   private String telefone;
   private String email;
   private Integer codUnidade;

    public Integer getCodInquilino() {
        return codInquilino;
    }

    public void setCodInquilino(Integer codInquilino) {
        this.codInquilino = codInquilino;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    @Override
    public String toString() {
        return "Inquilino{" + "codInquilino=" + codInquilino 
                + ", nome=" + nome 
                + ", dataNascimento=" + dataNascimento 
                + ", sexo=" + sexo 
                + ", telefone=" + telefone 
                + ", email=" + email 
                + ", codUnidade=" + codUnidade + '}';
    }
}
