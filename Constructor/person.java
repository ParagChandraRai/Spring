package com.springcore.ci;

import java.util.*;

public class person {
	private String name;
	private int personId;
	private Certi certi;
	private List<String> list;

	public person(String name, int personId, Certi certi, List<String> list) {
		this.name = name;
		this.personId = personId;
		this.certi = certi;
		this.list = list;
	}

	@Override
	public String toString() {
		return "person [name=" + name + ", personId=" + personId + "]" + this.certi.name + "List value " + this.list;
	}

}
