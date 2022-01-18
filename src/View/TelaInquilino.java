/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.DaoInquilino;
import Controller.DaoUnidade;
import Model.Inquilino;
import Model.Unidade;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferna
 */
public class TelaInquilino extends javax.swing.JFrame {

    /**
     * Creates new form telaInquilino
     */
    public TelaInquilino() {
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
        jLabelCodInquilino = new javax.swing.JLabel();
        jLabelNome = new javax.swing.JLabel();
        jLabelNascimento = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelCodUnidade = new javax.swing.JLabel();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldCodInquilino = new javax.swing.JTextField();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldNascimento = new javax.swing.JTextField();
        jTextFieldSexo = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldCodUnidade = new javax.swing.JTextField();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabelInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInquilino = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Criação / Edição de Inquilinos"));

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

        jLabelCodInquilino.setText("Cod Inquilino");

        jLabelNome.setText("Nome");

        jLabelNascimento.setText("Nascimento");

        jLabelSexo.setText("Sexo");

        jLabelTelefone.setText("Telefone");

        jLabelEmail.setText("Email");

        jLabelCodUnidade.setText("Cod Unidade");

        jLabelIdade.setText("Idade");

        jTextFieldCodInquilino.setText("jTextField1");

        jTextFieldNome.setText("jTextField2");

        jTextFieldNascimento.setText("jTextField3");

        jTextFieldSexo.setText("jTextField4");

        jTextFieldTelefone.setText("jTextField1");

        jTextFieldEmail.setText("jTextField1");

        jTextFieldCodUnidade.setText("jTextField1");

        jTextFieldIdade.setText("jTextField1");

        jLabelInfo.setForeground(new java.awt.Color(255, 0, 102));
        jLabelInfo.setText("Selecione Registro na tabela abaixo para Edição");

        jTableInquilino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Inquilino", "Nome", "Nascimento", "Sexo", "Telefone", "Email", "Cod Unidade"
            }
        ));
        jTableInquilino.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableInquilinoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableInquilino);

        javax.swing.GroupLayout jPanelBaseLayout = new javax.swing.GroupLayout(jPanelBase);
        jPanelBase.setLayout(jPanelBaseLayout);
        jPanelBaseLayout.setHorizontalGroup(
            jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanelBaseLayout.createSequentialGroup()
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelInfo)
                    .addGroup(jPanelBaseLayout.createSequentialGroup()
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelBaseLayout.createSequentialGroup()
                                    .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jButtonNovo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCodInquilino, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextFieldCodInquilino, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelNome)
                                        .addComponent(jTextFieldNome)))
                                .addComponent(jTextFieldEmail))
                            .addComponent(jLabelEmail))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNascimento)
                            .addComponent(jTextFieldNascimento)
                            .addComponent(jLabelCodUnidade)
                            .addComponent(jTextFieldCodUnidade))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdade)
                            .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanelBaseLayout.createSequentialGroup()
                                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldTelefone))
                                .addGroup(jPanelBaseLayout.createSequentialGroup()
                                    .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonExcluir)
                                        .addComponent(jLabelSexo))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(jLabelCodInquilino)
                    .addComponent(jLabelNome)
                    .addComponent(jLabelNascimento)
                    .addComponent(jLabelSexo)
                    .addComponent(jLabelTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(jLabelCodUnidade)
                    .addComponent(jLabelIdade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCodUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabelInfo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Inquilino inquilinos = new Inquilino();
        DaoInquilino daoInquilinos = new DaoInquilino();

        inquilinos.setNome(jTextFieldNome.getText());
        inquilinos.setDataNascimento(Date.valueOf(jTextFieldNascimento.getText()));
        inquilinos.setSexo(jTextFieldSexo.getText().charAt(0));
        inquilinos.setTelefone(jTextFieldTelefone.getText());
        inquilinos.setEmail(jTextFieldEmail.getText());
        inquilinos.setCodUnidade(Integer.parseInt(jTextFieldCodUnidade.getText()));        
        
        daoInquilinos.cadastrarInquilino(inquilinos);
        CarregarTabela();
        LimparjTextField();

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed

        Inquilino inquilinos =new Inquilino();
        DaoInquilino daoInquilino =new DaoInquilino();
        Integer index = jTableInquilino.getSelectedRow();

        inquilinos =daoInquilino.listarInquilino().get(index);
        inquilinos.setCodInquilino(Integer.parseInt(jTextFieldCodInquilino.getText()));
        inquilinos.setNome(jTextFieldNome.getText());
        inquilinos.setDataNascimento(Date.valueOf(jTextFieldNascimento.getText()));
        inquilinos.setSexo((jTextFieldNome.getText().charAt(0)));
        inquilinos.setTelefone(jTextFieldTelefone.getText());
        inquilinos.setEmail(jTextFieldEmail.getText());
        inquilinos.setCodUnidade(Integer.parseInt(jTextFieldCodUnidade.getText())); 

        daoInquilino.editarInqulino(inquilinos);
        CarregarTabela();
        LimparjTextField();
        DesabilitarJTextField();
        DesabilitarJbuttom();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed

        Inquilino inquilinos =new Inquilino();
        DaoInquilino daoInquilinos = new DaoInquilino();
        Integer index = jTableInquilino.getSelectedRow();
        inquilinos = daoInquilinos.listarInquilino().get(index);
        daoInquilinos.removerInquilino(Integer.parseInt(jTextFieldCodInquilino.getText()));
        CarregarTabela();
        LimparjTextField();
        DesabilitarJTextField();
        DesabilitarJbuttom();
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableInquilinoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableInquilinoMouseClicked

        Inquilino inquilinos = new Inquilino();
        DaoInquilino daoinquilinos =new DaoInquilino();
        Integer index = jTableInquilino.getSelectedRow();
        inquilinos= daoinquilinos.listarInquilino().get(index);
        
        jTextFieldCodInquilino.setText(String.valueOf(inquilinos.getCodInquilino()));
        jTextFieldNome.setText(inquilinos.getNome());
        jTextFieldNascimento.setText(String.valueOf(inquilinos.getDataNascimento()));
        jTextFieldSexo.setText(String.valueOf(inquilinos.getSexo()));
        jTextFieldTelefone.setText(inquilinos.getTelefone());
        jTextFieldEmail.setText(inquilinos.getEmail());
        jTextFieldCodUnidade.setText(String.valueOf(inquilinos.getCodUnidade()));        

        jButtonSalvar.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        HabilitarJTextField();
    }//GEN-LAST:event_jTableInquilinoMouseClicked

    private void LimparjTextField(){
        jTextFieldCodInquilino.setText("");
        jTextFieldCodUnidade.setText("");
        jTextFieldEmail.setText("");
        jTextFieldIdade.setText("");
        jTextFieldNascimento.setText("");
        jTextFieldNome.setText("");
        jTextFieldSexo.setText("");
        jTextFieldTelefone.setText("");        
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
        jTextFieldCodInquilino.setEnabled(false);
        jTextFieldCodUnidade.setEnabled(false);
        jTextFieldEmail.setEnabled(false);
        jTextFieldIdade.setEnabled(false);
        jTextFieldNascimento.setEnabled(false);
        jTextFieldNome.setEnabled(false);
        jTextFieldSexo.setEnabled(false);
        jTextFieldTelefone.setEnabled(false);        
        
        jLabelCodInquilino.setEnabled(false);
        jLabelCodUnidade.setEnabled(false);
        jLabelEmail.setEnabled(false);
        jLabelIdade.setEnabled(false);
        jLabelNascimento.setEnabled(false);
        jLabelNome.setEnabled(false);
        jLabelSexo.setEnabled(false);
        jLabelTelefone.setEnabled(false);        
    }
        
    private void HabilitarJTextField(){
        jTextFieldCodUnidade.setEnabled(true);
        jTextFieldEmail.setEnabled(true);
        jTextFieldNascimento.setEnabled(true);
        jTextFieldNome.setEnabled(true);
        jTextFieldSexo.setEnabled(true);
        jTextFieldTelefone.setEnabled(true);        
        
        jLabelCodUnidade.setEnabled(true);
        jLabelEmail.setEnabled(true);
        jLabelNascimento.setEnabled(true);
        jLabelNome.setEnabled(true);
        jLabelSexo.setEnabled(true);
        jLabelTelefone.setEnabled(true);   
    }
    
    private void CarregarTabela(){
        
        DefaultTableModel tabela = (DefaultTableModel) jTableInquilino.getModel();
        tabela.setNumRows(0);
      
        DaoInquilino daoInquilinos = new DaoInquilino();
        
        try {
            for(Inquilino i: daoInquilinos.listarInquilino()){
                tabela.addRow(new Object[]{
                    i.getCodInquilino(),
                    i.getNome(),                   
                    i.getDataNascimento(),
                    i.getSexo(),
                    i.getTelefone(),
                    i.getEmail(),
                    i.getCodUnidade()
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
            java.util.logging.Logger.getLogger(TelaInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInquilino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInquilino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonHome;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelCodInquilino;
    private javax.swing.JLabel jLabelCodUnidade;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelInfo;
    private javax.swing.JLabel jLabelNascimento;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInquilino;
    private javax.swing.JTextField jTextFieldCodInquilino;
    private javax.swing.JTextField jTextFieldCodUnidade;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNascimento;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldSexo;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables
}