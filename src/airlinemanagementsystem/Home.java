/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlinemanagementsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
/**
 *
 * @author kanis
 */

public class Home extends JFrame implements ActionListener {
    public Home(){
    setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/icons/front.jpg"));
    JLabel image=new JLabel(i1);
    image.setBounds(0,0,1600,800);
    add(image);
    
    JLabel heading=new JLabel("AIR INDIA WELCOMES YOU");
    heading.setBounds(500,40,1000,40);
    image.add(heading);
    
   setExtendedState(JFrame.MAXIMIZED_BOTH);
   setLocation(600,250);
   heading.setForeground(Color.BLUE);
   heading.setFont(new Font("Tahoma",Font.PLAIN,36));
   
   
   JMenuBar menubar=new JMenuBar();
   setJMenuBar(menubar);
   JMenu details=new JMenu("Details");
   
   JMenuItem flightDetails=new JMenuItem("Flight Details");
   flightDetails.addActionListener(this);
   details.add(flightDetails);
   
    JMenuItem customerdetails=new JMenuItem("Customer Details");
    customerdetails.addActionListener(this);
   details.add(customerdetails);
   
   
    JMenuItem reservationDetails=new JMenuItem("Reservation Details");
    
   details.add(reservationDetails);
   
   
    JMenuItem bookflight=new JMenuItem("Book Flight ");
    bookflight.addActionListener(this);
   details.add(bookflight);
   
   
    JMenuItem JourneyDetails=new JMenuItem("Journey Details");
    JourneyDetails.addActionListener(this);
   details.add(JourneyDetails);
   
   JMenuItem Cancellation=new JMenuItem("Cancel Tickets");
   details.add(Cancellation);
   
   JMenu ticket=new JMenu("Ticket");
   menubar.add(ticket);
   
   JMenuItem boardingpass=new JMenuItem("Boarding Pass");
   ticket.add(boardingpass);
   
   
   
   
   
   
   menubar.add(details);
   setVisible(true);
   
   
   
   
   
}
    public void actionPerformed(ActionEvent ae){
       String text=ae.getActionCommand();
       if(text.equals("Customer Details")){
           new AddCustomer();
       }else if(text.equals("Flight Details")){
           new FlightInfo();
       }else if(text.equals("Book Flight ")){
           new BookFlight();
       }else if(text.equals("Journey Details")){
           new JourneyDetails();
       }
    }
    public static void main(String[] args){
        new Home();
    }
}
