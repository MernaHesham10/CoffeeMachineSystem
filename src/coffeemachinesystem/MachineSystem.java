/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemachinesystem;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class MachineSystem {

    static Scanner scanner = new Scanner(System.in);
    private int water, milk, coffeeBeans, disposableCups, Cost;

    public MachineSystem() {
    }

    public MachineSystem(int water, int milk, int coffeeBeans, int disposableCups, int Cost) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.disposableCups = disposableCups;
        this.Cost = Cost;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getDisposableCups() {
        return disposableCups;
    }

    public void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }

    //Display The Supply of That Machine Has
    public static void showSupply(MachineSystem coffeeMachine) {
        System.out.println("Caffee Machine Has: ");
        System.out.println(coffeeMachine.getWater() + " Of Water");
        System.out.println(coffeeMachine.getMilk() + " Of Milk");
        System.out.println(coffeeMachine.getCoffeeBeans() + " Of Coffee Beans");
        System.out.println(coffeeMachine.getDisposableCups() + " Of Disposable Cups");
        System.out.println(coffeeMachine.getCost() + " of Cost");
    }

    //Select The Coffee User Want To Buy
    public static void BuyCoffee(MachineSystem coffeeMachine) {
        int EnteredUserchoice;
        System.out.println("What Do You Want to Buy? \n1.Espresso \n2.Latte \n3.Cappuccino \n4.Back To Main Menu");
        EnteredUserchoice = scanner.nextInt();

        switch (EnteredUserchoice) {
            case 1:
                System.out.println(CheckAvailability(coffeeMachine, new Espresso()));
                break;
            case 2:
                System.out.println(CheckAvailability(coffeeMachine, new Latte()));
                break;
            case 3:
                System.out.println(CheckAvailability(coffeeMachine, new Cappuccino()));
                break;
            case 4:
                break;
        }
    }

    //Check if What User IS Available Or Not
    public static String CheckAvailability(MachineSystem coffeeMachine, Coffee coffee) {
        
        if (coffeeMachine.getWater() < coffee.getWater()) {
            return "Sorry, There's not Water!";
        }
        else if (coffeeMachine.getMilk() < coffee.getMilk()) {
            return "Sorry, There's not Milk!";
        }
        else if (coffeeMachine.getCoffeeBeans() < coffee.getCoffeeBeans()) {
            return "Sorry, There's not Coffee Beans";
        }
        else if (coffeeMachine.getDisposableCups() < 1) {
            return "Sorry, There's not Disposable Cups";
        }
        else {
            coffeeMachine.setWater(coffeeMachine.getWater() - coffee.getWater());
            coffeeMachine.setMilk(coffeeMachine.getMilk() - coffee.getMilk());
            coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() - coffee.getCoffeeBeans());
            coffeeMachine.setDisposableCups(coffeeMachine.getDisposableCups() - 1);
            coffeeMachine.setCost(coffeeMachine.getCost()+ coffee.getCost());
            return "There's Available Supply!";
        }
    }

    //Fill Machine
    public static void FillMachine(MachineSystem machineSystem) {
        
        System.out.println("Enter How Many ML Of Water Do You Want To Add: ");
        machineSystem.setWater(scanner.nextInt() + machineSystem.getWater());
        System.out.println("Enter How Many ML Of Milk Do You Want To Add: ");
        machineSystem.setMilk(scanner.nextInt() + machineSystem.getMilk());
        System.out.println("Enter How Many ML Of Coffee Beans Do You Want To Add: ");
        machineSystem.setCoffeeBeans(scanner.nextInt() + machineSystem.getCoffeeBeans());
        System.out.println("Enter How Many ML Of Disposable Cups Do You Want To Add: ");
        machineSystem.setDisposableCups(scanner.nextInt() + machineSystem.getDisposableCups());
    }

    //Rest Of Money
    public static void RestOfMoney(MachineSystem machineSystem) {
        System.out.println("The Rest Of The Money = " + machineSystem.getCost());
        machineSystem.setCost(0);
    }

}
