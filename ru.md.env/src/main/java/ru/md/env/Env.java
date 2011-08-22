package ru.md.env;

import ru.md.env_base.BaseClass;

public class Env {
	
	private BaseClass baseClass;
	
	public Env() {
		super();
		baseClass = new BaseClass();
	}

	public BaseClass getBaseClass() {
		return baseClass;
	}

}
