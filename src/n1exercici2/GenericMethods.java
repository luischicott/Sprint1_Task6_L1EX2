package n1exercici2;

public class GenericMethods {
	
	public <T> void printValue(T value1, T value2, T value3) {
        System.out.println("1: " + value1);
        System.out.println("2: " + value2);
        System.out.println("3: " + value3);
    }

}
