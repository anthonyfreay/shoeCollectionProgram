/*
@author AnthonyBFreay
Dr. Mary-Angela Papalaskari
CSC 1051 - 002
17 November 2016
Project 10 - You've Got More Shoes!
*/

import java.text.NumberFormat;

public class ShoeCollection {

    //Atributes
    private Shoe[] collection;
    private int count;
    private double totalCost;

    //Constructor
    public ShoeCollection(){
        collection = new Shoe[100];
        count = 0;
        totalCost = 0.0;
    }

    //Methods
    public void addShoe(String manufact, String name, double price, int sku, int likes){
        if(count == collection.length){
            increaseSize();
        }
        
        collection[count] = new Shoe(manufact, name, price, sku, likes);
        totalCost+= price;
        count++;
    }
    
    public void addShoe(Shoe a){
        if(count == collection.length){
            increaseSize();
        }
        
        collection[count] = a;
        totalCost += a.getPrice();
        count++;
    }
    
    public String toString(){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String report = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        report+="My Shoe Collection\n\n";
        
        report+="Number of Shoes: "+count+"\n";
        report+="Total cost: "+fmt.format(totalCost)+"\n";
        report+="Average Cost: "+fmt.format(totalCost/count);
        
        report+="\n\nShoe List:\n\n";
        
        for(int shoe = 0; shoe<count; shoe++){
            report+=collection[shoe].toString()+"\n";
        }
        
        return report;
    }
    
    public void shuffle(){
        for(int shuf = 0; shuf<10; shuf++){
            int a = (int)(Math.random()*10);
            int b = (int)(Math.random()*10);
            
            Shoe temp = collection[a];
            collection[a] = collection[b];
            collection[b] = temp;
        }
    }
    
    public void discount(int x){
        for(Shoe collection1 : collection){
            if(collection1 != null)
                collection1.setPrice((collection1.getPrice() 
                        - (collection1.getPrice()*(double)x/100)));
        }
    }
    
    public ShoeCollection filter(String x){
        ShoeCollection b = new ShoeCollection();
        for(int i = 0; i<collection.length; i++){
            if(collection[i] != null){
                String man = collection[i].getManufact();
                String nam = collection[i].getName();

                if(man.contains(x) || nam.contains(x)){
                    b.addShoe(collection[i]);
                }
            }
        }
        return b;
    }
    
    public ShoeCollection filterPopular(int x){
        ShoeCollection b = new ShoeCollection();
        for(int i = 0; i<collection.length; i++){
            if(collection[i] != null && collection[i].getLikes()>=x){
                b.addShoe(collection[i]);
            }
        }
        return b;
    }
    
    private void increaseSize(){
        Shoe[] temp = new Shoe[collection.length * 2];
        
        for(int shoe = 0; shoe<collection.length; shoe++){
            temp[shoe] = collection[shoe];
        }
        collection = temp;
    }
    
}
