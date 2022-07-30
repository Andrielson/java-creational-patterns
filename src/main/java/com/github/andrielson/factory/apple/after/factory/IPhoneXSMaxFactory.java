package com.github.andrielson.factory.apple.after.factory;

import com.github.andrielson.factory.apple.after.model.IPhone;
import com.github.andrielson.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
