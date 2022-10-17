package Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import modulos.Curso;

/**
 *
 * @author Aluno
 */
public class ControleCurso {
    
     private static List<Curso> lista = new ArrayList<>();
    
    public void inserir(Curso curso){
        lista.add(curso);
    }
    
    public List<Curso> listarTodos(){
        return lista;
    } 
    
    public List<Curso> listaFiltrada(String procura){
        List<Curso> volta = new ArrayList<>();
        for(Curso c :lista){
            if(c.getNome().indexOf(procura)!=-1){
                volta.add(c);
            }
        }
        return volta;
    }

    public void excluir(Curso c){
        lista.remove(c);
    }
    
    
     public void alterar(Curso c){
        int i = 0;
        for(Curso curso  : lista){
           if(curso.getNome()==c.getNome()){
               lista.set(i, c);
           } 
           i++;
        }
    }
    
    
}
