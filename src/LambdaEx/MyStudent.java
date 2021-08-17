package LambdaEx;

public class MyStudent {

	private String firstName;
	private String lastName;
	private String major;
	private int age;
	private double score;
	
	public MyStudent() {
		super();
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

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "MyStudent [firstName=" + firstName + ", lastName=" + lastName + ", major=" + major + ", age=" + age
				+ ", score=" + score + "]";
	}

	public MyStudent(String firstName, String lastName, String major, int age, double score) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.major = major;
		this.age = age;
		this.score = score;
	}

}
