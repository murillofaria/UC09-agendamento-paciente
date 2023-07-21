/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import model.ListaPaciente;
import model.Paciente;

/**
 *
 * @author Murillo
 */
public class TelaCadastro extends javax.swing.JFrame {

    Paciente paciente = new Paciente();
    TelaInicial telaInicial = new TelaInicial();

    public TelaCadastro() {
        initComponents();
    }
    
    public void MostrarTela(TelaInicial obj){
        this.telaInicial = obj;
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlCadastro = new javax.swing.JPanel();
        jlblCadastroConsulta = new javax.swing.JLabel();
        jlblNomePaciente = new javax.swing.JLabel();
        jtxtNomePaciente = new javax.swing.JTextField();
        jlblTelefone = new javax.swing.JLabel();
        jftfTelefone = new javax.swing.JFormattedTextField();
        jlblCpf = new javax.swing.JLabel();
        jftfCpf = new javax.swing.JFormattedTextField();
        jlblDataConsulta = new javax.swing.JLabel();
        jftfDataConsulta = new javax.swing.JFormattedTextField();
        jcboxJaPaciente = new javax.swing.JCheckBox();
        jbtnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Consulta");

        jlblCadastroConsulta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblCadastroConsulta.setText("Cadastrar Consulta");

        jlblNomePaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblNomePaciente.setText("Nome do(a) Paciente:");

        jlblTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblTelefone.setText("Telefone:");

        try {
            jftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlblCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblCpf.setText("CPF:");

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jlblDataConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jlblDataConsulta.setText("Data da Consulta:");

        try {
            jftfDataConsulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcboxJaPaciente.setText("Já é Paciente");

        jbtnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnCadastrar.setText("CADASTRAR");
        jbtnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnlCadastroLayout = new javax.swing.GroupLayout(jpnlCadastro);
        jpnlCadastro.setLayout(jpnlCadastroLayout);
        jpnlCadastroLayout.setHorizontalGroup(
            jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblCadastroConsulta)
                    .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpnlCadastroLayout.createSequentialGroup()
                            .addComponent(jlblTelefone)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnlCadastroLayout.createSequentialGroup()
                            .addComponent(jlblNomePaciente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jtxtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnlCadastroLayout.createSequentialGroup()
                            .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlblDataConsulta)
                                .addComponent(jlblCpf))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jftfDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jcboxJaPaciente)
                                .addComponent(jbtnCadastrar)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jpnlCadastroLayout.setVerticalGroup(
            jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblCadastroConsulta)
                .addGap(18, 18, 18)
                .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblNomePaciente)
                    .addComponent(jtxtNomePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTelefone)
                    .addComponent(jftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCpf)
                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblDataConsulta)
                    .addComponent(jftfDataConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jcboxJaPaciente)
                .addGap(18, 18, 18)
                .addComponent(jbtnCadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCadastrarActionPerformed
        if (jtxtNomePaciente.getText().isEmpty() || jftfTelefone.getText().equals("(  )         ") || jftfCpf.getText().equals("   .   .   -  ") || jftfDataConsulta.getText().equals("  /  /    ")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos.");
        } else {
            paciente.setNome(jtxtNomePaciente.getText());
            paciente.setTelefone(jftfTelefone.getText());
            paciente.setCpf(jftfCpf.getText());
            paciente.setDataConsulta(jftfDataConsulta.getText());

            if (jcboxJaPaciente.isSelected()) {
                paciente.setJaPaciente("Sim");
            }
            ListaPaciente.Adicionar(paciente);
            telaInicial.atualizarTabela();
            dispose();
        }

    }//GEN-LAST:event_jbtnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnCadastrar;
    private javax.swing.JCheckBox jcboxJaPaciente;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfDataConsulta;
    private javax.swing.JFormattedTextField jftfTelefone;
    private javax.swing.JLabel jlblCadastroConsulta;
    private javax.swing.JLabel jlblCpf;
    private javax.swing.JLabel jlblDataConsulta;
    private javax.swing.JLabel jlblNomePaciente;
    private javax.swing.JLabel jlblTelefone;
    private javax.swing.JPanel jpnlCadastro;
    private javax.swing.JTextField jtxtNomePaciente;
    // End of variables declaration//GEN-END:variables
}
