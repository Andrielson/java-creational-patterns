package com.github.andrielson.abstractfactory.apple.factory;

import com.github.andrielson.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhone;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhoneX;
import com.github.andrielson.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
