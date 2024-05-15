package com.mycompany.burak_erdogan_proje;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author thebu
 */
public class Oyun_Ekrani extends javax.swing.JFrame {

    JLabel[][] label_listesi;
    JPanel[][] panel_listesi;
    JLabel[][] label_listesi2;
    JPanel[][] panel_listesi2;
    Torba t = new Torba();
    int satir1 = 0;
    int satir2 = 0;
    int satir3 = 0;
    int satir2_1 = 0;
    int satir2_2 = 0;
    int satir2_3 = 0;
    int cinko1 = 0;
    int cinko2 = 0;
    int[][] kart1;
    int[][] kart2;
    Node linkedlistim;
    Node linkedlistim2;

    public Oyun_Ekrani() {
        label_listesi = new JLabel[3][9];
        panel_listesi = new JPanel[3][9];
        label_listesi2 = new JLabel[3][9];
        panel_listesi2 = new JPanel[3][9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                JLabel label = new JLabel();
                label.setSize(200, 200);
                label_listesi[i][j] = label;
                JPanel panel = new JPanel();
                panel.setSize(300, 300);
                panel.setBackground(Color.lightGray);
                panel_listesi[i][j] = panel;
                panel_listesi[i][j].setBorder(LineBorder.createBlackLineBorder());
                panel_listesi[i][j].setPreferredSize(new Dimension(100, 100));
                panel_listesi[i][j].add(label_listesi[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                JLabel label = new JLabel();
                label.setSize(200, 200);
                label_listesi2[i][j] = label;
                JPanel panel = new JPanel();
                panel.setSize(300, 300);
                panel.setBackground(Color.lightGray);
                panel_listesi2[i][j] = panel;
                panel_listesi2[i][j].setBorder(LineBorder.createBlackLineBorder());
                panel_listesi2[i][j].setPreferredSize(new Dimension(100, 100));
                panel_listesi2[i][j].add(label_listesi2[i][j]);
            }
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_oyun_genel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tas_cek = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tas_degeri = new javax.swing.JLabel();
        pnl_kart1 = new javax.swing.JPanel();
        btn_oyuna_basla = new javax.swing.JButton();
        pnl_kart2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnl_oyun_genel.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("TOMBALA TORBASI");

        btn_tas_cek.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_tas_cek.setText("TAŞ ÇEK");
        btn_tas_cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tas_cekActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("ÇEKİLEN SAYI :");

        tas_degeri.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        tas_degeri.setText(" ");

        pnl_kart1.setBackground(new java.awt.Color(204, 204, 204));
        pnl_kart1.setLayout(new javax.swing.BoxLayout(pnl_kart1, javax.swing.BoxLayout.LINE_AXIS));

        btn_oyuna_basla.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btn_oyuna_basla.setText("OYUNA BAŞLA");
        btn_oyuna_basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oyuna_baslaActionPerformed(evt);
            }
        });

