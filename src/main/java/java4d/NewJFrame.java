/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on 12-ago-2009, 22.36.40
 */

package java4d;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilities.rFile;



/**
 *
 * @author Pierantonio
 */
public class NewJFrame extends javax.swing.JFrame {



    /** Creates new form NewJFrame */
    public NewJFrame() {
        
        initComponents();
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addContainerGap(369, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(197, 197, 197))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(65, 65, 65)
                .addComponent(jButton1)
                .addGap(140, 140, 140))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            rFile f = new rFile("prova1.txt", "rw");
            
            for(int i=0;i<256;i++)
                f.writeByte(i);

            f.close();
            
            // TODO add your handling code here:
        }  catch (FileNotFoundException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables

}