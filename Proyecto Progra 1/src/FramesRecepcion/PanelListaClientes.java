package FramesRecepcion;

import Datos.ListBook;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelListaClientes extends javax.swing.JPanel {

    DefaultTableModel modelo = new DefaultTableModel();

    public PanelListaClientes() {
        initComponents();
        tablaClientes.setModel(modelo);
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Teléfono");
    }

    public void cargarDatos() {
        modelo.setRowCount(0);
        for (int i = 0; i < ListBook.listbook.size(); i++) {
            modelo.addRow(new Object[]{
                ListBook.listbook.get(i).getID(),
                ListBook.listbook.get(i).getNombre(),
                ListBook.listbook.get(i).getApellido(),
                ListBook.listbook.get(i).getTelefono(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tablaClientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 17)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaClientes.setShowGrid(true);
        jScrollPane1.setViewportView(tablaClientes);

        btnModificar.setBackground(new java.awt.Color(0, 0, 0));
        btnModificar.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaClientes.getSelectedRow();

        if (filaSeleccionada >= 0) {
            ListBook.listbook.remove(filaSeleccionada);
            cargarDatos();

        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = tablaClientes.getSelectedRow();

        if (filaSeleccionada >= 0) {
            ModificarCliente mod = new ModificarCliente();
            mod.setVisible(true);
            mod.setLocationRelativeTo(null);
            mod.setResizable(false);

            String id = ListBook.listbook.get(filaSeleccionada).getID();
            String nom = ListBook.listbook.get(filaSeleccionada).getNombre();
            String ape = ListBook.listbook.get(filaSeleccionada).getApellido();
            String eda = ListBook.listbook.get(filaSeleccionada).getEdad();
            String gen = ListBook.listbook.get(filaSeleccionada).getGenero();
            String pes = ListBook.listbook.get(filaSeleccionada).getPeso();
            String alt = ListBook.listbook.get(filaSeleccionada).getAltura();
            String tel = ListBook.listbook.get(filaSeleccionada).getTelefono();
            String pad = ListBook.listbook.get(filaSeleccionada).getPadecimientos();

            mod.modificar(id, nom, ape, eda, gen, pes, alt, tel, pad, filaSeleccionada);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente");
        }


    }//GEN-LAST:event_btnModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    // End of variables declaration//GEN-END:variables
}
