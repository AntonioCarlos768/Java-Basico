/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Aluno
 */

@NamedQueries({

   @NamedQuery(name="Patrimonio.Todos", query="SELECT p FROM Patrimonio p")
    
})


@Entity
@Table(name= "Patrimonio")
public class Patrimonio {
    
    @Id
    @Column(name="numero")
    private int numero;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="valor")
    private double valor;
    
    @Column(name="dataaquisicao")
    @Temporal(TemporalType.DATE)
    private Date dataaquisicao;
    
    @Column(name="datadesfaz")
    @Temporal(TemporalType.DATE)
    private Date datadesfaz;
   
    @Column(name="numsala")
    private int numsala;
    
    @Column(name="siaperesponsavel")
    private int siaperesp;

    public Patrimonio() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDatadesfaz() {
        return datadesfaz;
    }

    public void setDatadesfaz(Date datadesfaz) {
        this.datadesfaz = datadesfaz;
    }

    public void setDataaquisicao(Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }

    public Date getDataaquisicao() {
        return dataaquisicao;
    }



  

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(int numsala) {
        this.numsala = numsala;
    }

    public int getSiaperesp() {
        return siaperesp;
    }

    public void setSiaperesp(int siaperesp) {
        this.siaperesp = siaperesp;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patrimonio other = (Patrimonio) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patrimonio{" + "numero=" + numero + ", descricao=" + descricao + ", valor=" + valor + ", dataaquisicao=" + dataaquisicao + ", datadesfaz=" + datadesfaz + ", numsala=" + numsala + ", siaperesp=" + siaperesp + '}';
    }

    
    

    
    
   
    
    
}
