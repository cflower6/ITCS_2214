/*

   Program: CustomerQueue ~ Driver Class
   Purpose: Creates a simulation or the customer class
   Date: 2/29/2015
   Author: Chris Flowers
 */


public class Driver {
    public static  QueueC Qc = new QueueC();
    public static void main(String[] args) {

        for(int i = 0;i < 60; i++) {
            System.out.println("Minute " + (i+1) + ": ");

            Qc.addNewCustomer();

            Qc.remove();




            System.out.println("---------------------------------------------------");

        }
        System.out.println("Max line of the whole simulation is: " + Qc.getMaxLine());
        System.out.println("Number of Customers serviced " + Qc.getTotalNumOfCust());
    }
}