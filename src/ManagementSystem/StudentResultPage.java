/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ManagementSystem;

import ConnectionProvider.ConnectionProvider;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author swati
 */
public class StudentResultPage extends javax.swing.JFrame {

    /**
     * Creates new form StudentResultPage
     */
    public StudentResultPage() {
        initComponents();
    }
    public StudentResultPage(String RollNo) {
        initComponents();
        jTextField2.setText(RollNo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(810, 510));
        setMinimumSize(new java.awt.Dimension(810, 510));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Class");
        jLabel1.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel1.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 71, -1, -1));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Roll No");
        jLabel2.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Father Name");
        jLabel3.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 100, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Section");
        jLabel4.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, -1, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Student Name");
        jLabel5.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel5.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel5.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Gender");
        jLabel6.setMaximumSize(new java.awt.Dimension(90, 20));
        jLabel6.setMinimumSize(new java.awt.Dimension(90, 20));
        jLabel6.setPreferredSize(new java.awt.Dimension(90, 20));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, -1, -1));

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField1.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField1.setPreferredSize(new java.awt.Dimension(120, 20));
        jTextField1.setRequestFocusEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, -1, 30));

        jTextField2.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField2.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField2.setPreferredSize(new java.awt.Dimension(120, 20));
        jTextField2.setRequestFocusEnabled(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 30));

        jTextField3.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField3.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField3.setPreferredSize(new java.awt.Dimension(120, 20));
        jTextField3.setRequestFocusEnabled(false);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 30));

        jTextField4.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField4.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField4.setPreferredSize(new java.awt.Dimension(120, 20));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, 30));

        jTextField5.setBackground(new java.awt.Color(204, 204, 204));
        jTextField5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField5.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField5.setPreferredSize(new java.awt.Dimension(120, 20));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, 30));

        jTextField6.setBackground(new java.awt.Color(204, 204, 204));
        jTextField6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setMaximumSize(new java.awt.Dimension(120, 20));
        jTextField6.setMinimumSize(new java.awt.Dimension(120, 20));
        jTextField6.setPreferredSize(new java.awt.Dimension(120, 20));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("English");
        jLabel7.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel7.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel7.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Hindi");
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Mathematics");
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel9.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 110, -1));

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Science");
        jLabel10.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel10.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel10.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 470, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Social Studies");
        jLabel11.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel11.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, 110, -1));

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Total Marks");
        jLabel12.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel12.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel12.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Passing Marks");
        jLabel13.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel13.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel13.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 110, -1));

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Marks Obtained");
        jLabel14.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel14.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel14.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, 130, -1));

        jLabel15.setBackground(new java.awt.Color(204, 204, 204));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("100");
        jLabel15.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel15.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel15.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("100");
        jLabel16.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel16.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel16.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, -1));

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("100");
        jLabel17.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel17.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel17.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("100");
        jLabel18.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel18.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel18.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("100");
        jLabel19.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel19.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel19.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("33");
        jLabel20.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel20.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel20.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("33");
        jLabel21.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel21.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel21.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("33");
        jLabel22.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel22.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel22.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("33");
        jLabel23.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel23.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel23.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 470, -1, -1));

        jLabel24.setBackground(new java.awt.Color(204, 204, 204));
        jLabel24.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("33");
        jLabel24.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel24.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel24.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, -1, -1));

        jTextField7.setBackground(new java.awt.Color(204, 204, 204));
        jTextField7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField7.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField7.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, 30));

        jTextField8.setBackground(new java.awt.Color(204, 204, 204));
        jTextField8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField8.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField8.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, 30));

        jTextField9.setBackground(new java.awt.Color(204, 204, 204));
        jTextField9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField9.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField9.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, -1, 30));

        jTextField10.setBackground(new java.awt.Color(204, 204, 204));
        jTextField10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField10.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField10.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 460, -1, 30));

        jTextField11.setBackground(new java.awt.Color(204, 204, 204));
        jTextField11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 0));
        jTextField11.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField11.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField11.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, -1, 30));

        jLabel25.setBackground(new java.awt.Color(204, 204, 204));
        jLabel25.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Total");
        jLabel25.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel25.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel25.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 550, -1, -1));

        jTextField12.setBackground(new java.awt.Color(204, 204, 204));
        jTextField12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField12.setForeground(new java.awt.Color(0, 0, 0));
        jTextField12.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField12.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField12.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, 30));

        jLabel26.setBackground(new java.awt.Color(204, 204, 204));
        jLabel26.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Verdict");
        jLabel26.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel26.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel26.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 550, -1, -1));

        jTextField13.setBackground(new java.awt.Color(204, 204, 204));
        jTextField13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(0, 0, 0));
        jTextField13.setMaximumSize(new java.awt.Dimension(100, 20));
        jTextField13.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextField13.setPreferredSize(new java.awt.Dimension(100, 20));
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, -1, 30));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFolder/icons8-logout-rounded-24.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageFolder/corridoor.jpg"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int flag=JOptionPane.showConfirmDialog(null,"Are you sure to Logout?", "Submit!", JOptionPane.YES_NO_OPTION);
        if(flag==0) {
            setVisible(false);
            HomePage frame=new HomePage();
            frame.setVisible(true);
            frame.setLocationRelativeTo(null);
        } else {
            setVisible(true);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String RollNo=jTextField2.getText();
        try{
            Connection con=ConnectionProvider.getCon();
            Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=st.executeQuery("SELECT*FROM student INNER JOIN result WHERE student.RollNo='"+RollNo+"' AND result.rollNo='"+RollNo+"'");
            
            if(!rs.first()){
                JOptionPane.showMessageDialog(null,"RollNo doesn't exist");
            }
            else{
                //check the numbering of these below

                jTextField1.setText(rs.getString(2));
                jTextField3.setText(rs.getString(5));
                jTextField4.setText(rs.getString(3));
                jTextField5.setText(rs.getString(4));
                jTextField6.setText(rs.getString(6));
                
                jTextField7.setText(rs.getString(8));
                jTextField8.setText(rs.getString(9));
                jTextField9.setText(rs.getString(10));
                jTextField10.setText(rs.getString(11));
                jTextField11.setText(rs.getString(12));
                
                int total=0;
                total=Integer.parseInt(jTextField7.getText())+Integer.parseInt(jTextField8.getText())+Integer.parseInt(jTextField9.getText())+Integer.parseInt(jTextField10.getText())+Integer.parseInt(jTextField11.getText());
                jTextField12.setText(String.valueOf(total));
                
                int m1=Integer.parseInt(rs.getString(8));
                int m2=Integer.parseInt(rs.getString(9));
                int m3=Integer.parseInt(rs.getString(10));
                int m4=Integer.parseInt(rs.getString(11));
                int m5=Integer.parseInt(rs.getString(12));
                
                if(m1<33 || m2<33 || m3<33 || m4<33 || m5<33){
                    jTextField13.setText("Fail");
                }
                else{
                    jTextField13.setText("Pass");
                }
                
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
                jTextField3.setEditable(false);
                jTextField4.setEditable(false);
                jTextField5.setEditable(false);
                jTextField6.setEditable(false);
                jTextField7.setEditable(false);
                jTextField8.setEditable(false);
                jTextField9.setEditable(false);
                jTextField10.setEditable(false);
                jTextField11.setEditable(false);
                jTextField12.setEditable(false);
                jTextField13.setEditable(false);
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResultPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StudentResultPage frame=new StudentResultPage();
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
