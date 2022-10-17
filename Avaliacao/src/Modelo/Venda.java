/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Aluno
 */
public class Venda {
   
    String data;
    float valortotal;
    int quantidade;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public float getValortotal() {
        return valortotal;
    }

    public void setValortotal(float valortotal) {
        this.valortotal = valortotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    private Produto produto;
   private Cliente cliente;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Venda() {
    }


//
//    @Override
//    public String toString() {
//       
//     float  a =  produto.getQtde()*produto.getValor();
//        
//        return super.toString()+a; //To change body of generated methods, choose Tools | Templates.
//    }

public float Float() {
        
    
    float  a = quantidade*produto.getValor();
    
    return a;
  
}
    
}
