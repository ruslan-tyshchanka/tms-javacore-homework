package HomeTask5.Computer;

public class HDD {
    String hddName;
    int hddVolume;
    String hddType;

    HDD()
    {
        hddName = "Unidentified";
        hddVolume = 1;
        hddType = "Internal";
    }
    HDD(String hddName, int hddVolume, String hddType)
    {
        this.hddName = hddName;
        this.hddVolume = hddVolume;
        this.hddType = hddType;
    }
    void displayHddAttributes (){
        System.out.println("HDD attributes: ");
        System.out.printf("Name: %s, Volume: %d, Type: %s", hddName, hddVolume, hddType);
        System.out.println();
    }
}
