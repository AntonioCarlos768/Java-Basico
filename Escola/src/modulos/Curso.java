/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos;

/**
 *
 * @author Aluno
 */
public class Curso {
    
    int idCuros;
    String Nome;
    int carga;

    
    public Curso() {
    }

    public Curso(int idCuros, String Nome, int carga) {
        this.idCuros = idCuros;
        this.Nome = Nome;
        this.carga = carga;
    }
    
    
    public int getIdCuros() {
        return idCuros;
    }

    public void setIdCuros(int idCuros) {
        this.idCuros = idCuros;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    
    
     
    
}
