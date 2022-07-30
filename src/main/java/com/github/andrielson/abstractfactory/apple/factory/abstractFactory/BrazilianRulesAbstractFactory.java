package com.github.andrielson.abstractfactory.apple.factory.abstractFactory;

import com.github.andrielson.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.github.andrielson.abstractfactory.apple.model.certificate.Certificate;
import com.github.andrielson.abstractfactory.apple.model.packing.BrazilianPacking;
import com.github.andrielson.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
