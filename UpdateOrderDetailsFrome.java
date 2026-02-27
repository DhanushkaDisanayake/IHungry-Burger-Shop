package BurgerShop.view;

import BurgerShop.controller.BurgerController;
import BurgerShop.model.BurgerOrder;
import BurgerShop.model.BurgerList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateOrderDetailsFrome extends javax.swing.JFrame {
    
    private BurgerOrder order = null;
    
    public UpdateOrderDetailsFrome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        lblCustomerId = new javax.swing.JLabel();
        lblBurgerQuantity = new javax.swing.JLabel();
        lblTotalAmount = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        cbOrderStatus = new javax.swing.JComboBox<>();
        txtBurgerQuantity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Order");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Enter Order ID     :  ");

        txtOrderId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtOrderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderIdActionPerformed(evt);
            }
        });
        txtOrderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtOrderIdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOrderIdKeyTyped(evt);
            }
        });

        lblCustomerId.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCustomerId.setText("Customer ID                 :        ");

        lblBurgerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBurgerQuantity.setText("Burger Quantity           : ");

        lblTotalAmount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalAmount.setText("Total Amount               :        ");

        lblOrderStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblOrderStatus.setText("Order Status                 :");

        lblCustomerName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCustomerName.setText("Customer Name           :        ");

        cbOrderStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbOrderStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preparing", "Delivered", "Cancel" }));

        txtBurgerQuantity.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtBurgerQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBurgerQuantityActionPerformed(evt);
            }
        });
        txtBurgerQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBurgerQuantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBurgerQuantityKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCustomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
                            .addComponent(lblTotalAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblBurgerQuantity)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBurgerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBurgerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBurgerQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addComponent(lblTotalAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbOrderStatus))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        btnUpdate.setBackground(new java.awt.Color(0, 204, 102));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
        if (txtOrderId.getText().length()<5) {
            JOptionPane.showMessageDialog(this,"Invalied Order ID... Try again...");
            txtOrderId.setText("");
            txtOrderId.requestFocus();
        }
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtOrderIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyReleased

        if (txtOrderId.getText().length()<5) {
            lblCustomerId.setText("Customer ID                  :  ");
            lblCustomerName.setText("Customer Name            :  ");
            lblTotalAmount.setText("Total Amount                :  ");
            txtBurgerQuantity.setText("");
            return;
        }

        if (txtOrderId.getText().length()==5) {
            try {
                BurgerController.dataStoreNode();
                
                order = BurgerList.searchOrderUpdate(txtOrderId.getText());
                
                if (order==null) {
                    JOptionPane.showMessageDialog(this,"Invalied Order ID... Try again...");
                    txtOrderId.setText("");
                    txtOrderId.requestFocus();
                }else{
                    if(order.getOrderStatus()==1){
                        JOptionPane.showMessageDialog(this,"Order is delivered...can't update...");
                        txtOrderId.setText("");
                    }else if (order.getOrderStatus()==2) {
                        JOptionPane.showMessageDialog(this,"Order is canceled...can't update...");
                        txtOrderId.setText("");
                    }
                    
                    lblCustomerId.setText("Customer ID                  :  "+order.getCustomerId());
                    lblCustomerName.setText("Customer Name            :  "+order.getCustomerName());
                    txtBurgerQuantity.setText(""+order.getBurgerQuantity());
                    lblTotalAmount.setText("Total Amount                :  Rs."+order.getTotalAmount());
                    cbOrderStatus.setSelectedIndex(0);
                }
                return;
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UpdateOrderDetailsFrome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_txtOrderIdKeyReleased

    private void txtBurgerQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBurgerQuantityActionPerformed
        
    }//GEN-LAST:event_txtBurgerQuantityActionPerformed

    private void txtBurgerQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurgerQuantityKeyTyped
        char ch = evt.getKeyChar();
        
        if (!Character.isDigit(ch)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtBurgerQuantityKeyTyped

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        if (txtBurgerQuantity.getText().isEmpty()) {
        
            JOptionPane.showMessageDialog(this,"Please Enter burger quantity...");
        
        }else if (Integer.parseInt(txtBurgerQuantity.getText().toString())<=0) {
        
            JOptionPane.showMessageDialog(this,"Invalied burder quantity...");
            txtBurgerQuantity.setText("");
            txtBurgerQuantity.requestFocus();
        
        }else{
            try {
                order.setBurgerQuantity(Integer.parseInt(txtBurgerQuantity.getText().toString()));
                order.setOrderStatus(cbOrderStatus.getSelectedIndex());
                order.setTotalAmount(order.getBurgerQuantity()*BurgerOrder.getBURGER_PRICE());
                
                int index = BurgerList.getOrderIdIndex(order.getOrderId());
                BurgerList.addUpdateOrder(index,order);
                
                
                BurgerController.dataStoreFile();
                
                JOptionPane.showMessageDialog(this,"Update Success");
                txtOrderId.setText("");
                txtBurgerQuantity.setText("");
                cbOrderStatus.setSelectedIndex(0);
                lblCustomerId.setText("Customer ID                  :  ");
                lblCustomerName.setText("Customer Name            :  ");
                lblTotalAmount.setText("Total Amount                :  ");
                txtOrderId.requestFocus();
            } catch (IOException ex) {
                Logger.getLogger(UpdateOrderDetailsFrome.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtOrderIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderIdKeyTyped
        if (txtOrderId.getText().length()==5) {
            evt.consume();
        }
    }//GEN-LAST:event_txtOrderIdKeyTyped

    private void txtBurgerQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBurgerQuantityKeyReleased
        double total=0;
        if (txtBurgerQuantity.getText().isEmpty()) {
            lblTotalAmount.setText("Total Amount                :  Rs. 0.00");
        }else{
            total=Integer.parseInt(txtBurgerQuantity.getText())*BurgerOrder.getBURGER_PRICE();
            lblTotalAmount.setText("Total Amount                :  Rs. "+total);
        }
    }//GEN-LAST:event_txtBurgerQuantityKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbOrderStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblBurgerQuantity;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblTotalAmount;
    private javax.swing.JTextField txtBurgerQuantity;
    private javax.swing.JTextField txtOrderId;
    // End of variables declaration//GEN-END:variables
}
