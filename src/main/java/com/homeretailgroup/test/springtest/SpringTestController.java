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
	 * @return NumbersDAO implementation's of getNumber(name) function
	 */
	@RequestMapping(value = "/numbers", method = RequestMethod.GET)
	public Integer getNumberOf(String name) {
		return new NumbersDAOImpl().getNumber(name);
	}

}
