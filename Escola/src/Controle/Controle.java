package Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import modulos.Professor;

/**
 *
 * @author Aluno
 */
public class Controle {
 
    private static List<Professor> lista = new ArrayList<>();
    
    public void inserir(Professor professor){
        lista.add(professor);
    }
    
    public List<Professor> listarTodos(){
        return lista;
    } 
    
    public List<Professor> listaFiltrada(String procura){
        List<Professor> volta = new ArrayList<>();
        for(Professor p :lista){
            if(p.getNome().indexOf(procura)!=-1){
                volta.add(p);
            }
        }
        return volta;
    }

    public void excluir(Professor p){
        lista.remove(p);
    }
    
    
     public void alterar(Professor p){
        int i = 0;
        for(Professor professor : lista){
           if(professor.getNome()==p.getNome()){
               lista.set(i, p);
           } 
           i++;
        }
    }
    
}
