package bookstore;

public class BestSellers extends javax.swing.JFrame {
    public BestSellers() {
        initComponents();
    }

     public class BooksFacade{
        Type FType;
        First FFirst;
        Second FSecond ;
        Third FThird;   
        Fourth FFourth;
        Fifth FFifth;
        
        public BooksFacade(){
            FType = new Type();
            FFirst = new First();
            FSecond = new Second();
            FThird = new Third();
            FFourth = new Fourth();
            FFifth = new Fifth();
        }

        public void Poetry(){
            FFirst.poet1();
            FSecond.poet2();
            FThird.poet3();
            FFourth.poet4();
            FFifth.poet5();
            FType.poet();
        }
        
   
        public void Novels(){
            FFirst.nov1();
            FSecond.nov2();
            FThird.nov3();
            FFourth.nov4();

            FFifth.nov5();
            FType.nov();

        }

        public void SoftwareEng(){
            FFirst.se1();
            FSecond.se2();
            FThird.se3();
            FFourth.se4();
            FFifth.se5();
            FType.se();

        }
             
        public void CookBooks(){
            FType.Cook();
            FFirst.cook1();
            FSecond.cook2();
            FThird.cook3();
            FFourth.cook4();
            FFifth.cook5();
        }

        public void Biography(){
            FType.biotype();
            FFirst.bio1();
            FSecond.bio2();
            FThird.bio3();
            FFourth.bio4();
            FFifth.bio5();
        }     
    }
 
        public class First {
            public void poet1(){
                f1.setText("River of the Gods");
            }
            public void bio1(){
                 f1.setText("The Game Changer : Shahid Afridi");
            }
            public void nov1(){
                f1.setText("Don Quixote");
            }
            public void cook1(){
                 f1.setText("Better Homes & Gardens");
            }
            public void se1(){
                f1.setText("Clean Code: Handbook of Agile Software");
            }
        }

        public class Second {
            public void poet2(){
                 f2.setText("Milk and Honey");
            }            
            public void bio2(){
                f2.setText("In the Line of Fire: Pervaiz Musharraf");
            }
            public void nov2(){
                 f2.setText("A Tale of Two Cities");
            }
            public void cook2(){
                f2.setText("Betty Crocker's Cookbook.");
            }
            public void se2(){
                 f2.setText("Design Patterns: Elements of OOP Software");
            }      
        }
        
                public class Third {
            public void  poet3(){
                f3.setText("Out of the Corner");
            }
            public void  bio3(){
                f3.setText("Pakistan a personal History: Imran Khan");
            }
            public void  nov3(){
                f3.setText("The Lord of the Rings");
            }

            public void  cook3(){
                f3.setText("The Fannie Farmer Cookbook.");
            }
            public void  se3(){
                f3.setText("Patterns of Enterprise Applications");
            }
        }
        

        public class Fourth {
            public void poet4(){
                 f4.setText("What We Wish");
            }           
            public void nov4(){
                 f4.setText("The Little Prince");
            }
            public void se4(){
                 f4.setText("Enterprise Integration Patterns");
            }   
            public void cook4(){
                 f4.setText("the Art of French Cooking");
            }
            public void bio4(){
                 f4.setText("Meri Aapbeeti: Benazir Bhutto");
            } 
        }

        public class Fifth {
            public void poet5(){
                 f5.setText("In Love. Amy Bloom");
            }           
            public void nov5(){
                 f5.setText("Harry Potter and the Sorcerer's Stone");
            }
            public void se5(){
                 f5.setText("Code Complete:book of Software Construction");
            }    
            public void cook5(){
                 f5.setText("The New Basics Cookbook");
            }
            public void bio5(){
                 f5.setText("Controversially Yours : Shoaib Akhter");
            } 
        }
        
        public class Type {
            public void poet(){
                 title.setText("POETRY");
            }            
            public void nov(){
                 title.setText("NOVELS");
            }
            public void se(){
                 title.setText("SOFTWARE ENGINEERING");
            }              
            public void Cook(){
                 title.setText("COOK BOOKS");
            }           
            public void biotype(){
                 title.setText("BIOGRAPHY");
            }     
        }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        f1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        f5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(0, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Novels");
        jButton1.setMaximumSize(new java.awt.Dimension(125, 125));
        jButton1.setMinimumSize(new java.awt.Dimension(125, 125));
        jButton1.setPreferredSize(new java.awt.Dimension(125, 125));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(110, 170, 125, 40);

        jButton2.setBackground(new java.awt.Color(0, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Software");
        jButton2.setMaximumSize(new java.awt.Dimension(125, 125));
        jButton2.setMinimumSize(new java.awt.Dimension(125, 125));
        jButton2.setPreferredSize(new java.awt.Dimension(125, 125));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(110, 240, 125, 40);

        jButton3.setBackground(new java.awt.Color(0, 0, 102));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Poetry");
        jButton3.setMaximumSize(new java.awt.Dimension(125, 125));
        jButton3.setMinimumSize(new java.awt.Dimension(125, 125));
        jButton3.setPreferredSize(new java.awt.Dimension(125, 125));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(110, 390, 130, 40);

        jButton4.setBackground(new java.awt.Color(0, 0, 102));
        jButton4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Biography");
        jButton4.setMaximumSize(new java.awt.Dimension(125, 125));
        jButton4.setMinimumSize(new java.awt.Dimension(125, 125));
        jButton4.setPreferredSize(new java.awt.Dimension(125, 125));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(110, 310, 125, 40);

        jButton5.setBackground(new java.awt.Color(0, 0, 102));
        jButton5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Cook Books");
        jButton5.setMaximumSize(new java.awt.Dimension(125, 125));
        jButton5.setMinimumSize(new java.awt.Dimension(125, 125));
        jButton5.setPreferredSize(new java.awt.Dimension(125, 125));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(110, 460, 130, 40);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        f1.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        f1.setForeground(new java.awt.Color(0, 0, 102));

        f2.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        f2.setForeground(new java.awt.Color(0, 0, 102));

        f3.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        f3.setForeground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        jLabel2.setText("BOOK TYPE : ");

        jLabel3.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        jLabel3.setText("TOP BEST SELLERS");

        title.setBackground(new java.awt.Color(102, 0, 102));
        title.setFont(new java.awt.Font("Arial", 3, 17)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 102));

        f4.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        f4.setForeground(new java.awt.Color(0, 0, 102));

        f5.setFont(new java.awt.Font("Arial", 3, 19)); // NOI18N
        f5.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f5, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(f4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel3)
                    .addContainerGap(265, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(96, 96, 96)
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(126, 126, 126)
                    .addComponent(jLabel3)
                    .addContainerGap(225, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(310, 140, 490, 380);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel31.setFont(new java.awt.Font("Mistral", 1, 42)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Best Sellers");

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(353, 353, 353)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(604, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton6)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addGap(27, 27, 27))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1163, 110);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 845, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        BooksFacade NovelFacade = new BooksFacade();
        NovelFacade.Novels();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        BooksFacade SoftwareFacade = new BooksFacade();
        SoftwareFacade.SoftwareEng();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        BooksFacade PoetryFacade = new BooksFacade();
        PoetryFacade.Poetry();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BooksFacade BiographyFacade = new BooksFacade();
        BiographyFacade.Biography();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        BooksFacade CookFacade = new BooksFacade();
        CookFacade.CookBooks();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Dashboard db = new Dashboard();
        db.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(BestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BestSellers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BestSellers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel f5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
