package com.revature.sre.day5.dp;

public class DessertFactory {//creational create a n object - with givne spec
	
    public static Dessert getDessert(String dessertType) {
        switch(dessertType) {
            case "cake":
                return new Cake();
            case "cookie":
                return new Cookie();
            case "ice cream":
                return new IceCream();
            case "k":
            	    return new Kheer();
            default: throw new DessertnotFoundException(dessertType + " not found!");
        }
    }

  
        public static void main(String[] args) {
            Dessert d1 = DessertFactory.getDessert("cake");
            Dessert d2 = DessertFactory.getDessert("cookie");
            Dessert d3 = DessertFactory.getDessert("ice cream");
            Dessert d4 = DessertFactory.getDessert("k");
            
            System.out.println(d1+ "  " + d2+"  "+d3  +"  "+d4);
         //  Dessert d5 = DessertFactory.getDessert("Kulfi");    // Throws DessertNotFoundException
        }
    }
