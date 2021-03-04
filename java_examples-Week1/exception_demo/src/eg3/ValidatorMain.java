package eg3;

public class ValidatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final int x=100;
//		x=10;

		ValidatorLogic v = new ValidatorLogic();
		try {
			if (v.isValidAge(36)) {
				System.out.println("Age validated");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
		if (v.isValidMobileNumber("+1-12345678909")) {
			System.out.println("Valid number");
		}
		}catch(InvalidContactException e) {
			System.out.println(e.getMessage());
		}

	}

}
//Assignment Exception
//1)Try to recreate the same
//2)Create a BusinessException(checked) and use it for handling for InvalidPassportNumber
//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.
