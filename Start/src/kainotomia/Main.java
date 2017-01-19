/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kainotomia;

import java.net.UnknownHostException;

/**
 *n
 * @author Sonu
 */
public class Main {
    public static void main(String args[]) throws UnknownHostException
    {
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
    }
}
