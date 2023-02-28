package de.tum.in.ase;

/**
 * A class for an Operator in the ParkShuttle system.
 * TODO: Implement enterShuttle(Shuttle shuttle) and toString()
 */
public class Operator extends Person {

	public Operator(String id, String firstName, String lastName) {
		super(id, firstName, lastName);
	}

	/**
	 * Assigns an operator to the given shuttle if the shuttle does not already have an operator.
	 *
	 * @param shuttle to assign this operator.
	 * @throws IllegalArgumentException when a shuttle already has an operator.
	 */
	@Override
	public void enterShuttle(Shuttle shuttle) {
		// TODO 3: Implement this method.
		if(shuttle.getOperator() == null) {
			shuttle.setOperator(this);
		}
		else throw new IllegalArgumentException("shuttle already has an operator");
	}

	/**
	 * Get the information of a person, and put "Operator: " before.
	 * The returned String must not end with "\n".
	 *
	 * <pre>
	 * ex.) "Operator: <1> Max Mustermann"
	 * </pre>
	 *
	 * @return a String of information
	 */
	@Override
	public String toString() {
		// TODO 4: Implement this method.
		return "Operator: " + "<" + getId() + ">" + getFirstName() + getLastName();
	}
}
