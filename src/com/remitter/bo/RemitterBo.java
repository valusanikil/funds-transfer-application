package com.remitter.bo;

import com.remitter.dao.RemitterDao;
import com.remitter.model.FundTransfer;
import com.remitter.model.Remitter;

public class RemitterBo {
	
	public int registerRemitter(Remitter remitter) { 
		RemitterDao rdao=new RemitterDao();
		int result=rdao.registerRemitter(remitter);
		return result;
	}
	
	public Remitter getRemitterByAccountNumber(int an) {
		RemitterDao rdao=new RemitterDao();
		Remitter remitter=rdao.getRemitterByAccountNumber(an);
		return remitter;
	}

	public Remitter login(int aNumber, String password) {
		RemitterDao rdao=new RemitterDao();
		Remitter remitter=rdao.login(aNumber,password);
		return remitter;
		
	}

	public void transferFund(FundTransfer ft) {
		RemitterDao rdao=new RemitterDao();
		rdao.transferFund(ft);
	}
}
