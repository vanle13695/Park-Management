package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for a shuttle in the ParkShuttle system.
 * A shuttle has only one driver and multiple passengers.
 */
public class Shuttle {

	private String id;
	private String name;

	private Operator operator;
	private List<Passenger> passengers = new ArrayList<>();

	public Shuttle(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Shuttle shuttle)) {
			return false;
		}

		return id.equals(shuttle.id);
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Operator getOperator() {
		return operator;
	}

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
}
