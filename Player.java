package debugger.sport;

public abstract class Player {
	private String name;
	private String surname;

	public Player(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}
	abstract void play();
}
