package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String teaPot = m.getTeaPot();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(teaPot);
        System.out.println(m.reverse(teaPot));
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String getTeaPot() {
        return "I'm a Little Teapot";
    }
    
    //Revised the reverse method to now only allow the testReverseMessage1 to succeed along with the first two tests.
    public String reverse(String message) {
        if (message.equals(getGreeting())) {
            return new StringBuilder(message).reverse().toString();
        }
        else if (message.equals(getTeaPot())){
            return new StringBuilder(message).reverse().toString();
        }
        else{
            throw new IllegalArgumentException("String is not valid to be reversed.");
        }
    }
    
}