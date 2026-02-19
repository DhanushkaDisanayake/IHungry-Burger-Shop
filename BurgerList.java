package BurgerShop.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BurgerList {
    
    private static Node first;
    
    private static String[] customerIdAr;
    private static String[] customerNameAr;
    private static double[] totalAmountAr;
    private static int[] burgerQuantityAr;
    private static String[] orderIdAr;
    
    public static void addBurgerOrder(BurgerOrder order){
        Node node = new Node(order);
        if (getFirst()==null){
            setFirst(node);
        }else{
            Node temp = getFirst();
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }
    
    public static int size(){
        int size=0;
        Node temp = getFirst();
        
        while(temp!=null){
            size++;
            temp = temp.getNext();
        }
        return size;
    }
    
    public static int getCustomerIdIndex(String customerId){
        Node temp = getFirst();
        int count = 0;
        
        while (temp!=null){
            if (customerId.equalsIgnoreCase(temp.getOrder().getCustomerId())) {
                return count;
            }
            temp = temp.getNext();
            count++;
        }
        return -1;
    }

    
   public static void sortOrdersByTotalDecending(){
	
        for (int i = 0; i < totalAmountAr.length-1; i++){
            for (int j = 0; j < totalAmountAr.length-1-i; j++){

                if (totalAmountAr[j]<totalAmountAr[j+1]){

                    double temp1 = totalAmountAr[j];
                    totalAmountAr[j] = totalAmountAr[j+1];
                    totalAmountAr[j+1] = temp1;

                    String temp2 = customerIdAr[j];
                    customerIdAr[j] = customerIdAr[j+1];
                    customerIdAr[j+1] = temp2;

                    String temp3 = customerNameAr[j];
                    customerNameAr[j] = customerNameAr[j+1];
                    customerNameAr[j+1] = temp3;
                }
            }
        }
    }
    
    public static int getOrderIdIndex(String orderId){
        Node temp = getFirst();
        int count = 0;
        
        while (temp!=null){
            if (orderId.equalsIgnoreCase(temp.getOrder().getOrderId())) {
                return count;
            }
            temp = temp.getNext();
            count++;
        }
        return -1;
    }
    
    public static void addUpdateOrder(int index,BurgerOrder order){
        Node temp = first;
        
        for (int i = 0; i < index; i++) {
            if (i==index) {
                temp.setOrder(order);
            }
            temp = temp.getNext();
        }
    }
    
    public static BurgerOrder searchOrderUpdate(String orderId) {
        Node temp = first;
        
        while (temp!=null) {
            if (orderId.equalsIgnoreCase(temp.getOrder().getOrderId())) {
                return temp.getOrder();
            }
            temp = temp.getNext();
        }
        return null;
    }

    /**
     * @return the customerIdAr
     */
    public static String[] getCustomerIdAr() {
        return customerIdAr;
    }

    /**
     * @return the customerNameAr
     */
    public static String[] getCustomerNameAr() {
        return customerNameAr;
    }
    
    /**
     * @return the totalAmountAr
     */
    public static double[] getTotalAmountAr() {
        return totalAmountAr;
    }

    /**
     * @return the burgerQuantityAr
     */
    public static int[] getBurgerQuantityAr() {
        return burgerQuantityAr;
    }

    /**
     * @return the orderIdAr
     */
    public static String[] getOrderIdAr() {
        return orderIdAr;
    }

    /**
     * @param aCustomerIdAr the customerIdAr to set
     */
    public static void setCustomerIdAr(String[] aCustomerIdAr) {
        customerIdAr = aCustomerIdAr;
    }

    /**
     * @param aCustomerNameAr the customerNameAr to set
     */
    public static void setCustomerNameAr(String[] aCustomerNameAr) {
        customerNameAr = aCustomerNameAr;
    }

    /**
     * @param aTotalAmountAr the totalAmountAr to set
     */
    public static void setTotalAmountAr(double[] aTotalAmountAr) {
        totalAmountAr = aTotalAmountAr;
    }

    /**
     * @param aBurgerQuantityAr the burgerQuantityAr to set
     */
    public static void setBurgerQuantityAr(int[] aBurgerQuantityAr) {
        burgerQuantityAr = aBurgerQuantityAr;
    }

    /**
     * @param aOrderIdAr the orderIdAr to set
     */
    public static void setOrderIdAr(String[] aOrderIdAr) {
        orderIdAr = aOrderIdAr;
    }

    /**
     * @return the first
     */
    public static Node getFirst() {
        return first;
    }
    
    public String[] getCustomerIdArray(){
        return getCustomerIdAr();
    } 
    
    public String[] getCustomerNameArray(){
        return getCustomerNameAr();
    } 
    
    public double[] getTotalAmountArray(){
        return getTotalAmountAr();
    }
    
    /**
     * @param aFirst the first to set
     */
    public static void setFirst(Node aFirst) {
        first = aFirst;
    }
}