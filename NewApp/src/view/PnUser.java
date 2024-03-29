/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableRowSorter;
import library.StringLibrary;
import model.bean.User;
import model.table.UserTable;

/**
 *
 * @author Minh_PC
 */
public class PnUser extends javax.swing.JPanel {

    private UserTable userTable;
    Boolean isActive = false;
    int row = -1;

    /**
     * Creates new form PnUser
     */
    public PnUser() {
        initComponents();
        userTable = new UserTable(tbMain);
        userTable.loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitMain = new javax.swing.JSplitPane();
        pnLeft = new javax.swing.JPanel();
        pnTimKiem = new javax.swing.JPanel();
        lbID1 = new javax.swing.JLabel();
        tfIDTK = new javax.swing.JTextField();
        lbTenDanhMuc1 = new javax.swing.JLabel();
        tfUserNameTK = new javax.swing.JTextField();
        lbTenDanhMuc4 = new javax.swing.JLabel();
        tfFullNameTK = new javax.swing.JTextField();
        cbKichHoatTK = new javax.swing.JCheckBox();
        btKichHoat = new javax.swing.JButton();
        pnButtonTK = new javax.swing.JPanel();
        btTimKiemTK = new javax.swing.JButton();
        pnChucNang = new javax.swing.JPanel();
        lbID = new javax.swing.JLabel();
        tfIDUser = new javax.swing.JTextField();
        lbTenDanhMuc = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        pnButton = new javax.swing.JPanel();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        ntNhapLai = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        lbTenDanhMuc2 = new javax.swing.JLabel();
        lbTenDanhMuc3 = new javax.swing.JLabel();
        tfFULLNameUser = new javax.swing.JTextField();
        cbKichHoat = new javax.swing.JCheckBox();
        pfPassword = new javax.swing.JPasswordField();
        pnCenter = new javax.swing.JPanel();
        scrollMain = new javax.swing.JScrollPane();
        tbMain = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        splitMain.setOneTouchExpandable(true);

        pnLeft.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Chức Năng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 255, 51))); // NOI18N
        pnLeft.setForeground(new java.awt.Color(51, 0, 51));
        pnLeft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pnLeft.setMinimumSize(new java.awt.Dimension(455, 230));
        pnLeft.setLayout(new java.awt.BorderLayout());

        pnTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Form Tìm Kiếm", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 255))); // NOI18N

        lbID1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbID1.setForeground(new java.awt.Color(51, 0, 51));
        lbID1.setText("ID:");
        lbID1.setPreferredSize(new java.awt.Dimension(8, 28));

        lbTenDanhMuc1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTenDanhMuc1.setForeground(new java.awt.Color(51, 0, 51));
        lbTenDanhMuc1.setText("UserName");
        lbTenDanhMuc1.setPreferredSize(new java.awt.Dimension(8, 28));

        lbTenDanhMuc4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTenDanhMuc4.setForeground(new java.awt.Color(51, 0, 51));
        lbTenDanhMuc4.setText("FullName");
        lbTenDanhMuc4.setPreferredSize(new java.awt.Dimension(8, 28));

        cbKichHoatTK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbKichHoatTK.setText("Kích Hoạt");

        btKichHoat.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btKichHoat.setForeground(new java.awt.Color(0, 153, 0));
        btKichHoat.setText("V");
        btKichHoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKichHoatActionPerformed(evt);
            }
        });

        btTimKiemTK.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btTimKiemTK.setForeground(new java.awt.Color(51, 0, 51));
        btTimKiemTK.setText("Tìm Kiếm");
        btTimKiemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonTKLayout = new javax.swing.GroupLayout(pnButtonTK);
        pnButtonTK.setLayout(pnButtonTKLayout);
        pnButtonTKLayout.setHorizontalGroup(
            pnButtonTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonTKLayout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(btTimKiemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(154, 154, 154))
        );
        pnButtonTKLayout.setVerticalGroup(
            pnButtonTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnButtonTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btTimKiemTK)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTenDanhMuc4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTenDanhMuc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addComponent(tfIDTK, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfUserNameTK)
                    .addComponent(tfFullNameTK))
                .addContainerGap())
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(cbKichHoatTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btKichHoat)
                .addGap(55, 55, 55))
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnButtonTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(tfIDTK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenDanhMuc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUserNameTK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenDanhMuc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFullNameTK, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btKichHoat))
                    .addComponent(cbKichHoatTK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnButtonTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnLeft.add(pnTimKiem, java.awt.BorderLayout.SOUTH);

        lbID.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbID.setForeground(new java.awt.Color(51, 0, 51));
        lbID.setText("ID USER:");
        lbID.setPreferredSize(new java.awt.Dimension(8, 28));

        tfIDUser.setEditable(false);

        lbTenDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTenDanhMuc.setForeground(new java.awt.Color(51, 0, 51));
        lbTenDanhMuc.setText("USER NAME:");
        lbTenDanhMuc.setPreferredSize(new java.awt.Dimension(8, 28));

        btThem.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btThem.setForeground(new java.awt.Color(51, 0, 51));
        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-icon.gif"))); // NOI18N
        btThem.setText("Thêm");
        btThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btThemMousePressed(evt);
            }
        });
        pnButton.add(btThem);

        btSua.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btSua.setForeground(new java.awt.Color(51, 0, 51));
        btSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit-icon.gif"))); // NOI18N
        btSua.setText("Sửa");
        btSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btSuaMousePressed(evt);
            }
        });
        pnButton.add(btSua);

        ntNhapLai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ntNhapLai.setForeground(new java.awt.Color(51, 0, 51));
        ntNhapLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/power_off.png"))); // NOI18N
        ntNhapLai.setText("Nhập Lại");
        ntNhapLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ntNhapLai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ntNhapLaiMousePressed(evt);
            }
        });
        pnButton.add(ntNhapLai);

        btXoa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btXoa.setForeground(new java.awt.Color(51, 0, 51));
        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hr.gif"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btXoaMousePressed(evt);
            }
        });
        pnButton.add(btXoa);

        lbTenDanhMuc2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTenDanhMuc2.setForeground(new java.awt.Color(51, 0, 51));
        lbTenDanhMuc2.setText("PASSWORD:");
        lbTenDanhMuc2.setPreferredSize(new java.awt.Dimension(8, 28));

        lbTenDanhMuc3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbTenDanhMuc3.setForeground(new java.awt.Color(51, 0, 51));
        lbTenDanhMuc3.setText("FULL NAME:");
        lbTenDanhMuc3.setPreferredSize(new java.awt.Dimension(8, 28));

        cbKichHoat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbKichHoat.setForeground(new java.awt.Color(51, 0, 51));
        cbKichHoat.setText("Kích Hoạt");
        cbKichHoat.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        cbKichHoat.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cbKichHoat.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbKichHoatStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnChucNangLayout = new javax.swing.GroupLayout(pnChucNang);
        pnChucNang.setLayout(pnChucNangLayout);
        pnChucNangLayout.setHorizontalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnButton, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addGroup(pnChucNangLayout.createSequentialGroup()
                        .addComponent(lbTenDanhMuc3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfFULLNameUser))
                    .addGroup(pnChucNangLayout.createSequentialGroup()
                        .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnChucNangLayout.createSequentialGroup()
                                .addComponent(lbTenDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pfPassword))
                            .addGroup(pnChucNangLayout.createSequentialGroup()
                                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbTenDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(lbID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfIDUser, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(tfUserName))
                                .addGap(18, 18, 18)
                                .addComponent(cbKichHoat)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnChucNangLayout.setVerticalGroup(
            pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnChucNangLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbKichHoat))
                .addGap(18, 18, 18)
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTenDanhMuc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnChucNangLayout.createSequentialGroup()
                        .addComponent(pfPassword)
                        .addGap(4, 4, 4)))
                .addGroup(pnChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTenDanhMuc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFULLNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnLeft.add(pnChucNang, java.awt.BorderLayout.CENTER);

        splitMain.setLeftComponent(pnLeft);

        pnCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Danh Sách", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 153, 51))); // NOI18N
        pnCenter.setLayout(new java.awt.BorderLayout());

        tbMain.setAutoCreateRowSorter(true);
        tbMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbMainMousePressed(evt);
            }
        });
        tbMain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbMainKeyReleased(evt);
            }
        });
        scrollMain.setViewportView(tbMain);

        pnCenter.add(scrollMain, java.awt.BorderLayout.CENTER);

        splitMain.setRightComponent(pnCenter);

        add(splitMain, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btThemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btThemMousePressed
        String name = tfUserName.getText();
        String fullName = tfFULLNameUser.getText();
        String passWord = pfPassword.getText();

        User objCat = new User(fullName, passWord, fullName, isActive);
        //userTable.addItem(objCat);
        if (isValid("Add", objCat)) {
            if (userTable.addItem(objCat) > 0) {
                JOptionPane.showMessageDialog(null, "Them Thanh Cong");
            }
        }

    }//GEN-LAST:event_btThemMousePressed

    private void btSuaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSuaMousePressed
        int id = 0;
        String name = "";
        String userName = "";
        String fullName = "";
        String passWord = "";
        if (!tfIDUser.getText().equals("")) {
            id = Integer.parseInt(tfIDUser.getText());
            userName = tfUserName.getText();
            fullName = tfFULLNameUser.getText();
            passWord = pfPassword.getText();
        }
        User objUser = new User(id, userName, passWord, fullName, isActive);
        //User objCat = new User(fullName, passWord, fullName, isActive);

        if (isValid("Edit", objUser)) {
            if (userTable.EditItem(row, objUser) > 0) {
                JOptionPane.showMessageDialog(null, "Sua Thanh Cong");
                resetForm();
            }
        }

    }//GEN-LAST:event_btSuaMousePressed

    private void ntNhapLaiMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ntNhapLaiMousePressed
        resetForm();
    }//GEN-LAST:event_ntNhapLaiMousePressed

    private void btXoaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btXoaMousePressed
        row = tbMain.getSelectedRow();
        int id = 0;
        String name = "";
        String fullName = "";
        String passWord = "";
        if (!tfIDUser.getText().equals("")) {
            id = Integer.parseInt(tfIDUser.getText());
            fullName = tfFULLNameUser.getText();
            passWord = pfPassword.getText();
        }
        User objUser = new User(id, fullName, passWord, fullName, isActive);
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagess/icon.png"));
        if (JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "Ban Co Muon Xoa Khong?", "From System", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon)) {
            if (isValid("Del", objUser)) {
                if (userTable.delItem(row, objUser) > 0) {
                    JOptionPane.showMessageDialog(null, "Xoa Thanh Cong");
                    resetForm();
                }
            } 
        }


    }//GEN-LAST:event_btXoaMousePressed

    private void cbKichHoatStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbKichHoatStateChanged
        if (cbKichHoat.isSelected()) {
            isActive = true;
        } else {
            isActive = false;
        }
    }//GEN-LAST:event_cbKichHoatStateChanged

    private void tbMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMainMousePressed
        // TODO add your handling code here:
        setForm();
    }//GEN-LAST:event_tbMainMousePressed

    private void tbMainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbMainKeyReleased
        // TODO add your handling code here:
        setForm();
    }//GEN-LAST:event_tbMainKeyReleased

    private void btTimKiemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemTKActionPerformed
        //Filter:timf kiems thong qua table trong model ko tuong tac qua co so du lieu
        // TẠo ra một TAbleRowSorter: để wuy định kiểu dữ  liệu tìm kiếm trong model 

        TableRowSorter sorter = new TableRowSorter(tbMain.getModel());
        // Tìm kiếm theo tuwnmgf dòng trong table......Lưu ý tablwe tìm kiếm theo String

        tbMain.setRowSorter(sorter);
        String idF = tfIDTK.getText();
        String userName = tfUserNameTK.getText();
        String nameF = tfFullNameTK.getText();
        boolean isKH = cbKichHoatTK.isSelected();
        ArrayList<RowFilter<AbstractTableModel, Object>> alFilter = new ArrayList<>();
        RowFilter<AbstractTableModel, Object> filterID;
        if (!idF.equals("")) {
            filterID = RowFilter.regexFilter("^" + idF + "$", 0);// 
        } else {
            filterID = RowFilter.regexFilter(idF, 0);// 
        }
        alFilter.add(filterID);

        RowFilter<AbstractTableModel, Object> filterName = RowFilter.regexFilter("(?i)" + userName, 1);// ?i ko phan biet hoa thuong
        alFilter.add(filterName);

        RowFilter<AbstractTableModel, Object> filterUserName = RowFilter.regexFilter("(?i)" + nameF, 2);// ?i ko phan biet hoa thuong
        alFilter.add(filterUserName);

