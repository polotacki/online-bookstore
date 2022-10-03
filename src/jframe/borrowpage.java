package jframe;



import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class borrowpage extends javax.swing.JFrame 
{
    DefaultTableModel model;
    String book = "";
    String publisher = "" ;
    int booknum1= 5;
    int booknum2= 5;
    int booknum3= 5;
    int booknum4= 5;
    int booknum5= 5;
    int price = 0;
    
   
    public borrowpage() 
    {
        initComponents();
    
        addTableHeader();

    }
    public void addTableHeader() 
    {
        model = (DefaultTableModel) jTable1.getModel();
        Object[] newIdentifiers = new Object[]{"book", " publisher", " bookcopies", "price"};
        model.setColumnIdentifiers(newIdentifiers);
         
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTextFielditem = new javax.swing.JComboBox<>();
        BookPublisher = new javax.swing.JTextField();
        bookcopies = new javax.swing.JTextField();
        prices = new javax.swing.JTextField();
        btn_exit1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFielditem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select your book ..", "Journy to the centre of the earth", "Moby Dic", "King Kong", "Game Of Thrones", "Islam Story" }));
        jTextFielditem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jTextFielditemItemStateChanged(evt);
            }
        });
        jTextFielditem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielditemActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFielditem, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 170, -1));

        BookPublisher.setBorder(null);
        jPanel2.add(BookPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 170, 20));

        bookcopies.setBorder(null);
        jPanel2.add(bookcopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 170, 20));

        prices.setBorder(null);
        prices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pricesActionPerformed(evt);
            }
        });
        jPanel2.add(prices, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 170, 20));

        btn_exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/icons8_cancel_32px.png"))); // NOI18N
        btn_exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_exit1MousePressed(evt);
            }
        });
        jPanel2.add(btn_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 60, 50));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 560, 200, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/confirm@2x.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 500, 240, 50));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "book", " publisher", " bookcopies", "price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 460, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jframe/borrow@2x.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exit1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exit1MousePressed
        // TODO add your handling code here:

        dispose();
    }//GEN-LAST:event_btn_exit1MousePressed

    private void jTextFielditemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielditemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielditemActionPerformed
//            names [0] = "Journy to the centre of the earth" ;
//            names [1] = "Moby Dic" ;
//            names [2] = "King Kong" ;
//            names [3] = "Game Of Thrones" ;
//            names [4] = "Islam Story" ;
//       Book book1 = new Book(5 , names ,500, "john Arin", 5) ;
    
    

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
 int indexs[] = jTable1.getSelectedRows();
        Object[] row = new Object[4];
        borrowedbooks fram2 = new borrowedbooks();
        DefaultTableModel model2 = (DefaultTableModel)fram2.jTable2.getModel();
        for (int i = 0; i < indexs.length; i++) {
        row[0] = model.getValueAt(indexs[i], 0);
        row[1] = model.getValueAt(indexs[i], 1);
        row[2] = model.getValueAt(indexs[i], 2);
        row[3] = model.getValueAt(indexs[i], 3);

            model2.addRow(row);     
        }
 fram2.setVisible(true);
               
    }//GEN-LAST:event_jLabel3MousePressed
/*   book = jTextFielditem.getSelectedItem().toString();
//         BookPublisher.setText(publisher);
//            booknum1= 5;
// booknum2= 5;
//  booknum3= 5;
//  booknum4= 5;
//    booknum5= 5;
//    
//        switch(jTextFielditem.getSelectedItem().toString()){
//            case "Journy to the centre of the earth":
//            price=500;
//           publisher = "john Arin";
//           String booknum1 = String.valueOf(this.booknum1);
//            bookcopies.setText(booknum1);
//           
//             model.addRow(new Object[]{book, publisher,booknum1,price});
//            break;
//            case "Moby Dic":
//             price=500;
//              publisher = "Ali jan";
//              
//                model.addRow(new Object[]{book, publisher,booknum2,price});
//            break;
//            case "King Kong":
//            price=500;
//             publisher = "Michael safe";
//             
//               model.addRow(new Object[]{book, publisher,booknum3,price});
//            break;
//            case "Game Of Thrones":
//            price=500;
//             publisher = "Ali Ansary";
//              
//              model.addRow(new Object[]{book, publisher,booknum4,price});
//            break;
//            case "Islam Story":
//            price=500;
//             publisher = "Gehad torbani";
//             model.addRow(new Object[]{book, publisher,booknum5, price});
//            break;*/
           
    private void jTextFielditemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jTextFielditemItemStateChanged
       
       
