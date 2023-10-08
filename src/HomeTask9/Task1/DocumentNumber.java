package HomeTask9.Task1;
public class DocumentNumber {
    static void printDocumentNumber (String documentNumber) {
        System.out.println("Document number under test is "+documentNumber);
        System.out.println();
    }
    static void displayTwoDigitBlocks (String documentNumber) {
        StringBuilder documentNumberBuilder = new StringBuilder(documentNumber);
        String block1=documentNumberBuilder.substring(0, 4);
        String block2=documentNumberBuilder.substring(9,13);
        String twoDigitBlocks=block1.concat(block2);
        System.out.println(twoDigitBlocks);
        System.out.println();
    }
    static void displayDocumentNumberWithoutLetterBlocks (String documentNumber) {
        StringBuilder documentNumberBuilder = new StringBuilder(documentNumber);
        documentNumberBuilder.replace(5,8, "***");
        documentNumberBuilder.replace(14,17, "***");
        System.out.println(documentNumberBuilder);
        System.out.println();
    }
    static void displayOnlyLetters (String documentNumber) {
        StringBuilder documentNumberBuilder = new StringBuilder(documentNumber);
        documentNumberBuilder.replace(20,21,"/");
        documentNumberBuilder.replace(17,19,"/");
        documentNumberBuilder.replace(8,14,"/");
        documentNumberBuilder.delete(0,5);
        String finalVersion = documentNumberBuilder.toString();
        System.out.println(finalVersion.toLowerCase());
        System.out.println();
    }
    static void displayOnlyLettersWithTitle (String documentNumber){
        StringBuilder documentNumberBuilder = new StringBuilder(documentNumber);
        documentNumberBuilder.replace(20,21,"/");
        documentNumberBuilder.replace(17,19,"/");
        documentNumberBuilder.replace(8,14,"/");
        documentNumberBuilder.delete(0,5);
        String finalVersion = documentNumberBuilder.toString();
        System.out.println("Letters: "+finalVersion.toLowerCase());
        System.out.println();
    }
    static void checkIfDocumentNumberContains (String documentNumber, String targetPart) {
        boolean includesPart = documentNumber.toLowerCase().contains(targetPart.toLowerCase());
        if (includesPart==true) {
            System.out.println("Document number "+documentNumber+" contains '"+targetPart+"'");
        } else {
            System.out.println("Document number "+documentNumber+" does not contain '"+targetPart+"'");
        }
        System.out.println();
    }
    static void checkIfDocumentNumberStartsWith (String documentNumber, String targetPart) {
        boolean startsWithTargetPart = documentNumber.startsWith(targetPart);
        if (startsWithTargetPart==true) {
            System.out.println("Document number "+documentNumber+" starts with '"+targetPart+"'");
        } else {
            System.out.println("Document number "+documentNumber+" does not start with '"+targetPart+"'");
        }        System.out.println();
    }
    static void checkIfDocumentEndsWith (String documentNumber, String targetPart) {
        boolean endsWithTargetPart = documentNumber.endsWith(targetPart);
        if (endsWithTargetPart==true) {
            System.out.println("Document number "+documentNumber+" ends with '"+targetPart+"'");
        } else {
            System.out.println("Document number "+documentNumber+" does not end with '"+targetPart+"'");
        }        System.out.println();
    }
}
