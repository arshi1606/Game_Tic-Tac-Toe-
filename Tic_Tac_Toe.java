
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Arshi
 */
public class Tic_Tac_Toe extends javax.swing.JFrame {

    int turn = 2;
    int ButtonUsed[] = {0,0,0,0,0,0,0,0,0};
    int Player_X_won[] = {0,0,0,0,0,0,0,0,0};
    int Player_O_won[] = {0,0,0,0,0,0,0,0,0};
    
    int Player_X_won(){
          if(Player_X_won[0] == 1 && Player_X_won[1] == 1 && Player_X_won[2] == 1){ 
              return 1;
          }
           if(Player_X_won[3] == 1 && Player_X_won[4] == 1 && Player_X_won[5] == 1){ 
              return 1;
          }
            if(Player_X_won[6] == 1 && Player_X_won[7] == 1 && Player_X_won[8] == 1){ 
              return 1;
          }
             if(Player_X_won[0] == 1 && Player_X_won[4] == 1 && Player_X_won[8] == 1){ 
              return 1;
          }
              if(Player_X_won[2] == 1 && Player_X_won[4] == 1 && Player_X_won[6] == 1){ 
              return 1;
          }
               if(Player_X_won[0] == 1 && Player_X_won[3] == 1 && Player_X_won[6] == 1){ 
              return 1;
          }
                if(Player_X_won[1] == 1 && Player_X_won[4] == 1 && Player_X_won[7] == 1){ 
              return 1;
          }
                 if(Player_X_won[2] == 1 && Player_X_won[5] == 1 && Player_X_won[8] == 1){ 
              return 1;
          }
         return 0;        
     } 
     
     int Player_O_won(){
          if(Player_O_won[0] == 1 && Player_O_won[1] == 1 && Player_O_won[2] == 1){ 
              return 1;
          }
           if(Player_O_won[3] == 1 && Player_O_won[4] == 1 && Player_O_won[5] == 1){ 
              return 1;
          }
            if(Player_O_won[6] == 1 && Player_O_won[7] == 1 && Player_O_won[8] == 1){ 
              return 1;
          }
             if(Player_O_won[0] == 1 && Player_O_won[4] == 1 && Player_O_won[8] == 1){ 
              return 1;
          }
              if(Player_O_won[2] == 1 && Player_O_won[4] == 1 && Player_O_won[6] == 1){ 
              return 1;
          }
               if(Player_O_won[0] == 1 && Player_O_won[3] == 1 && Player_O_won[6] == 1){ 
              return 1;
          }
                if(Player_O_won[1] == 1 && Player_O_won[4] == 1 && Player_O_won[7] == 1){ 
              return 1;
          }
                 if(Player_O_won[2] == 1 && Player_O_won[5] == 1 && Player_O_won[8] == 1){ 
              return 1;
          }
         return 0;        
     } 
     
