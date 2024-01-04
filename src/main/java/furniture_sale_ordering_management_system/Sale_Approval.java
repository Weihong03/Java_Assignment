package furniture_sale_ordering_management_system;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Wei Hong
 */
public class Sale_Approval extends javax.swing.JFrame {

    private String userID;

    /**
     * Creates new form ManageBooking
     */
    public Sale_Approval(String userID) {
        this.userID = userID;

        initComponents();
        // Set the title of the window
        setTitle("Sale Approval");

        // Get the dimension of the screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calculate the center coordinates
        int centerX = (screenSize.width - getWidth()) / 2;
        int centerY = (screenSize.height - getHeight()) / 2;

        // Set the location of the window
        setLocation(centerX, centerY);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private Sale_Approval() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Salestable = new javax.swing.JTable();
        jButton_modify = new javax.swing.JButton();
        jButton_delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField_search = new javax.swing.JTextField();
        jButton_approve = new javax.swing.JButton();
        jButton_reject = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setText("SALE APPROVAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jButton_back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/back.png"))); // NOI18N
        jButton_back.setText("Back");
        jButton_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_backActionPerformed(evt);
            }
        });

        jTable_Salestable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable_Salestable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Amount", "Date", "Salesperson", "Confirmation", "Approved by", "Invoice Generated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Salestable);

        jButton_modify.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_modify.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/modify.png"))); // NOI18N
        jButton_modify.setText("Modify");
        jButton_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_modifyActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/furniture_sale_ordering_management_system/Images/delete.png"))); // NOI18N
        jButton_delete.setText("Delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Search :");

        jTextField_search.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });

        jButton_approve.setText("Approve");
        jButton_approve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_approveActionPerformed(evt);
            }
        });

        jButton_reject.setText("Reject");
        jButton_reject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_rejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addComponent(jButton_modify)
                                .addGap(36, 36, 36)
                                .addComponent(jButton_delete))
                            .addComponent(jButton_back))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_approve, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_reject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 545, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_delete)
                            .addComponent(jButton_modify))
                        .addGap(11, 11, 11)
                        .addComponent(jButton_back))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_approve)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_reject)))
                .addGap(186, 186, 186))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_backActionPerformed
        Officer_Home home = new Officer_Home(userID);
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton_backActionPerformed

    private void jButton_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_modifyActionPerformed
        int selectedRowIndex = jTable_Salestable.getSelectedRow();
        if (selectedRowIndex >= 0) {
            // Get the values from the selected row
            String ID = jTable_Salestable.getValueAt(selectedRowIndex, 0).toString();
            int Amount = Integer.parseInt(jTable_Salestable.getValueAt(selectedRowIndex, 1).toString());
            String Date = jTable_Salestable.getValueAt(selectedRowIndex, 2).toString();
            String Salesperson = jTable_Salestable.getValueAt(selectedRowIndex, 3).toString();
            String Confirmation = jTable_Salestable.getValueAt(selectedRowIndex, 4).toString();
            String Approved_by = jTable_Salestable.getValueAt(selectedRowIndex, 5).toString();
            String Invoice_generated = jTable_Salestable.getValueAt(selectedRowIndex, 6).toString();

            // Create an instance of ModifyBooking and pass the selected data
            ModifySales modifySales = new ModifySales(ID, Amount, Date, Salesperson, userID);
            modifySales.setVisible(true);
            this.dispose();
        } else {
            // No row selected, display an error message or perform appropriate handling
            JOptionPane.showMessageDialog(this, "Please select a booking to modify.");
        }
    }//GEN-LAST:event_jButton_modifyActionPerformed


    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        // Get the selected row from your table or list
        int selectedRow = jTable_Salestable.getSelectedRow(); // Replace this with your actual logic to retrieve the selected row

        // Adjust the selectedRow index by adding 1
        selectedRow++;

        // Read the contents of the file into memory
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return; // Exit the method if an error occurs while reading the file
        }

        // Calculate the line indices of the selected row's data
        int startIndex = (selectedRow - 1) * 11; // Each row has 11 lines of data
        int endIndex = startIndex + 10;

        // Remove the selected row's data from the in-memory list
        if (startIndex >= 0 && endIndex < lines.size()) {
            lines.subList(startIndex, endIndex + 1).clear();
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete."); // Handle the case when the selected row is invalid
            return;
        }

        // Write the updated data back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/Sales_Quotation.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            return; // Exit the method if an error occurs while writing to the file
        }

        JOptionPane.showMessageDialog(this, "Selected row deleted successfully.");
        // Refresh the UI
        refreshTable();
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        String searchText = jTextField_search.getText();
        searchSales(searchText);
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jButton_approveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_approveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_approveActionPerformed

    private void jButton_rejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_rejectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_rejectActionPerformed

    private void refreshTable() {
        // Clear the existing data from the table
        DefaultTableModel model = (DefaultTableModel) jTable_Salestable.getModel();
        model.setRowCount(0);

        dispose();
        Sale_Approval saleApproval = new Sale_Approval();
        saleApproval.setVisible(true);
        saleApproval.displaySales(); // Call the method to display the bookings

        jTable_Salestable.revalidate();
        jTable_Salestable.repaint();
    }

    public void displaySales() {
        DefaultTableModel model = (DefaultTableModel) jTable_Salestable.getModel();
        model.setRowCount(0); // Clear existing data

        try (BufferedReader br = new BufferedReader(new FileReader("Data/Sales_Quotation.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("ID: ")) {
                    String[] rowData = new String[8];
                    // Remove trailing comma if present in the ID
                    rowData[0] = line.split(": ")[1].replaceAll(",\\s*$", "").trim();
                    for (int i = 1; i < 8; i++) {
                        line = br.readLine();
                        if (line != null && line.contains(": ")) {
                            String[] parts = line.split(": ", 2);
                            if (parts.length == 2) {
                                // Remove trailing comma if present
                                rowData[i] = parts[1].replaceAll(",\\s*$", "");
                            } else {
                                // Handle unexpected line format
                                rowData[i] = " ";
                            }
                        } else {
                            // Handle unexpected line format
                            rowData[i] = " ";
                        }
                    }
                    model.addRow(rowData);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void searchSales(String searchText) {
        TableRowSorter<TableModel> rowSorter = new TableRowSorter<>(jTable_Salestable.getModel());
        jTable_Salestable.setRowSorter(rowSorter);

        RowFilter<TableModel, Object> rowFilter = RowFilter.regexFilter("(?i)" + searchText); // Case-insensitive search
        rowSorter.setRowFilter(rowFilter);
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
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale_Approval.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Sale_Approval approval = new Sale_Approval();
                approval.setVisible(true);
                approval.displaySales();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_approve;
    private javax.swing.JButton jButton_back;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_modify;
    private javax.swing.JButton jButton_reject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Salestable;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
