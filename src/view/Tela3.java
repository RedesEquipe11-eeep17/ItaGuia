package view;

public class Tela3 extends javax.swing.JFrame {

    public Tela3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();
        labelText = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        menuItem2 = new javax.swing.JMenuItem();
        menuItem3 = new javax.swing.JMenuItem();
        menuItem4 = new javax.swing.JMenuItem();
        menuItem5 = new javax.swing.JMenuItem();
        menuItem6 = new javax.swing.JMenuItem();
        menuItem7 = new javax.swing.JMenuItem();
        menuItem8 = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuItem9 = new javax.swing.JMenuItem();
        menuItem10 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelTitle.setForeground(new java.awt.Color(255, 255, 255));
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("ITAPIPOCA - CIDADE DOS TRÊS CLIMAS");
        jPanel1.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 950, 50));

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/centro_da_cidade.jpg"))); // NOI18N
        jPanel1.add(labelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 420, 190));

        labelText.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        labelText.setForeground(new java.awt.Color(255, 255, 255));
        labelText.setText("<html>A possibilidade de escolha aqui prevalece. A cidade de Itapipoca \njunto com a região rural oferece um complexo natural que \nproporciona aventura, lazer, conhecimento e entretenimento. \nO melhor é que o cenário do passeio muda de acordo com a \nvontade do visitante, pois nossa região possui três agradáveis \nclimas que favorecem diversos gostos. Logo na sede já é possível \nvisualizar diversas serras que resplandecem e refletem um \nverde-escuro aos olhos de quem as observa.Indo ao encontro das \nmesmas, encontramos atrativos naturais, aptos para quem gosta \nde um ambiente mais calmo e fresco. Lá podemos encontrar \ndiversas bicas, que banham com suas águas limpas e geladas que \nvêm lá do topo da serra. Vizinho a essas bicas temos pequenos \nrestaurantes que servem a culinária local e principalmente a \npossibilidade de degustação de frutos, que é o forte da região. \nSem falar das trilhas ecológicas que lá existem, \nque por sua vez leva quem as fazem até gigantes pedreiras que \nde lá se faz possível uma visualização abrangente da região e a \nobservação de vários inselbergs. Mudando o sentido, vamos ao \nencontro do sertão, onde se faz muito calor durante o dia e \nbastante frio durante a noite. Porém esse calor diurno pode ser \nrefrescado com um delicioso banho em um de nossos agradáveis \naçudes. Se concentra nessa parte do município a criação bovina, \nonde se faz possível se provar o famoso queijo coalho \nou a paçoca de carne. Em pequenos restaurantes sertanejos \npodemos encontrar a apreciada galinha caipira, ou o capote cozido. \nVale ressaltar que a região citada concentra sítios arqueológicos e \npaleontológicos, onde são encontrados fósseis e resquícios de \nanimais primitivos. Outro forte é a existência de uma tribo indígena \n(tribo Tremembé) no meio do sertão bravo, onde essa existência só \naumenta e fortifica a cultura indígena no município. \nSeguindo a rota chegamos ao litoral, no qual se destaca a praia da \nbaleia, em que pode-se encontrar todas  as iguarias e atrativos que \numa praia cearense oferece. Então quem busca aventura, diversão, \nconhecimento e cultura, precisa conhecer Itapipoca.</html>");
        jPanel1.add(labelText, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 510, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));

        barraMenu.setBackground(new java.awt.Color(255, 255, 255));

        menu1.setBackground(new java.awt.Color(255, 255, 255));
        menu1.setText("Navegar");

        menuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuItem1.setText("Ir para Apresentação");
        menuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        menu1.add(menuItem1);

        menuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuItem2.setText("Ir para Início");
        menuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        menu1.add(menuItem2);

        menuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuItem3.setText("Ir para Pontos Turísticos");
        menuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        menu1.add(menuItem3);

        menuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuItem4.setText("Ir para Festejos da Cidade");
        menu1.add(menuItem4);

        menuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        menuItem5.setText("Ir para Fotos da Cidade");
        menu1.add(menuItem5);

        menuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        menuItem6.setText("Ir para Historia");
        menu1.add(menuItem6);

        menuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, 0));
        menuItem7.setText("Ir para Mapa de Itapipoca");
        menu1.add(menuItem7);

        menuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        menuItem8.setText("Ir para Dicionario");
        menu1.add(menuItem8);
        menu1.add(separador1);

        menuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        menuItem9.setText("Avançar");
        menu1.add(menuItem9);

        menuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        menuItem10.setText("Retornar");
        menu1.add(menuItem10);

        barraMenu.add(menu1);

        menu2.setText("Ajuda");
        barraMenu.add(menu2);

        menu3.setText("Sobre");
        barraMenu.add(menu3);

        setJMenuBar(barraMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem1ActionPerformed
        this.dispose();
        Tela2 t2 = new Tela2();
        t2.setLocationRelativeTo(null);
        t2.setVisible(true);
    }//GEN-LAST:event_menuItem1ActionPerformed

    private void menuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem2ActionPerformed
        this.dispose();
        Tela3 t3 = new Tela3();
        t3.setLocationRelativeTo(null);
        t3.setVisible(true);
    }//GEN-LAST:event_menuItem2ActionPerformed

    private void menuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItem3ActionPerformed
        this.dispose();
        Tela4 t4 = new Tela4();
        t4.setLocationRelativeTo(null);
        t4.setVisible(true);
    }//GEN-LAST:event_menuItem3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelText;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItem10;
    private javax.swing.JMenuItem menuItem2;
    private javax.swing.JMenuItem menuItem3;
    private javax.swing.JMenuItem menuItem4;
    private javax.swing.JMenuItem menuItem5;
    private javax.swing.JMenuItem menuItem6;
    private javax.swing.JMenuItem menuItem7;
    private javax.swing.JMenuItem menuItem8;
    private javax.swing.JMenuItem menuItem9;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
