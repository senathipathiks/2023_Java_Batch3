package com.sbaadharapp.customIDGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class AadharIdGenerator implements IdentifierGenerator{
	
	
	public Serializable generate(SharedSessionContractImplementor session, Object object) {
        String prefix = "UID";
        String query = "SELECT MAX(aadhar_no) FROM aadhar";
        Connection connection = null;
        
        try {
			connection = session.getJdbcConnectionAccess().obtainConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		

        try (PreparedStatement statement = connection.prepareStatement(query)) {
        	
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                String lastId = rs.getString(1);
                if (lastId != null) {
                    int number = Integer.parseInt(lastId.substring(prefix.length())) + 1;
                    return prefix+ number;
                }
            }
        } catch (SQLException e) {
//        	System.out.println("hello");
            throw new HibernateException("Unable to generate ID", e);
        }

        return prefix+ 100; // Initial value if no records are present
    }


}
