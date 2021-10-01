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


public class deletarGui extends javax.swing.JFrame {
    UsuarioAtualizar objuser = new UsuarioAtualizar();
    ExcluirDAO DAO;

    public deletarGui() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtAlterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textID = new javax.swing.JTextField();
        BtAlterar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        BtAlterar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtAlterar.setText("Deletar");
        BtAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Digite o ID que vai ser deletado");

        textID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        BtAlterar1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BtAlterar1.setText("Sair");
        BtAlterar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterar1ActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtAlterar1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtAlterar)
                        .addComponent(BtAlterar1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarActionPerformed
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
                DAO = new ExcluirDAO();
                cod = DAO.Excluir(id);       
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

    private void BtAlterar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterar1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_BtAlterar1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(deletarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deletarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deletarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deletarGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deletarGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAlterar;
    private javax.swing.JButton BtAlterar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField textID;
    // End of variables declaration//GEN-END:variables

}
