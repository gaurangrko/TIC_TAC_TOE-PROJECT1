
import static java.awt.Color.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class Tic_Tac_ToeFrame extends javax.swing.JFrame {

    
    private String turn;
    private int xCount;
    private int oCount;
    private int totalCount;
    
    public Tic_Tac_ToeFrame() {
        initComponents();
        turn="O";
        xCount=0;
        oCount=0;
        totalCount=0;
    }

    
    private void choosePlayer(){
        
        if(turn.equals("O")){
            
            turn = "X";
        }
        else{
            turn = "O";
        }
    }
    
    public void resetGame(){
        btn1.setText("");
         btn2.setText("");
          btn3.setText("");
           btn4.setText("");
            btn5.setText("");
             btn6.setText("");
              btn7.setText("");
               btn8.setText("");
                btn9.setText("");
                
                btn1.setBackground(white);
                btn2.setBackground(white);
                btn3.setBackground(white);
                btn4.setBackground(white);
                btn5.setBackground(white);
                btn6.setBackground(white);
                btn7.setBackground(white);
                btn8.setBackground(white);
                btn9.setBackground(white);
                
                totalCount=0;
    }
    public void invokeButton(JButton btn){

 if(!btn.getText().equals("")){
     
            return;
            
        }
          totalCount++;  // for draw case
        btn.setText(turn);
        
        if(turn.equals("O")){
            
            btn.setForeground(magenta);
            
        }
        
        else{
            
            btn.setForeground(red);
            
        }
        
        checkWin();
        choosePlayer();

}     
    public void updateScore(){
        xscore.setText(String.valueOf(xCount));
        oscore.setText(String.valueOf(oCount));
    }
    public void checkWin(){
        String b1=btn1.getText();
         String b2=btn2.getText();
          String b3=btn3.getText();
           String b4=btn4.getText();
            String b5=btn5.getText();
             String b6=btn6.getText();
              String b7=btn7.getText();
               String b8=btn8.getText();
                String b9=btn9.getText();
                
                //win condition 1
                if((b1.equals(b2) && b2.equals(b3)) && !b1.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn1.setBackground(orange);
                     btn2.setBackground(orange);
                      btn3.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                
                else if((b4.equals(b5) && b5.equals(b6)) && !b4.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn4.setBackground(orange);
                     btn5.setBackground(orange);
                      btn6.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                
                else if((b7.equals(b8) && b8.equals(b9)) && !b7.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn7.setBackground(orange);
                     btn8.setBackground(orange);
                      btn9.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                
                else if((b1.equals(b4) && b4.equals(b7)) && !b1.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn1.setBackground(orange);
                     btn4.setBackground(orange);
                      btn7.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
             
                else if((b2.equals(b5) && b5.equals(b8)) && !b2.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn2.setBackground(orange);
                     btn5.setBackground(orange);
                      btn8.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                
                else if((b3.equals(b6) && b6.equals(b9)) && !b3.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn3.setBackground(orange);
                     btn6.setBackground(orange);
                      btn9.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                else if((b1.equals(b5) && b5.equals(b9)) && !b1.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn1.setBackground(orange);
                     btn5.setBackground(orange);
                      btn9.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                
                else if((b3.equals(b5) && b5.equals(b7)) && !b3.equals("")){
                    
                    //showing dialog box after win; that this player has win
                    JOptionPane.showMessageDialog(this,"Player "+ turn + " wins" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                    
                    //for showing the background colour of buttons after win
                    btn3.setBackground(orange);
                     btn5.setBackground(orange);
                      btn7.setBackground(orange);
                      
                      if(turn.equals("O"))
                      {
                          oCount++;
                      }
                      else{
                          xCount++;
                      }
                      
                      updateScore();
                }
                else if(totalCount==9)
                {
                    JOptionPane.showMessageDialog(this,"Draw !" , "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE); 
                resetGame();
                }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        exitbtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xscore = new javax.swing.JLabel();
        oscore = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE GAME");
        setPreferredSize(new java.awt.Dimension(600, 500));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
        );

        btn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        exitbtn.setBackground(new java.awt.Color(255, 102, 0));
        exitbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitbtn.setText("EXIT");
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(0, 102, 255));
        resetbtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SCORECARD");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("PLAYER X");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setText("PLAYER O");

        xscore.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        xscore.setText("0");

        oscore.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        oscore.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(oscore))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(xscore)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(xscore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(oscore))
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
//         if(!btn2.getText().equals("")){
//            return;
//        }
//        btn2.setText(turn);
//        
//        if(turn.equals("O")){
//            btn2.setForeground(magenta);
//        }
//        
//        else{
//            btn2.setForeground(red);
//        }
//       
//        choosePlayer();

           invokeButton(btn2);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
       invokeButton(btn1);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
         invokeButton(btn3);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
       invokeButton(btn8);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
       invokeButton(btn7);
        
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
         invokeButton(btn5);
        
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        invokeButton(btn4);
        
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
         invokeButton(btn6);
        
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        invokeButton(btn9);
    }//GEN-LAST:event_btn9ActionPerformed

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here: 
        if(JOptionPane.showConfirmDialog(this,"Confirm if you want to Exit", "TIC TAC TOE", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitbtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        
        resetGame();
    }//GEN-LAST:event_resetbtnActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_ToeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel oscore;
    private javax.swing.JButton resetbtn;
    private javax.swing.JLabel xscore;
    // End of variables declaration//GEN-END:variables
}
