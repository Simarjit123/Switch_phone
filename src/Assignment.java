import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {

		// Display list of items available
		String[] apple = { "Iphone 12", "Iphone 12 Mini", "Iphone 11", "Iphone 11 Mini" };
		String[] google = { "Google Pixel 6", "Google Pixel 6 Pro", "Google Pixel Pro", "Google Pixel 5" };
		String[] samsung = { "S20", "S21", "Flip3", "Fold3" };
		String brandName;
		System.out.println("Enter brand type");
		Scanner sc = new Scanner(System.in);
		brandName = sc.nextLine();
		boolean isAvailable = false;
		switch (brandName) {
		case "apple": {
			for (int i = 0; i < apple.length; i++) {
				System.out.println(apple[i]);
			}
			System.out.println("Please enter the prduct");

			String brandtype = sc.nextLine();
			int i;
			for (i = 0; i < apple.length; i++) {
				if (brandtype.equals(apple[i])) {
					isAvailable = true;
					System.out.println("Product selected is : " + apple[i]);
					break;
				} else
					isAvailable = false;
			}
			if (isAvailable == true) {
				System.out.println("Product selected is : " + apple[i]);
			} else {
				System.out.println("Not available");
			}
			break;

		}
		case "google": {
			for (int i = 0; i < google.length; i++) {
				System.out.println(google[i]);
			}
			System.out.println("Please enter the prduct");
			String brandtype = sc.nextLine();
			int i;
			for (i = 0; i < google.length; i++) {
				if (brandtype.equals(google[i])) {
					isAvailable = true;
					break;
				} else
					isAvailable = false;
			}
			if (isAvailable==true) {
				System.out.println("Product selected is : " + google[i]);
			} else {
				System.out.println("Not available");
			}
			break;
		}
		case "samsung": {
			for (int i = 0; i < samsung.length; i++) {
				System.out.println(samsung[i]);
			}
			System.out.println("Please enter the prduct");
			String brandtype = sc.nextLine();
			int i;
			for (i = 0; i < samsung.length; i++) {
				if (brandtype.equals(samsung[i])) {
					isAvailable = true;
					break;
				} else
					isAvailable = false;
			}
			if (isAvailable==true) {
				System.out.println("Product selected is : " + samsung[i]);
			} else {
				System.out.println("Not available");
			}
			break;
		}
		default:
			System.out.println("Please enter a valid model");
		}

	}

}
