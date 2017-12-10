package view;

public class Tela9c extends javax.swing.JFrame {

    public Tela9c() {
        initComponents();
        botaoReturn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelText = new javax.swing.JLabel();
        botaoReturn = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel.setBackground(new java.awt.Color(0, 0, 0));
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("<html>Qual seu intuito?</html>");
        painel.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 50));

        labelText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        labelText.setForeground(new java.awt.Color(255, 255, 255));
        labelText.setText("<html><p align=\"justify\">Esse software foi criado com o intuito de informar e lhes disponinibilizar mais aprendizado sobre nossa cidade e tambem sobre suas girias,cultura e seus principais pontos turisticos, não só isso mais para tambem em um futuro proximo visitantes de outros locais obtessem conhecimento sobre o mesmo.</p></html>");
        painel.add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 410, 290));

        botaoReturn.setText("Retornar");
        botaoReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoReturn.setBorderPainted(false);
        botaoReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReturnActionPerformed(evt);
            }
        });
        painel.add(botaoReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 100, 30));

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-preto-fundo.jpg"))); // NOI18N
        painel.add(labelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 420));

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
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
