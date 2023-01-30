package de.tum.in.ase;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * A utility class for the ParkShuttle system.
 * TODO: Implement all the empty methods in this class.
 */
public class ParkShuttle {

	private ParkShuttle() {
	}

	/**
	 * Return information of all persons given as a string.
	 * You might want to use Person::toString for this purpose.
	 * Add a new line ("\n") between each person.
	 *
	 * <p style="color: red;">The generated String must end with "\n".</p>
	 *
	 * <pre>
	 * ex.)
	 * Operator: <1> Stephan Krusche
	 * Passenger: <2> Taiki Okano
	 * Passenger: <3> Alexey Bednik
	 * </pre>
	 *
	 * @param persons a list of persons to be displayed.
	 * @return a String containing all persons' information.
	 */
	public static String getPersonsInfo(List<Person> persons) {
		// TODO 5: Implement this method.
		return null;
	}

	/**
	 * Filter only passengers from the given list of persons.
	 * The method should keep the order of the given list.
	 *
	 * @param persons a list of persons to be filtered.
	 * @return a list which includes only passengers.
	 */
	public static List<Person> filterPassenger(List<Person> persons) {
		// TODO 6: Implement this method.
		return null;
	}

	/**
	 * Merge two lists of persons into one list.
	 * The order of the generated list does not have to be preserved.
	 *
	 * @param persons1 is a list of persons.
	 * @param persons2 is a list of persons.
	 * @return a list of persons from two given lists without any duplicated elements.
	 */
	public static List<Person> mergeTwoShuttles(List<Person> persons1, List<Person> persons2) {
		// TODO 7: Implement this method.
		return null;
	}

	/**
	 * Sort given persons with their id, but operators need to come before passengers regardless their id.
	 *
	 * @param persons a list of persons to be sorted.
	 * @return a list sorted by their id.
	 */
	public static List<Person> sortPersonsById(List<Person> persons) {
		// TODO 8: Implement this method.
		return null;
	}
}
