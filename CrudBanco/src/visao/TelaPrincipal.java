package visao;


import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
       // setExtendedState(javax.swing.JFrame.MAXIMIZED_BOTH);
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
        jPanel5 = new javax.swing.JPanel();
        btnSala = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuSalas = new javax.swing.JMenuItem();
        menuResponsaveis = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuBensPatrimoniados = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuLogout = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel5.setPreferredSize(new java.awt.Dimension(544, 60));
        jPanel5.setLayout(new java.awt.GridLayout(1, 0));

        btnSala.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSala.setText("Sala");
        btnSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalaActionPerformed(evt);
            }
        });
        jPanel5.add(btnSala);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Responsavel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Patrimonio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);

        jButton4.setText("...");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4);

        jPanel1.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jMenu1.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("Manutenções");

        menuSalas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuSalas.setBackground(new java.awt.Color(102, 102, 102));
        menuSalas.setText("Salas");
        menuSalas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalasActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalas);

        menuResponsaveis.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuResponsaveis.setBackground(new java.awt.Color(102, 102, 102));
        menuResponsaveis.setText("Responsáveis");
        menuResponsaveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuResponsaveisActionPerformed(evt);
            }
        });
        jMenu1.add(menuResponsaveis);

        jSeparator2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu1.add(jSeparator2);

        menuBensPatrimoniados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuBensPatrimoniados.setBackground(new java.awt.Color(102, 102, 102));
        menuBensPatrimoniados.setText("Bens Patrimoniados");
        jMenu1.add(menuBensPatrimoniados);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(102, 102, 102));
        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu2.setText("Sair");

        menuLogout.setBackground(new java.awt.Color(102, 102, 102));
        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu2.add(menuLogout);

        menuSair.setBackground(new java.awt.Color(102, 102, 102));
        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu2.add(menuSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuResponsaveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuResponsaveisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuResponsaveisActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void menuSalasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalasActionPerformed
        
       
        
    }//GEN-LAST:event_menuSalasActionPerformed

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        
        // cria uma janela de confirmação com os seguintes parâmetros
        // 1 - Janela pai - this é a janela atual, mas poderia ser null
        // 2 - Mensagem a ser exibida na caixa de dialogo
        // 3 - titulo da caixa de diálogo
        // 4 - quais os botões que aparecerão, nesse caso Sim e Não
        
        // o resultado do showconfirmdialog é o botão que foi clicado, 
        // nesse caso o botão sim
        if(JOptionPane.showConfirmDialog(this, "Deseja sair do sistema???" ,
                                               "Sair do Sistema", 
                                               JOptionPane.YES_NO_OPTION) ==
                                               JOptionPane.YES_OPTION)
        {
            // finaliza a aplicação
            System.exit(0);
        }
    }//GEN-LAST:event_menuSairActionPerformed

    private void btnSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalaActionPerformed
         // criando uma tela com base na classe TelaManutSala
        TelaManutencaoSala telaSala = new TelaManutencaoSala(this,true);
        
        // Tornar a tela visível
        telaSala.setVisible(true);
    }//GEN-LAST:event_btnSalaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaManutencaoResponsavel tela = new TelaManutencaoResponsavel(this,true);
        tela.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        TelaManutPatrimonio tela = new TelaManutPatrimonio();
        tela.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void branquear(javax.swing.JPanel x)
    {
        x.setBackground(Color.white);
    }
    
    public void escurecer(javax.swing.JPanel x)
    {
        x.setBackground(Color.black);
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSala;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem menuBensPatrimoniados;
    private javax.swing.JMenuItem menuLogout;
    private javax.swing.JMenuItem menuResponsaveis;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSalas;
    // End of variables declaration//GEN-END:variables
}