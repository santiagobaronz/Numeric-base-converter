package vista;

import javax.swing.JOptionPane;
import modelo.Conversor;

/**
 *
 * @author aldanielago
 */
public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.panel_contenedor_bases.setVisible(false); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_form = new javax.swing.JPanel();
        txt_title = new javax.swing.JLabel();
        txt_description = new javax.swing.JLabel();
        jtf_number = new javax.swing.JTextField();
        btn_convetir = new javax.swing.JButton();
        panel_contenedor_bases = new javax.swing.JPanel();
        lbl_base2 = new javax.swing.JLabel();
        lbl_base3 = new javax.swing.JLabel();
        lbl_base5 = new javax.swing.JLabel();
        lbl_base4 = new javax.swing.JLabel();
        btn_reiniciar = new javax.swing.JButton();
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
        jtf_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtf_numberKeyTyped(evt);
            }
        });

        btn_convetir.setBackground(new java.awt.Color(255, 205, 178));
        btn_convetir.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        btn_convetir.setForeground(new java.awt.Color(22, 26, 29));
        btn_convetir.setText("Convertir");
        btn_convetir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_convetir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_convetirMouseClicked(evt);
            }
        });

        panel_contenedor_bases.setBackground(new java.awt.Color(109, 104, 117));

        lbl_base2.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base2.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base2.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base2.setText("Base 2");
        lbl_base2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_base2.setOpaque(true);
        lbl_base2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_base2MouseClicked(evt);
            }
        });

        lbl_base3.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base3.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base3.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base3.setText("Base 3");
        lbl_base3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_base3.setOpaque(true);
        lbl_base3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_base3MouseClicked(evt);
            }
        });

        lbl_base5.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base5.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base5.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base5.setText("Base 5");
        lbl_base5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_base5.setOpaque(true);
        lbl_base5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_base5MouseClicked(evt);
            }
        });

        lbl_base4.setBackground(new java.awt.Color(229, 152, 155));
        lbl_base4.setFont(new java.awt.Font("Comic Sans MS", 2, 18)); // NOI18N
        lbl_base4.setForeground(new java.awt.Color(255, 255, 255));
        lbl_base4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_base4.setText("Base 4");
        lbl_base4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 180, 162), 1, true));
        lbl_base4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_base4.setOpaque(true);
        lbl_base4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_base4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_contenedor_basesLayout = new javax.swing.GroupLayout(panel_contenedor_bases);
        panel_contenedor_bases.setLayout(panel_contenedor_basesLayout);
        panel_contenedor_basesLayout.setHorizontalGroup(
            panel_contenedor_basesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor_basesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel_contenedor_basesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_base5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_base4, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_base3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_base2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_contenedor_basesLayout.setVerticalGroup(
            panel_contenedor_basesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenedor_basesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_base2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_base3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_base4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbl_base5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_reiniciar.setBackground(new java.awt.Color(255, 205, 178));
        btn_reiniciar.setFont(new java.awt.Font("Comic Sans MS", 2, 14)); // NOI18N
        btn_reiniciar.setForeground(new java.awt.Color(22, 26, 29));
        btn_reiniciar.setText("Reiniciar");

        jl_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/fondo.jpeg"))); // NOI18N

        javax.swing.GroupLayout jp_formLayout = new javax.swing.GroupLayout(jp_form);
        jp_form.setLayout(jp_formLayout);
        jp_formLayout.setHorizontalGroup(
            jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formLayout.createSequentialGroup()
                .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_contenedor_bases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jp_formLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jp_formLayout.createSequentialGroup()
                                .addComponent(btn_convetir, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(btn_reiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jp_formLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_title)
                                    .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jp_formLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(txt_description)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jp_formLayout.setVerticalGroup(
            jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_formLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txt_title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_description)
                .addGap(24, 24, 24)
                .addComponent(jtf_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jp_formLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_convetir)
                    .addComponent(btn_reiniciar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35)
                .addComponent(panel_contenedor_bases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jp_formLayout.createSequentialGroup()
                .addComponent(jl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_form, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_convetirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_convetirMouseClicked
        this.panel_contenedor_bases.setVisible(true); 
        Conversor conversor = new Conversor(); 
        
        Base2 base2 = new Base2(); 
        Base3 base3 = new Base3(); 
        Base4 base4 = new Base4(); 
        Base5 base5 = new Base5(); 
        
        int numero = Integer.parseInt(jtf_number.getText()); 
        
        base2.jtf_base2.setText("Si sirve");
        base2.jtf_base2.setText(conversor.conversor_base(numero, 2));
        System.out.println(conversor.conversor_base(numero, 2));
        base2.jtf_base4.setText(String.valueOf(conversor.conversor_base(numero, 4)));
        System.out.println(conversor.conversor_base(numero, 4));
        base2.jtf_base8.setText(String.valueOf(conversor.conversor_base(numero, 8)));
        System.out.println(conversor.conversor_base(numero, 8));
        base2.jtf_base16.setText(String.valueOf(conversor.conversor_base(numero, 16)));
        System.out.println(conversor.conversor_base(numero, 16));
        
        base3.jtf_base3.setText(String.valueOf(conversor.conversor_base(numero, 3)));
        base3.jtf_base9.setText(String.valueOf(conversor.conversor_base(numero, 9)));
        base3.jtf_base27.setText(String.valueOf(conversor.conversor_base(numero, 27)));
        base3.jtf_base81.setText(String.valueOf(conversor.conversor_base(numero, 81)));
        
        base4.jtf_base4.setText(String.valueOf(conversor.conversor_base(numero, 4)));
        base4.jtf_base16.setText(String.valueOf(conversor.conversor_base(numero, 16)));
        base4.jtf_base64.setText(String.valueOf(conversor.conversor_base(numero, 64)));
        //base4.jtf_base256.setText(String.valueOf(conversor.conversor_base(numero, 256)));
        
        base5.jtf_base5.setText(String.valueOf(conversor.conversor_base(numero, 5)));
        base5.jtf_base25.setText(String.valueOf(conversor.conversor_base(numero, 25)));
        base5.jtf_base125.setText(String.valueOf(conversor.conversor_base(numero, 125)));
        //base5.jtf_base625.setText(String.valueOf(conversor.conversor_base(numero, 625)));
    }//GEN-LAST:event_btn_convetirMouseClicked

    private void jtf_numberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_numberKeyTyped
        char x = evt.getKeyChar();
        if (x == '0' || x == '1' || x == '2' || x == '3' || x == '4' || x == '5' || x == '6' || x == '7' || x == '8' || x == '9' || x == '.') {
        } else {
            evt.consume();
        }
    }//GEN-LAST:event_jtf_numberKeyTyped

    private void lbl_base2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_base2MouseClicked
        Base2 p1 = new Base2();
        p1.setSize(690,460);
        p1.setLocation(0,0);
        
        jl_image.removeAll();
        jl_image.add(p1);
        jl_image.revalidate();
        jl_image.repaint();
    }//GEN-LAST:event_lbl_base2MouseClicked

    private void lbl_base3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_base3MouseClicked
        Base3 p1 = new Base3();
        p1.setSize(690,460);
        p1.setLocation(0,0);
        
        jl_image.removeAll();
        jl_image.add(p1);
        jl_image.revalidate();
        jl_image.repaint();
    }//GEN-LAST:event_lbl_base3MouseClicked

    private void lbl_base5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_base5MouseClicked
        Base5 p1 = new Base5();
        p1.setSize(690,460);
        p1.setLocation(0,0);
        
        jl_image.removeAll();
        jl_image.add(p1);
        jl_image.revalidate();
        jl_image.repaint();
    }//GEN-LAST:event_lbl_base5MouseClicked

    private void lbl_base4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_base4MouseClicked
        Base4 p1 = new Base4();
        p1.setSize(690,460);
        p1.setLocation(0,0);
        
        jl_image.removeAll();
        jl_image.add(p1);
        jl_image.revalidate();
        jl_image.repaint();
    }//GEN-LAST:event_lbl_base4MouseClicked

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
    private javax.swing.JButton btn_reiniciar;
    private javax.swing.JLabel jl_image;
    private javax.swing.JPanel jp_form;
    public javax.swing.JTextField jtf_number;
    private javax.swing.JLabel lbl_base2;
    private javax.swing.JLabel lbl_base3;
    private javax.swing.JLabel lbl_base4;
    private javax.swing.JLabel lbl_base5;
    private javax.swing.JPanel panel_contenedor_bases;
    private javax.swing.JLabel txt_description;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables
}
