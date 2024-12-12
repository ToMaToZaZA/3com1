package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import includeClass.PasswordHashing;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.sql.*;
import mysqlConnect.MysqlConnect;

public class Login extends javax.swing.JFrame {

    Connection conn = null;         //ເກັບການເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
    PreparedStatement pst = null;    //ກຽມຄໍາສັ່ງ SQL
    ResultSet rs = null;        //ເກັບຜົນໄດ້ຮັບ

    public Login() {
        initComponents();

        this.setTitle("ໂປຣແກຣມຂາຍເຄື່ອງໜ້າຮ້ານ");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/shop.png")));
        this.setLocationRelativeTo(null); //ສະແດງຜົນກາງຈໍພາບ
        this.setResizable(false); //ບໍ່ໃຫ້ຂະຫຍາຍໃຫຍ່ໄດ້

        //ປຽນສີແຖບ Title bar ແລະ ສີຕົວໜັງສື
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(211, 84, 0));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));

        //PlaceHolder
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ບັນຊີເຂົ້າໃຊ້");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ລະຫັດຜ່ານ");

        //ສະແດງລະຫັດຜ່ານ + ສະແດງເມື່ອປຸ່ມຢູ່ໃນສະຖານະ capslock
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true;" + "showCapsLock:true");

        //ລືບ
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        //ໃສ່ຮູບໃນ txtUser ແລະ txtPass
        //txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, new FlatSVGIcon("image_svg/user.svg"));
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/account.svg"));
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/key_vertical.svg"));

        //ໃສຮູບທີ່ປຸ່ມ ເຂົ້າໃຊ້ ແລະ ຍົກເລີກ
        btnLogin.setIcon(new FlatSVGIcon("image_svg/login.svg"));
        btnCancel.setIcon(new FlatSVGIcon("image_svg/cancel.svg"));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Defago Noto Sans", 1, 24)); // NOI18N
        jLabel1.setText("ຟອມເຂົ້າໃຊ້ລະບົບ");

        txtUsername.setFont(new java.awt.Font("Defago Noto Sans", 0, 18)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Saysettha OT", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 120, 2));
        btnLogin.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("ເຂົ້າໃຊ້");
        btnLogin.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 120, 2));
        btnCancel.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setText("ຍົກເລີກ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(txtPassword))))
                .addGap(93, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogin.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        //ກວດສອບຟອມຖ້າປ້ອນຂໍ້ມູນບໍ່ຄົບໃຫ້ແຈ້ງເຕືອນ
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "ກະລຸນາປ້ອນຂໍ້ມູນໃຫ້ຄົບໂ້ວນດ້ວຍນະຈະອິອິ", "ຫວ່າງເປົ່າ", JOptionPane.WARNING_MESSAGE);

            return;
        }

        //ພີມ trycatch ກົດປຸ່ມ tab
        try {
            conn = MysqlConnect.connectDB(); //ເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
            String sql = "SELECT emp_id, CONCAT(emp_name, ' ', emp_lname), status FROM employee WHERE username=? AND password=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUsername.getText());
            pst.setString(2, PasswordHashing.doHashing(txtPassword.getText()));
            rs = pst.executeQuery();
            if (rs.next()) {
              Main m = new Main(rs.getString(1), rs.getString(2), rs.getString(3));
                m.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານບໍ່ຖືກຕ້ອງ", "ຜິດພາດ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public static void main(String args[]) {

        FlatDarkLaf.setup();
        //FlatLightLaf.setup();

        //ກໍານົດຟ້ອນເລີ້ມຕົ້ນໃຫ້ກັບຟອມ
        UIManager.put("defaultFont", new Font("Defago Noto Sans", Font.PLAIN, 18));
        UIManager.put("OptionPane.messageFont", new Font("Defago Noto Sans", Font.PLAIN, 14));
        UIManager.put("OptionPane.okButtonText", "ຕົກລົງ");
        UIManager.put("OptionPane.cancelButtonText", "ຍົກເລີກ");

        UIManager.put("Button.arc", 100);
        UIManager.put("Component.arc", 10);
        UIManager.put("ProgressBar.arc", 10);
        UIManager.put("CheckBox.arc", 5);
        UIManager.put("TextComponent.arc", 10);

        UIManager.put("Component.arrowType", "triangle");
        UIManager.put("ScrollBar.showButtons", true);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
