package view;

public class Tela9c extends javax.swing.JFrame {

    public Tela9c() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        labelText = new javax.swing.JLabel();
        botaoReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel1.setBackground(new java.awt.Color(0, 0, 0));
        painel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelText.setForeground(new java.awt.Color(255, 255, 255));
        labelText.setText("<html><p align=\"justify\">Esse software foi criado com o intuito de informar e lhes disponinibilizar mais aprendizado sobre nossa cidade e tambem sobre suas girias,cultura e seus principais pontos turisticos, não só isso mais para tambem em um futuro proximo visitantes de outros locais obtessem conhecimento sobre o mesmo.</p></html>");
        painel1.add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 300));

        botaoReturn.setText("Retornar");
        botaoReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReturnActionPerformed(evt);
            }
        });
        painel1.add(botaoReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 100, 30));

        getContentPane().add(painel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoReturnActionPerformed
        this.dispose();
        Tela3 t3v = new Tela3();
        t3v.setLocationRelativeTo(null);
        t3v.setVisible(true);
        
    }//GEN-LAST:event_botaoReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Tela9c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela9c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela9c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela9c.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela9c().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoReturn;
    private javax.swing.JLabel labelText;
    private javax.swing.JPanel painel1;
    // End of variables declaration//GEN-END:variables
}