        pnl_kart2.setBackground(new java.awt.Color(204, 204, 204));
        pnl_kart2.setLayout(new javax.swing.BoxLayout(pnl_kart2, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout pnl_oyun_genelLayout = new javax.swing.GroupLayout(pnl_oyun_genel);
        pnl_oyun_genel.setLayout(pnl_oyun_genelLayout);
        pnl_oyun_genelLayout.setHorizontalGroup(
            pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                        .addComponent(btn_oyuna_basla, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tas_degeri, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn_tas_cek, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                        .addComponent(pnl_kart1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(pnl_kart2, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        pnl_oyun_genelLayout.setVerticalGroup(
            pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                .addGroup(pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(tas_degeri))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_tas_cek))
                    .addGroup(pnl_oyun_genelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btn_oyuna_basla)))
                .addGap(82, 82, 82)
                .addGroup(pnl_oyun_genelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnl_kart1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnl_kart2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_oyun_genel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_oyun_genel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tas_cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tas_cekActionPerformed
        // TODO add your handling code here:
        if (t.torba == null) {
            JOptionPane.showMessageDialog(rootPane, "Lütfen Bir Kart Çekmeden Önce Oyunu Başlatınız!!", "Dikkat!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            if (cinko1 == 3 || cinko2 == 3) {
                JOptionPane.showMessageDialog(rootPane, "Oyun Bitti Lutfen Yeni Oyun Başlatınız", "Dikkat", JOptionPane.INFORMATION_MESSAGE);
            } else {

                int k = t.torbadan_elemancekcek(t.torba);
                Integer a = k;
                if (a != -2) {
                    tas_degeri.setText(a.toString());
                    Liste_islemleri l = new Liste_islemleri();
                    int b = Integer.valueOf(tas_degeri.getText());

                    Node temp = linkedlistim;
                    Node temp2 = linkedlistim2;

                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 9; j++) {
                            if (!label_listesi[i][j].getText().equals("")) {
                                if (label_listesi[i][j].getText().equals(tas_degeri.getText())) {

                                    panel_listesi[i][j].setBackground(Color.white);
                                    int c = l.satirikontrol(temp, b);
                                    if (c == 0) {
                                        satir1++;
                                        if (satir1 == 5 && cinko1 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir1 == 5 && cinko1 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir1 == 5 && cinko1 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        }
                                    } else if (c == 1) {
                                        satir2++;
                                        if (satir2 == 5 && cinko1 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir2 == 5 && cinko1 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir2 == 5 && cinko1 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        }
                                    } else if (c == 2) {
                                        satir3++;
                                        if (satir3 == 5 && cinko1 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir3 == 5 && cinko1 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        } else if (satir3 == 5 && cinko1 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "1. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko1++;
                                        }
                                    }

                                }
                            }
                            if (!label_listesi2[i][j].getText().equals("")) {
                                if (label_listesi2[i][j].getText().equals(tas_degeri.getText())) {
                                    panel_listesi2[i][j].setBackground(Color.white);
                                    int yeni2 = l.satirikontrol(temp2, b);

                                    if (yeni2 == 0) {
                                        satir2_1++;
                                        if (satir2_1 == 5 && cinko2 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_1 == 5 && cinko2 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_1 == 5 && cinko2 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        }
                                    } else if (yeni2 == 1) {
                                        satir2_2++;
                                        if (satir2_2 == 5 && cinko2 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_2 == 5 && cinko2 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_2 == 5 && cinko2 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        }
                                    } else if (yeni2 == 2) {
                                        satir2_3++;
                                        if (satir2_3 == 5 && cinko2 == 0) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 1. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_3 == 5 && cinko2 == 1) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu 2. Çinko!!!", "!!", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        } else if (satir2_3 == 5 && cinko2 == 2) {
                                            JOptionPane.showMessageDialog(rootPane, "2. Oyuncu Kazandı TOMBALA!!!", "TEBRİKLER", JOptionPane.INFORMATION_MESSAGE);
                                            cinko2++;
                                        }

                                    }

                                }
                            }
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Tombala Torbasında Eleman Kalmadı!!", "Dikkat", JOptionPane.ERROR_MESSAGE);
                }

            }
        }

    }//GEN-LAST:event_btn_tas_cekActionPerformed

    private void btn_oyuna_baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oyuna_baslaActionPerformed
        //         TODO add your handling code here:

        oyunu_sifirla();
        t.torba = t.generatePermutation(90);
        Liste_islemleri kart1_ıcın = new Liste_islemleri();

        //!!!!!!!!!! Hocam Kendi Arrayinizi Bu bloktaki yorum satırını kaldırarak deneyebilirsiniz 
        //!!!!!!!!!!!!! Lutfen alt satırdaki bloğu da yorum satırına almayı unutmayın
//        int[][] card1 = {{5, -1, 22, -1, 45, -1, 60, 73, -1},
//        {-1, 10, -1, 31, 47, 58, 68, -1, -1},
//        {-1, 17, 26, 38, -1, -1, -1, 79, 86}};
//        linkedlistim = kart1_ıcın.arrayi_linked_list_cevirme(card1);
//        linkedlistim = kart1_ıcın.down_baglama(linkedlistim);
//        kart1_ıcın.matrixiyaz(card1);
//        kart1_ıcın.linkyaz(linkedlistim);
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 9; j++) {
//
//                if (card1[i][j] != -1) {
//                    Integer k = card1[i][j];
//                    label_listesi[i][j].setText(k.toString());
//                    panel_listesi[i][j].add(label_listesi[i][j]);
//                    pnl_kart1.add(panel_listesi[i][j]);
//                } else {
//                    label_listesi[i][j].setText(" ");
//                    panel_listesi[i][j].add(label_listesi[i][j]);
//                    pnl_kart1.add(panel_listesi[i][j]);
//                }
//
//            }
//        }
        //------------------------------------------------------------------------
        
        
        //------------------------------------------------------
        //kendi arrayinizi denemek icin kapatacagınız yer :
        kart1 = kart1_ıcın.matrix_olusturma();
        linkedlistim = kart1_ıcın.arrayi_linked_list_cevirme(kart1);
        linkedlistim = kart1_ıcın.down_baglama(linkedlistim);
        kart1_ıcın.matrixiyaz(kart1);
        kart1_ıcın.linkyaz(linkedlistim);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {

                if (kart1[i][j] != -1) {
                    Integer k = kart1[i][j];
                    label_listesi[i][j].setText(k.toString());
                    panel_listesi[i][j].add(label_listesi[i][j]);
                    pnl_kart1.add(panel_listesi[i][j]);
                } else {
                    label_listesi[i][j].setText(" ");
                    panel_listesi[i][j].add(label_listesi[i][j]);
                    pnl_kart1.add(panel_listesi[i][j]);
                }

            }
        }
        //------------------------------------------------------

