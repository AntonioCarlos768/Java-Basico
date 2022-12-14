/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tela;

import Controle.ControleVenda;
import Modelo.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class TelaVenda extends javax.swing.JDialog {

    private List<Venda> dados = new ArrayList<>();
    private ControleVenda cv = new ControleVenda();
    
    /**
     * Creates new form TelaVenda
     */
    public TelaVenda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
     atualizaTabela();
    }

    private void atualizaTabela() {
        DefaultTableModel modelo = (DefaultTableModel) TabelaV.getModel();

        modelo.setNumRows(0);

        for (Venda dado : dados) {
            modelo.addRow(new Object[]{dado.getData(),dado.getProduto().getNomeprod(), dado.getCliente().getNome(),dado.Float() ,dado.getQuantidade()});
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        incluir = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaV = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Vendas");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        incluir.setBackground(new java.awt.Color(51, 153, 255));
        incluir.setText("Incluir");
        incluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incluirActionPerformed(evt);
            }
        });
        jPanel2.add(incluir);

        alterar.setBackground(new java.awt.Color(51, 153, 255));
        alterar.setText("Alterar");
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });
        jPanel2.add(alterar);

        excluir.setBackground(new java.awt.Color(51, 153, 255));
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });
        jPanel2.add(excluir);

        ver.setBackground(new java.awt.Color(51, 153, 255));
        ver.setText("Ver");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel2.add(ver);

        sair.setBackground(new java.awt.Color(255, 102, 102));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel2.add(sair);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        TabelaV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Produto", "Cliente", "Valor Total"
            }
        ));
        jScrollPane1.setViewportView(TabelaV);

        jPanel3.add(jScrollPane1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void incluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incluirActionPerformed
        // TODO add your handling code here:
        DadosVenda dv = new DadosVenda(null, true);
        dv.setTitle("Inserir Venda");
        dv.setVisible(true);
        if (dv.isSalvar()) {
            cv.inserirDados(dv.getVenda());
            dados.clear();
            dados.addAll(cv.listarTodos());
            atualizaTabela();
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!");
        
        }
    }//GEN-LAST:event_incluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        // TODO add your handling code here:
        int linha = TabelaV.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha ");
        } else {
            Venda v= dados.get(linha);
            DadosVenda dv = new DadosVenda(null, true);
            dv.setTitle("Alterar Venda");
            dv.setVenda(v);
            dv.setVisible(true);
            v = dv.getVenda();
            if (dv.isSalvar()) {
                cv.alterarVenda(v);
                JOptionPane.showMessageDialog(null, "Venda alterada");
            }
            dados.clear();
            dados.addAll(cv.listarTodos());
            atualizaTabela();
        }
    }//GEN-LAST:event_alterarActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        // TODO add your handling code here:
        int linha = TabelaV.getSelectedRow();
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma linha ");
        } else {
            Venda v = dados.get(linha);
            cv.excluirVenda(v);
            dados.clear();
            dados.addAll(cv.listarTodos());
            atualizaTabela();
            JOptionPane.showMessageDialog(null, "Produto excluido");
        }
    }//GEN-LAST:event_excluirActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        int linha = 0;
        linha = TabelaV.getSelectedRow();
        if(linha==-1){
            JOptionPane.showMessageDialog(this,"Voce nao selecionou uma linha");
        } else {
            Venda v = new Venda();
            v = dados.get(linha);

            DadosVenda tela = new DadosVenda(null,true);
            tela.setVenda(v);
            tela.desligarCampos();
            tela.setVisible(true);

        }
    }//GEN-LAST:event_verActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        setVisible(false);

    }//GEN-LAST:event_sairActionPerformed

             
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaVenda dialog = new TelaVenda(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaV;
    private javax.swing.JButton alterar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton incluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sair;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
