/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ControleProduto {
 
    
     private static List<Produto> lista = new ArrayList<>();

    public void inserirDados(Produto f) {
        lista.add(f);
    }

    public void alterarProduto(Produto f) {
        int i = 0;
        for (Produto produto : lista) {
            if (produto.getCodigo() == (f.getCodigo())) {
                lista.set(i, f);
            }
            i++;
        }
    }

    public void excluirProduto(Produto f) {
        lista.remove(f);
    }

    public List<Produto> listaFiltrada(String procura) {
        List<Produto> volta = new ArrayList<>();
        for (Produto f : lista) {
    if(f.getNomeprod().indexOf(procura)!=-1){
                volta.add(f);
            }
        }
        return volta;
    }

    public List<Produto> listarTodos() {
        return lista;
    }
}

    

