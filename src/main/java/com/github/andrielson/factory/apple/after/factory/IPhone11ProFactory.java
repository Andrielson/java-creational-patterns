package com.github.andrielson.factory.apple.after.factory;

import com.github.andrielson.factory.apple.after.model.IPhone;
import com.github.andrielson.factory.apple.after.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11Pro();
	}

}
