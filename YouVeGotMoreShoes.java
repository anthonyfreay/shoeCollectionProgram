/*
@author AnthonyBFreay
Dr. Mary-Angela Papalaskari
CSC 1051 - 002
17 November 2016
Project 10 - You've Got More Shoes!
*/
public class YouVeGotMoreShoes {
    public static void main(String[] args){
        ShoeCollection shoes = new ShoeCollection();

        //Shoes for testing, NOT accurate shoes specifics
        shoes.addShoe("Rockport", "Rugged Bucks Boot", 119.95, 8187457, 16);
        shoes.addShoe("Timberland", "Earthkeepers Chukka", 107.99, 8163390, 50);
        shoes.addShoe("Nike SB", "Check Solar", 70.00, 8692447, 70);
        shoes.addShoe("adidas Skateboarding", "Seely", 65.00, 8123308, 65);
        shoes.addShoe("John Varvatos", "Reed Low", 359.99, 8765572, 90);
        shoes.addShoe("Vans", "Authentic", 49.99, 7255074, 800);
        shoes.addShoe("ASICS", "Tiger Gel-Lyte V", 120.00, 8779300, 117);
        shoes.addShoe("Puma", "Carson Health", 65.00, 8750587, 57);
        shoes.addShoe("New Balance", "M730v3", 79.95, 8681943, 43);
        shoes.addShoe("adidas", "Speedform Apollo 2 Clutch", 99.00, 
                8704748, 20);
        
        System.out.println(shoes);
        
        shoes.discount(20);        
        System.out.println(shoes);
        
        shoes.shuffle();        
        System.out.println(shoes);
        
        shoes.shuffle();        
        System.out.println(shoes);
        
        ShoeCollection C1 = shoes.filter("an");        
        System.out.println(C1);
        
        ShoeCollection C2 = shoes.filter("adidas");
        System.out.println(C2);
        
        ShoeCollection C3 = shoes.filterPopular(50);
        System.out.println(C3);
        
        ShoeCollection C4 = shoes.filterPopular(100);
        System.out.println(C4);
        
        
        
        
    }
}