//        BookPublisher.setText(publisher);
       
        price = 500;
         //           Ali jan Michael safe Ali Ansary Gehad torbani

        switch(jTextFielditem.getSelectedItem().toString())
        {
            case "select your book .." : 
                BookPublisher.setText("");
                bookcopies.setText("");
                prices.setText("");

                break;
            case "Journy to the centre of the earth":
                
                BookPublisher.setText("john Arin");
                String booknuma = String.valueOf(this.booknum1);
                bookcopies.setText(booknuma);
                prices.setText("500");
           
             
                break;
                
            case "Moby Dic":
                
                BookPublisher.setText("Ali jan");
                String booknumb = String.valueOf(this.booknum2);
                bookcopies.setText(booknumb);
                 prices.setText("500");

                break;
            case "King Kong":
                
                BookPublisher.setText("Michael safe");
                String booknumc = String.valueOf(this.booknum3);
                bookcopies.setText(booknumc);
                 prices.setText("500");

           
                break;
                
            case "Game Of Thrones":
                
                BookPublisher.setText("Ali Ansary");
                String booknumd = String.valueOf(this.booknum4);
                bookcopies.setText(booknumd);
                prices.setText("500");

           
                break;
                
            case "Islam Story":
                
                BookPublisher.setText("Gehad torbani");
                String booknume = String.valueOf(this.booknum5);
                bookcopies.setText(booknume);
                prices.setText("500");


            break;
           
//         Book book2 = new Book(5 , names ,500, "Ali jan", 5) ; 
//       Book book3 = new Book(5 , names ,500, "Michael safe", 5) ;
//       Book book4 = new Book(5 , names ,500, "Ali Ansary", 5) ; 
//        Book book5 = new Book(5 , names ,500, "Gehad torbani", 5) ; 
        
        }     
            //clear fields after inserting the data
            // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielditemItemStateChanged

    private void pricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pricesActionPerformed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed

        
        
        
        
        
         if(Integer.parseInt(bookcopies.getText())>0)
         {
             
           model.addRow(new Object[]{jTextFielditem.getSelectedItem(), BookPublisher.getText(), bookcopies.getText(),prices.getText()});   
          switch(jTextFielditem.getSelectedItem().toString())
            {
            case "Journy to the centre of the earth":
                
                booknum1-=1;
           
             
                break;
                
            case "Moby Dic":
                booknum2-=1;
               

                break;
            case "King Kong":
                
                booknum3-=1;

           
                break;
                
            case "Game Of Thrones":
                booknum4-=1;
               

           
                break;
                
            case "Islam Story":
                booknum5-=1;
                


            break;
           

        
            }
          jTextFielditem.setSelectedItem("select your book ..");
//          BookPublisher.setText("");
//          bookcopies.setText("");
//          prices.setText("");
          
         }
         else
         {
              JOptionPane.showMessageDialog(null, "Sorry! this book isn't found\nThese are these are the books we have");
         }
          
    }//GEN-LAST:event_jLabel2MousePressed
    
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
            java.util.logging.Logger.getLogger(borrowpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(borrowpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(borrowpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(borrowpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new borrowpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BookPublisher;
    private javax.swing.JTextField bookcopies;
    private javax.swing.JLabel btn_exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jTextFielditem;
    private javax.swing.JTextField prices;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
     BookPublisher.setText(null);
     
    }
}
