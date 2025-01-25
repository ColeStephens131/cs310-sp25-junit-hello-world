package edu.jsu.mcis.cs310;

public class Main {

    public static void main(String[] args) {
        
        Main m = new Main();
        String message = m.getGreeting();
        String teaPot = m.getTeaPot();
        String diddle = m.getDiddle();
        String hickory = m.getHickory();
        //Added a new method call
        String person = m.getPerson();
        
        System.out.println(message);
        System.out.println(m.reverse(message));
        System.out.println(teaPot);
        System.out.println(m.reverse(teaPot));
        System.out.println(diddle);
        System.out.println(m.reverse(diddle));
        //Added a new Print Statement
        System.out.println(hickory);
        System.out.println(m.reverse(hickory));
        //Added a new Print Statement
        System.out.println(person);
        
    }
    
    public String getGreeting() {
        return "Hello, World!";
    }
    
    public String getTeaPot() {
        return "I'm a Little Teapot";
    }
    
    public String getDiddle() {
        return "ey Diddle Diddle";
    }
    
    //Added a new String method
    public String getHickory() {
        return "Hickory Dickory Dock";
    }
    
    public String getPerson() {
        return "A person's a person.";
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
        else if(message.equals(getHickory())) {
            return new StringBuilder(message).reverse().toString();
        }
        else{
            throw new IllegalArgumentException("String is not valid to be reversed.");
        }
    }
    
}