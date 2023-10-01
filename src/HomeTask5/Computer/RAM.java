package HomeTask5.Computer;

public class RAM {
    String ramName;
    int ramVolume;
    RAM()
    {
        ramName = "Unidentified";
        ramVolume = 1;
    }
    RAM(String ramName, int ramVolume)
    {
        this.ramName = ramName;
        this.ramVolume = ramVolume;
    }
    void displayRamAttributes (){
        System.out.println("RAM attributes: ");
        System.out.printf("Name: %s, Volume: %d", ramName, ramVolume);
        System.out.println();
    }
}
