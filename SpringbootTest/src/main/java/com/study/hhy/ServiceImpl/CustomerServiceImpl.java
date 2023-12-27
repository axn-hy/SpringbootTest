package com.study.hhy.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.study.hhy.Service.CustomerService;
import com.study.hhy.mapper.CustomerMapper;
import com.study.hhy.pojo.Customer;
/**
 * @author HHY
 */
@Service
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.READ_COMMITTED,rollbackFor =Exception.class)
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerMapper cm;
	@Override
	public Customer getOneCu(Integer cid) {
		// TODO Auto-generated method stub
		return  cm.selectByPrimaryKey(cid);
	}

	@Override
	public void InsertCu(Customer customer) {
		cm.insert(customer);
	}

	@Override
	public void UpdateCu(Customer customer) {
		cm.updateByPrimaryKeySelective(customer);
	}

	@Override
	public void DeleteCu(Integer cid) {
		cm.deleteByPrimaryKey(cid);
	}

	@Override
	public Customer getOnemessage(Integer cid) {
		return cm.selectRoleByCid(cid);
	}

}
