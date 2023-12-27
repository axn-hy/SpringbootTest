package com.study.hhy.Service;

import com.study.hhy.pojo.Customer;

/**
 * @author HHY
 */
public interface CustomerService {
	Customer getOneCu(Integer cid);

	public void InsertCu(Customer customer);

	void UpdateCu(Customer customer);

	void DeleteCu(Integer cid);

	Customer getOnemessage(Integer cid);
}
