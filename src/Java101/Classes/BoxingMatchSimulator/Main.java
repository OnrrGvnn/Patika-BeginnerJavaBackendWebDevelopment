package Java101.Classes.BoxingMatchSimulator;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alpi", 20, 100, 77, 75);
        Fighter f2 = new Fighter("Yeto", 15, 100, 70, 60);

        Ring ring = new Ring(f1, f2, 70, 90, 50);

        System.out.println("\nWelcome The Box Match !");
        ring.run();

    }
}