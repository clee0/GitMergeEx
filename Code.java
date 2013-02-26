public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("You are okay.");
		else if (score > 90)
			System.out.println("That's not so good.");
		else if (score > 60)
			System.out.println("That's pretty bad.");
		else
			System.out.println("Get out of my house.");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(60);
	}
}