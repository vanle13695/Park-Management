package de.tum.in.ase;

/**
 * An abstract class for a person in the ParkShuttle.
 * You can assume that two people with the same id are the same person.
 * This is implemented in equals().
 */
public abstract class Person {

	private String id;
	private String firstName;
	private String lastName;

	public Person(String id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * Adds the person to a shuttle.
	 *
	 * @param shuttle that a person is added to.
	 * @throws IllegalArgumentException when the person is already added.
	 */
	public abstract void enterShuttle(Shuttle shuttle);

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Person person)) {
			return false;
		}

		return id.equals(person.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return String.format("<%s> %s %s", id, firstName, lastName);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