// tiem kiem theo kieu boolean
        /*RowFilter<AbstractTableModel, Object> filterActive = new RowFilter<AbstractTableModel, Object>() {
            boolean activeF = cbKichHoatTK.isSelected();
            @Override
            public boolean include(RowFilter.Entry<? extends AbstractTableModel, ? extends Object> entry) {
                //entry: tập hợp cá dòng dữ liệu troogn model
                if ((boolean) entry.getValue(3) == activeF) {
                    return true;
                } else {
                    return false;
                }
            }
        };*/
        RowFilter<AbstractTableModel, Object> filterActive = RowFilter.regexFilter(String.valueOf(isKH), 3);
        alFilter.add(filterActive);
        // RowFilter<AbstractTableModel, Object> filterIsActive = RowFilter.regexFilter("(?i)" + userName, 1);// ?i ko phan biet hoa thuong
        // alFilter.add(filterName);

        // Quy ddinhj tim kiem theo dieu kien va
        RowFilter<AbstractTableModel, Object> filterAND = RowFilter.andFilter(alFilter);
        sorter.setRowFilter(filterAND);
    }//GEN-LAST:event_btTimKiemTKActionPerformed

    private void btKichHoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKichHoatActionPerformed
        if (cbKichHoatTK.isEnabled()) {
            btKichHoat.setText("X");
            btKichHoat.setForeground(Color.red);
            cbKichHoatTK.setEnabled(false);

        } else {
            btKichHoat.setText("V");
            btKichHoat.setForeground(Color.green);
            cbKichHoatTK.setEnabled(true);
        }
    }//GEN-LAST:event_btKichHoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btKichHoat;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btTimKiemTK;
    private javax.swing.JButton btXoa;
    private javax.swing.JCheckBox cbKichHoat;
    private javax.swing.JCheckBox cbKichHoatTK;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbID1;
    private javax.swing.JLabel lbTenDanhMuc;
    private javax.swing.JLabel lbTenDanhMuc1;
    private javax.swing.JLabel lbTenDanhMuc2;
    private javax.swing.JLabel lbTenDanhMuc3;
    private javax.swing.JLabel lbTenDanhMuc4;
    private javax.swing.JButton ntNhapLai;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnButton;
    private javax.swing.JPanel pnButtonTK;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnChucNang;
    private javax.swing.JPanel pnLeft;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JScrollPane scrollMain;
    private javax.swing.JSplitPane splitMain;
    private javax.swing.JTable tbMain;
    private javax.swing.JTextField tfFULLNameUser;
    private javax.swing.JTextField tfFullNameTK;
    private javax.swing.JTextField tfIDTK;
    private javax.swing.JTextField tfIDUser;
    private javax.swing.JTextField tfUserName;
    private javax.swing.JTextField tfUserNameTK;
    // End of variables declaration//GEN-END:variables

    private boolean isValid(String add, User objUser) {
        switch (add) {
            case "Add":
                if ("".equals(objUser.getUserName())) {
                    JOptionPane.showConfirmDialog(null, "vui long nhap ten day du");
                    return false;
                }
                if ("".equals(objUser.getPassWord())) {
                    JOptionPane.showConfirmDialog(null, "vui long nhap mat khau");
                    return false;
                }
                if (!StringLibrary.isPassword(objUser.getPassWord())) {
                    JOptionPane.showConfirmDialog(null, "<html>mat khau ko duoc chua ki tu dac biet, bat dau bang chu cai"
                            + "<br /> va do dai toi thieu [6-30] ki tu </html>");
                    return false;
                }
                break;
            case "Del":
                if (objUser.getFullName().equals("")) {
                    JOptionPane.showMessageDialog(null, "Vui Long chon dong de xoa");
                    return false;
                }
                break;
            case "Edit":
                if (objUser.getFullName().equals("")) {
                    JOptionPane.showMessageDialog(null, "Vui Long chon dong de sua");
                    return false;
                }
                if ("".equals(objUser.getUserName())) {
                    JOptionPane.showConfirmDialog(null, "vui long nhap ten day du");
                    return false;
                }
                break;
        }

        return true;
    }

    private void resetForm() {
        tfIDUser.setText("");
        tfUserName.setText("");
        pfPassword.setText("");
        tfFULLNameUser.setText("");
        //cbKichHoat.s
    }

    public void setForm() {
        row = tbMain.getSelectedRow();
        String id = tbMain.getValueAt(row, 0).toString();
        String name = tbMain.getValueAt(row, 1).toString();
        String FullName = tbMain.getValueAt(row, 2).toString();
        // boolean isActive=Boolean.parseBoolean(tbMain.getValueAt(row, 4).toString());
        tfIDUser.setText(id);
        tfUserName.setText(name);
        tfFULLNameUser.setText(FullName);
    }
}
