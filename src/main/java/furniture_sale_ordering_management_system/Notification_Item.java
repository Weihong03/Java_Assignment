/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package furniture_sale_ordering_management_system;

import javax.swing.Icon;
/**
 *
 * @author Wei Hong
 */
public class Notification_Item extends javax.swing.JPanel {


    public Notification_Item(Icon icon, String name, String description, String time, int amount) {
        initComponents();
        imageAvatar.setIcon(icon);
        jLabel_name.setText(name);
        jLabel_description.setText(description);
        jLabel_time.setText(time);
        jLabel_amount.setText(String.valueOf(amount));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_name = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();
        jLabel_description = new javax.swing.JLabel();
        jLabel_amount = new javax.swing.JLabel();
        imageAvatar = new furniture_sale_ordering_management_system.Images.ImageAvatar();

        setOpaque(false);

        jLabel_name.setFont(new java.awt.Font("SansSerif", 1, 13)); // NOI18N
        jLabel_name.setForeground(new java.awt.Color(106, 106, 106));
        jLabel_name.setText("Name");

        jLabel_time.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_time.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_time.setText("Time");

        jLabel_description.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_description.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_description.setText("Description");

        jLabel_amount.setFont(new java.awt.Font("SansSerif", 0, 13)); // NOI18N
        jLabel_amount.setForeground(new java.awt.Color(134, 134, 134));
        jLabel_amount.setText("Amount");

        imageAvatar.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_name)
                    .addComponent(jLabel_time))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_amount))
                    .addComponent(jLabel_description))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_name)
                            .addComponent(jLabel_description))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_time)
                            .addComponent(jLabel_amount)))
                    .addComponent(imageAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private furniture_sale_ordering_management_system.Images.ImageAvatar imageAvatar;
    private javax.swing.JLabel jLabel_amount;
    private javax.swing.JLabel jLabel_description;
    private javax.swing.JLabel jLabel_name;
    private javax.swing.JLabel jLabel_time;
    // End of variables declaration//GEN-END:variables
}
