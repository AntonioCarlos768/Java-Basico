/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Venda;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ControleVenda {
    
     private static List<Venda> lista = new ArrayList<>();

    public void inserirDados(Venda f) {
        lista.add(f);
    }

    public void alterarVenda(Venda f) {
        int i = 0;
        for (Venda venda : lista) {
            if (venda.getData() == (f.getData())) {
                lista.set(i, f);
            }
            i++;
        }
    }

    public void excluirVenda(Venda f) {
        lista.remove(f);
    }

    public List<Venda> listaFiltrada(String procura) {
        List<Venda> volta = new ArrayList<>();
        for (Venda f : lista) {
           if(f.getData().indexOf(procura)!=-1){
                volta.add(f);
            }
        }
        return volta;
    }

    public List<Venda> listarTodos() {
        return lista;
    }
    
}
