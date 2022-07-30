package com.github.andrielson.factory.app.dbadapter.after.factory;

import com.github.andrielson.factory.app.dbadapter.after.db.DB;
import com.github.andrielson.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
