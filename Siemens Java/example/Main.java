package example;

import java.text.BreakIterator;

public class Main {
     public static void main(String[] args) {

        Permit p1 = new Permit(15,"Nikhil Tumula");
        Bike b1 = new Bike("MH46-1111", "Honda");

        b1.setBikePermit(p1); //passing after bike is created
        
    }
    
}
