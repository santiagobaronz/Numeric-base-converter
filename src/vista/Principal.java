package vista;

/**
 *
 * @author aldanielago
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_form = new javax.swing.JPanel();
        txt_title = new javax.swing.JLabel();
        txt_description = new javax.swing.JLabel();
        jtf_number = new javax.swing.JTextField();
        btn_convetir = new javax.swing.JButton();
        lbl_base2 = new javax.swing.JLabel();
        lbl_base3 = new javax.swing.JLabel();
        lbl_base5 = new javax.swing.JLabel();
        lbl_basen = new javax.swing.JLabel();
        jl_image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(109, 104, 117));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jp_form.setBackground(new java.awt.Color(109, 104, 117));
        jp_form.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(181, 131, 141), 1, true));
        jp_form.setName(""); // NOI18N

        txt_title.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        txt_title.setForeground(new java.awt.Color(255, 205, 178));
        txt_title.setText("Conversor de base numérica");

        txt_description.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        txt_description.setForeground(new java.awt.Color(255, 205, 178));
        txt_description.setText("Digite un numero en base 10: ");

        jtf_number.setBackground(new java.awt.Color(181, 131, 141));

        btn_convetir.setBackground(new java.awt.Color(255, 205, 178));
        btn_convetir.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        btn_convetir.setForeground(new java.awt.Color(22, 26, 29));
        btn_convetir.setText("Convertir");

        lbl_base2.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base2.setText("Base 2");
        lbl_base2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base2.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lbl_base2.setOpaque(true);

        lbl_base3.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base3.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base3.setText("Base 3");
        lbl_base3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base3.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lbl_base3.setOpaque(true);

        lbl_base5.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base5.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base5.setText("Base 5");
        lbl_base5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base5.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lbl_base5.setOpaque(true);

        lbl_basen.setBackground(new java.awt.Color(229, 152, 155));
        lbl_basen.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_basen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_basen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_basen.setText("Otra base");
        lbl_basen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_basen.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        lbl_basen.setOpaque(true);

        jl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jp_formLayout = new javax.swing.GroupLayout(jp_form);
        jp_form.setLayout(jp_formLayout);
        jp_formLayout.setHorizontalGroup(
            jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formLayout.createSequentialGroup()
                .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_formLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(txt_title))
                            .addGroup(jp_formLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(txt_description))))
                    .addGroup(jp_formLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_base3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_base2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_base5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_basen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jp_formLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_convetir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jl_image))
        );
        jp_formLayout.setVerticalGroup(
            jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txt_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_description)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_convetir)
                .addGap(18, 18, 18)
                .addComponent(lbl_base2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_base3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_base5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_basen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jl_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_convetir;
    private javax.swing.JLabel jl_image;
    private javax.swing.JPanel jp_form;
    private javax.swing.JTextField jtf_number;
    private javax.swing.JLabel lbl_base2;
    private javax.swing.JLabel lbl_base3;
    private javax.swing.JLabel lbl_base5;
    private javax.swing.JLabel lbl_basen;
    private javax.swing.JLabel txt_description;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables
}
