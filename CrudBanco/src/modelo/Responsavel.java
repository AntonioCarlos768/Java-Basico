package modelo;


import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Responsavel.Todas", query = "SELECT r FROM Responsavel r" ),
    
    // consulta para trazer todas as salas de um bloco passado 
    // com parâmetros (:nrbloco)
    @NamedQuery(name = "Responsavel.porNome", 
                query = "SELECT r FROM Responsavel r WHERE r.nome like :nome")   
    
})

@Entity
@Table(name="responsavel")
public class Responsavel implements Serializable {

        
    @Id
    @Column(name="siape")
    private int siape;
    
    @Column(name="nome", length = 50)
    private String nome;
    
    @Column(name="departamento", length = 20)
    private String departamento;
    
    @Column(name="cpf", length = 14)
    private String cpf ;
    
    @Column(name="funcao", length = 20)
    private String funcao;

    public Responsavel() {
    }

    public Responsavel(int siape, String nome, String departamento, String cpf, String funcao) {
        this.siape = siape;
        this.nome = nome;
        this.departamento = departamento;
        this.cpf = cpf;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.siape;
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
        return siape + " - " + nome;
    }

    
    
    
    
}
