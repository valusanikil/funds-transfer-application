package com.remitter.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.remitter.model.Beneficiary;

public class BeneficiaryDao {
	
	public int beneficiaryRegistration(Beneficiary beneficiary) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String user = "root";
		String password = "123456";
		String query="INSERT INTO beneficiary_info VALUES(?,?,?,?,?,?)";
		int result=0;
		try (Connection con = DriverManager.getConnection(url,user,password);
				PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setInt(1, beneficiary.getbAccountNumber());
			pstmt.setString(2, beneficiary.getbName());
			pstmt.setString(3, beneficiary.getBankname());
			pstmt.setString(4, beneficiary.getIFSC());
			pstmt.setInt(5, beneficiary.getCurrentBalance());
			pstmt.setString(6, beneficiary.getEmail());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
