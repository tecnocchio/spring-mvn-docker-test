package com.homeretailgroup.test.springtest.dao;

public interface NumbersDAO {

	/**
	 * Get the number given the name.
	 * @param name the name of the number to lookup
	 * @return the number or 0 if the name is not known.
	 */
	int getNumber(String name);

}
