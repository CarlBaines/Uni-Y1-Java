/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package e4092399.robotwars;

/**
 *
 * @author e4092399
 */
public class RobotWars {

    public static void main(String[] args) {

        // Creates two new instances of the robot class
        Robot robot1 = new Robot("Robot1", 100, 50, 100); // Name, HP, Strength, Battery parameters
        Robot robot2 = new Robot("Robot2", 100, 50, 100);

        // Starts the battle - while loop runs until a robot is no longer operational.
        while (robot1.isAlive() && robot2.isAlive()) {
            // Robot1 and Robot2 take turns to attack each other.
            // Robot1 attacks Robot2
            if (!robot1.attack(robot2)) {
                System.out.println(robot1.getName() + " failed to attack!");
            }

            // Robot2 attacks Robot1
            if (!robot2.attack(robot1)) {
                System.out.println(robot2.getName() + " failed to attack!");
            }

            // Display HP and battery status of each robot after they have attacked each other.
            System.out.println(robot1.getName() + " HP: " + robot1.getHp() + " Battery: " + robot1.getBattery());
            System.out.println(robot2.getName() + " HP: " + robot2.getHp() + " Battery: " + robot2.getBattery());
            System.out.println("-----");
        }

        // Declares winner by using the isAlive method in the robot class.
        if (robot1.isAlive()) {
            System.out.println(robot1.getName() + " wins!");
        } 
        else if (robot2.isAlive()) {
            System.out.println(robot2.getName() + " wins!");
        }
        else {
            System.out.println("It's a draw!");
        }
    }
}

