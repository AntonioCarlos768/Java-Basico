/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class ControleCliente {
 
    private static List<Cliente> lista = new ArrayList<>();

    public void inserirDados(Cliente f) {
        lista.add(f);
    }

    public void alterarCliente(Cliente f) {
        int i = 0;
        for (Cliente cliente : lista) {
            if (cliente.getCodCliente() == (f.getCodCliente())) {
                lista.set(i, f);
            }
            i++;
        }
    }

    public void excluirCliente(Cliente f) {
        lista.remove(f);
    }

    public List<Cliente> listaFiltrada(String procura) {
        List<Cliente> volta = new ArrayList<>();
        for (Cliente f : lista) {
           if(f.getNome().indexOf(procura)!=-1){
                volta.add(f);
            }
        }
        return volta;
    }

    public List<Cliente> listarTodos() {
        return lista;
    }
    
}
