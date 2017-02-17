package com.sky.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface PrepareStatementSetter {

	public void setter(PreparedStatement ps)throws SQLException;
}
