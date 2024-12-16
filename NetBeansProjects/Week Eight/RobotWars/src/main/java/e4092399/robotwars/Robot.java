/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4092399.robotwars;
import java.util.Random;


/**
 *
 * @author e4092399
 */
public class Robot {
    

    Random rand = new Random();

    // Attributes
    private final String name;
    private int hp;
    private int strength;
    private int attackDamage;
    private int maxBattery;
    private int battery;

    // Constructor to initialise robot attributes
    public Robot(String name, int hp, int strength, int maxBattery) {
        this.name = name;
        this.hp = hp;
        this.strength = strength;
        this.attackDamage = 0;
        this.maxBattery = maxBattery;
        this.battery = maxBattery; // Set battery to full initially
    }
    
    // Methods
    // Getters
    public int getHp() {
        return hp;
    }

    public int getBattery() {
        return battery;
    }

    public String getName() {
        return name;
    }

    // Attack logic
    public boolean attack(Robot opponent) {
        // Check if the attack fails due to kernel panic (10% chance)
        if (rand.nextInt(10) == 0) {
            System.out.println(name + "'s attack failed due to kernel panic!");
            return false; // Attack fails
        }

        // Determine attack strength percentage (random from 0 to 100)
        int attackPercentage = rand.nextInt(101);
        // Calculate attack damage based on the strength percentage
        int damage = (int) (strength * (attackPercentage / 100.0));
        this.attackDamage = damage;

        // Check battery consumption based on attack percentage
        int batteryUsed = calculateBatteryUsage(attackPercentage);
        if (battery < batteryUsed) {
            System.out.println(name + " doesn't have enough battery to attack!");
            return false; // Not enough battery to attack
        }

        // Subtract the battery used
        battery -= batteryUsed;

        // Apply damage to opponent
        opponent.receiveDamage(damage);
        System.out.println(name + " attacked " + opponent.getName() + " for " + damage + " damage!");
        return true;
    }

    // Method to calculate battery usage based on attack percentage
    private int calculateBatteryUsage(int attackPercentage) {
        if (attackPercentage == 0) return 0;
        if (attackPercentage <= 25) return 1;
        if (attackPercentage <= 50) return 2;
        if (attackPercentage <= 75) return 3;
        return 4; // for attack percentage > 75
    }

    // Method to apply damage to robot
    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (hp <= 0) {
            System.out.println(name + " is destroyed!");
        }
    }

    // Check if the robot is still operational
    public boolean isAlive() {
        return hp > 0;
    }
}


    
    
    
    
