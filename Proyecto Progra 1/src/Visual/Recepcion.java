
package Visual;

import desplazable.Desface;

public class Recepcion extends javax.swing.JFrame {

    /**
     * Creates new form Recepcion
     */
    Desface desplace; 
    public Recepcion() {
        initComponents();
        desplace = new Desface();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btndesplegar = new javax.swing.JButton();
        btninicio = new javax.swing.JButton();
        btninscribir = new javax.swing.JButton();
        btnlistaclientes = new javax.swing.JButton();
        btnmensualidad = new javax.swing.JButton();
        btnagendar = new javax.swing.JButton();
        btnvender = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcion");

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setForeground(new java.awt.Color(102, 102, 102));

        panelMenu.setBackground(new java.awt.Color(57, 57, 57));

        btndesplegar.setBackground(new java.awt.Color(57, 57, 57));
        btndesplegar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btndesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu.png"))); // NOI18N
        btndesplegar.setText("Opciones                         ");
        btndesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndesplegar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndesplegar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btndesplegar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndesplegarMouseClicked(evt);
            }
        });
        btndesplegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesplegarActionPerformed(evt);
            }
        });

        btninicio.setBackground(new java.awt.Color(57, 57, 57));
        btninicio.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btninicio.setText("Inicio ");
        btninicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        btninscribir.setBackground(new java.awt.Color(57, 57, 57));
        btninscribir.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btninscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/users.png"))); // NOI18N
        btninscribir.setText("Nueva Inscripción         ");
        btninscribir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscribir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btninscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscribirActionPerformed(evt);
            }
        });

        btnlistaclientes.setBackground(new java.awt.Color(57, 57, 57));
        btnlistaclientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnlistaclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/list.png"))); // NOI18N
        btnlistaclientes.setText("Lista de clientes             ");
        btnlistaclientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlistaclientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnmensualidad.setBackground(new java.awt.Color(57, 57, 57));
        btnmensualidad.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnmensualidad.setText("Mensualidades");
        btnmensualidad.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnmensualidad.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnmensualidad.setMaximumSize(new java.awt.Dimension(638, 520));
        btnmensualidad.setMinimumSize(new java.awt.Dimension(638, 520));
        btnmensualidad.setPreferredSize(new java.awt.Dimension(638, 520));
        btnmensualidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmensualidadActionPerformed(evt);
            }
        });

        btnagendar.setBackground(new java.awt.Color(57, 57, 57));
        btnagendar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnagendar.setText("Agendar cita");
        btnagendar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnvender.setBackground(new java.awt.Color(57, 57, 57));
        btnvender.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/shopping-bag.png"))); // NOI18N
        btnvender.setText("Venta de productos      ");
        btnvender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvender.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btndesplegar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnagendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistaclientes)
                    .addComponent(btninscribir)
                    .addComponent(btninicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndesplegar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btninscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlistaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnmensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnagendar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvender, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 622, Short.MAX_VALUE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmensualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmensualidadActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninicioActionPerformed

    private void btninscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscribirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninscribirActionPerformed

    private void btndesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesplegarActionPerformed
       
    }//GEN-LAST:event_btndesplegarActionPerformed

    private void btndesplegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndesplegarMouseClicked

        desplace.desplazarIzquierda(panelMenu, panelMenu.getX(), -180, 10, 10);
        if (panelMenu.getX() == -180){
            desplace.desplazarDerecha(panelMenu, panelMenu.getX(),0, 10, 10);
        }
    }//GEN-LAST:event_btndesplegarMouseClicked

    public void run() {
        new Recepcion().setVisible(true);
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagendar;
    private javax.swing.JButton btndesplegar;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton btninscribir;
    private javax.swing.JButton btnlistaclientes;
    private javax.swing.JButton btnmensualidad;
    private javax.swing.JButton btnvender;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
        }
