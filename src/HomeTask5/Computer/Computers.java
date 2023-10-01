package HomeTask5.Computer;

public class Computers {
    int price;
    String model;
    HDD HDD;
    RAM RAM;
    Computers(int computerPrice, String computerModel)
    {
        this.price=computerPrice;
        this.model=computerModel;
        RAM = new RAM();
        String ramName = RAM.ramName;
        int ramVolume = RAM.ramVolume;
        HDD = new HDD();
        String hddName = HDD.hddName;
        int hddVolume = HDD.hddVolume;
        String hddType = HDD.hddType;
    }
    Computers(int computerPrice, String computerModel, String ramName, int ramVolume, String hddName, int hddVolume, String hddType)
    {
        this.price=computerPrice;
        this.model=computerModel;
        RAM  = new RAM(ramName, ramVolume);
        HDD  = new HDD(hddName, hddVolume, hddType);
    }
    void displayComputerAttributes(){
        System.out.println("General computer attributes:");
        System.out.printf("Price: %d, Model: %s", price, model);
        System.out.println();
        RAM.displayRamAttributes();
        HDD.displayHddAttributes();
    }
}
