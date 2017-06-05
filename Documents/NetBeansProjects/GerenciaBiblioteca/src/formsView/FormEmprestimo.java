package formsView;

import dao.EmprestimoDAO;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormEmprestimo extends javax.swing.JFrame
{

  public FormEmprestimo()
  {
    initComponents();
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jLabel2 = new javax.swing.JLabel();
    txtNomeAluno = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    txtNomeLivro = new javax.swing.JTextField();
    labelData = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    btnRegistrar = new javax.swing.JButton();
    txtDateEmp = new javax.swing.JFormattedTextField();
    txtDateEnt = new javax.swing.JFormattedTextField();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Emprestimo");

    jLabel2.setText("Nome Aluno");

    jLabel3.setText("Nome do Livro");

    labelData.setText("Data do emprestimo");

    jLabel5.setText("Data de entrega");

    btnRegistrar.setText("Registrar");
    btnRegistrar.addActionListener(new java.awt.event.ActionListener()
    {
      public void actionPerformed(java.awt.event.ActionEvent evt)
      {
        btnRegistrarActionPerformed(evt);
      }
    });

    DateFormat relogioFormatado = new SimpleDateFormat("dd/MM/yyyy");
    Date relogio = new Date();
    txtDateEmp.setText(relogioFormatado.format(relogio));

    Calendar c = Calendar.getInstance();
    c.setTime(relogio);

    c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) +10);
    txtDateEnt.setText(relogioFormatado.format(c.getTime()));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(26, 26, 26)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel2)
              .addComponent(txtNomeAluno)
              .addComponent(jLabel3)
              .addComponent(txtNomeLivro)
              .addComponent(labelData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel5)
              .addComponent(txtDateEnt, javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(txtDateEmp)))
          .addGroup(layout.createSequentialGroup()
            .addGap(110, 110, 110)
            .addComponent(btnRegistrar)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel2)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel3)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtNomeLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(labelData)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jLabel5)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(txtDateEnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnRegistrar)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    setLocationRelativeTo(null);
  }// </editor-fold>//GEN-END:initComponents

  private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnRegistrarActionPerformed
  {//GEN-HEADEREND:event_btnRegistrarActionPerformed
    DateFormat relogioFormatado = new SimpleDateFormat("dd/MM/yyyy");        
    Date relogio = new Date();
    Calendar c = Calendar.getInstance();
    c.setTime(relogio);
    c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) +10);
    
    EmprestimoDAO regitraEmp = new EmprestimoDAO();
    regitraEmp.salvaEmpLivro(txtNomeAluno.getText(), txtNomeLivro.getText(),  relogioFormatado.format(relogio), relogioFormatado.format(c.getTime()));
    txtNomeAluno.setText("");
    txtNomeLivro.setText("");
//    c.set(Calendar.DAY_OF_MONTH, c.get(Calendar.DAY_OF_MONTH) +10);
//    txtDateEnt.setText(relogioFormatado.format(c.getTime()));
  }//GEN-LAST:event_btnRegistrarActionPerformed

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
      java.util.logging.Logger.getLogger(FormEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(FormEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(FormEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(FormEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new FormEmprestimo().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnRegistrar;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel labelData;
  private javax.swing.JFormattedTextField txtDateEmp;
  private javax.swing.JFormattedTextField txtDateEnt;
  private javax.swing.JTextField txtNomeAluno;
  private javax.swing.JTextField txtNomeLivro;
  // End of variables declaration//GEN-END:variables
}
