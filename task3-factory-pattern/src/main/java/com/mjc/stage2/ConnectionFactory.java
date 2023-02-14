package com.mjc.stage2;

import java.sql.Connection;

public interface ConnectionFactory {
    Connection createConnection();
}

//        3) Implement Factory design pattern.
//        For this task, you will need to implement the ConnectionFactory interface in the class H2ConnectionFactory and its createConnection() method.
//
//        Note: The properties for connection should be loaded from this file. H2 embedded database is used for this task.