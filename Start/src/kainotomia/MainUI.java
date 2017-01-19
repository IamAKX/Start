/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kainotomia;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Sonu
 */
public class MainUI extends javax.swing.JFrame {

    double width ,height;
int check=0;
    Vector v=new Vector();
    /**
     * Creates new form MainUI
     */
    public MainUI() throws UnknownHostException {
        initComponents();
         //server();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
width = screenSize.getWidth();
 height = screenSize.getHeight();
        setIcon();
         
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
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("START!! Server");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Enter this IP in your Android Device : ");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CONNECTION STATUS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Aharoni", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Waiting for the connection...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                        .addGap(41, 41, 41))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("START Server");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        final MainUI obj=new MainUI();
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             try
             {
                 Thread.sleep(4000);
             }
             catch(Exception e)
             {
                         
             }
                obj.setVisible(true);
            }
            
        });
          obj.server();
    
        
    }
    
     private void server() 
    {

float fx=0,fy=0,a,b,scalex=0,scaley=0;
                float x,y,x1 = 1,y1=1;
        	Socket clientsocket = null;
		ServerSocket serversocket=null;
		try
		{
                    
			serversocket =new ServerSocket(4444);
			
                        InetAddress ip=InetAddress.getLocalHost();
                        jLabel1.setText(jLabel1.getText()+ip.toString().substring(ip.toString().indexOf('/')+1));
                       
			
		}catch(Exception e)
		{
	}
		
				String mes;
		while(true)
		{
            try {
                clientsocket=serversocket.accept();
//                jLabel3.setText("You are connected");
//                System.out.println("Accepted");
                Scanner in1 = new Scanner(clientsocket.getInputStream());
                check++;
                if(check!=0)
                    {
                        
                    }
                if(in1.hasNext())
                {
                   
                    mes=in1.nextLine();
                    if(! checkExistance(mes))
                    {	v.add(mes);
                System.out.println("Launching : "+mes);
                  
                    Process p = null;
                    String filePath = mes;
                    try {
                        if(mes.substring(0,1).equalsIgnoreCase("*"))
                        {
                            jPanel1.setBackground(Color.green);
                        jLabel3.setText("You are connected");
                         x1=Float.parseFloat(mes.substring(mes.indexOf('x')+1,mes.indexOf('y')));
                            y1=Float.parseFloat(mes.substring(mes.indexOf('y')+1));
                        }
                        else
                            if("leftclick".equals(mes))
                            {
                                Robot robot = new Robot();
 
            // LEFT CLICK
                                 robot.mousePress(InputEvent.BUTTON1_MASK);
                                // robot.delay(100);
                                 robot.mouseRelease(InputEvent.BUTTON1_MASK);
                            }
                        else
                              if("rightclick".equals(mes))
                            {
                                Robot robot = new Robot();
 
            // Right CLICK
                                  robot.mousePress(InputEvent.BUTTON3_MASK);
                                  //robot.delay(100);
                                  robot.mouseRelease(InputEvent.BUTTON3_MASK);
                            }
                        else
                        if(mes.substring(0,1).equalsIgnoreCase("#"))
                        {
//                            
                            x= Float.parseFloat(mes.substring(mes.indexOf('x')+1,mes.indexOf('y')));
                            y= Float.parseFloat(mes.substring(mes.indexOf('y')+1));
                            robot((int)x,(int)y);
                        }else
                        if(mes=="iexplore")
                        { p = Runtime.getRuntime().exec("C:\\Program Files\\Internet Explorer\\iexplore.exe");
                         p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
                        }                        else
                        {  p = Runtime.getRuntime().exec("cmd /c start "+mes);
                         p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
                        } 
                        // p.waitFor(1000, TimeUnit.DAYS);
                        //				p.destroy();
//                        p = Runtime.getRuntime().exec("cmd /c start taskkill /im cmd.exe /f");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    
                    
                    }
                    
                }
            } catch (IOException ex) {
                Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
            }
			
		}
    }
    
    
    
    boolean checkExistance(String s)
	{
		for(int i=0;i<v.size();i++)
		{
			if(v.elementAt(i)==s)
			{
				
			}
			
			
		}
		return false;
		
	}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
       
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconabc.png")));
    }

    public void robot(int x, int y)
     {
    try {
        Robot r=new Robot();
        r.mouseMove(x, y);
    } catch (AWTException ex) {
        Logger.getLogger(MainUI.class.getName()).log(Level.SEVERE, null, ex);
    }
     }
}
