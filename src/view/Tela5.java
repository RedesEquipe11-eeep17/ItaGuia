package view;

public class Tela5 extends javax.swing.JFrame {

    public Tela5() {
        initComponents();
        botao1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        botao7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        botao1 = new javax.swing.JButton();
        botao2 = new javax.swing.JButton();
        botao3 = new javax.swing.JButton();
        botao4 = new javax.swing.JButton();
        botao6 = new javax.swing.JButton();
        botao5 = new javax.swing.JButton();
        botao7 = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        menuItem5 = new javax.swing.JMenuItem();
        menuItem6 = new javax.swing.JMenuItem();
        menuItem7 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuItem10 = new javax.swing.JMenuItem();
        separator2 = new javax.swing.JPopupMenu.Separator();
        menuItem11 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        menuItem12 = new javax.swing.JMenuItem();
        menuItem13 = new javax.swing.JMenuItem();
        menu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Festejos da Cidade");
        getContentPane().add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, 480, 50));

        botao1.setText("<html><center>FESTA DE SÃO SEBASTIÃO - PADROEIRO DO MUNICÍPIO</html></center>");
        botao1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao1.setBorderPainted(false);
        botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(botao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, 50));

        botao2.setText("CARNAVAL");
        botao2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao2.setBorderPainted(false);
        botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(botao2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 200, 50));

        botao3.setText("FESTA DAS FLORES");
        botao3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao3.setBorderPainted(false);
        botao3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao3ActionPerformed(evt);
            }
        });
        getContentPane().add(botao3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 200, 50));

        botao4.setText("EXPOSIÇÃO AGROPECUÁRIA");
        botao4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao4.setBorderPainted(false);
        botao4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao4ActionPerformed(evt);
            }
        });
        getContentPane().add(botao4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 200, 50));

        botao6.setText("<html><center>FESTA DE NOSSA SENHORA DAS MERCÊS</center></html>");
        botao6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao6.setBorderPainted(false);
        botao6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao6ActionPerformed(evt);
            }
        });
        getContentPane().add(botao6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 200, 50));

        botao5.setText("ANIVERSÁRIO DO MUNICÍPIO");
        botao5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao5.setBorderPainted(false);
        botao5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao5ActionPerformed(evt);
            }
        });
        getContentPane().add(botao5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 50));

        botao7.setText("REGATA DA PRAIA DA BALEIA");
        botao7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botao7.setBorderPainted(false);
        botao7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao7ActionPerformed(evt);
            }
        });
        getContentPane().add(botao7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 200, 50));

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/BackgroundTelas.png"))); // NOI18N
        getContentPane().add(labelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

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

        barraMenu.add(menu1);

        menu2.setText("Opções");

        menuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuItem10.setText("Deixe seu Comentario");
        menuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem10ActionPerformed(evt);
            }
        });
        menu2.add(menuItem10);
        menu2.add(separator2);

        menuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menuItem11.setText("Relatar Problema");
        menuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem11ActionPerformed(evt);
            }
        });
        menu2.add(menuItem11);

        barraMenu.add(menu2);

        menu3.setText("Sobre");

        menuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        menuItem12.setText("Sobre o Software");
        menuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem12ActionPerformed(evt);
            }
        });
        menu3.add(menuItem12);

        menuItem13.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        menuItem13.setText("Desenvolvedores");
        menuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem13ActionPerformed(evt);
            }
        });
        menu3.add(menuItem13);

        barraMenu.add(menu3);

        menu4.setText("Ajuda");
        barraMenu.add(menu4);

        setJMenuBar(barraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
        this.dispose();
        Tela5a t5a = new Tela5a();
        t5a.setLocationRelativeTo(null);
        t5a.setVisible(true);
    }//GEN-LAST:event_botao1ActionPerformed

    private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
        this.dispose();
        Tela5b t5b = new Tela5b();
        t5b.setLocationRelativeTo(null);
        t5b.setVisible(true);
    }//GEN-LAST:event_botao2ActionPerformed

    private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
        this.dispose();
        Tela5c t5c = new Tela5c();
        t5c.setLocationRelativeTo(null);
        t5c.setVisible(true);
    }//GEN-LAST:event_botao3ActionPerformed

    private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
        this.dispose();
        Tela5d t5d = new Tela5d();
        t5d.setLocationRelativeTo(null);
        t5d.setVisible(true);
    }//GEN-LAST:event_botao4ActionPerformed

    private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
        this.dispose();
        Tela5e t5e = new Tela5e();
        t5e.setLocationRelativeTo(null);
        t5e.setVisible(true);
    }//GEN-LAST:event_botao5ActionPerformed

    private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
        this.dispose();
        Tela5f t5f = new Tela5f();
        t5f.setLocationRelativeTo(null);
        t5f.setVisible(true);
    }//GEN-LAST:event_botao6ActionPerformed

    private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
        this.dispose();
        Tela5g t5g = new Tela5g();
        t5g.setLocationRelativeTo(null);
        t5g.setVisible(true);
    }//GEN-LAST:event_botao7ActionPerformed

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

    private void menuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem12ActionPerformed
        this.dispose();
        Tela9c t9c = new Tela9c();
        t9c.setLocationRelativeTo(null);
        t9c.setVisible(true);
    }//GEN-LAST:event_menuItem12ActionPerformed

    private void menuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem13ActionPerformed
        this.dispose();
        Tela9d t9d = new Tela9d();
        t9d.setLocationRelativeTo(null);
        t9d.setVisible(true);
    }//GEN-LAST:event_menuItem13ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton botao1;
    private javax.swing.JButton botao2;
    private javax.swing.JButton botao3;
    private javax.swing.JButton botao4;
    private javax.swing.JButton botao5;
    private javax.swing.JButton botao6;
    private javax.swing.JButton botao7;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menu4;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem10;
    private javax.swing.JMenuItem menuItem11;
    private javax.swing.JMenuItem menuItem12;
    private javax.swing.JMenuItem menuItem13;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JMenuItem menuItem6;
    private javax.swing.JMenuItem menuItem7;
    private javax.swing.JPopupMenu.Separator separator2;
    // End of variables declaration//GEN-END:variables
}
