/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Fernando Marcos Rodrigues
 * Classe Model para Entidade despesa
 */
public class Despesa {
    
    private Integer codDespesa;
    private Integer codUnidade;
    private String descricao;
    private String tipo;
    private Double valor;
    private Date vencimento;
    private Boolean statusPgto;

    public Integer getCodDespesa() {
        return codDespesa;
    }

    public void setCodDespesa(Integer codDespesa) {
        this.codDespesa = codDespesa;
    }

    public Integer getCodUnidade() {
        return codUnidade;
    }

    public void setCodUnidade(Integer codUnidade) {
        this.codUnidade = codUnidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Boolean getStatusPgto() {
        return statusPgto;
    }

    public void setStatusPgto(Boolean statusPgto) {
        this.statusPgto = statusPgto;
    }

    @Override
    public String toString() {
        return "Despesa{" + "codDespesa=" + codDespesa 
                + ", codUnidade=" + codUnidade 
                + ", descricao=" + descricao 
                + ", tipo=" + tipo 
                + ", valor=" + valor 
                + ", vencimento=" + vencimento 
                + ", statusPgto=" + statusPgto + '}';
    }
}
