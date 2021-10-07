/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import DAO.Editar;
import DAO.ExcluirDAO;
import DAO.consultaDAO;
import Modelos.cliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EditarGUI extends javax.swing.JFrame {
cliente objCli = new cliente();
ExcluirDAO DAO = new ExcluirDAO();
Editar EDAO = new Editar();
    public EditarGUI() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        TextTel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextEnd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btEditar = new javax.swing.JButton();
        btdeletar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Telefone", "CPF", "Sexo", "Endereco", "Data.N"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ID do Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nome");

        TextId.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TextIdComponentAdded(evt);
            }
        });
        TextId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextIdKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Endereço");

        btEditar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btdeletar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btdeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Deletar.png"))); // NOI18N
        btdeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btdeletarMousePressed(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btdeletarMouseExited(evt);
            }
        });
        btdeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeletarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(TextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel2)
                                .addGap(173, 173, 173)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(79, 79, 79)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btdeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addComponent(btEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextTel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btdeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
                String Coluna2 = rs.getString("TELEFONE").toString().trim();
                String Coluna3 = rs.getString("CPF").toString().trim();
                String Coluna4 = rs.getString("Sexo").toString().trim();
                String Coluna5 = rs.getString("Endereco").toString().trim();
                String Coluna6 = rs.getString("DataDenascimento").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5, Coluna6});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btdeletarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdeletarMousePressed
         btdeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DeletarDown.png")));
    }//GEN-LAST:event_btdeletarMousePressed

    private void btdeletarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdeletarMouseExited
       btdeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Deletar.png")));
    }//GEN-LAST:event_btdeletarMouseExited

    private void TextIdComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TextIdComponentAdded
        
    }//GEN-LAST:event_TextIdComponentAdded

    private void TextIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextIdKeyReleased
         String tipo = "ID";
          String arg= TextId.getText();
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
            ResultSet rs = consultaDAO.filtrar(tipo, arg);
            
            DefaultTableModel mp = (DefaultTableModel) jTable1.getModel();
        while(rs.next())
            {
                String Coluna0 = rs.getString("id").toString().trim();
                String Coluna1 = rs.getString("nome").toString().trim();
                String Coluna2 = rs.getString("TELEFONE").toString().trim();
                String Coluna3 = rs.getString("CPF").toString().trim();
                String Coluna4 = rs.getString("Sexo").toString().trim();
                String Coluna5 = rs.getString("Endereco").toString().trim();
                String Coluna6 = rs.getString("DataDenascimento").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5, Coluna6});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
    }//GEN-LAST:event_TextIdKeyReleased

    private void btdeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeletarActionPerformed
        boolean cod;
        String id;
        int confirm1  = JOptionPane.showConfirmDialog(null, "Tem Ceteza que deseja deletar esse Cliente ele não podera se Repurepado");
        
        boolean confirm2 = (confirm1 == JOptionPane.YES_OPTION);
        if(confirm2)
        {
            
        
        cliente objCli = new cliente();
        id = TextId.getText();
        
        if(TextId.getText().isEmpty())
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
        TextId.setText("");
        
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
                String Coluna2 = rs.getString("TELEFONE").toString().trim();
                String Coluna3 = rs.getString("CPF").toString().trim();
                String Coluna4 = rs.getString("Sexo").toString().trim();
                String Coluna5 = rs.getString("Endereco").toString().trim();
                String Coluna6 = rs.getString("DataDenascimento").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5, Coluna6});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }
        }
        else
        {
        JOptionPane.showMessageDialog(null, "Ação Cancelada");
        }
    }//GEN-LAST:event_btdeletarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        
        boolean cod;
        objCli = new cliente();
        objCli.setNome(TextNome.getText());
        objCli.setTelefone(TextTel.getText());
        objCli.setEndereco(TextEnd.getText());
        int ids= Integer.parseInt(TextId.getText());
        objCli.setId(ids);
        
        if(TextNome.getText().isEmpty()  || TextId.getText().isEmpty() || TextTel.getText().isEmpty() || TextEnd.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Os campos não podem estar vazios");
        }
        else
        {

           try{
                EDAO = new Editar();
                cod = EDAO.Atualizar(objCli);       
                JOptionPane.showMessageDialog(null, "Usuário: "+TextNome.getText()+" teve seus dados Atualizados Com Sucesso!");
           }
           catch(SQLException error)
           {
                 JOptionPane.showMessageDialog(this, "Error na ao enviar para o Banco de dados " + error.getMessage());
           }
        }
        TextId.setText("");
        TextNome.setText("");
        TextTel.setText("");
        TextEnd.setText("");
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
                String Coluna2 = rs.getString("TELEFONE").toString().trim();
                String Coluna3 = rs.getString("CPF").toString().trim();
                String Coluna4 = rs.getString("Sexo").toString().trim();
                String Coluna5 = rs.getString("Endereco").toString().trim();
                String Coluna6 = rs.getString("DataDenascimento").toString().trim();
                
                mp.addRow(new String[]{Coluna0, Coluna1, Coluna2, Coluna3, Coluna4, Coluna5, Coluna6});
            }
        }
        catch(SQLException error)
        {
            JOptionPane.showMessageDialog(this,"Ocorreu um error " + error);
        }                       
        
    }//GEN-LAST:event_btEditarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextEnd;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextTel;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btdeletar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
