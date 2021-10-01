/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import dao.Editar;
import dao.ExcluirDAO;
import dao.consultaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.UsuarioAtualizar;


public class EditarGui extends javax.swing.JFrame {
    UsuarioAtualizar objuser = new UsuarioAtualizar();
    Editar DAO;
    ExcluirDAO DAOdelete;

    public EditarGui() {
        initComponents();
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        TextEmail = new javax.swing.JTextField();
        textTel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BtAlterar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        BtDeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Digite o ID que vai ser alterado");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(35);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(50);
        }

        textID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CPF");

        TextEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextEmailActionPerformed(evt);
            }
        });

        textTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Telefone");

        BtAlterar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtAlterar.setText("Alterar Dados");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        BtDeletar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtDeletar.setText("Deletar");
        BtDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(56, 56, 56))
                            .addComponent(TextEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(66, 66, 66))
                            .addComponent(textCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(72, 72, 72))
                            .addComponent(textNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(64, 64, 64))
                            .addComponent(textTel, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textTel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btSairActionPerformed

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
        boolean cod;
        objuser = new UsuarioAtualizar();
        objuser.setNome(textNome.getText());
        objuser.setCpf(textCPF.getText());
        objuser.setEmail(TextEmail.getText().toLowerCase());
        objuser.setTelefone(textTel.getText());
        objuser.setId(textID.getText());
        
        if(textNome.getText().isEmpty()  || textCPF.getText().isEmpty() || TextEmail.getText().isEmpty() || textID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
        }
        else
        {

           try{
                DAO = new Editar();
                cod = DAO.Atualizar(objuser);       
                JOptionPane.showMessageDialog(null, "Usuário: "+textNome.getText()+" teve seus dados Atualizados Com Sucesso!");
           }
           catch(SQLException error)
           {
                 JOptionPane.showMessageDialog(this, "Error na ao enviar para o Banco de dados " + error.getMessage());
           }
        }
        textID.setText("");
        textNome.setText("");
        textCPF.setText("");
        textTel.setText("");
        TextEmail.setText("");
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();
        int l=mp1.getRowCount();
        
        if(1>0)
        {
            while(l>0)
            {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1-1);
                l--;
            }
        }
        
        try{
            ResultSet rs = consultaDAO.CarregarTabela();
            
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                String Coluna0 = rs.getString("id").toString().trim();
                String Coluna1 = rs.getString("nome").toString().trim();
                String Coluna2 = rs.getString("CPF").toString().trim();
                String Coluna3 = rs.getString("EMAIL").toString().trim();
                String Coluna4 = rs.getString("TELEFONE").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
    }//GEN-LAST:event_BtAlterarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();
        int l=mp1.getRowCount();
        
        if(1>0)
        {
            while(l>0)
            {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1-1);
                l--;
            }
        }
        
        try{
            ResultSet rs = consultaDAO.CarregarTabela();
            
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                String Coluna0 = rs.getString("id").toString().trim();
                String Coluna1 = rs.getString("nome").toString().trim();
                String Coluna2 = rs.getString("CPF").toString().trim();
                String Coluna3 = rs.getString("EMAIL").toString().trim();
                String Coluna4 = rs.getString("TELEFONE").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
    }//GEN-LAST:event_formWindowOpened

    private void BtDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarActionPerformed
          boolean cod;
        String id;
        objuser = new UsuarioAtualizar();
        id = textID.getText();
        
        if(textID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "O campo ID não pode estar vazio");
        }
        else
        {

           try{
                DAOdelete = new ExcluirDAO();
                cod = DAOdelete.Excluir(id);       
                JOptionPane.showMessageDialog(null, "O Cliente foi deletado");
           }
           catch(SQLException error)
           {
                 JOptionPane.showMessageDialog(this, "Error na ao enviar para o Banco de dados " + error.getMessage());
           }
        }
        textID.setText("");
        
        DefaultTableModel mp1 = (DefaultTableModel) jTable1.getModel();
        int l=mp1.getRowCount();
        
        if(1>0)
        {
            while(l>0)
            {
                ((DefaultTableModel) jTable1.getModel()).removeRow(1-1);
                l--;
            }
        }
        
        try{
            ResultSet rs = consultaDAO.CarregarTabela();
            
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
            while(rs.next())
            {
                String Coluna0 = rs.getString("id").toString().trim();
                String Coluna1 = rs.getString("nome").toString().trim();
                String Coluna2 = rs.getString("CPF").toString().trim();
                String Coluna3 = rs.getString("EMAIL").toString().trim();
                String Coluna4 = rs.getString("TELEFONE").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
    }//GEN-LAST:event_BtDeletarActionPerformed

    private void TextEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextEmailActionPerformed

    private void textTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTelActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtDeletar;
    private javax.swing.JTextField TextEmail;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextField textID;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textTel;
    // End of variables declaration//GEN-END:variables

}
