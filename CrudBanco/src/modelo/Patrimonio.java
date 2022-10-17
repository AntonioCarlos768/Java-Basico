package modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@NamedQueries({
    // consulta para trazer todos as salas do banco de dados
    @NamedQuery(name = "Patrimonio.Todos", query = "SELECT s FROM Patrimonio s" ),
    @NamedQuery(name = "Patrimonio.Filtro", query = "SELECT p FROM Patrimonio p where p.descricao like :pesquisa" )
})

@Entity
@Table(name="patrimonio")
public class Patrimonio implements Serializable {

    @Id
    @Column(name="numero")
    private int numsala;
    
    @Column(name="descricao", length=60)
    private String descricao;
                
    @Column(name = "valor")
    private Double valor;
    
    @Column(name = "dataaquisicao")
    @Temporal(TemporalType.DATE)
    private Date dataaquisicao;
      
    @Column(name="datadesfaz")
    @Temporal(TemporalType.DATE)
    private Date dataDesfazimento;
    
    @JoinColumn(name = "siaperesp", referencedColumnName = "siape")
    @ManyToOne
    private Responsavel responsavel;
    
    @JoinColumn(name="numsala", referencedColumnName="numero")
    @ManyToOne
    private Sala sala;

    public int getNumero() {
        return numsala;
    }

    public void setNumero(int numero) {
        this.numsala = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataaquisicao() {
        return dataaquisicao;
    }

    public void setDataaquisicao(Date dataaquisicao) {
        this.dataaquisicao = dataaquisicao;
    }

    public Date getDataDesfazimento() {
        return dataDesfazimento;
    }

    public void setDataDesfazimento(Date dataDesfazimento) {
        this.dataDesfazimento = dataDesfazimento;
    }

    public int getNumsala() {
        return numsala;
    }

    public void setNumsala(int numsala) {
        this.numsala = numsala;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

   

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Patrimonio() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + this.numsala;
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
        if (this.numsala != other.numsala) {
            return false;
        }
        return true;
    }
    
    
   

    @Override
    public String toString() {
//        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
//        
//        String dataAquisicaoFormatada = formatador.format(this.dataaquisicao);
//        String dataDesfazimentoFormatada = formatador.format(this.dataDesfazimento);
        
        return numsala + " - " + descricao;
    }

   
    
    
}
