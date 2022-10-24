package com.line.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface StatementStrategy {
    // connection을 받아서 PreparedStatement를 return
    PreparedStatement makeStatement(Connection conn) throws SQLException;
}
