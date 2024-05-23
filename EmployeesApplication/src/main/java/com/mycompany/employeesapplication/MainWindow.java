package com.mycompany.employeesapplication;



public class MainWindow extends javax.swing.JFrame {

    

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnLoginAsAnAdministrator = new javax.swing.JButton();
        btnLogInEmployee = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("     İnspimo");

        btnLoginAsAnAdministrator.setText("Log in as an administrator");
        btnLoginAsAnAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginAsAnAdministratorActionPerformed(evt);
            }
        });

        btnLogInEmployee.setText(" Log in as an employee");
        btnLogInEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLoginAsAnAdministrator)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnLogInEmployee)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogInEmployee)
                    .addComponent(btnLoginAsAnAdministrator))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginAsAnAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginAsAnAdministratorActionPerformed
        LogInAsAnAdministrator logInAsAnAdministrator = new LogInAsAnAdministrator();
        logInAsAnAdministrator.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnLoginAsAnAdministratorActionPerformed

    private void btnLogInEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInEmployeeActionPerformed
        LogInAsAnEmployee logInAsAnEmployee = new LogInAsAnEmployee();
        logInAsAnEmployee.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnLogInEmployeeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogInEmployee;
    private javax.swing.JButton btnLoginAsAnAdministrator;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
