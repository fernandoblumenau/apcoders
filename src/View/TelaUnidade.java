/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DaoUnidade;
import Model.Unidade;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class TelaUnidade extends javax.swing.JFrame {

    /**
     * Creates new form telaUnidade
     */
    public TelaUnidade() {
        initComponents();
        CarregarTabela();
        DesabilitarJbuttom();
        DesabilitarJTextField();
        LimparjTextField();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonHome = new javax.swing.JButton();
        jLabelCodUnidade = new javax.swing.JLabel();
        jLabelProprietario = new javax.swing.JLabel();
        jLabelCondominio = new javax.swing.JLabel();
        jLabelEndereco = new javax.swing.JLabel();
        jTextFieldCodUnidade = new javax.swing.JTextField();
        jTextFieldProprietario = new javax.swing.JTextField();
        jTextFieldCondominio = new javax.swing.JTextField();
        jTextFieldEndereco = new javax.swing.JTextField();
        jLabelInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUnidade = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Criação / Edição de Unidades"));

        jButtonNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/novo.png"))); // NOI18N
        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/salvar.png"))); // NOI18N
        jButtonSalvar.setText("salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/atualizar.png"))); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/excluir.png"))); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home.png"))); // NOI18N
        jButtonHome.setText("Home");

        jLabelCodUnidade.setText("Cod Unidade");

        jLabelProprietario.setText("Proprietário");

        jLabelCondominio.setText("Condomínio");

        jLabelEndereco.setText("Endereço");

        jTextFieldCodUnidade.setText("jTextField1");

        jTextFieldProprietario.setText("jTextField2");

        jTextFieldCondominio.setText("jTextField3");

        jTextFieldEndereco.setText("jTextField4");

        jLabelInfo.setForeground(new java.awt.Color(255, 0, 102));
        jLabelInfo.setText("Selecione Registro na tabela abaixo para Edição");

        jTableUnidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Unidade", "Proprietário", "Condomínio", "Endereço"
            }
        ));
        jTableUnidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableUnidadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableUnidade);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCodUnidade)
                    .addComponent(jTextFieldCodUnidade))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelProprietario)
                    .addComponent(jTextFieldProprietario))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelCondominio)
                    .addComponent(jTextFieldCondominio))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldEndereco)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBaseLayout.createSequentialGroup()
                                .addComponent(jButtonExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonHome))
                            .addComponent(jLabelEndereco))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addComponent(jLabelInfo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanelBaseLayout.setVerticalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonHome))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCodUnidade)
                    .addComponent(jLabelProprietario)
                    .addComponent(jLabelCondominio)
                    .addComponent(jLabelEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCondominio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
      
        HabilitarJTextField();
        DesabilitarJbuttom();
        jButtonSalvar.setEnabled(true);
        LimparjTextField();         
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed

        Unidade unidades = new Unidade();
        DaoUnidade daoUnidades = new DaoUnidade();
        
        unidades.setCondominio(jTextFieldCondominio.getText());
        unidades.setEndereco(jTextFieldEndereco.getText());
        unidades.setProprietario(jTextFieldProprietario.getText());
        daoUnidades.cadastrarUnidade(unidades);       
        CarregarTabela();
        LimparjTextField();        
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTableUnidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableUnidadeMouseClicked

        Unidade unidades = new Unidade();
        DaoUnidade daoUnidades =new DaoUnidade();
        Integer index = jTableUnidade.getSelectedRow();
        unidades= daoUnidades.listarUnidade().get(index);
        jTextFieldCodUnidade.setText(String.valueOf(unidades.getCodUnidade()));
        jTextFieldCondominio.setText(unidades.getCondominio());
        jTextFieldEndereco.setText(unidades.getEndereco());
        jTextFieldProprietario.setText(unidades.getProprietario());
         
        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        HabilitarJTextField();           
    }//GEN-LAST:event_jTableUnidadeMouseClicked

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        Unidade unidades =new Unidade(); 
        DaoUnidade daoUnidades =new DaoUnidade();
        Integer index = jTableUnidade.getSelectedRow();
        
        unidades =daoUnidades.listarUnidade().get(index);
        unidades.setCodUnidade(Integer.parseInt(jTextFieldCodUnidade.getText()));
        unidades.setCondominio(jTextFieldCondominio.getText());
        unidades.setEndereco(jTextFieldEndereco.getText());
        unidades.setProprietario(jTextFieldProprietario.getText());
        
        daoUnidades.editarUnidade(unidades);    
        CarregarTabela();
        LimparjTextField();
        DesabilitarJTextField();
        DesabilitarJbuttom();        
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        Unidade unidades =new Unidade();  
        DaoUnidade daoUnidades = new DaoUnidade();
        Integer index = jTableUnidade.getSelectedRow();
        unidades = daoUnidades.listarUnidade().get(index);
        daoUnidades.removerUnidade(Integer.parseInt(jTextFieldCodUnidade.getText()));
        CarregarTabela();
        LimparjTextField();
        DesabilitarJTextField();
        DesabilitarJbuttom();                
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void LimparjTextField(){
        jTextFieldCodUnidade.setText("");
        jTextFieldCondominio.setText("");
        jTextFieldEndereco.setText("");
        jTextFieldProprietario.setText("");
    }    
    
    private void DesabilitarJbuttom(){
        jButtonEditar.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonExcluir.setEnabled(false);    
    }

    private void HabilitarJbuttom(){
        jButtonEditar.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
    }       
    
    private void DesabilitarJTextField(){
        jTextFieldCodUnidade.setEnabled(false);
        jTextFieldCondominio.setEnabled(false);
        jTextFieldEndereco.setEnabled(false);
        jTextFieldProprietario.setEnabled(false);
        
        jLabelCodUnidade.setEnabled(false);
        jLabelCondominio.setEnabled(false);
        jLabelEndereco.setEnabled(false);
        jLabelProprietario.setEnabled(false);
    }
        
    private void HabilitarJTextField(){
        jTextFieldCondominio.setEnabled(true);
        jTextFieldEndereco.setEnabled(true);
        jTextFieldProprietario.setEnabled(true);
        
        jLabelCondominio.setEnabled(true);
        jLabelEndereco.setEnabled(true);
        jLabelProprietario.setEnabled(true);
    }
    
    private void CarregarTabela(){
        
        DefaultTableModel tabela = (DefaultTableModel) jTableUnidade.getModel();
        tabela.setNumRows(0);
      
        DaoUnidade daoUnidades = new DaoUnidade();
        
        try {
            for(Unidade u: daoUnidades.listarUnidade()){
                tabela.addRow(new Object[]{
                    u.getCodUnidade(),
                    u.getProprietario(),                   
                    u.getCondominio(),
                    u.getEndereco(),
                });
            }                            
        } catch (Exception erro) {            
            JOptionPane.showMessageDialog(null,"Erro ao Carregar tabela",
                    "Erro",JOptionPane.ERROR_MESSAGE); 
        }  
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaUnidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaUnidade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodUnidade;
    private javax.swing.JLabel jLabelCondominio;
    private javax.swing.JLabel jLabelEndereco;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelProprietario;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUnidade;
    private javax.swing.JTextField jTextFieldCodUnidade;
    private javax.swing.JTextField jTextFieldCondominio;
    private javax.swing.JTextField jTextFieldEndereco;
    private javax.swing.JTextField jTextFieldProprietario;
    // End of variables declaration//GEN-END:variables
}