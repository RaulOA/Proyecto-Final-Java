
package Visual;

import static Datos.ArrayDatosClientes.listaClientes;
import Datos.DatosClientes;
import desplazable.Desface;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Recepcion extends javax.swing.JFrame {

    /**
     * Creates new form Recepcion
     */
    DefaultTableModel modelTable = new DefaultTableModel();
    
    Desface desplace; 
    public Recepcion() {
        initComponents();
        desplace = new Desface();
        
        jPanelInscripcion.setVisible(false);
        jPanelListaClientes.setVisible(false);
        
        tablaListaClientes.setModel(modelTable);
        modelTable.addColumn("Nombre");
        modelTable.addColumn("Apellido1");
        modelTable.addColumn("Apellido2");
        modelTable.addColumn("Sexo");
        cargarDatos();
        cargarInscripcion();
          
    }
    public void cargarDatos(){
        
        modelTable.setRowCount(0);
        
        for (int i = 0;i< listaClientes.size() ; i++) {
            
            modelTable.addRow(new Object []{
                
                listaClientes.get(i).getNombre(),
                listaClientes.get(i).getApellido1(),
                listaClientes.get(i).getApellido2(),
                listaClientes.get(i).getSexo(),
            
            });
        }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sexo = new javax.swing.ButtonGroup();
        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        btndesplegar = new javax.swing.JButton();
        btninicio = new javax.swing.JButton();
        btninscribir = new javax.swing.JButton();
        btnlistaclientes = new javax.swing.JButton();
        btnmensualidad = new javax.swing.JButton();
        btnagendar = new javax.swing.JButton();
        btnvender = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();
        jPanelInscripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInscripcionNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInscripcionApellido1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtInscripcionApellido2 = new javax.swing.JTextField();
        radioMasculino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        radioFemenino = new javax.swing.JRadioButton();
        btnInscribir = new javax.swing.JButton();
        jPanelListaClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaListaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recepcion");

        panelPrincipal.setBackground(new java.awt.Color(102, 102, 102));
        panelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelPrincipal.setForeground(new java.awt.Color(102, 102, 102));

        panelMenu.setBackground(new java.awt.Color(57, 57, 57));

        btndesplegar.setBackground(new java.awt.Color(57, 57, 57));
        btndesplegar.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btndesplegar.setForeground(new java.awt.Color(255, 255, 255));
        btndesplegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/menu.png"))); // NOI18N
        btndesplegar.setText("Opciones                         ");
        btndesplegar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndesplegar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btndesplegar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btndesplegar.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                btndesplegarComponentAdded(evt);
            }
        });
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
        btninicio.setForeground(new java.awt.Color(255, 255, 255));
        btninicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/home-outline.png"))); // NOI18N
        btninicio.setText("Inicio                                ");
        btninicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btninicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninicioActionPerformed(evt);
            }
        });

        btninscribir.setBackground(new java.awt.Color(57, 57, 57));
        btninscribir.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btninscribir.setForeground(new java.awt.Color(255, 255, 255));
        btninscribir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/user-plus.png"))); // NOI18N
        btninscribir.setText("Nueva Inscripción         ");
        btninscribir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninscribir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btninscribir.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btninscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninscribirActionPerformed(evt);
            }
        });

        btnlistaclientes.setBackground(new java.awt.Color(57, 57, 57));
        btnlistaclientes.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnlistaclientes.setForeground(new java.awt.Color(255, 255, 255));
        btnlistaclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/users.png"))); // NOI18N
        btnlistaclientes.setText("Lista de clientes             ");
        btnlistaclientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlistaclientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnlistaclientes.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnlistaclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlistaclientesActionPerformed(evt);
            }
        });

        btnmensualidad.setBackground(new java.awt.Color(57, 57, 57));
        btnmensualidad.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnmensualidad.setForeground(new java.awt.Color(255, 255, 255));
        btnmensualidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cash-outline (1).png"))); // NOI18N
        btnmensualidad.setText("Mensualidades              ");
        btnmensualidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        btnagendar.setForeground(new java.awt.Color(255, 255, 255));
        btnagendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/calendar-outline.png"))); // NOI18N
        btnagendar.setText("Agendar cita                  ");
        btnagendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnagendar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnagendar.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnagendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagendarActionPerformed(evt);
            }
        });

        btnvender.setBackground(new java.awt.Color(57, 57, 57));
        btnvender.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvender.setForeground(new java.awt.Color(255, 255, 255));
        btnvender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/shopping-bag.png"))); // NOI18N
        btnvender.setText("Venta de productos      ");
        btnvender.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvender.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        btnvolver.setBackground(new java.awt.Color(57, 57, 57));
        btnvolver.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnvolver.setForeground(new java.awt.Color(255, 255, 255));
        btnvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/return-down-back-outline.png"))); // NOI18N
        btnvolver.setText("Volver                             ");
        btnvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnvolver.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnvolver.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmensualidad, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnagendar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndesplegar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btninscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnlistaclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelInscripcion.setBackground(new java.awt.Color(102, 102, 102));
        jPanelInscripcion.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        txtInscripcionNombre.setBackground(new java.awt.Color(153, 153, 153));
        txtInscripcionNombre.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N
        txtInscripcionNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscripcionNombreActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellido 1:");

        txtInscripcionApellido1.setBackground(new java.awt.Color(153, 153, 153));
        txtInscripcionApellido1.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N
        txtInscripcionApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscripcionApellido1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido 2:");

        txtInscripcionApellido2.setBackground(new java.awt.Color(153, 153, 153));
        txtInscripcionApellido2.setFont(new java.awt.Font("Eras Medium ITC", 0, 15)); // NOI18N
        txtInscripcionApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInscripcionApellido2ActionPerformed(evt);
            }
        });

        radioMasculino.setBackground(new java.awt.Color(153, 153, 153));
        sexo.add(radioMasculino);
        radioMasculino.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        radioMasculino.setForeground(new java.awt.Color(255, 255, 255));
        radioMasculino.setText("Masculino");

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sexo:");

        radioFemenino.setBackground(new java.awt.Color(153, 153, 153));
        sexo.add(radioFemenino);
        radioFemenino.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        radioFemenino.setForeground(new java.awt.Color(255, 255, 255));
        radioFemenino.setText("Femenino");
        radioFemenino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemeninoActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(new java.awt.Color(0, 0, 0));
        btnInscribir.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        btnInscribir.setForeground(new java.awt.Color(255, 255, 255));
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelInscripcionLayout = new javax.swing.GroupLayout(jPanelInscripcion);
        jPanelInscripcion.setLayout(jPanelInscripcionLayout);
        jPanelInscripcionLayout.setHorizontalGroup(
            jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                .addGroup(jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(txtInscripcionApellido2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(txtInscripcionApellido1)
                                .addComponent(txtInscripcionNombre))
                            .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(radioMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioFemenino))))
                    .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanelInscripcionLayout.setVerticalGroup(
            jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInscripcionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInscripcionNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtInscripcionApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtInscripcionApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioMasculino)
                    .addComponent(radioFemenino))
                .addGap(44, 44, 44)
                .addComponent(btnInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanelListaClientes.setBackground(new java.awt.Color(102, 102, 102));

        tablaListaClientes.setBackground(new java.awt.Color(102, 102, 102));
        tablaListaClientes.setForeground(new java.awt.Color(102, 102, 102));
        tablaListaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaListaClientes);

        javax.swing.GroupLayout jPanelListaClientesLayout = new javax.swing.GroupLayout(jPanelListaClientes);
        jPanelListaClientes.setLayout(jPanelListaClientesLayout);
        jPanelListaClientesLayout.setHorizontalGroup(
            jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelListaClientesLayout.setVerticalGroup(
            jPanelListaClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelListaClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelListaClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed

        try {

            String nombre = txtInscripcionNombre.getText();
            String apellido1 = txtInscripcionApellido1.getText();
            String apellido2 = txtInscripcionApellido2.getText();
            String sexo ="";
            if (radioMasculino.isSelected()||radioFemenino.isSelected()) {
                if (radioMasculino.isSelected()) {
                    sexo="Masculino";
                }else if (radioFemenino.isSelected()){
                    sexo = "Femenino";
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,"Debe seleccionar el sexo");
            }

            DatosClientes nuevoCliente = new DatosClientes();
            nuevoCliente.setNombre(nombre);
            nuevoCliente.setApellido1(apellido1);
            nuevoCliente.setApellido2(apellido2);
            nuevoCliente.setSexo(sexo);

            listaClientes.add(nuevoCliente);
            JOptionPane.showMessageDialog(rootPane,"Cliente Inscrito");

            cargarDatos();
            txtInscripcionNombre.setText("");
            txtInscripcionApellido1.setText("");
            txtInscripcionApellido2.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane,"Ocurrio un error");
        }
    }//GEN-LAST:event_btnInscribirActionPerformed

    private void radioFemeninoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemeninoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioFemeninoActionPerformed

    private void txtInscripcionApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscripcionApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInscripcionApellido2ActionPerformed

    private void txtInscripcionApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscripcionApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInscripcionApellido1ActionPerformed

    private void txtInscripcionNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInscripcionNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInscripcionNombreActionPerformed

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed
        Loggin volverloggin = new Loggin();
        volverloggin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnagendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagendarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnagendarActionPerformed

    private void btnmensualidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmensualidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmensualidadActionPerformed

    private void btnlistaclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlistaclientesActionPerformed
        jPanelInscripcion.setVisible(false);
        jPanelListaClientes.setVisible(true);
    }//GEN-LAST:event_btnlistaclientesActionPerformed

    private void btninscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninscribirActionPerformed
        jPanelInscripcion.setVisible(true);
        jPanelListaClientes.setVisible(false);
    }//GEN-LAST:event_btninscribirActionPerformed

    private void btninicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btninicioActionPerformed

    private void btndesplegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesplegarActionPerformed

    }//GEN-LAST:event_btndesplegarActionPerformed

    private void btndesplegarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndesplegarMouseClicked

        desplace.desplazarIzquierda(panelMenu, panelMenu.getX(), -180, 10, 10);
        if (panelMenu.getX() == -180){
            desplace.desplazarDerecha(panelMenu, panelMenu.getX(),0, 10, 10);
        }
    }//GEN-LAST:event_btndesplegarMouseClicked

    private void btndesplegarComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_btndesplegarComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btndesplegarComponentAdded

        
    public void run() {
        new Recepcion().setVisible(true);
            }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnagendar;
    private javax.swing.JButton btndesplegar;
    private javax.swing.JButton btninicio;
    private javax.swing.JButton btninscribir;
    private javax.swing.JButton btnlistaclientes;
    private javax.swing.JButton btnmensualidad;
    private javax.swing.JButton btnvender;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelInscripcion;
    private javax.swing.JPanel jPanelListaClientes;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JRadioButton radioFemenino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.ButtonGroup sexo;
    private javax.swing.JTable tablaListaClientes;
    private javax.swing.JTextField txtInscripcionApellido1;
    private javax.swing.JTextField txtInscripcionApellido2;
    private javax.swing.JTextField txtInscripcionNombre;
    // End of variables declaration//GEN-END:variables
private void cargarInscripcion() {
        
        
        
        
    }        
}

