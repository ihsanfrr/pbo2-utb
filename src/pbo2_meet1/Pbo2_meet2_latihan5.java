/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo2_meet1;

/**
 *
 * @author ihsanfrr
 */
public class Pbo2_meet2_latihan5 extends javax.swing.JFrame {

    /**
     * Creates new form Pbo2_meet2_latihan5
     */
    public Pbo2_meet2_latihan5() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        gender1 = new javax.swing.JRadioButton();
        gender2 = new javax.swing.JRadioButton();
        religion1 = new javax.swing.JRadioButton();
        religion2 = new javax.swing.JRadioButton();
        religion3 = new javax.swing.JRadioButton();
        religion4 = new javax.swing.JRadioButton();
        religion5 = new javax.swing.JRadioButton();
        hobby1 = new javax.swing.JCheckBox();
        hobby2 = new javax.swing.JCheckBox();
        hobby3 = new javax.swing.JCheckBox();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Name");

        jLabel2.setText("Gender");

        jLabel3.setText("Religion");

        jLabel4.setText("Hobbies");

        gender1.setText("Male");
        gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender1ActionPerformed(evt);
            }
        });

        gender2.setText("Female");
        gender2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gender2ActionPerformed(evt);
            }
        });

        religion1.setText("Islam");
        religion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion1ActionPerformed(evt);
            }
        });

        religion2.setText("Kristen");
        religion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion2ActionPerformed(evt);
            }
        });

        religion3.setText("Hindu");
        religion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion3ActionPerformed(evt);
            }
        });

        religion4.setText("Budha");
        religion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion4ActionPerformed(evt);
            }
        });

        religion5.setText("Konghuchu");
        religion5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                religion5ActionPerformed(evt);
            }
        });

        hobby1.setText("Reading");

        hobby2.setText("Watching Film");

        hobby3.setText("Playing Games");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        textAreaField.setColumns(20);
        textAreaField.setRows(5);
        jScrollPane1.setViewportView(textAreaField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnProcess)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(hobby1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hobby2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hobby3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(religion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religion3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religion4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(religion5))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(gender1)
                        .addGap(18, 18, 18)
                        .addComponent(gender2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(nameField))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gender1)
                    .addComponent(gender2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(religion1)
                    .addComponent(religion2)
                    .addComponent(religion3)
                    .addComponent(religion4)
                    .addComponent(religion5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hobby1)
                    .addComponent(hobby2)
                    .addComponent(hobby3))
                .addGap(18, 18, 18)
                .addComponent(btnProcess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender1ActionPerformed
        gender2.setSelected(false);
    }//GEN-LAST:event_gender1ActionPerformed

    private void gender2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gender2ActionPerformed
        gender1.setSelected(false);
    }//GEN-LAST:event_gender2ActionPerformed

    private void religion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion1ActionPerformed
        religion2.setSelected(false);
        religion3.setSelected(false);
        religion4.setSelected(false);
        religion5.setSelected(false);
    }//GEN-LAST:event_religion1ActionPerformed

    private void religion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion2ActionPerformed
        religion1.setSelected(false);
        religion3.setSelected(false);
        religion4.setSelected(false);
        religion5.setSelected(false);
    }//GEN-LAST:event_religion2ActionPerformed

    private void religion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion3ActionPerformed
        religion1.setSelected(false);
        religion2.setSelected(false);
        religion4.setSelected(false);
        religion5.setSelected(false);
    }//GEN-LAST:event_religion3ActionPerformed

    private void religion4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion4ActionPerformed
        religion1.setSelected(false);
        religion2.setSelected(false);
        religion3.setSelected(false);
        religion5.setSelected(false);
    }//GEN-LAST:event_religion4ActionPerformed

    private void religion5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_religion5ActionPerformed
        religion1.setSelected(false);
        religion2.setSelected(false);
        religion3.setSelected(false);
        religion4.setSelected(false);
    }//GEN-LAST:event_religion5ActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        textAreaField.setText("");
        
//        Name
        String name = nameField.getText();
        textAreaField.append("Name :" + name + "\n");
        
//        Gender
        String gender;
        if(gender1.isSelected()) {
            gender = gender1.getText();
        } else if(gender2.isSelected()) {
            gender = gender2.getText();
        } else {
            gender = "No selection";
        }
        textAreaField.append("Gender :" + gender + "\n");
        
//        Religion
        String religion;
        if(religion1.isSelected()) {
            religion = religion1.getText();
        } else if(religion2.isSelected()) {
            religion = religion2.getText();
        } else if(religion3.isSelected()) {
            religion = religion3.getText();
        } else if(religion4.isSelected()) {
            religion = religion4.getText();
        } else if(religion5.isSelected()) {
            religion = religion5.getText();
        } else {
            religion = "No selection";
        }
        textAreaField.append("Gender :" + religion + "\n");
        
//        Hobbies
        StringBuilder hobbies = new StringBuilder();
        
        if (hobby1.isSelected()) hobbies.append(hobby1.getText()).append(", ");
        if (hobby2.isSelected()) hobbies.append(hobby2.getText()).append(", ");
        if (hobby3.isSelected()) hobbies.append(hobby3.getText()).append(", ");

        String[] hobbiesArray = hobbies.toString().split(", ");
        int length;
        if (hobbies.isEmpty()) {
          length = 0;
        } else {
          length = hobbiesArray.length;
        }
        
        String result = switch (length) {
            case 0 -> "You don't choose a hobby";
            case 1 -> "Hobby : " + hobbies + ".";
            default -> "Hobbies : " + hobbies.substring(0, hobbies.length() - 2) + ".";
        };
        textAreaField.append(result + "\n");
    }//GEN-LAST:event_btnProcessActionPerformed

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
            java.util.logging.Logger.getLogger(Pbo2_meet2_latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pbo2_meet2_latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pbo2_meet2_latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pbo2_meet2_latihan5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pbo2_meet2_latihan5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton gender1;
    private javax.swing.JRadioButton gender2;
    private javax.swing.JCheckBox hobby1;
    private javax.swing.JCheckBox hobby2;
    private javax.swing.JCheckBox hobby3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JRadioButton religion1;
    private javax.swing.JRadioButton religion2;
    private javax.swing.JRadioButton religion3;
    private javax.swing.JRadioButton religion4;
    private javax.swing.JRadioButton religion5;
    private javax.swing.JTextArea textAreaField;
    // End of variables declaration//GEN-END:variables
}