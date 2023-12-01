package HomeTask7.Phone;

public class Phones {
    public static void main(String[] args) {
        Phone businessPhone = new Phone("+375(25)133-75-73", "iPhone 10",0.250);
        Phone homePhone = new Phone("+375(17)486-99-55", "Stationary", 1.5);
        Phone personalPhone = new Phone("+375(29)897-50-17", "Samsung Galaxy 10", 0.300);

        businessPhone.receiveCall("Boss","+375(25)123-45-67");
        businessPhone.getNumber();

        homePhone.receiveCall("Uncle Ben", "+375(29)312-76-65");
        homePhone.getNumber();

        personalPhone.receiveCall("Dog Sitter");
        personalPhone.getNumber();

        businessPhone.sendMessage("+375(29)853-64-22", "+375(25)133-75-73", "+375(17)486-99-55", "+375(29)897-50-17");

    }

}
