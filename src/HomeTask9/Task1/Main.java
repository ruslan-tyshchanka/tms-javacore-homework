package HomeTask9.Task1;

public class Main {
    public static void main(String[] args) {
        String documentNumber = "1234-ABC-5678-DEW-9D2A";
        DocumentNumber.printDocumentNumber(documentNumber);
        DocumentNumber.displayTwoDigitBlocks(documentNumber);
        DocumentNumber.displayDocumentNumberWithoutLetterBlocks(documentNumber);
        DocumentNumber.displayOnlyLetters(documentNumber);
        DocumentNumber.displayOnlyLettersWithTitle(documentNumber);
        DocumentNumber.checkIfDocumentNumberContains(documentNumber, "ABC");
        DocumentNumber.checkIfDocumentNumberStartsWith(documentNumber, "555");
        DocumentNumber.checkIfDocumentEndsWith(documentNumber, "1a2b");

    }
}
