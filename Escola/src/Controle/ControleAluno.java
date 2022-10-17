package Controle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import modulos.Aluno;

/**
 *
 * @author Aluno
 */
public class ControleAluno {
    
    private static List<Aluno> lista = new ArrayList<>();
    
    public void inserir(Aluno aluno){
        lista.add(aluno);
    }
    
    public List<Aluno > listarTodos(){
        return lista;
    } 
    
    public List<Aluno > listaFiltrada(String procura){
        List<Aluno > volta = new ArrayList<>();
        for(Aluno  a :lista){
            if(a.getNome().indexOf(procura)!=-1){
                volta.add(a);
            }
        }
        return volta;
    }

    public void excluir(Aluno  a){
        lista.remove(a);
    }
    
    
     public void alterar(Aluno  a){
        int i = 0;
        for(Aluno  aluno  : lista){
           if(aluno.getNome()==a.getNome()){
               lista.set(i, a);
           } 
           i++;
        }
    }
    
}
