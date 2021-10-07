package Interface;

//Imports
import DAO.consultaDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarUsuarios extends javax.swing.JFrame {
 
    public ConsultarUsuarios() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BtSair = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consulta");
        setBackground(new java.awt.Color(204, 255, 255));
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

        BtSair.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        BtSair.setText("Sair");
        BtSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSairActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Sexo", "Telefone" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Pesquise");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
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
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, 0, 90, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                        .addGap(56, 56, 56))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(BtSair, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addGap(280, 280, 280))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
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

    private void BtSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtSairActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String tipo = "";
        int resultados = 0;
        String escolha= jComboBox1.getSelectedItem().toString().trim();
        if(escolha == "Nome"){
            tipo=" "+"Nome";}
        if(escolha == "CPF"){
            tipo=" "+"CPF";}
        if(escolha == "Sexo"){
            tipo=" "+"Sexo";}
        if(escolha == "Telefone"){
            tipo=" "+"Telefone";}
        String arg= jTextField1.getText();
        
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
                resultados++;
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
        jLabel1.setText( resultados +" resulatados encontrados");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        
        
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtSair;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
