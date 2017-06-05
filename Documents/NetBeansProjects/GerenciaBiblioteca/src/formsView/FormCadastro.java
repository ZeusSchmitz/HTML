package formsView;

import dao.CadastroDAO;


public class FormCadastro extends javax.swing.JFrame
{

  
  public FormCadastro()
  {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jButton1 = new javax.swing.JButton();
    txtNomLivro = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    txtAutor = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    txtNumLivro = new javax.swing.JTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Cadastro");

    jButton1.setText("Cadastrar");
    jButton1.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        jButton1ActionPerformed(evt);
      }
    });

    jLabel2.setText("Nome do Livro");

    jLabel3.setText("Autor do Livro");

    jLabel4.setText("Num. Livro");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(jButton1)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel2)
              .addComponent(jLabel3)
              .addComponent(jLabel4)
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(txtNumLivro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(txtNomLivro, javax.swing.GroupLayout.Alignment.LEADING)))
            .addGap(65, 65, 65)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNomLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel4)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNumLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(57, 57, 57)
        .addComponent(jButton1)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
  {//GEN-HEADEREND:event_jButton1ActionPerformed
    CadastroDAO saveLivro = new CadastroDAO();
    saveLivro.salvaLivro( txtNomLivro.getText(), txtAutor.getText(), txtNumLivro.getText());
    txtAutor.setText("");
    txtNomLivro.setText("");
    txtNumLivro.setText("");
  }//GEN-LAST:event_jButton1ActionPerformed

  public static void main(String args[])
  {
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
      java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(FormCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new FormCadastro().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JTextField txtAutor;
  private javax.swing.JTextField txtNomLivro;
  private javax.swing.JTextField txtNumLivro;
  // End of variables declaration//GEN-END:variables
}
