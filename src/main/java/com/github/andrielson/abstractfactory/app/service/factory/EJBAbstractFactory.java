package com.github.andrielson.abstractfactory.app.service.factory;

import com.github.andrielson.abstractfactory.app.service.services.CarEJBService;
import com.github.andrielson.abstractfactory.app.service.services.CarService;
import com.github.andrielson.abstractfactory.app.service.services.UserEJBService;
import com.github.andrielson.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



