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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MachineSystem machineSystem = new MachineSystem(400, 540, 120, 9, 550);
        
        int EnteredUserchoice;
            char wantToContinue;
            MainMenu:
            do {

                System.out.println("\nSelect What Do You Want To Do :\n1.Buy \n2.Fill \n3.Take \n4.Remaining \n5.Exit \n");
                EnteredUserchoice = scanner.nextInt();
                switch (EnteredUserchoice) {

                    //Buy Coffee
                    case 1:
                        MachineSystem.BuyCoffee(machineSystem);
                        break;

                    //Check availability Of Room   
                    case 2:
                        MachineSystem.FillMachine(machineSystem);
                        break;

                    //Room Booking    
                    case 3:
                        MachineSystem.RestOfMoney(machineSystem);
                        break;

                    //Check if Room is Found Or Not if Found then it can Order Food   
                    case 4:
                        MachineSystem.showSupply(machineSystem);
                        break;

                    //Exit from Application    
                    case 5:
                        break MainMenu;
                        
                    default:
                        System.out.println("Please Select From Menu");
                }
                System.out.println("\nDo You Want To Do Anthing Else(Y/N): ");
                wantToContinue = scanner.next().charAt(0);
                if (!(wantToContinue == 'y' || wantToContinue == 'Y' || wantToContinue == 'n' || wantToContinue == 'N')) {
                    System.out.println("Invalid Selected");
                    System.out.println("\nDo You Want To Do Anthing Else(Y/N): ");
                    wantToContinue = scanner.next().charAt(0);
                }

            } while (wantToContinue == 'y' || wantToContinue == 'Y');
    }
}
