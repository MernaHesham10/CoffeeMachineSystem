/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coffeemachinesystem;

/**
 *
 * @author DELL
 */
public class Coffee extends MachineSystem {

    private String name;

    public Coffee(int water, int milk, int coffeeBeans, int money, String name) {
        super(water, milk, coffeeBeans, 1, money);
        this.name = name;
    }
}
