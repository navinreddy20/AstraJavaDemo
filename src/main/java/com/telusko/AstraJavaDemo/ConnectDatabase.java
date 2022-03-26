package com.telusko.AstraJavaDemo;

import com.datastax.oss.driver.api.core.CqlSession;
import com.datastax.oss.driver.api.core.cql.ResultSet;
import com.datastax.oss.driver.api.core.cql.Row;
import java.nio.file.Paths;

public class ConnectDatabase {

    CqlSession session = null;

    // Connect with Astra DB
    public void connect(){
         session = CqlSession.builder()
                .withCloudSecureConnectBundle(Paths.get("<<path>>/secure-connect-telusko.zip"))
                .withAuthCredentials("<<Client ID>>","<<Client Secrect>>")
                .build();
    }

    public String getValue(String key) {

        if(session==null)
            connect();

        String value = "";

            // Execute the Query to fetch the value for a specific key
            // teluskokey is a keyspace and my_gadgets is the table
            ResultSet rs = session.execute("select value from teluskokey.my_gadgets where key = '" + key + "'");
            Row row = rs.one();

            if (row != null) {
                value = row.getString("value");
            } else {
                System.out.println("An error occurred.");
            }

        return value;
    }
}