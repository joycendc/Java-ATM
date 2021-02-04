package projectatm;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static projectatm.Login.path;

public class Main extends javax.swing.JFrame {

    String userpath="";
    Date d = new Date();
    DateFormat df = new SimpleDateFormat("MM-dd-yyyy    hh:mm:ss a");
    DateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
    public Main() {
        
    }

    Main(String value) {
        initComponents(); 
        userpath = value;
        jFrame1.getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 3));
        jFrame1.getRootPane().setDefaultButton(ok);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.black, 3));       
        getData();
        men2.setVisible(false);
        accbt.setVisible(false);
        outbt.setVisible(false);
        load();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        choice = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablelogs = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        men2 = new javax.swing.JLabel();
        accbt = new javax.swing.JLabel();
        outbt = new javax.swing.JLabel();
        men1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        acc = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loadbt = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bal1 = new javax.swing.JLabel();

        jFrame1.setUndecorated(true);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("1.    BALANCE INQUIRY");

        jLabel6.setText("2.    DEPOSIT");

        jLabel8.setText("3.    WITHDRAW");

        jLabel9.setText("ENTER CHOICE");

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ok.setText("OK");
        ok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 255, 255));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 86, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(jLabel6)
                .addGap(39, 39, 39)
                .addComponent(jLabel8)
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(choice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tablelogs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DATE", "ACTION", "BALANCE"
            }
        ));
        jScrollPane1.setViewportView(tablelogs);
        if (tablelogs.getColumnModel().getColumnCount() > 0) {
            tablelogs.getColumnModel().getColumn(0).setResizable(false);
            tablelogs.getColumnModel().getColumn(1).setResizable(false);
            tablelogs.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.setOpaque(false);

        men2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        men2.setText("MENU");
        men2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                men2MouseClicked(evt);
            }
        });

        accbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accbt.setText("ACCOUNT");
        accbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accbtMouseClicked(evt);
            }
        });

        outbt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        outbt.setText("LOGOUT");
        outbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                outbtMouseClicked(evt);
            }
        });

        men1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        men1.setText("MENU");
        men1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                men1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(outbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(men1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(men2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(men2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(men1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accbt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outbt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("WELCOME");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setText("jLabel2");
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("LAST LOG");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        date.setText("null");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("SAVINGS ACCOUNT");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        acc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        acc.setText("jLabel6");
        jPanel3.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("AVAILABLE BALANCE");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        bal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bal.setText("jLabel8");
        jPanel3.add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("TRANSACTION HISTORY");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, 30));

        loadbt.setBackground(new java.awt.Color(255, 255, 255));
        loadbt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loadbt.setText("LOAD");
        loadbt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        loadbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadbtMouseClicked(evt);
            }
        });
        loadbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadbtActionPerformed(evt);
            }
        });
        jPanel3.add(loadbt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("-");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setOpaque(false);
        jButton1.setRequestFocusEnabled(false);
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 30, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("x ");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.setOpaque(false);
        jButton2.setRequestFocusEnabled(false);
        jButton2.setVerifyInputWhenFocusTarget(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 40, 30));

        bal1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bal1.setText("PHP :");
        jPanel3.add(bal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void load(){
       DefaultTableModel model = (DefaultTableModel)tablelogs.getModel(); 
       if(model.getRowCount()==0){
           loadLogs();
       }else{
            
       }
    }
    private void men2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_men2MouseClicked
        hideButton();
    }//GEN-LAST:event_men2MouseClicked

    private void men1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_men1MouseClicked
        men1.setVisible(false);
        men2.setVisible(true);
        accbt.setVisible(true);
        outbt.setVisible(true);
    }//GEN-LAST:event_men1MouseClicked

    private void loadbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadbtActionPerformed
    private void loadLogs(){
        DefaultTableModel model = (DefaultTableModel)tablelogs.getModel();
        try{           
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+"log.txt"));
            String s = "";
            while((s = br.readLine()) != null){
                String data[] = new String[3];
                data = s.split(",");
                Object row[] = new Object[3];
                row[0] = data[0];
                row[1] = data[1];
                row[2] = data[2];
                model.addRow(row);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"mali yonnn"+e+"asdasd");
        }
    }
    private void hideButton(){
        men1.setVisible(true);
        men2.setVisible(false);
        accbt.setVisible(false);
        outbt.setVisible(false);
    }
    private void accbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accbtMouseClicked
        hideButton();
        this.setState(ICONIFIED);
        jFrame1.setSize(271,304);
        jFrame1.setLocationRelativeTo(null);
        jFrame1.setVisible(true);
        choice.requestFocus();
    }//GEN-LAST:event_accbtMouseClicked

    private void outbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_outbtMouseClicked
        hideButton();
        int log = JOptionPane.showConfirmDialog(null,"Are you sure to logout ?","",0,2);
        if(log==0){
            writeLog();
            this.setVisible(false);
            this.dispose();
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_outbtMouseClicked
    private void writeLog(){
        try{
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+".txt"));
            String s = "";
            s = br.readLine();
            sb.append(s);
            sb.append("\n"+df.format(new Date()));
            File f = new File(path+""+userpath+".txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(f, false));
            pw.append(sb.toString());
            pw.close();
        }catch(Exception e){}
    }
    private void loadbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadbtMouseClicked
        DefaultTableModel model = (DefaultTableModel)tablelogs.getModel();
        model.setRowCount(0);
        loadLogs();
        
    }//GEN-LAST:event_loadbtMouseClicked
    private double getBalance(){
        double val=0;
        try{           
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+".txt"));
            String s = "";
            s = br.readLine();
            String data[] = new String[10];
            data = s.split(",");
            val = Double.parseDouble(data[9]);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Invalid File");
        }finally{
            return val;
        }
    }
    private void setDepositBalance(double amount){
        double newbal=0;
        try{
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+".txt"));
            String s = "";
            s = br.readLine();
            String data[] = new String[10];
            data = s.split(",");
            newbal = Double.parseDouble(data[9])+amount;
            String row = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4]  + "," + data[5] + "," + data[6] +","+ data[7] +","+ data[8] +","+ newbal+"\n";
            String datelog = br.readLine();
            sb.append(row);  
            sb.append(datelog);               
            File f = new File(path+""+userpath+".txt");
            PrintWriter pw = new PrintWriter(new FileOutputStream(f, false));
            pw.append(sb.toString());
            pw.close();
        }catch(Exception e){}
        try{
            File f2 = new File(path+""+userpath+"log.txt");
            PrintWriter pw2 = new PrintWriter(new FileOutputStream(f2, true));
            pw2.append(sdf.format(new Date()) +"," + "deposit" + "," + amount+"\n");
            pw2.close();
        }catch(Exception e){}
        finally{
            JOptionPane.showMessageDialog(null,"Deposit Successful !");
        }
    }
    private void setWithdrawBalance(double amount){
        double newbal=0;
        try{
            StringBuffer sb = new StringBuffer();
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+".txt"));
            String s = "";
            s = br.readLine();
            String data[] = new String[10];
            data = s.split(",");
            if(Double.parseDouble(data[9])>=amount){
                newbal = Double.parseDouble(data[9])-amount;
                String row = data[0] + "," + data[1] + "," + data[2] + "," + data[3] + "," + data[4]  + "," + data[5] + "," + data[6] +","+ data[7] +","+ data[8] +","+ newbal+"\n";
                String datelog = br.readLine();
                sb.append(row);  
                sb.append(datelog);
                File f = new File(path+""+userpath+".txt");
                PrintWriter pw = new PrintWriter(new FileOutputStream(f, false));
                pw.append(sb.toString());
                pw.close();
                try{
                    File f2 = new File(path+""+userpath+"log.txt");
                    PrintWriter pw2 = new PrintWriter(new FileOutputStream(f2, true));
                    pw2.append(sdf.format(new Date()) +"," + "withdraw" + "," + amount+"\n");
                    pw2.close();
                    JOptionPane.showMessageDialog(null,"Withdraw Successful !");
                }catch(Exception e){}
            }else{
                JOptionPane.showMessageDialog(null,"Insufficient Balance !");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Reading File !");
        }
    }
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        if(choice.getText().equals("1")){
            JOptionPane.showMessageDialog(null,"Current Balance :"+getBalance());
            try{
                File f2 = new File(path+""+userpath+"log.txt");
                PrintWriter pw2 = new PrintWriter(new FileOutputStream(f2, true));
                pw2.append(sdf.format(new Date()) +"," + "inquiry" + "," + getBalance()+"\n");
                pw2.close();
            }catch(Exception e){}
            choice.setText("");
        }else if(choice.getText().equals("2")){
            double deposit = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Amount :"));
            setDepositBalance(deposit);
            choice.setText("");
        }else if(choice.getText().equals("3")){
            double withdraw = Double.parseDouble(JOptionPane.showInputDialog(null,"Enter Amount to Withdraw :"));
            setWithdrawBalance(withdraw);
            choice.setText("");
        }else{
            JOptionPane.showMessageDialog(null,"Invalid Choice !");
            choice.setText("");
        }
    }//GEN-LAST:event_okActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        jFrame1.setVisible(false);
        this.setState(NORMAL);
        getData();
        //new Main(userpath).setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        writeLog();
        System.exit(0);        
//        this.dispose();
//        new Login().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public String getLogDate(){
        String date="";
        try{
            BufferedReader br = new BufferedReader( new FileReader(path+""+userpath+".txt"));
            br.readLine();
            String s = br.readLine();
            date = s;
        }catch(Exception e){
            date = df.format(new Date());
        }
        return date;
    }
    public void getData(){
        try{
            BufferedReader br = new BufferedReader(new FileReader(path+""+userpath+".txt"));
            String s = "";
            s = br.readLine();
            String data[] = new String[10];
            data = s.split(",");
            name.setText(data[2]+" "+data[3]+" "+data[4]);
            date.setText(getLogDate());
            acc.setText(data[5]);
            bal.setText(data[9]);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"mali yonnn");
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc;
    private javax.swing.JLabel accbt;
    private javax.swing.JLabel bal;
    private javax.swing.JLabel bal1;
    private javax.swing.JTextField choice;
    private javax.swing.JLabel date;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadbt;
    private javax.swing.JLabel men1;
    private javax.swing.JLabel men2;
    private javax.swing.JLabel name;
    private javax.swing.JButton ok;
    private javax.swing.JLabel outbt;
    private javax.swing.JTable tablelogs;
    // End of variables declaration//GEN-END:variables
}
