package Java101.Classes.BoxingMatchSimulator;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    double firstHit;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight, double firstHit) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.firstHit = firstHit;
    }

    public double firstHit() {
        double randomValue = Math.random() * 100;
        System.out.println(randomValue);
        return this.firstHit = randomValue;
    }

    void run() {
        if (isCheck()) {
            System.out.println("The Battle Between " + this.f1.name + " And " + this.f2.name + " Is Starting !\n");

            int roundNumber = 1;

            if (firstHit() > 50) {
                System.out.println("----Round 1-----");
                this.f2.health = this.f1.hit(f2);
                System.out.println("The first hit comes from " + this.f1.name + ".");
                System.out.println(this.f2.name + "'s remaining health: " + this.f2.health + ".");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + "'s remaining health: " + this.f1.health + ".");
            } else {
                System.out.println("----Round 1-----");
                this.f1.health = this.f2.hit(this.f1);
                System.out.println("The first hit comes from " + this.f2.name + ".");
                System.out.println(this.f1.name + "'s remaining health: " + this.f1.health + ".");
                this.f2.health = this.f1.hit(f2);
                System.out.println(this.f2.name + "'s remaining health: " + this.f2.health + ".");
            }

            while (this.f1.health > 0 && this.f2.health > 0) {
                roundNumber++;
                System.out.println("----Round " + roundNumber + "-----");
                this.f2.health = this.f1.hit(f2);
                if (this.f2.health <= 0) {
                    break;
                }
                System.out.println(this.f2.name + "'s remaining health: " + this.f2.health + ".");
                this.f1.health = this.f2.hit(this.f1);
                if (this.f1.health <= 0) {
                    break;
                }
                System.out.println(this.f1.name + "'s remaining health: " + this.f1.health + ".");
            }
        } else {
            System.out.println("The fighters are not suitable for the fight.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight && this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }
}
