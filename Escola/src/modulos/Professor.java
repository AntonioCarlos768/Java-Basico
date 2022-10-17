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
public class Professor {
    
    int idProfessor;
    String nome;
    String email;
    String fone;

    public Professor() {
    }
    
     public Professor( String nome, String email, String fone, int idProfessor) {
        
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.idProfessor = idProfessor;
     }
    
    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    
    
}
