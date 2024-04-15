package n1exercici2;

public class S1_T6_N1EX2_Luis_Chicott {

	public static void main(String[] args) {
		
		GenericMethods example = new GenericMethods();
		
		example.printValue(1, new Person("Luis", "Chicott", 36) ,"España");
		System.out.print("\n");
		example.printValue("Argentina",new Person("Nicolás", "Jara", 36), 2);
		System.out.print("\n");
		example.printValue(new Person("María", "Teresa", 61),"Venezuela", 3);


	}

}
