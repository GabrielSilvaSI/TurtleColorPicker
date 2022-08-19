
package classes;

import java.awt.Color;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        //ImageIcon img = new ImageIcon(filename);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnColorPanel = new javax.swing.JPanel();
        pnInvertColor = new javax.swing.JPanel();
        lbTextBlac = new javax.swing.JLabel();
        lbTextWhite = new javax.swing.JLabel();
        lbTextInv = new javax.swing.JLabel();
        sldRed = new javax.swing.JSlider();
        sldGreen = new javax.swing.JSlider();
        sldBlue = new javax.swing.JSlider();
        pnRed = new javax.swing.JPanel();
        pnGreen = new javax.swing.JPanel();
        pnBlue = new javax.swing.JPanel();
        tfRed = new javax.swing.JTextField();
        tfGreen = new javax.swing.JTextField();
        tfBlue = new javax.swing.JTextField();
        lbPercRed = new javax.swing.JLabel();
        lbPercGreen = new javax.swing.JLabel();
        lbPercBlue = new javax.swing.JLabel();
        btEnter = new javax.swing.JButton();
        btRand = new javax.swing.JButton();
        btInvert = new javax.swing.JButton();
        lbRbg = new javax.swing.JLabel();
        tfRgb = new javax.swing.JTextField();
        lbHex = new javax.swing.JLabel();
        tfHex = new javax.swing.JTextField();
        lbInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turtle Color Picker");
        setResizable(false);

        pnColorPanel.setBackground(new java.awt.Color(255, 255, 255));

        pnInvertColor.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pnInvertColorLayout = new javax.swing.GroupLayout(pnInvertColor);
        pnInvertColor.setLayout(pnInvertColorLayout);
        pnInvertColorLayout.setHorizontalGroup(
            pnInvertColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );
        pnInvertColorLayout.setVerticalGroup(
            pnInvertColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 18, Short.MAX_VALUE)
        );

        lbTextBlac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextBlac.setText("[TEXT]");

        lbTextWhite.setForeground(new java.awt.Color(255, 255, 255));
        lbTextWhite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextWhite.setText("[TEXT]");

        lbTextInv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTextInv.setText("[TEXT]");

        javax.swing.GroupLayout pnColorPanelLayout = new javax.swing.GroupLayout(pnColorPanel);
        pnColorPanel.setLayout(pnColorPanelLayout);
        pnColorPanelLayout.setHorizontalGroup(
            pnColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnColorPanelLayout.createSequentialGroup()
                .addComponent(pnInvertColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnColorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbTextInv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lbTextWhite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTextBlac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnColorPanelLayout.setVerticalGroup(
            pnColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnColorPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTextBlac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextWhite)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextInv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pnInvertColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sldRed.setMaximum(255);
        sldRed.setValue(255);
        sldRed.setFocusable(false);
        sldRed.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldRedStateChanged(evt);
            }
        });

        sldGreen.setMaximum(255);
        sldGreen.setValue(255);
        sldGreen.setFocusable(false);
        sldGreen.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldGreenStateChanged(evt);
            }
        });

        sldBlue.setMaximum(255);
        sldBlue.setValue(255);
        sldBlue.setFocusable(false);
        sldBlue.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldBlueStateChanged(evt);
            }
        });

        pnRed.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout pnRedLayout = new javax.swing.GroupLayout(pnRed);
        pnRed.setLayout(pnRedLayout);
        pnRedLayout.setHorizontalGroup(
            pnRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnRedLayout.setVerticalGroup(
            pnRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnGreen.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout pnGreenLayout = new javax.swing.GroupLayout(pnGreen);
        pnGreen.setLayout(pnGreenLayout);
        pnGreenLayout.setHorizontalGroup(
            pnGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnGreenLayout.setVerticalGroup(
            pnGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnBlue.setBackground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout pnBlueLayout = new javax.swing.GroupLayout(pnBlue);
        pnBlue.setLayout(pnBlueLayout);
        pnBlueLayout.setHorizontalGroup(
            pnBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnBlueLayout.setVerticalGroup(
            pnBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        tfRed.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfRed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRed.setText("255");
        tfRed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRedKeyTyped(evt);
            }
        });

        tfGreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfGreen.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfGreen.setText("255");
        tfGreen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfGreenKeyTyped(evt);
            }
        });

        tfBlue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfBlue.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfBlue.setText("255");
        tfBlue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBlueKeyTyped(evt);
            }
        });

        lbPercRed.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPercRed.setText("100%");

        lbPercGreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPercGreen.setText("100%");

        lbPercBlue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPercBlue.setText("100%");

        btEnter.setText("Enter");
        btEnter.setToolTipText("Enter color values");
        btEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnterActionPerformed(evt);
            }
        });

        btRand.setText("Rand");
        btRand.setToolTipText("Random color");
        btRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRandActionPerformed(evt);
            }
        });

        btInvert.setText("Inv");
        btInvert.setToolTipText("Invert color");
        btInvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInvertActionPerformed(evt);
            }
        });

        lbRbg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRbg.setText("RGB");

        tfRgb.setEditable(false);
        tfRgb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfRgb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfRgb.setText("255,255,255");
        tfRgb.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfRgbFocusGained(evt);
            }
        });
        tfRgb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfRgbMouseClicked(evt);
            }
        });

        lbHex.setText("HEX");

        tfHex.setEditable(false);
        tfHex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfHex.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfHex.setText("FFFFFF");
        tfHex.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tfHexFocusGained(evt);
            }
        });
        tfHex.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfHexMouseClicked(evt);
            }
        });

        lbInfo.setForeground(new java.awt.Color(0, 204, 204));
        lbInfo.setText("[!]");
        lbInfo.setToolTipText("Info");
        lbInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbInfoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRed, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPercRed, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPercGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPercBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btRand, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbRbg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfRgb, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbHex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfHex, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbInfo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldRed, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPercRed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btEnter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btRand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPercGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sldGreen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sldBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPercBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btInvert, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfRgb)
                        .addComponent(lbHex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfHex)
                        .addComponent(lbRbg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbInfo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfRedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRedKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfRedKeyTyped

    private void tfGreenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfGreenKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfGreenKeyTyped

    private void tfBlueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBlueKeyTyped
        String chars="0987654321";
        if(!chars.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_tfBlueKeyTyped

    private void sldRedStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldRedStateChanged
        attComponents();
    }//GEN-LAST:event_sldRedStateChanged

    private void sldGreenStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldGreenStateChanged
        attComponents();
    }//GEN-LAST:event_sldGreenStateChanged

    private void sldBlueStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldBlueStateChanged
        attComponents();
    }//GEN-LAST:event_sldBlueStateChanged

    private void btEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnterActionPerformed
        checkTexFields();
        textFieldsEnter();
    }//GEN-LAST:event_btEnterActionPerformed

    private void btRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRandActionPerformed
        Random rand = new Random();
        sldRed.setValue(rand.nextInt(256));
        sldGreen.setValue(rand.nextInt(256));
        sldBlue.setValue(rand.nextInt(256));
    }//GEN-LAST:event_btRandActionPerformed

    private void btInvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInvertActionPerformed
        invertColor();
    }//GEN-LAST:event_btInvertActionPerformed

    private void lbInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbInfoMouseClicked
        JOptionPane.showMessageDialog(rootPane, "https://github.com/GabrielSilvaSI");
    }//GEN-LAST:event_lbInfoMouseClicked

    private void tfHexMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfHexMouseClicked
        tfHex.selectAll();
    }//GEN-LAST:event_tfHexMouseClicked

    private void tfRgbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfRgbMouseClicked
        tfRgb.selectAll();
    }//GEN-LAST:event_tfRgbMouseClicked

    private void tfRgbFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfRgbFocusGained
        tfRgb.selectAll();
    }//GEN-LAST:event_tfRgbFocusGained

    private void tfHexFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfHexFocusGained
        tfHex.selectAll();
    }//GEN-LAST:event_tfHexFocusGained

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEnter;
    private javax.swing.JButton btInvert;
    private javax.swing.JButton btRand;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbHex;
    private javax.swing.JLabel lbInfo;
    private javax.swing.JLabel lbPercBlue;
    private javax.swing.JLabel lbPercGreen;
    private javax.swing.JLabel lbPercRed;
    private javax.swing.JLabel lbRbg;
    private javax.swing.JLabel lbTextBlac;
    private javax.swing.JLabel lbTextInv;
    private javax.swing.JLabel lbTextWhite;
    private javax.swing.JPanel pnBlue;
    private javax.swing.JPanel pnColorPanel;
    private javax.swing.JPanel pnGreen;
    private javax.swing.JPanel pnInvertColor;
    private javax.swing.JPanel pnRed;
    private javax.swing.JSlider sldBlue;
    private javax.swing.JSlider sldGreen;
    private javax.swing.JSlider sldRed;
    private javax.swing.JTextField tfBlue;
    private javax.swing.JTextField tfGreen;
    private javax.swing.JTextField tfHex;
    private javax.swing.JTextField tfRed;
    private javax.swing.JTextField tfRgb;
    // End of variables declaration//GEN-END:variables

    private void attComponents() {
        pnColorPanel.setBackground(new Color(sldRed.getValue(), sldGreen.getValue(), sldBlue.getValue()));
        pnInvertColor.setBackground(new Color(255-sldRed.getValue(), 255-sldGreen.getValue(), 255-sldBlue.getValue()));
        lbTextInv.setForeground(new Color(255-sldRed.getValue(), 255-sldGreen.getValue(), 255-sldBlue.getValue()));
        pnRed.setBackground(new Color(sldRed.getValue(), 0, 0));
        pnGreen.setBackground(new Color(0, sldGreen.getValue(), 0));
        pnBlue.setBackground(new Color(0, 0, sldBlue.getValue()));
        lbPercRed.setText((sldRed.getValue()*100)/255+"%");
        lbPercGreen.setText((sldGreen.getValue()*100)/255+"%");
        lbPercBlue.setText((sldBlue.getValue()*100)/255+"%");
        tfRed.setText(sldRed.getValue()+"");
        tfGreen.setText(sldGreen.getValue()+"");
        tfBlue.setText(sldBlue.getValue()+"");
        tfRgb.setText(sldRed.getValue()+","+sldGreen.getValue()+","+sldBlue.getValue());
        hexGenerate();
    }

    private void checkTexFields() {
        if(tfRed.getText().equals(""))
            tfRed.setText("0");
        if(tfGreen.getText().equals(""))
            tfGreen.setText("0");
        if(tfBlue.getText().equals(""))
            tfBlue.setText("0");
        if(Integer.parseInt(tfRed.getText())>255)
            tfRed.setText("255");
        if(Integer.parseInt(tfGreen.getText())>255)
            tfGreen.setText("255");
        if(Integer.parseInt(tfBlue.getText())>255)
            tfBlue.setText("255");
        
    }

    private void textFieldsEnter() {
        int red = Integer.parseInt(tfRed.getText());
        int green = Integer.parseInt(tfGreen.getText());
        int blue = Integer.parseInt(tfBlue.getText());
        sldRed.setValue(red);
        sldGreen.setValue(green);
        sldBlue.setValue(blue);
    }

    private void invertColor() {
        sldRed.setValue(255-sldRed.getValue());
        sldGreen.setValue(255-sldGreen.getValue());
        sldBlue.setValue(255-sldBlue.getValue());
    }

    private void hexGenerate() {
        String hex = "";
        if(sldRed.getValue()<16)
            hex += "0";
        hex += Integer.toHexString(sldRed.getValue()).toUpperCase();
        if(sldGreen.getValue()<16)
            hex += "0";
        hex += Integer.toHexString(sldGreen.getValue()).toUpperCase();
        if(sldBlue.getValue()<16)
            hex += "0";
        hex += Integer.toHexString(sldBlue.getValue()).toUpperCase();
        tfHex.setText(hex);
    }
}
