class StringBuilderDemo {
    public static void main(String[] args) {

        
        StringBuilder nameString = new StringBuilder("Barbara");
        StringBuilder addressString = new StringBuilder("6311 Hickory Nut Grove Road");

        
        System.out.println("Name stored: " + nameString);
        System.out.println("Name capacity: " + nameString.capacity());

        System.out.println("Address stored: " + addressString);
        System.out.println("Address capacity: " + addressString.capacity());

        
        nameString.setLength(20);
        addressString.setLength(20);

        System.out.println("\n— After resizing each StringBuilder to 20 —");
        System.out.println("Updated name: \"" + nameString + "\"");
        System.out.println("Updated address: \"" + addressString + "\"");
    }
}
