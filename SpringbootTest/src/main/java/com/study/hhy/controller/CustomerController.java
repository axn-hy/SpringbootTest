package com.study.hhy.controller;

import com.study.hhy.Service.CustomerService;
import com.study.hhy.pojo.Customer;
import com.study.hhy.util.ResultUtil;
import org.springframework.web.bind.annotation.*;

/**
 * @author HHY
 */
@RestController
public class CustomerController {
	private final CustomerService cs;

	public CustomerController(CustomerService cs) {
		this.cs = cs;
	}

	@GetMapping("/customer/{cid}")
	public Object getOne(@PathVariable("cid") Integer cid) {
	return ResultUtil.success(cs.getOneCu(cid));
	}
	@GetMapping("/customermesage/{cid}")
	public Object getAllOne(@PathVariable("cid") Integer cid){
		return ResultUtil.success(cs.getOnemessage(cid));
	}

	@PostMapping("/customer/insert")
	public  void InsertCustomer(@RequestBody Customer customer) {
		cs.InsertCu(customer);
	}

	@PostMapping("/customer/update")
	public  void UpdateCustomer(@RequestBody Customer customer){
		cs.UpdateCu(customer);
	}
	@DeleteMapping("/customer/delete/{cid}")
	public  void DeleteCustomer(@PathVariable("cid") Integer cid){
		 cs.DeleteCu(cid);
	}
}
