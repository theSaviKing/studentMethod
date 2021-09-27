public class Main {
  public static void main(String[] args) {
    
	School aha = new School("Academy of Holy Angels", 9, 12, 635, "Heidi Foley");
	Student paul = new Student("T. Paul", "Kariuki", 12, aha, 3.67);

	System.out.print(paul.print());
  
  }
}
