package view;

import javax.swing.JOptionPane;

public class Tela2 extends javax.swing.JFrame {

    public Tela2() {
        
        initComponents();
      
    }   
    public void contarTempo(){
     int cont = 1;
      JOptionPane.showMessageDialog(null, "Tecle enter para prosseguir");
        try{
            
            while(cont<=3){
               
                Thread.sleep(1000);
                cont++;
            }
            this.dispose();
            Tela3 t3 = new Tela3();
            t3.setLocationRelativeTo(null);
            t3.setVisible(true);
        }catch(Exception erro){}
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel2 = new javax.swing.JPanel();
        labelTitle = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        painel2.setBackground(new java.awt.Color(255, 255, 255));
        painel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitle.setText("Bem Vindo ao Guia Turístico!!!");
        painel2.add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 520, 90));

        labelImagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/T2(1).png"))); // NOI18N
        painel2.add(labelImagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 89, 520, 431));

        getContentPane().add(painel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        labelTitle.setText("<html>"+Tela1.resposta+" Seja Bem Vindo ao Guia Turístico!!!</br></html>");
        contarTempo();
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JPanel painel2;
    // End of variables declaration//GEN-END:variables
}
