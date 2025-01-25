package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String teaPot = m.getTeaPot();
        String diddle = m.getDiddle();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(teaPot);
        System.out.println(m.reverse(teaPot));
        System.out.println(diddle);
        System.out.println(m.reverse(diddle));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String getTeaPot() {
        return "I'm a Little Teapot";
    }
    
    //Added a new method to print a new String
    public String getDiddle() {
        return "Hey Diddle Diddle";
    }
    
    //Reverse Method
    //Only Strings in this method are allowed to be reversed. 
    public String reverse(String message) {
        if (message.equals(getGreeting())) {
            return new StringBuilder(message).reverse().toString();
        }
        else if (message.equals(getTeaPot())){
            return new StringBuilder(message).reverse().toString();
        }
        //Added else-if statement to allow the method getDiddle() to be reversed.
        else if (message.equals(getDiddle())) {
            return new StringBuilder(message).reverse().toString();
        }
        else{
            throw new IllegalArgumentException("String is not valid to be reversed.");
        }
    }
    
}