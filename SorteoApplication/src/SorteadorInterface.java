
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sf
 */
public class SorteadorInterface extends javax.swing.JFrame {

    /**
     * Creates new form SorteadorInterface
     */
    public SorteadorInterface() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        AparecerResultado = new javax.swing.JLabel();
        BotaoSortear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(24, 27, 35));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("SorteioJava");
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, -1));

        AparecerResultado.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        AparecerResultado.setForeground(new java.awt.Color(255, 255, 255));
        AparecerResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(AparecerResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 230, 50));

        BotaoSortear.setBackground(new java.awt.Color(51, 102, 255));
        BotaoSortear.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BotaoSortear.setText("Sortear");
        BotaoSortear.setBorder(null);
        BotaoSortear.setBorderPainted(false);
        BotaoSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSortearActionPerformed(evt);
            }
        });
        getContentPane().add(BotaoSortear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/Components (3).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSortearActionPerformed
        Random random = new Random();
        int numeroSorteado = random.nextInt(20); // Gera um número aleatório entre 0 e 100

        AparecerResultado.setText(String.valueOf(numeroSorteado));
    }//GEN-LAST:event_BotaoSortearActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SorteadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SorteadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SorteadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SorteadorInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SorteadorInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AparecerResultado;
    private javax.swing.JButton BotaoSortear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}