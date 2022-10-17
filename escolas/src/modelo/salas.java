/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */
@NamedQueries({
@NamedQuery(name="Sala.Todas", query="SELECT s FROM salas s"),

@NamedQuery(name="Sala.Numero", query="SELECT s FROM salas s")
        
})

@Entity
@Table(name = "sala")
public class salas implements Serializable{

    @Id   
    @Column(name ="numero")
   private int numero;
   
    @Column(name="bloco")
    private int bloco;
   
    @Column(name="descricao", length=60 )
   private String descricao;

    public salas() {
    }

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    


    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.numero;
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
        final salas other = (salas) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "salas{" + "numero=" + numero + ", bloco=" + bloco + ", descricao=" + descricao + '}';
    }

    

    

  

    
 
    
    
    
}
