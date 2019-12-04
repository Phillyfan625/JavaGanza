package View;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LessonTemplate extends javax.swing.JFrame {

    /**
     * Creates new form LessonTemplate
     */
    int qNum = 0;
    public static int correctAnswers = 0;

    public LessonTemplate(int cAnswers) {
        initComponents();
        questions();
        correctAnswers = cAnswers;
    }

    public String[] questions(){

        String[] questions = new String[3];
        questions[0] = "Hello World Application";
        questions[1] = "Create a for loop";
        questions[2] = "Write a program that has your name in it";

        qNum = new Random().nextInt(questions.length);
        jLabel2.setText(questions[qNum]); 

        return questions;
    }

//    private void jLabel1ActionPerformed(java.awt.event.ActionEvent evt){
//        jLabel1.setText(questions().toString());
//        System.out.println(questions().toString());
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel1.setFont(new java.awt.Font("Detente", 1, 24)); // NOI18N
        jLabel1.setText("Lesson ");

        jLabel2.setText("Question here **");

        jLabel3.setText("Your answer below");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(144, 144, 144))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 108, 108))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(162, 162, 162))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:

            //take in text area1
            //take textarea1 to java
            //this creates a file called q1.java
            PrintWriter pw = new PrintWriter("q1.java");
            pw.write(jTextArea1.getText());
            pw.close();            

            String storeInput;            
            //turn that into command line
            //this below was hardcoded to a machine originally
            //storeInput = runCmd("javac C:\\Users\\peter.johnson\\Documents\\NetBeansProjects\\JavaGanza\\q1.java");

            //this below can get the specific directory you are in and is running command line promts with the file we made
            storeInput = runCmd("javac " +  new File("").getAbsolutePath() + "\\q1.java");
            if(!storeInput.equals("")){
                throw new Exception(storeInput);
            }
            //NO MORE HARDCODING!!!!!
            //storeInput = runCmd("echo Main-Class: q1 > C:\\Users\\peter.johnson\\Documents\\NetBeansProjects\\JavaGanza\\manifest.txt");
            storeInput = runCmd("echo Main-Class: q1 > " + new File("").getAbsolutePath() + "\\manifest.txt");

            //execute java file
            //storeInput = runCmd("java q1");
            //this runs the file
            storeInput = runCmd("java q1");
            //then gives the result of the file from the textbox
            JOptionPane.showMessageDialog(null,storeInput);

            //this is the case statement that checks the answer for questions
            switch(qNum){
                case 0:
                    q1(storeInput);                
                    break;
                case 1:
                    q2(storeInput);
                    break;
                case 2:
                    q3(storeInput);
                    break;
            }

            System.out.println(new File("").getAbsolutePath());
           //below is if the user gets it wrong it gives the error message 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LessonTemplate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(LessonTemplate.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }

        MainMenu mm = new MainMenu();
        mm.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    //these below are methods that are for each question
    //it has two responses if they get it right and wrong
    //prompts what the compiler resulted in
    //promts the number of correct answers
    public void q1(String storeInput){
        if(storeInput.equals("Hello World")){
           String result =("You've got it right!");
           correctAnswers++;
           JOptionPane.showMessageDialog(null,result);
           JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
       }
       else{
           String result = ("you suck");
           JOptionPane.showMessageDialog(null,result);
           JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
       }
    }
        
    public void q2(String storeInput){
        if(storeInput.equals("Hello World")){
            String result =("You've got it right!");
            correctAnswers++;
            JOptionPane.showMessageDialog(null,result);
            JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
        }
        else{
            String result = ("you suck");
            JOptionPane.showMessageDialog(null,result);
            JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
        }
    }

    public void q3(String storeInput){
        if(storeInput.equals("Hello World")){
           String result =("You've got it right!");
           correctAnswers++;
           JOptionPane.showMessageDialog(null,result);
           JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
       }
       else{
           String result = ("you suck");
           JOptionPane.showMessageDialog(null,result);
           JOptionPane.showMessageDialog(null,"Correct Answers: " + correctAnswers + "/3");
       }
    }

    public static String runCmd(String command) throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", command);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader r2 = new BufferedReader(new InputStreamReader(p.getErrorStream()));
        String line;
        String br = "";
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            br+= line;
            System.out.println(line);
        }

        return br;
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
            java.util.logging.Logger.getLogger(LessonTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LessonTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LessonTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LessonTemplate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LessonTemplate(0).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
