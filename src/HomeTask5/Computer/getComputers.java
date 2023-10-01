package HomeTask5.Computer;

public class getComputers {
    public static void main(String[] args) {
        Computers computer1 = new Computers(500, "PC");
        Computers computer2 = new Computers(700, "Workstation", "RAM 500", 100, "HDD 1000", 110, "External" );

        System.out.println("Computer 1");
        computer1.displayComputerAttributes();
        System.out.println();
        System.out.println("Computer 2");
        computer2.displayComputerAttributes();
    }
}
