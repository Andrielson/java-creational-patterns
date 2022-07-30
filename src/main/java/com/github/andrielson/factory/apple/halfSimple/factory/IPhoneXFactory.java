package com.github.andrielson.factory.apple.halfSimple.factory;

import com.github.andrielson.factory.apple.halfSimple.model.IPhone;
import com.github.andrielson.factory.apple.halfSimple.model.IPhoneX;
import com.github.andrielson.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX();
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax();
		} else return null;
	}

}
