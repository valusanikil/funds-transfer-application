package com.remitter.bo;

import com.remitter.dao.BeneficiaryDao;
import com.remitter.model.Beneficiary;

public class BeneficiaryBo {
	public int beneficiaryRegistration(Beneficiary beneficiary) {
		BeneficiaryDao bdao=new BeneficiaryDao();
		int result=bdao.beneficiaryRegistration(beneficiary);
		return result;
	}
}
