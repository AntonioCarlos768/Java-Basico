/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Responsavel;
import util.GerenciadorDeConexao;

/**
 *
 * @author Aluno
 */
public class ControleResponsavel {
    
    public void inserir(Responsavel r){
    
        EntityManager gerente = GerenciadorDeConexao.getGerente();
    gerente.getTransaction().begin();
    gerente.persist(r);
    gerente.getTransaction().commit();
    gerente.close();
    }
    
    public List<Responsavel> listarTodos(){
    EntityManager gerente = GerenciadorDeConexao.getGerente();
    TypedQuery<Responsavel> consulta = gerente.createNamedQuery("Responsavel.Todos", Responsavel.class);
        
        
        return consulta.getResultList();
    
    }
    
    public void alterar(Responsavel r){
     EntityManager gerente = GerenciadorDeConexao.getGerente();
      gerente.getTransaction().begin();
      gerente.merge(r);
      gerente.getTransaction().commit();
    gerente.close();
    }
    
}