    public Tic_Tac_Toe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ResetButton = new javax.swing.JButton();
        t11 = new javax.swing.JButton();
        t21 = new javax.swing.JButton();
        t31 = new javax.swing.JButton();
        t32 = new javax.swing.JButton();
        t12 = new javax.swing.JButton();
        t22 = new javax.swing.JButton();
        t33 = new javax.swing.JButton();
        t13 = new javax.swing.JButton();
        t23 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBackground(new java.awt.Color(0, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.black);
        setResizable(false);

        ResetButton.setText("Play Again! Get One More Chance to Win");
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        t11.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t11.setForeground(new java.awt.Color(204, 51, 0));
        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });

        t21.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t21.setForeground(new java.awt.Color(204, 51, 0));
        t21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t21ActionPerformed(evt);
            }
        });

        t31.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t31.setForeground(new java.awt.Color(204, 51, 0));
        t31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t31ActionPerformed(evt);
            }
        });

        t32.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t32.setForeground(new java.awt.Color(204, 51, 0));
        t32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t32ActionPerformed(evt);
            }
        });

        t12.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t12.setForeground(new java.awt.Color(204, 51, 0));
        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });

        t22.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t22.setForeground(new java.awt.Color(204, 51, 0));
        t22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t22ActionPerformed(evt);
            }
        });

        t33.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t33.setForeground(new java.awt.Color(204, 51, 0));
        t33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t33ActionPerformed(evt);
            }
        });

        t13.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t13.setForeground(new java.awt.Color(204, 51, 0));
        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });

        t23.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        t23.setForeground(new java.awt.Color(204, 51, 0));
        t23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(t12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResetButton)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(t32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(t31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(t33, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ResetButton)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        if(ButtonUsed[0] == 0){
             if(turn%2==0){
                    turn++;
                    t11.setText("X");
                    ButtonUsed[0]= 1;
                    Player_X_won[0] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t11.setText("O");
                    ButtonUsed[0] = 1;
                    Player_O_won[0] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[1] == 0){
             if(turn%2==0){
                    turn++;
                    t12.setText("X");
                    ButtonUsed[1]= 1;
                    Player_X_won[1] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t12.setText("O");
                    ButtonUsed[1] = 1;
                    Player_O_won[1] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[2] == 0){
             if(turn%2==0){
                    turn++;
                    t13.setText("X");
                    ButtonUsed[2]= 1;
                    Player_X_won[2] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t13.setText("O");
                    ButtonUsed[2] = 1;
                    Player_O_won[2] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t21ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[3] == 0){
             if(turn%2==0){
                    turn++;
                    t21.setText("X");
                    ButtonUsed[3]= 1;
                    Player_X_won[3] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t21.setText("O");
                    ButtonUsed[3] = 1;
                    Player_O_won[3] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t22ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[4] == 0){
             if(turn%2==0){
                    turn++;
                    t22.setText("X");
                    ButtonUsed[4]= 1;
                    Player_X_won[4] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t22.setText("O");
                    ButtonUsed[4] = 1;
                    Player_O_won[4] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t23ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[5] == 0){
             if(turn%2==0){
                    turn++;
                    t23.setText("X");
                    ButtonUsed[5]= 1;
                    Player_X_won[5] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t23.setText("O");
                    ButtonUsed[5] = 1;
                    Player_O_won[5] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t31ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[6] == 0){
             if(turn%2==0){
                    turn++;
                    t31.setText("X");
                    ButtonUsed[6]= 1;
                    Player_X_won[6] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t31.setText("O");
                    ButtonUsed[6] = 1;
                    Player_O_won[6] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t32ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[7] == 0){
             if(turn%2==0){
                    turn++;
                    t32.setText("X");
                    ButtonUsed[7]= 1;
                    Player_X_won[7] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t32.setText("O");
                    ButtonUsed[7] = 1;
                    Player_O_won[7] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void t33ActionPerformed(java.awt.event.ActionEvent evt) {                                    
         if(ButtonUsed[8] == 0){
             if(turn%2==0){
                    turn++;
                    t33.setText("X");
                    ButtonUsed[8]= 1;
                    Player_X_won[8] = 1;
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
            else{
                    turn++;
                    t33.setText("O");
                    ButtonUsed[8] = 1;
                    Player_O_won[8] = 1 ; 
                    
                    int result1 = Player_X_won();
                    int result2 = Player_O_won();
                    
                    if(result1==1){
                        JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player X Won!!!");
                    }
                    else if(result2 == 1){
                         JOptionPane.showMessageDialog(rootPane,"Congrulations !!! Player O Won!!!");
                    }
            }
        }
        else{
                JOptionPane.showMessageDialog(rootPane,"This Button is Alreday Used ! Try Another");
                }
    }                                   

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
         t11.setText("");
         t12.setText("");
         t13.setText("");
         t21.setText("");
         t22.setText("");
         t23.setText("");
         t31.setText("");
         t32.setText("");
         t33.setText("");
         
         
         turn=2;
         for(int i =0 ; i <9 ; i++){
             ButtonUsed[i]=0;
         }
          for(int i =0 ; i <9 ; i++){
             Player_X_won[i]=0;
         }
           for(int i =0 ; i <9 ; i++){
             Player_O_won[i]=0;
         }
    }                                           

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
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tic_Tac_Toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tic_Tac_Toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton ResetButton;
    private javax.swing.JButton t11;
    private javax.swing.JButton t12;
    private javax.swing.JButton t13;
    private javax.swing.JButton t21;
    private javax.swing.JButton t22;
    private javax.swing.JButton t23;
    private javax.swing.JButton t31;
    private javax.swing.JButton t32;
    private javax.swing.JButton t33;
    // End of variables declaration                   
}
