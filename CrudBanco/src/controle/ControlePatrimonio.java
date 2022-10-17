/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import util.GerenciadorConexao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import modelo.Patrimonio;
import modelo.Responsavel;

/**
 *
 * @author Aluno
 */
public class ControlePatrimonio {
   
    // método para inserir uma sala no banco de dados
    public void inserir(Patrimonio s) 
    {
        // criar um objeto do tipo EntityManager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia uma transação
        gerente.getTransaction().begin();
        
        // salvar a sala no banco de dados
        gerente.persist(s);
        
        // finaliza a transação
        gerente.getTransaction().commit();
        
        // finaliza a conexao com o banco
        gerente.close();
    }
    
    // método para excluir uma sala passada por parâmetro
    public void excluir(Patrimonio s)
    {
        //cria um entitymanager para as operações com banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // pegar o objeto do banco utilizando sua chave primária
        Patrimonio respExcluir = gerente.find(Patrimonio.class, s.getNumero());
        
        // iniciar uma transação
        gerente.getTransaction().begin();
        
        // excluir a sala do banco de dados
        gerente.remove(respExcluir);
        
        // faz um commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
        
    }
    
    // método para sobrepor um registro na tabela
    // obs. a chave primária não pode ser alterada
    public void alterar(Patrimonio s)
    {
        // criar uma entitymanager
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // inicia a transação
        gerente.getTransaction().begin();
        
        //faz um merge -  atualizar um registro
        gerente.merge(s);
        
        //faz commit na transação
        gerente.getTransaction().commit();
        
        // fecha a conexão
        gerente.close();
    }
    
    public List<Patrimonio> listarTodas()
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Patrimonio> consulta = 
                    gerente.createNamedQuery("Patrimonio.Todos", Patrimonio.class);
        
        // retorna a lista de objetos da consulta
        return consulta.getResultList();
        
    }


    public List<Patrimonio> listarPorNome(String nome)
    {
        // criar uma conexao com o banco
        EntityManager gerente = GerenciadorConexao.getGerente();
        
        // criar um objeto do tipo Consulta
        TypedQuery<Patrimonio> consulta = gerente.createNamedQuery("Patrimonio.Filtro", Patrimonio.class);
        consulta.setParameter("pesquisa", "%"+nome+"%");
     
        return consulta.getResultList();
        
    }    
   
}
