package de.tum.in.ase;

/**
 * A class for a Passenger in the ParkShuttle system.
 * TODO: Implement enterShuttle(Shuttle shuttle) and toString()
 */
public class Passenger extends Person {

	public Passenger(String id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	/**
	 * Add a passenger to the given shuttle if the passenger is not already present in the shuttle.
	 *
	 * @param shuttle add this passenger to the shuttle.
	 * @throws IllegalArgumentException when the passenger is already added to that shuttle.
	 */
	@Override
	public void enterShuttle(Shuttle shuttle) {
		// TODO 1: Implement this method.
		if(!shuttle.getPassengers().contains(this)) {
			shuttle.getPassengers().add(this);
		}
		else throw new IllegalArgumentException("passenger is already added to that shuttle");
	}

	/**
	 * Get the information of a person, and put "Passenger: " before.
	 * The returned String must not end with "\n" for this method.
	 *
	 * <pre>
	 * ex.) "Passenger: <1> Max Mustermann"
	 * </pre>
	 *
	 * @return a string of information
	 */
	@Override
	public String toString() {
		// TODO 2: Implement this method.
		return "Passenger: " + "<" + getId() + ">" + getFirstName() + getLastName();
	}
}
