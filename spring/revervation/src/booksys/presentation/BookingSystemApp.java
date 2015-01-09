/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

package booksys.presentation ;

import javax.swing.*;
import javax.swing.plaf.MenuBarUI;

//import java.awt.* ;
//import java.awt.event.* ;

public class BookingSystemApp
  extends JFrame
{
  private StaffUI ui ;

  public BookingSystemApp()
  {
    setTitle("Restaurant Booking System") ;
    setResizable(false) ;
    
    setJMenuBar(new JMenuBar()) ;
    
    JMenu fileMenu = new JMenu("File") ;
    getJMenuBar().add(fileMenu) ;

    JMenuItem quit = new JMenuItem("Quit") ;
    quit.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  System.exit(0) ;
	}
      }) ;
    fileMenu.add(quit) ;
    
    JMenu dateMenu = new JMenu("Date") ;
    getJMenuBar().add(dateMenu) ;

    JMenuItem display = new JMenuItem("Display...") ;
    display.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  ui.displayDate() ;
	}
      }) ;
    dateMenu.add(display) ;
    
    JMenu bookingMenu = new JMenu("Booking") ;
    getJMenuBar().add(bookingMenu) ;
    
    JMenuItem newReservation = new JMenuItem("New Reservation...") ;
    newReservation.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  ui.addReservation() ;
	}
      }) ;
    bookingMenu.add(newReservation) ;

    JMenuItem newWalkIn = new JMenuItem("New Walk-in...") ;
    newWalkIn.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  ui.addWalkIn() ;
	}
      }) ;
    bookingMenu.add(newWalkIn) ;

    JMenuItem cancel = new JMenuItem("Cancel") ;
    cancel.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  ui.cancel() ;
	}
      });
    bookingMenu.add(cancel) ;

    JMenuItem recordArrival = new JMenuItem("Record Arrival") ;
    recordArrival.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent e) {
	  ui.recordArrival() ;
	}
      });
    bookingMenu.add(recordArrival) ;
    
    this.addWindowListener(new java.awt.event.WindowAdapter() {
	public void windowClosing(java.awt.event.WindowEvent e) {
	  System.exit(0) ;
	}
      }) ;

    ui = new StaffUI(this) ;
    this.add(ui) ;

    this.pack() ;
    this.show() ;
  }
  
  public static void main(String args[])
  {
    new BookingSystemApp() ;
  }
}
