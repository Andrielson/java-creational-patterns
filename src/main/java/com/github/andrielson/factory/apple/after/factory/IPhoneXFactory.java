package com.github.andrielson.factory.apple.after.factory;

import com.github.andrielson.factory.apple.after.model.IPhone;
import com.github.andrielson.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
