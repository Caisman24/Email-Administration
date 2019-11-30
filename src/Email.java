import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private String alternateEmail;
	private int mailboxCapacity = 200;
	private String copmanySuffix = "solocoding.com";

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;

		this.department = setDepartment();

		this.password = randomPassword();
		System.out.println("Your password is: " + this.password);

		if (department == "none") {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + copmanySuffix;
		} else {
			email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + copmanySuffix;
		}
	}

	private String setDepartment() {
		System.out.println("New worker: " + firstName + " " + lastName + "\nPlease enter the department code: \nSales 1\nDevelopment 2\nAccount 3\nNone 0");
		Scanner input = new Scanner(System.in);
		int numberChoice = input.nextInt();

		switch (numberChoice) {
		case 1:
			return "sales";
		case 2:
			return "development";
		case 3:
			return "account";
		default:
			return "none";
		}
	}

	private String randomPassword() {
		final int LENGTH_OF_PASS = 10;
		String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		char[] password = new char[LENGTH_OF_PASS];
		for (int i = 0; i < LENGTH_OF_PASS; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

	public String showInfo() {
		return "\nName: " + firstName + " " + lastName +
				"\nPassword " + password +
				"\nCompany Email: " + email +
				"\nMailbox Capacity: " + mailboxCapacity + "mb";
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

}