        this.pnl_kart1.setLayout(new GridLayout(3, 9));
        Liste_islemleri kart2_ıcın = new Liste_islemleri();

        kart2 = kart2_ıcın.matrix_olusturma();
        linkedlistim2 = kart2_ıcın.arrayi_linked_list_cevirme(kart2);
        linkedlistim2 = kart2_ıcın.down_baglama(linkedlistim2);
        kart2_ıcın.matrixiyaz(kart2);
        kart2_ıcın.linkyaz(linkedlistim2);

        this.pnl_kart2.setLayout(new GridLayout(3, 9));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {

                if (kart2[i][j] != -1) {
                    Integer yeni = kart2[i][j];
                    label_listesi2[i][j].setText(yeni.toString());
                    panel_listesi2[i][j].add(label_listesi2[i][j]);
                    pnl_kart2.add(panel_listesi2[i][j]);
                } else {
                    label_listesi2[i][j].setText(" ");
                    panel_listesi2[i][j].add(label_listesi2[i][j]);
                    pnl_kart2.add(panel_listesi2[i][j]);
                }

            }
        }

        pnl_kart1.revalidate();
        pnl_kart2.revalidate();
    }//GEN-LAST:event_btn_oyuna_baslaActionPerformed

    public void oyunu_sifirla() {

        t.torba_sifira(90);

        satir1 = 0;
        satir2 = 0;
        satir3 = 0;
        cinko1 = 0;
        satir2_1 = 0;
        satir2_2 = 0;
        satir2_3 = 0;
        cinko2 = 0;
        tas_degeri.setText("");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                label_listesi[i][j].setText(" ");
                panel_listesi[i][j].setBackground(Color.lightGray);
            }
        }
        pnl_kart1.setBackground(Color.lightGray);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                label_listesi2[i][j].setText(" ");
                panel_listesi2[i][j].setBackground(Color.lightGray);
            }
        }
        pnl_kart2.setBackground(Color.lightGray);
    }

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
            java.util.logging.Logger.getLogger(Oyun_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Oyun_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Oyun_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Oyun_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Oyun_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_oyuna_basla;
    private javax.swing.JButton btn_tas_cek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pnl_kart1;
    private javax.swing.JPanel pnl_kart2;
    private javax.swing.JPanel pnl_oyun_genel;
    private javax.swing.JLabel tas_degeri;
    // End of variables declaration//GEN-END:variables
}
