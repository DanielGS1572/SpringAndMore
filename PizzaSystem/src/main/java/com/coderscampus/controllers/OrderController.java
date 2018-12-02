package com.coderscampus.controllers;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderscampus.domain.Customer;
import com.coderscampus.domain.Order;
import com.coderscampus.repository.OrderRepository;

@Controller
@RequestMapping("/orders")
public class OrderController {
	
	
	private OrderRepository orderRepo;
	
	@RequestMapping(value="", method=RequestMethod.GET)		//value esta "" porque ya se esta anotando a nivel de la clase
	public String orderGet(ModelMap model){
		
		Order order = new Order();
		model.put("order", order);
		
		
		return "orders";
	}
	
	@RequestMapping(value="{orderId}", method=RequestMethod.GET)
	public String orderGet(@PathVariable Long orderId, ModelMap model){
		
		Order order = orderRepo.findOne(orderId);
		model.put("order", order);
		
		
		return "orders";
	}
	
	
	@RequestMapping(value="{orderId}", method=RequestMethod.POST)
	public String orderPost(@PathVariable Long orderId, HttpServletRequest request, @ModelAttribute Order order, ModelMap mode){
		return "redirect:orders/"+orderId+"/pizzas";		/*Esto se relaciona con pizza controller*/
	}
	
	
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String orderPost(HttpServletRequest request, @ModelAttribute Order order,ModelMap model){
		Customer customer = (Customer) request.getSession().getAttribute("customer");
		order.setCustomer(customer);
		
		Order savedOrder = orderRepo.save(order);
		return "redirect:orders/"+savedOrder.getId()+"/pizzas";
	}

	

	@Autowired		//Para hacer unit testing por ejemplo con moquito de preferencia la anotacion
//	se pone en el setter y no en la propiedad
	public void setOrderRepo(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	
}
