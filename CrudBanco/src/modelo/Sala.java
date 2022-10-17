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
 * 
 */

// indica que a classe será uma entidade de persistência


// indica qual a tabela no banco de dados que irá armazenar 
// os objetos dessa classe


// aqui serão colocadas as consultas realizadas sobre objetos
// da classe Sala (tabela sala)
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Sala.Todas", query = "SELECT s FROM Sala s" ),
    @NamedQuery(name = "Sala.porBloco", 
                query = "SELECT s FROM Sala s WHERE s.bloco = :nrbloco"),  
    @NamedQuery(name = "Sala.porNumero", 
                query = "SELECT s FROM Sala s WHERE s.numSala = :nrsala"),
        
    // consulta pra trazer todas as salas que possuem em sua descricao
    // o texto existente no parâmetro :desc
    @NamedQuery(name = "Sala.porDescricao", 
                query = "SELECT s from Sala s WHERE s.descricao LIKE :desc")
})

@Entity
@Table(name="sala")
public class Sala implements Serializable{

       
    @Id
    @Column(name="numero")
    private int numSala;
    
    @Column(name="bloco")
    private int bloco;
    
    @Column(name="descricao", length = 50)
    private String descricao;

    public Sala() {
    }

    public Sala(int numSala, int bloco, String descricao) {
        this.numSala = numSala;
        this.bloco = bloco;
        this.descricao = descricao;
    }

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
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
        int hash = 7;
        hash = 53 * hash + this.numSala;
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
        final Sala other = (Sala) obj;
        if (this.numSala != other.numSala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return numSala + " - " + descricao + " - bloco-"+ bloco;
    }

       
}
