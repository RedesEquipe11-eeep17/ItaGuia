package view;

public class Tela9d extends javax.swing.JFrame {

    public Tela9d() {
        initComponents();
        botaoReturn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JButton();
        labelImagem1 = new javax.swing.JLabel();
        labelImagem2 = new javax.swing.JLabel();
        labelImagem3 = new javax.swing.JLabel();
        botaoReturn = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setBackground(new java.awt.Color(204, 204, 204));
        titulo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setText("Desenvolvedores");
        titulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        titulo.setBorderPainted(false);
        titulo.setEnabled(false);
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 320, 50));

        labelImagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T9d(2).png"))); // NOI18N
        labelImagem1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mylliane Maria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(labelImagem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 200, 300));

        labelImagem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T9d(3).jpg"))); // NOI18N
        labelImagem2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Luciel Sousa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(labelImagem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 230, 240));

        labelImagem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T9d(1).jpg"))); // NOI18N
        labelImagem3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ivan Ronald", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(labelImagem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 230, 240));

        botaoReturn.setText("Retornar");
        botaoReturn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botaoReturn.setBorderPainted(false);
        botaoReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoReturnActionPerformed(evt);
            }
        });
        getContentPane().add(botaoReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 120, 30));

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/background-preto-fundo.jpg"))); // NOI18N
        getContentPane().add(labelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 490));

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
            java.util.logging.Logger.getLogger(Tela9d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela9d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela9d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela9d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela9d().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoReturn;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelImagem1;
    private javax.swing.JLabel labelImagem2;
    private javax.swing.JLabel labelImagem3;
    private javax.swing.JButton titulo;
    // End of variables declaration//GEN-END:variables
}
