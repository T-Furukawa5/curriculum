package check;

public class Check {
	//課題①
	private static String firstName = "古川";
	private static String lastName = "達也";

	//課題②
	private static void printName(String a,String b) {
		String fullName = firstName + lastName;
		System.out.println("printNameメソッド → "+fullName);

	}

	public static void main(String[] args) {
		printName(firstName,lastName);

		//課題③
		Pet pet = new Pet(Constants.Constants.CHECK_CLASS_JAVA,Constants.Constants.CHECK_CLASS_HOGE);
		RobotPet rpet = new RobotPet(Constants.Constants.CHECK_CLASS_R2D2,Constants.Constants.CHECK_CLASS_LUKE);
		pet.introduce();
		rpet.introduce();

		}
		// TODO 自動生成されたメソッド・スタブ
}