import java.util.Random;

/*
            Program: CustomerQueue ~ Customer Class
            Purpose: This creates 2 customer objects into the queue, it also declares totalCust and MaxLength as a global variable
            Date: 2/29/2015
            Author: Chris Flowers
 */
public class QueueC {

    Customer first = new Customer();
    Customer last = new Customer();
    int totalCust = 0;

    int maxLength = 0;
    /*
     * Creates a default constructor
     */
    public QueueC(){
        first = null;
        last = null;
    }
    /*
     * add function, that takes the customer class and if the queue is empty then first will be newCust and so on.
     */
    public void add (Customer newCust){
        if(isEmpty()){
            first = newCust;
        }else{
            last.setNext(newCust);
        }
        last = newCust;
    }
 /*
  * remove function if it's not empty then start the decServiceTime() and when the the service is 0 then remove customer
  */

    public void remove(){
        if(!isEmpty()){

            first.decServiceTime();

            if(first.getServiceTime() == 0){
                first = first.getNext();
                System.out.println("A Customer has been serviced and removed from the line");
                totalCust++;
            }
        }
    }

    /*
     * This is the Empty function so if it's empty it will make first null;
     */
    public boolean isEmpty(){
        return first == null;
    }
    /*
     * Adds new customer object when requirements are met
     */
    public void addNewCustomer(){
        Random r = new Random();
        Customer newCust = new Customer();

        int chance = 0;

        chance = r.nextInt(4) + 1;

        if(chance == 1 ){
            add(newCust);
            maxLength++;
            System.out.println("A new Cusotomer has been added");
        }


    }
    /*
     * Gets the total customers serviced
     */
    public int getTotalNumOfCust(){

        return totalCust;
    }
    /*
     * gets the service time
     */
    public int getServiceTime(){

        return first.getServiceTime();

    }
    /*
     * gets decServiceTime()
     */
    public void decServiceTime(){
        first.decServiceTime();

    }
    /*
     * gets the maxmimum line of the whole simulation -- I didn't know if you wanted the total people in the whole line.
     */
    public int getMaxLine(){

        return maxLength;

    }








}