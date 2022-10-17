/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.salas;
import util.GerenciadorDeConexao;

/**
 *
 * @author Aluno
 */
public class ControleSala {
    
    public void inserir(salas s){
    
        EntityManager gerente = GerenciadorDeConexao.getGerente();
    gerente.getTransaction().begin();
    gerente.persist(s);
    gerente.getTransaction().commit();
    gerente.close();
    }
    
    public List<salas> listarTodos (){
    EntityManager gerente = GerenciadorDeConexao.getGerente();
    TypedQuery<salas> consulta = gerente.createNamedQuery("Sala.Todas", salas.class);
       
        
        return consulta.getResultList();
    
    }
    
    
     public List<salas> SalaPorNumero (int numeros){
    EntityManager gerente = GerenciadorDeConexao.getGerente();
    TypedQuery<salas> consulta = gerente.createNamedQuery("Sala.Todas", salas.class);
       consulta.setParameter("Sala.numro",numeros);
        
        return consulta.getResultList();
    
    }
    
     
    
    
    
    
    
    public void alterar(salas s){
     EntityManager gerente = GerenciadorDeConexao.getGerente();
      gerente.getTransaction().begin();
      gerente.merge(s);
      gerente.getTransaction().commit();
    gerente.close();
    }
    
    public void excluir (salas s){
    
        EntityManager gerente = GerenciadorDeConexao.getGerente();
        salas respExcluir= gerente.find(salas.class, s.getNumero());
        gerente.getTransaction().begin();
        gerente.remove(respExcluir);
        gerente.getTransaction().commit();
    }
    
    
    
}
