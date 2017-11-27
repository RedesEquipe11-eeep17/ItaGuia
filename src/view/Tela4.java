package view;

public class Tela4 extends javax.swing.JFrame {

    public Tela4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelImagem1 = new javax.swing.JLabel();
        labelImagem2 = new javax.swing.JLabel();
        labelImagem3 = new javax.swing.JLabel();
        labelImagem4 = new javax.swing.JLabel();
        labelImagem5 = new javax.swing.JLabel();
        labelImagem6 = new javax.swing.JLabel();
        labelImagem7 = new javax.swing.JLabel();
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
        menuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        painel.setBackground(new java.awt.Color(153, 153, 153));

        labelTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Pontos Turísticos");

        labelImagem1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4a(1).jpg"))); // NOI18N
        labelImagem1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Igreja do Arapari", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem1MouseClicked(evt);
            }
        });

        labelImagem2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4b(1).jpg"))); // NOI18N
        labelImagem2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cruzeiro da Balança", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem2MouseClicked(evt);
            }
        });

        labelImagem3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4c(1).jpg"))); // NOI18N
        labelImagem3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Igreja da Matriz", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem3MouseClicked(evt);
            }
        });

        labelImagem4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4d(1).jpg"))); // NOI18N
        labelImagem4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serra da Canoa", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem4MouseClicked(evt);
            }
        });

        labelImagem5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4f(1).jpg"))); // NOI18N
        labelImagem5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Praia da Baleia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem5MouseClicked(evt);
            }
        });

        labelImagem6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4g(1).jpg"))); // NOI18N
        labelImagem6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Praça três Climas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem6MouseClicked(evt);
            }
        });

        labelImagem7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T4e(1).jpg"))); // NOI18N
        labelImagem7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horto do Santo Cruzeiro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        labelImagem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagem7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImagem2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagem5, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImagem6, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagem3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(labelImagem7, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(painelLayout.createSequentialGroup()
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(labelImagem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelImagem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(labelImagem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelImagem4, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagem6, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelImagem5, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelImagem7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        menuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        menuItem10.setText("Deixe seu Comentario");
        menuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem10ActionPerformed(evt);
            }
        });
        menu2.add(menuItem10);
        menu2.add(separator2);

        menuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        menuItem11.setText("Relatar Problema");
        menuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem11ActionPerformed(evt);
            }
        });
        menu2.add(menuItem11);

        barraMenu.add(menu2);

        menu3.setText("Sobre");

        menuItem12.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        menuItem12.setText("Sobre o Software");
        menuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem12ActionPerformed(evt);
            }
        });
        menu3.add(menuItem12);

        barraMenu.add(menu3);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void labelImagem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem1MouseClicked
        this.dispose();
        Tela4a t4a = new Tela4a();
        t4a.setLocationRelativeTo(null);
        t4a.setVisible(true);
    }//GEN-LAST:event_labelImagem1MouseClicked

    private void labelImagem2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem2MouseClicked
        this.dispose();
        Tela4b t4b = new Tela4b();
        t4b.setLocationRelativeTo(null);
        t4b.setVisible(true);
    }//GEN-LAST:event_labelImagem2MouseClicked

    private void labelImagem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem3MouseClicked
        this.dispose();
        Tela4c t4c = new Tela4c();
        t4c.setLocationRelativeTo(null);
        t4c.setVisible(true);
    }//GEN-LAST:event_labelImagem3MouseClicked

    private void labelImagem4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem4MouseClicked
        this.dispose();
        Tela4d t4d = new Tela4d();
        t4d.setLocationRelativeTo(null);
        t4d.setVisible(true);
    }//GEN-LAST:event_labelImagem4MouseClicked

    private void labelImagem5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem5MouseClicked
        this.dispose();
        Tela4f t4f = new Tela4f();
        t4f.setLocationRelativeTo(null);
        t4f.setVisible(true);
    }//GEN-LAST:event_labelImagem5MouseClicked

    private void labelImagem6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem6MouseClicked
        this.dispose();
        Tela4g t4g = new Tela4g();
        t4g.setLocationRelativeTo(null);
        t4g.setVisible(true);
    }//GEN-LAST:event_labelImagem6MouseClicked

    private void labelImagem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagem7MouseClicked
        this.dispose();
        Tela4e t4e = new Tela4e();
        t4e.setLocationRelativeTo(null);
        t4e.setVisible(true);
    }//GEN-LAST:event_labelImagem7MouseClicked

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

    private void menuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem12ActionPerformed
        this.dispose();
        Tela9c t9c = new Tela9c();
        t9c.setLocationRelativeTo(null);
        t9c.setVisible(true);
    }//GEN-LAST:event_menuItem12ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel labelImagem1;
    private javax.swing.JLabel labelImagem2;
    private javax.swing.JLabel labelImagem3;
    private javax.swing.JLabel labelImagem4;
    private javax.swing.JLabel labelImagem5;
    private javax.swing.JLabel labelImagem6;
    private javax.swing.JLabel labelImagem7;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem10;
    private javax.swing.JMenuItem menuItem11;
    private javax.swing.JMenuItem menuItem12;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JMenuItem menuItem6;
    private javax.swing.JMenuItem menuItem7;
    private javax.swing.JMenuItem menuItem8;
    private javax.swing.JMenuItem menuItem9;
    private javax.swing.JPanel painel;
    private javax.swing.JPopupMenu.Separator separador1;
    private javax.swing.JPopupMenu.Separator separator2;
    // End of variables declaration//GEN-END:variables
}
