/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author CROMA
 */
public class project extends javax.swing.JFrame {
    double first,second=0,result=0;
    char opr;
    public project() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        add = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        sub = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        mtp = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        div = new javax.swing.JButton();
        equal = new javax.swing.JButton();
        bt00 = new javax.swing.JButton();
        per = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        tf.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("CALCULATOR");

        bt1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        add.setText("+");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        sub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sub.setText("-");
        sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        mtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        mtp.setText("*");
        mtp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mtpActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        bt0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        dot.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        dot.setText(".");
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        div.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        equal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        equal.setText("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        bt00.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt00.setText("00");
        bt00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt00ActionPerformed(evt);
            }
        });

        per.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        per.setText("%");
        per.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back.setText("<");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt00, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mtp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(equal)
                                .addGap(18, 18, 18)
                                .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mtp, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt00, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(per, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mtpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mtpActionPerformed
        // TODO add your handling code here:
        String s=tf.getText();
        first=Double.parseDouble(s);
        opr='*';
        tf.setText("");
    }//GEN-LAST:event_mtpActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:    
       
       String s =tf.getText()+bt1.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
       
         String s =tf.getText()+bt2.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt3.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt4.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt5.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt6.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt7.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt8.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt9.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt0.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt0ActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        tf.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        // TODO add your handling code here:
        if (!tf.getText().contains("."))
        {
        tf.setText(tf.getText()+".");
        }
    }//GEN-LAST:event_dotActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String s=tf.getText();
        first=Double.parseDouble(s);
        opr='+';
        tf.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subActionPerformed
        // TODO add your handling code here:
        String s=tf.getText();
        first=Double.parseDouble(s);
        opr='-';
         tf.setText("");
    }//GEN-LAST:event_subActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        // TODO add your handling code here:
        String s=tf.getText();
        first=Double.parseDouble(s);
        opr='/';
         tf.setText("");
    }//GEN-LAST:event_divActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        // TODO add your handling code here:
        String s =tf.getText();
        second=Double.parseDouble(s);
        if(opr =='+')
        {
             result =first+second;
            tf.setText(String.valueOf(result));
            
        }
         if(opr =='-')
        {
             result =first-second;
            tf.setText(String.valueOf(result));
            
        } 
         if(opr =='*')
        {
             result =first*second;
            tf.setText(String.valueOf(result));
            
        }
         if(opr =='/')
        {
             result =first/second;
            tf.setText(String.valueOf(result));
            
        }
          if(opr =='%')
        {
             result =(first/second)*100;
            tf.setText(String.valueOf(result));
            
            
        }
             
        
            
    }//GEN-LAST:event_equalActionPerformed

    private void bt00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt00ActionPerformed
        // TODO add your handling code here:
         String s =tf.getText()+bt00.getText();
        tf.setText(s);
        
    }//GEN-LAST:event_bt00ActionPerformed

    private void perActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perActionPerformed
        // TODO add your handling code here:
        first =Double.parseDouble(tf.getText());
        tf.setText("");
        opr = '%';
    }//GEN-LAST:event_perActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
       String backspace=null;
        
        if(tf.getText().length()>0){
        StringBuilder strB = new StringBuilder(tf.getText());
        strB.deleteCharAt(tf.getText().length() - 1);
        backspace = strB.toString();
        tf.setText(backspace);
        
        }
    }//GEN-LAST:event_backActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tfActionPerformed
   

    /**
     * @param args
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
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new project().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt00;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton clear;
    private javax.swing.JButton div;
    private javax.swing.JButton dot;
    private javax.swing.JButton equal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mtp;
    private javax.swing.JButton per;
    private javax.swing.JButton sub;
    private javax.swing.JTextField tf;
    // End of variables declaration//GEN-END:variables
}
