/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ZooMS;

/**
 *
 * @author Alvihn-PC
 */

class Lion extends Animals {
    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ", the lion who is " + age + " years old roars!");
    }

    @Override
    public void eat(String food) {
        System.out.println("He also likes eating " + food + ".");
    }
}