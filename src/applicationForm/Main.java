package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    private String emp_id;
    private String name;
    private String status;

    public Main(){
        initComponents();
    }
    
    
   public Main(String emp_id, String name, String status) {
    this.emp_id = emp_id;
    this.name = name;
    this.status = status;
    initComponents();
    this.setTitle(this.emp_id + this.name + this.status);
     setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/shop.png")));
     this.setExtendedState(JFrame.MAXIMIZED_BOTH);
     
     //ບໍ່ສະແດງ Icon ທີ່ title bar
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false);

    //ປຽນສີແຖບ Title bar ແລະ ສີຕົວໜັງສື
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(52, 73, 94));
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
    
    //ຖ້າບໍ່ແມ່ນ admin ບໍ່ໃຫ້ເຫັນຂໍ້ມູນ, ສັັ່ງຊື້ນຳເຂົ້າ, ລາຍງານ
    
    if(!this.status.equals("Admin")){
        jMenuData.setVisible(false);
        jMenuOrder.setVisible(false);
        jMenuReport.setVisible(false);
    
    }
    
    
    // ໃຫ້ສະແດງໜ້າ PanelHome ກ່ອນ 
    showPanel(new PanelHome());
    
    
    }
    

                //ສ້າງເມັດທອດສະແດງແຕ່ລະໜ້າ jPanelMain
   private void showPanel(JPanel panel){
   
       jPanelMain.removeAll();
       jPanelMain.add(panel);
       jPanelMain.validate();
       
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuData = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuOrder = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItemDark = new javax.swing.JMenuItem();
        jMenuItemMacDark = new javax.swing.JMenuItem();
        jMenuItemLight = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuExit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMain.setBackground(new java.awt.Color(255, 51, 51));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_Page.png"))); // NOI18N
        jMenuHome.setText("ໜ້າຫລັກ");
        jMenuHome.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_Database.png"))); // NOI18N
        jMenuData.setText("ຈັດການຂ້ໍມູນ");
        jMenuData.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem1.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem1.setText("ຈັດການຂໍ້ມູນຢີ່ຫໍ້");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem2.setText("ຈັດການຂໍ້ມູນປະເພດ");
        jMenuData.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem3.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        jMenuData.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem4.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jMenuData.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem5.setText("ຈັດການຂໍ້ມູນອັດຕາການແລກປ່ຽນ");
        jMenuData.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem6.setText("ຈັດການຂໍ້ມູນຜູ້ສະໜອງ");
        jMenuData.add(jMenuItem6);

        jMenuBar1.add(jMenuData);

        jMenuOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order_Import.png"))); // NOI18N
        jMenuOrder.setText("ສັ່ງຊື້-ນຳເຂົ້າ");
        jMenuOrder.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem7.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem7.setText("ຈັດການຂໍ້ມູນສັ່ງຊື້");
        jMenuOrder.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem8.setText("ຈັດການຂໍ້ມູນນຳເຂົ້າ");
        jMenuOrder.add(jMenuItem8);

        jMenuBar1.add(jMenuOrder);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        jMenu10.setText("ລູກຄ້າ");
        jMenu10.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenu10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sale_Product.png"))); // NOI18N
        jMenu11.setText("ຂາຍສິນຄ້າ");
        jMenu11.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenu11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu11);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_Property.png"))); // NOI18N
        jMenu5.setText("ຄົ້ນຫາຂໍ້ມູນສິນຄ້າ");
        jMenu5.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenu5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu5);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report_Card.png"))); // NOI18N
        jMenuReport.setText("ລາຍງານ");
        jMenuReport.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem9.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem9.setText("ລາຍງານລາຍຮັບ");
        jMenuReport.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem10.setText("ລາຍງານສິນຄ້າ");
        jMenuReport.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem11.setText("ໃບບິນ");
        jMenuReport.add(jMenuItem11);

        jMenuBar1.add(jMenuReport);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        jMenu7.setText("ໂປຮໄຟຮ");
        jMenu7.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenu7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change_Theme.png"))); // NOI18N
        jMenu8.setText("ສີພື້ນຫຼັງ");
        jMenu8.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenu8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemDark.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItemDark.setText("ດຳ");
        jMenuItemDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDarkActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemDark);

        jMenuItemMacDark.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItemMacDark.setText("ຟ້າ");
        jMenuItemMacDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMacDarkActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemMacDark);

        jMenuItemLight.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItemLight.setText("ຂາວ");
        jMenuItemLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLightActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItemLight);

        jMenuItem15.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem15.setText("ເທົາເຫຼືອງ");
        jMenu8.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuItem16.setText("ເທົາຂຽວ");
        jMenu8.add(jMenuItem16);

        jMenuBar1.add(jMenu8);

        jMenuExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown.png"))); // NOI18N
        jMenuExit.setText("ອອກລະບົບ");
        jMenuExit.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jMenuExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuExit.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuExitMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuExitMouseClicked
        System.exit(0);
        
        
        
        
        
        
    }//GEN-LAST:event_jMenuExitMouseClicked

    private void jMenuItemLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLightActionPerformed
       
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
    SwingUtilities.invokeLater(() -> {
        try {
        UIManager.setLookAndFeel(new FlatLightLaf());
        SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
        }
    });
        
        
        
    }//GEN-LAST:event_jMenuItemLightActionPerformed

    private void jMenuItemDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDarkActionPerformed
      
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
    SwingUtilities.invokeLater(() -> {
        try {
        UIManager.setLookAndFeel(new FlatDarkLaf());
        SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
        }
    });
        
        
        
    }//GEN-LAST:event_jMenuItemDarkActionPerformed

    private void jMenuItemMacDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMacDarkActionPerformed
       
       getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(28, 40, 51));
    getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
    SwingUtilities.invokeLater(() -> {
        try {
        UIManager.setLookAndFeel(new FlatMacDarkLaf());
        SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
        }
    }); 
        
        
        
        
    }//GEN-LAST:event_jMenuItemMacDarkActionPerformed

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
        showPanel(new PanelHome());
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       showPanel(new PanelBrand());
    }//GEN-LAST:event_jMenuItem1ActionPerformed
        
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuData;
    private javax.swing.JMenu jMenuExit;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemDark;
    private javax.swing.JMenuItem jMenuItemLight;
    private javax.swing.JMenuItem jMenuItemMacDark;
    private javax.swing.JMenu jMenuOrder;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
