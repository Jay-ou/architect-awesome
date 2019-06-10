package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 客户控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	/**
	 * 显示用户列表
	 * @return
	 */
	@RequestMapping("list")
	public String queryCustomerList() {
		return "customer"; }
}
