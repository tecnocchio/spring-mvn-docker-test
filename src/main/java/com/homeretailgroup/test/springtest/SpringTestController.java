/**
 * 
 */
package com.homeretailgroup.test.springtest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.homeretailgroup.test.springtest.dao.NumbersDAOImpl;

/**
 * @author maurizio
 *
 */
@RestController
public class SpringTestController {

	/**
	 * @param name 
	 * @return NumbersDAO Implementation's getNumber value
	 */
	@RequestMapping(value = "/numbers", method = RequestMethod.GET)
	public String getNumberOf(String name) {
		return Integer.toString(new NumbersDAOImpl().getNumber(name));
	}

}
