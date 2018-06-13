package ueb09.fz;

public class Trommelbremse implements Bremsen {
	private int belag;
	private static final int MIN_BELAG = 2;
	private static final int MAX_BELAG = 8;

	public Trommelbremse() {
		this.belag = MAX_BELAG;
	}

	public void bremsen() {
		System.out.println("Trommelbremse bremst!");
	}

	public boolean brauchtService() {
		return belag < MIN_BELAG;
	}

	public String toString() {
		return "Trommelbremse";
	}
}
