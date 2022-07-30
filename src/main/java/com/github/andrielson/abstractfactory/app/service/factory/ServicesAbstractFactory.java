package com.github.andrielson.abstractfactory.app.service.factory;

import com.github.andrielson.abstractfactory.app.service.services.CarService;
import com.github.andrielson.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
