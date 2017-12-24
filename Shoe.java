/*
@author AnthonyBFreay
Dr. Mary-Angela Papalaskari
CSC 1051 - 002
17 November 2016
Project 10 - You've Got More Shoes!
*/
import java.text.*;
public class Shoe {
    //Attributes
    private String manufact;
    private String name;
    private double price;
    private int sku;
    private int likes;
    
    //Constructors
    Shoe (String m, String n, double p, int s, int l){
        manufact = m;
        name = n;
        price = p;
        sku = s;
        likes = l;
    }
    Shoe(String m, String n, double p, int s){
        manufact = m;
        name = n;
        price = p;
        sku = s;
        likes = 0;
    }
    
    //Methods
    public String toString(){
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return (name+" by "+manufact+", SKU: "+sku+" "+formatter.format(price)+"... "
                +likes+" likes");
    }
    public void setPrice(double p){
        price = p;
    }
    public String getManufact(){
        return manufact;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getLikes(){
        return likes;
    }
    public void like(){
        likes++;
    }
    public void like(int l){
        likes+=l;
    }
}
