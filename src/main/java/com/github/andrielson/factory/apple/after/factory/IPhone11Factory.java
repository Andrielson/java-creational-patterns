package com.github.andrielson.factory.apple.after.factory;

import com.github.andrielson.factory.apple.after.model.IPhone;
import com.github.andrielson.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
