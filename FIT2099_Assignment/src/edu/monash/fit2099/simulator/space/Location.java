package edu.monash.fit2099.simulator.space;

import java.util.Map;

/**
 * Location base class for simulated locations.
 * <p>
 * Generated by UML Lab.
 * 
 * @author ram
 * @date 17 February 2013
 */
/*
 * Changelog:
 * 2013-04-13: Factored Location.Maker out into a separate file, because the combination
 * 		of inner classes and generics was too much for Eclipse's tiny brain (ram)
 */
public abstract class Location {

	/**
	 * Stores references to neighbours of this <code>Location</code> associated with the direction
	 */
	protected Map<Direction, Location> neighbours;

	/**
	 * Finds and returns neighbouring location of this <code>Location</code> in the specified direction, or null if no such neighbour exists
	 * <p>
	 * @param 	d the direction
	 * @return 	the neighbour in the specified direction <code>d</code>, or null if no such neighbour exists
	 */
	public Location getNeighbour(final Direction d) {
		return neighbours.get(d);
	}

	/**
	 * Adds a neighbour to this <code>Location</code> in the specified direction.
	 * 
	 * @param 	d direction in which the neighbour needs to be added
	 * @param 	l neighbouring location
	 * @return 	the neighbouring location of this <code>Location</code> in the direction <code>d</code>
	 */
	public Location addNeighbour(final Direction d, final Location l) {
		return neighbours.put(d, l);
	}
	
	/**
	 * Returns true if and only if there is a <code>Location</code> adjacent to this <code>Location</code> in the 
	 * specified <code>Direction d<code>, false otherwise
	 * 
	 * @param d direction
	 * @return true if such a <code>Location</code> in the specified <code>Direction d</code> exists, false otherwise
	 */
	public Boolean hasExit(final Direction d) {
		return neighbours.keySet().contains(d);
	}
	
}
