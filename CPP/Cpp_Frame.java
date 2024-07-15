package CPP;

import C.C_Frame;
import CodingQuestionsFrames.C_Plus_Plus_Coding_Questions_Frame;
import Concepts.CppConceptHandler;
import Concepts.ConceptGUI;
import Concepts.PointersGUI;
import Java.Java_Frame;
import JavaScript.JavaScript_Frame;
import Python.Python_Frame;
import frame.About_Frame;
import frame.Menu;
import frame.TableView;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import shortQuestionsFrames.Cpp_Short_Questions_Frame;
import terms.TermsAndConditions;

/**
 *
 * @author MuhammadHasnatRasool
 */
public class Cpp_Frame extends javax.swing.JFrame {

    /**
     * Creates new form CPP_Frame
     */
    public Cpp_Frame() {
        setResizable(false);
        setAlwaysOnTop(true);
        setLocationRelativeTo(null);
        setLocationByPlatform(true);
        setLocation(250,100);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mcqs = new javax.swing.JButton();
        output = new javax.swing.JButton();
        coding = new javax.swing.JButton();
        codingq = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        shortq = new javax.swing.JButton();
        table = new javax.swing.JButton();
        menu1 = new javax.swing.JButton();
        menu2 = new javax.swing.JButton();
        codingq1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Welcome to   C ++ Language  Learning");

        mcqs.setBackground(new java.awt.Color(255, 204, 0));
        mcqs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mcqs.setForeground(new java.awt.Color(255, 255, 255));
        mcqs.setText("Mcqs");
        mcqs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcqsActionPerformed(evt);
            }
        });

        output.setBackground(new java.awt.Color(255, 204, 0));
        output.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        output.setForeground(new java.awt.Color(255, 255, 255));
        output.setText("Output");
        output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputActionPerformed(evt);
            }
        });

        coding.setBackground(new java.awt.Color(255, 204, 0));
        coding.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        coding.setForeground(new java.awt.Color(255, 255, 255));
        coding.setText("T/F");
        coding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codingActionPerformed(evt);
            }
        });

        codingq.setBackground(new java.awt.Color(255, 204, 0));
        codingq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codingq.setForeground(new java.awt.Color(255, 255, 255));
        codingq.setText("CodeQ");
        codingq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codingqActionPerformed(evt);
            }
        });

        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));

        jButton5.setBackground(new java.awt.Color(204, 255, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton5.setText("C");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(204, 255, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton7.setText("Java");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(204, 255, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton8.setText("Python");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton9.setText("Js");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 255, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton10.setText("Pointers");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(204, 255, 204));
        jButton11.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton11.setText("Basic");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(204, 255, 204));
        jButton13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton13.setText("Chemistry");

        jButton15.setBackground(new java.awt.Color(204, 255, 204));
        jButton15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton15.setText("Physics");

        jButton16.setBackground(new java.awt.Color(204, 255, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton16.setText("Biology");

        jButton17.setBackground(new java.awt.Color(204, 255, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton17.setText("MsWord");

        jButton18.setBackground(new java.awt.Color(204, 255, 204));
        jButton18.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton18.setText("MsExcel");

        jButton19.setBackground(new java.awt.Color(204, 255, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jButton19.setText("Git");

        ImageIcon icon = new ImageIcon(getClass().getResource("/icons/cplus.jpeg"));
        Image image = icon.getImage().getScaledInstance(100,98,Image.SCALE_REPLICATE);
        ImageIcon icon2 = new ImageIcon(image);
        jLabel2.setIcon(icon2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jButton5)
                .addGap(48, 48, 48)
                .addComponent(jButton7)
                .addGap(39, 39, 39)
                .addComponent(jButton8)
                .addGap(41, 41, 41)
                .addComponent(jButton9)
                .addGap(29, 29, 29)
                .addComponent(jButton10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(28, 28, 28)
                .addComponent(jButton13)
                .addGap(28, 28, 28)
                .addComponent(jButton15)
                .addGap(34, 34, 34)
                .addComponent(jButton16)
                .addGap(37, 37, 37)
                .addComponent(jButton17)
                .addGap(42, 42, 42)
                .addComponent(jButton18)
                .addGap(38, 38, 38)
                .addComponent(jButton19)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        shortq.setBackground(new java.awt.Color(255, 204, 0));
        shortq.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        shortq.setForeground(new java.awt.Color(255, 255, 255));
        shortq.setText("ShortQ");
        shortq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortqActionPerformed(evt);
            }
        });

        table.setBackground(new java.awt.Color(255, 204, 0));
        table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        table.setForeground(new java.awt.Color(255, 255, 255));
        table.setText("TableView");
        table.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableActionPerformed(evt);
            }
        });

        menu1.setBackground(new java.awt.Color(255, 204, 0));
        menu1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu1.setForeground(new java.awt.Color(255, 255, 255));
        menu1.setText("About");
        menu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu1ActionPerformed(evt);
            }
        });

        menu2.setBackground(new java.awt.Color(255, 204, 0));
        menu2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu2.setForeground(new java.awt.Color(255, 255, 255));
        menu2.setText("Menu");
        menu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu2ActionPerformed(evt);
            }
        });

        codingq1.setBackground(new java.awt.Color(255, 204, 0));
        codingq1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        codingq1.setForeground(new java.awt.Color(255, 255, 255));
        codingq1.setText("Concepts");
        codingq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codingq1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mcqs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(menu2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(coding, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(shortq, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(output, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(codingq, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codingq1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(74, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mcqs)
                    .addComponent(output)
                    .addComponent(coding))
                .addGap(104, 104, 104)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codingq)
                    .addComponent(table)
                    .addComponent(shortq))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(menu2)
                    .addComponent(menu1)
                    .addComponent(codingq1))
                .addContainerGap(112, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 7, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 7, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 549, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mcqsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcqsActionPerformed

        new TermsAndConditions("C").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mcqsActionPerformed

    private void outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputActionPerformed

        new TermsAndConditions("C_Plus_Plus_Output").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_outputActionPerformed

    private void codingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codingActionPerformed

        new TermsAndConditions("C_Plus_Plus_TF").setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_codingActionPerformed

    private void shortqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortqActionPerformed

        Cpp_Short_Questions_Frame.main(new String[] {});
//        setVisible(false);
    }//GEN-LAST:event_shortqActionPerformed

    private void tableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableActionPerformed

        new TableView().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_tableActionPerformed

    private void menu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu1ActionPerformed
       About_Frame.getInstance().setVisible(true);
    }//GEN-LAST:event_menu1ActionPerformed

    private void codingqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codingqActionPerformed
        
//          setVisible(false);
          C_Plus_Plus_Coding_Questions_Frame.main(new String[] {});
        
    }//GEN-LAST:event_codingqActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        new C_Frame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         new Java_Frame().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void menu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu2ActionPerformed
        Menu.getInstance().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_menu2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
         setVisible(false);
        new Python_Frame().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         setVisible(false);
        new JavaScript_Frame().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        setVisible(false);
        new PointersGUI().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void codingq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codingq1ActionPerformed
        setVisible(false);
        new PointersGUI().setVisible(true);
    }//GEN-LAST:event_codingq1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
          ConceptGUI<CppConceptHandler> frame = new ConceptGUI<>("C++-Basics",new CppConceptHandler());
          frame.setVisible(true);
          this.toBack();
          frame.toFront();
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(Cpp_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cpp_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cpp_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cpp_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cpp_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coding;
    private javax.swing.JButton codingq;
    private javax.swing.JButton codingq1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mcqs;
    private javax.swing.JButton menu1;
    private javax.swing.JButton menu2;
    private javax.swing.JButton output;
    private javax.swing.JButton shortq;
    private javax.swing.JButton table;
    // End of variables declaration//GEN-END:variables
}