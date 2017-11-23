package view;

public class Tela7 extends javax.swing.JFrame {

    public Tela7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        labelImagem = new javax.swing.JLabel();
        labelTitle = new javax.swing.JLabel();
        labelTexto = new javax.swing.JLabel();
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

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T7(1).jpg"))); // NOI18N
        labelImagem.setText("jLabel4");

        labelTitle.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("História de Itapipoca");

        labelTexto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelTexto.setForeground(new java.awt.Color(255, 255, 255));
        labelTexto.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        labelTexto.setText("<html><p align=\"justify\">Suas origens remontam aos primórdios do Século XVII, quando requereram e obtiveram por Sesmaria terras situadas na região, os portugueses Francisco Pinheiro do Lago e sua mulher D. Josefa Ferreira de Oliveira, Tomé de Oliveira Chaves e sua mulher, tendo como localização possessória os sítios Santo Amaro e São José, destacando Jerônimo de Freitas Guimarães e sua mulher D. Francisca Pinheiro do Lago.  Desses e outros, vinculados ao mesmo agregamento, nasceu a Vila, mantendo a mesma denominação e a ter como instrumento de criação a Resolução Imperial de 3 de fevereiro de 1823, referendado pelo Alvará de 17 de outubro do mesmo ano. Quando da transferência da Vila, para a localização atual, com o nome de Imperatriz, atribuído conforme Lei Provincial nº 1.011, de 3 de novembro de 1862, o antigo reduto passou a chamar-se Vila Velha. A mudança de nome, para a denominação atual. Ocorreu segundo Dec. Nº 1, de 2 de dezembro de 1889. Sua elevação à categoria de Cidade, ocorreu, em virtude de Lei nº 1.288, de 31 de agosto de 1915.  Em suas manifestações de apoio eclesial consta inicialmente do desdobramento do Curato do Acaraú em quatro Freguesias, conforme Provisão referenciada no ano de 1757 e assinada por D. Francisco Xavier Aranha, do Bispado de Pernambuco. Uma dessas Freguesias teve por sede o reduto de São Bento de Amontada sob cuja jurisdição ficou subordinado o reduto de São José da Uruburetama.  Em 1778, segundo praxe adotada na formação de patrimônios eclesiásticos, Jerônimo Guimarães doou, em favor da recém-desmembrada Freguesia, meia légua de terras, situando-se nesse local o espaço físico onde deveria ser construída a Igreja-Matriz. A transferência de sede da Freguesia, para a Vila de Imperatriz, deu-se segundo Lei nº 364, de 29 de julho de 1846, sendo seu primeiro vigário o padre Luiz Antônio da Rocha Lima, funcionando provisoriamente na capela de Nossa senhora das Mercês.  A Igreja-Matriz, dedicada ao padroado de Nossa Senhora das Mercês, teve como início de obras o ano de 1881 e como responsável Monsenhor Antero José de Lima. Dada a sua evolução eclesiástica, concedeu-se à Paróquia o título de Bispado, não havendo, pelo menos ao nosso alcance, registros que identifiquem a data-início dessa evolução. Evolução política Quando da transferência da Vila, para a localização atual, com o nome de Imperatriz, atribuído conforme Lei Provincial nº 1.011, de 3 de novembro de 1862, o antigo reduto passou a chamar-se Vila Velha. A mudança de nome, para a denominação atual. Ocorreu segundo Dec. Nº 1, de 2 de dezembro de 1889. Sua elevação à categoria de Cidade, ocorreu, em virtude de Lei nº 1.288, de 31 de agosto de 1915.</p></html>");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 1006, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela7().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelTexto;
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
    // End of variables declaration//GEN-END:variables
}
