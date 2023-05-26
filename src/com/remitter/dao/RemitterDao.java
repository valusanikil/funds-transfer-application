package com.remitter.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.remitter.model.FundTransfer;
import com.remitter.model.Remitter;

public class RemitterDao {

	public int registerRemitter(Remitter remitter) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String user = "root";
		String password = "123456";
		String query="INSERT INTO remitter_info VALUES(?,?,?,?,?,?,?)";
		int result=0;
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(query);) {
			pstmt.setInt(1, remitter.getAccountNumber());
			pstmt.setString(2, remitter.getName());
			pstmt.setString(3, remitter.getEmailId());
			pstmt.setString(4, remitter.getPassword());
			pstmt.setInt(5, remitter.getBalance());
			pstmt.setInt(6, remitter.getAccountStatus());
			pstmt.setString(7, remitter.getIfsc());
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	public Remitter getRemitterByAccountNumber(int an) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String user = "root";
		String password = "123456";
		String query="SELECT * from remitter_info WHERE Account_Number=?";
		Remitter remitter=null;
		try (Connection con = DriverManager.getConnection(url, user, password);
				PreparedStatement pstmt = con.prepareStatement(query);) {
			pstmt.setInt(1, an);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				remitter=new Remitter();
				remitter.setAccountNumber(rs.getInt(1));
				remitter.setName(rs.getString(2));
				remitter.setName(rs.getString(2));
				remitter.setEmailId(rs.getString(3));
				remitter.setPassword(rs.getString(4));
				remitter.setBalance(rs.getInt(5));
				remitter.setAccountStatus(rs.getInt(6));
				remitter.setIfsc(rs.getString(7));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return remitter;
	}

	public Remitter login(int aNumber, String password) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String user = "root";
		String pass = "123456";
		String query="Select * from remitter_info WHERE Account_Number=? and password=?";
		Remitter remitter=null;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(query);) {
			pstmt.setInt(1, aNumber);
			pstmt.setString(2, password);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				remitter=new Remitter();
				remitter.setAccountNumber(rs.getInt(1));
				remitter.setPassword(rs.getString(4));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return remitter;
	}

	public void transferFund(FundTransfer ft) {
		String url = "jdbc:mysql://localhost:3306/remitter?useSSL=false";
		String user = "root";
		String pass = "123456";
		String query="INSERT INTO fund_transfer VALUES(?,?,?,?,?,?)";
		int status;
		try (Connection con = DriverManager.getConnection(url, user, pass);
				PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setInt(1, ft.getTransactionId());
			pstmt.setInt(2, ft.getRemitterAccountNumber());
			pstmt.setInt(3, ft.getBeneficiaryAccountNumber());
			pstmt.setInt(4, ft.getTransactionAmount());
			pstmt.setString(5, ft.getTransactionStatus());
			pstmt.setString(6, ft.getTransactionDate());
			status=pstmt.executeUpdate();
			if(status==1) {
				System.out.println("Success");
			}
			else {
				System.out.println("Failure");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
