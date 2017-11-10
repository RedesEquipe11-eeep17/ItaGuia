package view;

public class Tela7 extends javax.swing.JFrame {

    public Tela7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("História de Itapipoca");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("<html>Suas origens remontam aos primórdios do Século XVII, quando requereram e obtiveram por Sesmaria terras situadas na região, os portugueses Francisco Pinheiro do Lago e sua mulher D. Josefa Ferreira de Oliveira, Tomé de Oliveira Chaves e sua mulher, tendo como localização possessória os sítios Santo Amaro e São José, destacando Jerônimo de Freitas Guimarães e sua mulher D. Francisca Pinheiro do Lago.\n\nDesses e outros, vinculados ao mesmo agregamento, nasceu a Vila, mantendo a mesma denominação e a ter como instrumento de criação a Resolução Imperial de 3 de fevereiro de 1823, referendado pelo Alvará de 17 de outubro do mesmo ano. Quando da transferência da Vila, para a localização atual, com o nome de Imperatriz, atribuído conforme Lei Provincial nº 1.011, de 3 de novembro de 1862, o antigo reduto passou a chamar-se Vila Velha. A mudança de nome, para a denominação atual. Ocorreu segundo Dec. Nº 1, de 2 de dezembro de 1889. Sua elevação à categoria de Cidade, ocorreu, em virtude de Lei nº 1.288, de 31 de agosto de 1915.\n\nEm suas manifestações de apoio eclesial consta inicialmente do desdobramento do Curato do Acaraú em quatro Freguesias, conforme Provisão referenciada no ano de 1757 e assinada por D. Francisco Xavier Aranha, do Bispado de Pernambuco. Uma dessas Freguesias teve por sede o reduto de São Bento de Amontada sob cuja jurisdição ficou subordinado o reduto de São José da Uruburetama.\n\nEm 1778, segundo praxe adotada na formação de patrimônios eclesiásticos, Jerônimo Guimarães doou, em favor da recém-desmembrada Freguesia, meia légua de terras, situando-se nesse local o espaço físico onde deveria ser construída a Igreja-Matriz. A transferência de sede da Freguesia, para a Vila de Imperatriz, deu-se segundo Lei nº 364, de 29 de julho de 1846, sendo seu primeiro vigário o padre Luiz Antônio da Rocha Lima, funcionando provisoriamente na capela de Nossa senhora das Mercês.\n\nA Igreja-Matriz, dedicada ao padroado de Nossa Senhora das Mercês, teve como início de obras o ano de 1881 e como responsável Monsenhor Antero José de Lima. Dada a sua evolução eclesiástica, concedeu-se à Paróquia o título de Bispado, não havendo, pelo menos ao nosso alcance, registros que identifiquem a data-início dessa evolução.\nEvolução política\nQuando da transferência da Vila, para a localização atual, com o nome de Imperatriz, atribuído conforme Lei Provincial nº 1.011, de 3 de novembro de 1862, o antigo reduto passou a chamar-se Vila Velha. A mudança de nome, para a denominação atual. Ocorreu segundo Dec. Nº 1, de 2 de dezembro de 1889. Sua elevação à categoria de Cidade, ocorreu, em virtude de Lei nº 1.288, de 31 de agosto de 1915.</html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
