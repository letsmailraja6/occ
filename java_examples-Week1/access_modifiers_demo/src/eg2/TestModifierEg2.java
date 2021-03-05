package eg2;

public class TestModifierEg2 {
	public void helloPublic() {
		System.out.println("Hello public of " + getClass());
	}

	private void helloPrivate() {
		System.out.println("Hello private of " + getClass());
	}

	void helloDefault() {
		System.out.println("Hello default of " + getClass());
	}

	protected void helloProtected() {
		System.out.println("Hello protected of " + getClass());
	}
}
