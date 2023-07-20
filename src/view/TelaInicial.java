/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Murillo
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAgendamento = new javax.swing.JPanel();
        jlblBemVindo = new javax.swing.JLabel();
        jscrllpnAgendamento = new javax.swing.JScrollPane();
        jtblAgendamento = new javax.swing.JTable();
        jbtnNovaConsulta = new javax.swing.JButton();
        jbtnExcluirConsulta = new javax.swing.JButton();
        jbtnFinalizarConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agendamento do Paciente");

        jlblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlblBemVindo.setText("Bem-vindo ao Sistema de Agendamento");

        jscrllpnAgendamento.setToolTipText("");

        jtblAgendamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Paciente", "CPF", "Telefone", "Data", "Já é paciente?", "Consulta Realizada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jscrllpnAgendamento.setViewportView(jtblAgendamento);

        jbtnNovaConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnNovaConsulta.setText("NOVA CONSULTA");
        jbtnNovaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNovaConsultaActionPerformed(evt);
            }
        });

        jbtnExcluirConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnExcluirConsulta.setText("EXCLUIR CONSUILTA");

        jbtnFinalizarConsulta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jbtnFinalizarConsulta.setText("FINALIZAR CONSULTA");

        javax.swing.GroupLayout pnlAgendamentoLayout = new javax.swing.GroupLayout(pnlAgendamento);
        pnlAgendamento.setLayout(pnlAgendamentoLayout);
        pnlAgendamentoLayout.setHorizontalGroup(
            pnlAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jscrllpnAgendamento)
                    .addGroup(pnlAgendamentoLayout.createSequentialGroup()
                        .addGroup(pnlAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblBemVindo)
                            .addGroup(pnlAgendamentoLayout.createSequentialGroup()
                                .addComponent(jbtnNovaConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnExcluirConsulta)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnFinalizarConsulta)))
                        .addGap(0, 149, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAgendamentoLayout.setVerticalGroup(
            pnlAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlblBemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jscrllpnAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnNovaConsulta)
                    .addComponent(jbtnExcluirConsulta)
                    .addComponent(jbtnFinalizarConsulta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgendamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNovaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNovaConsultaActionPerformed
            TelaCadastro telaCadastro = new TelaCadastro();
            telaCadastro.setVisible(true);
    }//GEN-LAST:event_jbtnNovaConsultaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnExcluirConsulta;
    private javax.swing.JButton jbtnFinalizarConsulta;
    private javax.swing.JButton jbtnNovaConsulta;
    private javax.swing.JLabel jlblBemVindo;
    private javax.swing.JScrollPane jscrllpnAgendamento;
    private javax.swing.JTable jtblAgendamento;
    private javax.swing.JPanel pnlAgendamento;
    // End of variables declaration//GEN-END:variables
}
