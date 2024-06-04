/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooMS;
/**
 *
 * @author Alvihn-PC
 */
public class Animals {
    protected String name;
    protected int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }

    public void eat() {
        System.out.println("This animal eats");
    }

    public void eat(String food) {
        System.out.println("The animal eats " + food);
       
    }
    
}
