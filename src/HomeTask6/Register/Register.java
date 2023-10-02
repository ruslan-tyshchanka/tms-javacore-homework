package HomeTask6.Register;

public class Register {
    int arraySize=10;
    int numberOfRegisteredContracts=0;
    Contract[] registeredContracts = new Contract[arraySize];
    void saveDocument(Contract contractToBeSaved) {
        if(numberOfRegisteredContracts<arraySize){
            registeredContracts[numberOfRegisteredContracts]=contractToBeSaved;
            System.out.println("Document is saved!");
            numberOfRegisteredContracts++;
        } else {
            System.out.println("Document cannot be saved. The register is full.");
        }
    }
    void displayInfo (Contract contractToBeDisplayed) {
        System.out.println();
        contractToBeDisplayed.displayContractInfo();
        System.out.println();
    }

}
