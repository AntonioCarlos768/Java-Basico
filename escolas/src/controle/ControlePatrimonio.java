/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Patrimonio;
import util.GerenciadorDeConexao;

/**
 *
 * @author Aluno
 */
public class ControlePatrimonio {
    
    public List<Patrimonio> listarTodos (){
    EntityManager gerente = GerenciadorDeConexao.getGerente();
    TypedQuery<Patrimonio> consulta = gerente.createNamedQuery("Patrimonio.Todos", Patrimonio.class);
       
        
        return consulta.getResultList();
    
    }
    
    
    public void inserir (Patrimonio p){
    EntityManager gerente = GerenciadorDeConexao.getGerente();
    gerente.getTransaction().begin();
    gerente.persist(p);
    gerente.getTransaction().commit();
    gerente.close();
    }
    
}
