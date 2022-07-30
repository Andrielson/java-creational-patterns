package com.github.andrielson.abstractfactory.apple.factory.abstractFactory;

import com.github.andrielson.abstractfactory.apple.model.certificate.Certificate;
import com.github.andrielson.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
