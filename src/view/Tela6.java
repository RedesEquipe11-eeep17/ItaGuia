package view;

public class Tela6 extends javax.swing.JFrame {

    public Tela6() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        telaScroll = new javax.swing.JScrollPane();
        painel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelImagem1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        menuItem5 = new javax.swing.JMenuItem();
        menuItem6 = new javax.swing.JMenuItem();
        menuItem7 = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuItem8 = new javax.swing.JMenuItem();
        menuItem9 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuItem10 = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        menuItem11 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painel1.setBackground(new java.awt.Color(0, 0, 0));

        labelTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Fotos de Itapipoca");

        labelImagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(1).jpg"))); // NOI18N
        labelImagem1.setPreferredSize(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(2).jpg"))); // NOI18N

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(3).jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 225));
        jLabel2.setMinimumSize(new java.awt.Dimension(300, 225));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(4).jpg"))); // NOI18N

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(5).jpg"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T6(6).jpg"))); // NOI18N

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(labelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 56, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(414, Short.MAX_VALUE))
        );

        telaScroll.setViewportView(painel1);

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setText("Navegar");

        menuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItem1.setText("Ir para Início");
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        menu1.add(menuItem1);

        menuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuItem2.setText("Ir para Pontos Turísticos");
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        menu1.add(menuItem2);

        menuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuItem3.setText("Ir para Festejos da Cidade");
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        menu1.add(menuItem3);

        menuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuItem4.setText("Ir para Fotos da Cidade");
        menuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem4ActionPerformed(evt);
            }
        });
        menu1.add(menuItem4);

        menuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuItem5.setText("Ir para Historia");
        menuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem5ActionPerformed(evt);
            }
        });
        menu1.add(menuItem5);

        menuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuItem6.setText("Ir para Mapa de Itapipoca");
        menuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem6ActionPerformed(evt);
            }
        });
        menu1.add(menuItem6);

        menuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuItem7.setText("Ir para Dicionario");
        menuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem7ActionPerformed(evt);
            }
        });
        menu1.add(menuItem7);
        menu1.add(separador1);

        menuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuItem8.setText("Avançar");
        menuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem8ActionPerformed(evt);
            }
        });
        menu1.add(menuItem8);

        menuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menuItem9.setText("Retornar");
        menu1.add(menuItem9);

        barraMenu.add(menu1);

        menu2.setText("Ajuda");

        menuItem10.setText("Deixe seu Comentario");
        menuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem10ActionPerformed(evt);
            }
        });
        menu2.add(menuItem10);
        menu2.add(separator2);

        menuItem11.setText("Relatar Problema");
        menuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem11ActionPerformed(evt);
            }
        });
        menu2.add(menuItem11);

        barraMenu.add(menu2);

        menu3.setText("Sobre");
        barraMenu.add(menu3);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 1131, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telaScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
        this.dispose();
        Tela3 t3 = new Tela3();
        t3.setLocationRelativeTo(null);
        t3.setVisible(true);
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
        this.dispose();
        Tela4 t4 = new Tela4();
        t4.setLocationRelativeTo(null);
        t4.setVisible(true);
    }//GEN-LAST:event_menuItem2ActionPerformed

    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        this.dispose();
        Tela5 t5 = new Tela5();
        t5.setLocationRelativeTo(null);
        t5.setVisible(true);
    }//GEN-LAST:event_menuItem3ActionPerformed

    private void menuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem4ActionPerformed
        this.dispose();
        Tela6 t6 = new Tela6();
        t6.setLocationRelativeTo(null);
        t6.setVisible(true);
    }//GEN-LAST:event_menuItem4ActionPerformed

    private void menuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem5ActionPerformed
        this.dispose();
        Tela7 t7 = new Tela7();
        t7.setLocationRelativeTo(null);
        t7.setVisible(true);
    }//GEN-LAST:event_menuItem5ActionPerformed

    private void menuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem6ActionPerformed
        this.dispose();
        Tela8 t8 = new Tela8();
        t8.setLocationRelativeTo(null);
        t8.setVisible(true);
    }//GEN-LAST:event_menuItem6ActionPerformed

    private void menuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem7ActionPerformed
        this.dispose();
        Tela9 t9 = new Tela9();
        t9.setLocationRelativeTo(null);
        t9.setVisible(true);
    }//GEN-LAST:event_menuItem7ActionPerformed

    private void menuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem8ActionPerformed
        this.dispose();
        Tela3 t3a = new Tela3();
        t3a.setLocationRelativeTo(null);
        t3a.setVisible(true);
    }//GEN-LAST:event_menuItem8ActionPerformed

    private void menuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem10ActionPerformed
        this.dispose();
        Tela9a t9a = new Tela9a();
        t9a.setLocationRelativeTo(null);
        t9a.setVisible(true);
    }//GEN-LAST:event_menuItem10ActionPerformed

    private void menuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem11ActionPerformed
        this.dispose();
        Tela9b t9b = new Tela9b();
        t9b.setLocationRelativeTo(null);
        t9b.setVisible(true);
    }//GEN-LAST:event_menuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelImagem1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem10;
    private javax.swing.JMenuItem menuItem11;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JMenuItem menuItem6;
    private javax.swing.JMenuItem menuItem7;
    private javax.swing.JMenuItem menuItem8;
    private javax.swing.JMenuItem menuItem9;
    private javax.swing.JPanel painel1;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separator2;
    private javax.swing.JScrollPane telaScroll;
    // End of variables declaration//GEN-END:variables
}
