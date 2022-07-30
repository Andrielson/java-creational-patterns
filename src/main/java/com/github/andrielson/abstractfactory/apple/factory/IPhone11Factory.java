package com.github.andrielson.abstractfactory.apple.factory;

import com.github.andrielson.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhone;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhone11;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone11Factory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhone11(rules);
		} else if(level.equals("highEnd")) {
			return new IPhone11Pro(rules);
		} else return null;
	}

}
