package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    //Revised the reverse method by adding a StringBuilder, making sure that the other three tests fail.
    public String reverse(String message) {
        if (message.equals(getGreeting())) {
            return new StringBuilder(message).reverse().toString();
        }
        else{
            throw new IllegalArgumentException("String is not valid to be reversed.");
        }
    }
    
}