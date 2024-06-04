/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooMS;

/**
 *
 * @author Alvihn-PC
 */
class Elephant extends Animals {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ", the elephant who is " + age + " years old trumpets!");
    }

    @Override
    public void eat(String food) {
        System.out.println("She also likes eating " + food + ".");
    }
}
