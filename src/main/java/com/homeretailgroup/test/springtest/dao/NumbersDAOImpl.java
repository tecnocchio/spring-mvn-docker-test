package com.homeretailgroup.test.springtest.dao;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class NumbersDAOImpl implements NumbersDAO {

	private static final Map<String, Integer> STATIC_DATA = new LinkedHashMap<>();
	static {
		STATIC_DATA.put("alice", 654321);
		STATIC_DATA.put("bob", 123456);
		STATIC_DATA.put("eve", 999);
	}

	@Override
	public int getNumber(String name) {
		return STATIC_DATA.getOrDefault(name, 0);
	}

}
