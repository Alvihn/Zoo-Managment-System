/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooMS;
/**
 *
 * @author Alvihn-PC
 */
public class Main {
    public static void main(String[] args) {
        Animals lion = new Lion("Mufasa", 7);
        Animals elephant = new Elephant("Ella", 15);
        Animals monkey = new Monkey("Jonny", 5);

        lion.makeSound();
        lion.eat("meat");

        System.out.println();

        elephant.makeSound();
        elephant.eat("grass");
                
        System.out.println();

        
        monkey.makeSound();
        monkey.eat("bananas");
        
        System.out.println();
    }
}
