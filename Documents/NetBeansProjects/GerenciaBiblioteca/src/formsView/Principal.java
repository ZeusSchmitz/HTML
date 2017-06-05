package formsView;

import formsView.FormCadastro;
import formsView.FormDevolucao;
import formsView.FormConsultar;
import formsView.FormEmprestimo;

public class Principal extends javax.swing.JFrame
{

  public Principal()
  {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("ZETEC");

    jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
    jLabel1.setText("Gerenciador de Bíblioteca");

    jButton1.setText("Cadstrar");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton1ActionPerformed(evt);
      }
    });

    jButton2.setText("Emprestimo");
    jButton2.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton2ActionPerformed(evt);
      }
    });

    jButton3.setText("Consultar");
    jButton3.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton3ActionPerformed(evt);
      }
    });

    jButton4.setText("Devolução");
    jButton4.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton4ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(66, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
              .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        .addGap(64, 64, 64))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addComponent(jLabel1)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(0, 13, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed
    FormCadastro fCadastro = new FormCadastro();
    fCadastro.setVisible(rootPaneCheckingEnabled);
//    CadastroDAO lerArq = new CadastroDAO();
//    lerArq.leitura();
  }//GEN-LAST:event_jButton1ActionPerformed

  private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton3ActionPerformed
  {//GEN-HEADEREND:event_jButton3ActionPerformed
    FormConsultar fConsultar = new FormConsultar();
    fConsultar.setVisible(rootPaneCheckingEnabled);
  }//GEN-LAST:event_jButton3ActionPerformed

  private void jButton2ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton2ActionPerformed
  {//GEN-HEADEREND:event_jButton2ActionPerformed
    FormEmprestimo fEmprestimo = new FormEmprestimo();
    fEmprestimo.setVisible(rootPaneCheckingEnabled);
  }//GEN-LAST:event_jButton2ActionPerformed

  private void jButton4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton4ActionPerformed
  {//GEN-HEADEREND:event_jButton4ActionPerformed
    FormDevolucao fDevolucao = new FormDevolucao();
    fDevolucao.setVisible(rootPaneCheckingEnabled);
  }//GEN-LAST:event_jButton4ActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Principal().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JButton jButton3;
  private javax.swing.JButton jButton4;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}
