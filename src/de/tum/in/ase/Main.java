package de.tum.in.ase;

public class Main {

	private Main() {
	}

	public static void main(String[] args) {
		// For the testing purpose, you can use the variables below.

		Shuttle linuxPenguin = new Shuttle("A-1095", "Linux Penguin");
		Shuttle antarcticaPenguin = new Shuttle("B-24578", "Antarctica Penguin");
		Shuttle tuxPenguin = new Shuttle("C-35071", "Tux Penguin");
		Shuttle tumPenguin = new Shuttle("D-49890", "TUM Penguin");

		Person stephan = new Operator("01", "Stephan", "Krusche");
		Person taiki = new Passenger("02", "Taiki", "Okano");
		Person alex = new Passenger("03", "Alexey", "Bednik");
		Person ivanP = new Passenger("04", "Ivan", "Parmacli");
		Person ivanK = new Passenger("05", "Ivan", "Kuzmin");

		Person carsten = new Operator("06", "Carsten", "Trinitis");
		Person nick = new Passenger("07", "Nicholas", "Kienzle");
		Person sam = new Passenger("08", "Sameh", "Nour");

		Person michael = new Operator("09", "Michael", "Luttenberger");
		Person zahi = new Passenger("10", "Zahi", "Touqan");
		Person amir = new Passenger("11", "Amir", "Bouslama");
	}
}
