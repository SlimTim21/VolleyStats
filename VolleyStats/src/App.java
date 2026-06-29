public class App {
    public static void main(String[] args) throws Exception {

        Player Tim = new Player("Tim", 10, 20);

        //Player stats display
        System.out.println("|| Player Stats ||");

        //Tim Stats
        System.out.println(Tim.name + ":");
        System.out.println("Kills: " + Tim.kills);
        System.out.println("Hitting Percentage: " + ((double)Tim.kills / (double)Tim.hitAttempts));
    }
}
