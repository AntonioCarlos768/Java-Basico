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
@NamedQuery(name="Responsavel.Todos", query="SELECT r FROM Responsavel r")
})

@Entity
@Table(name="responsavel")
public class Responsavel implements  Serializable{

    @Id
    @Column(name="siape")
    private int siape;
    
    @Column(name="nome", length=45)
    private String nome;
    
    @Column(name="departamento", length=45)
    private String departamento;

    @Column(name="funcao", length=20)
    private String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    public int getSiape() {
        return siape;
    }

    public void setSiape(int siape) {
        this.siape = siape;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 41 * hash + this.siape;
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
        final Responsavel other = (Responsavel) obj;
        if (this.siape != other.siape) {
            return false;
        }
        return true;
    }
    
    
    
  

    @Override
    public String toString() {
        return "Responsavel{" + "siape=" + siape + ", nome=" + nome + ", departamento=" + departamento + ", funcao=" + funcao + '}';
    }

  

    

   

   

    
    
}
