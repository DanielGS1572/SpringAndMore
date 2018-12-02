package com.coderscampus.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderscampus.domain.Order;
import com.coderscampus.domain.Pizza;
import com.coderscampus.domain.Topping;
import com.coderscampus.enums.PizzaCrustEnum;
import com.coderscampus.enums.PizzaSizeEnum;
import com.coderscampus.repository.OrderRepository;
import com.coderscampus.repository.ToppingRepository;

@Controller
@RequestMapping("/orders/{orderId}/pizzas")		//Esto se relaciona con orderPost de OrderController y a su
//vez se relacion con PathVariable de pizzaGet
public class PizzaController {
	private ToppingRepository toppingRepo; 
	private OrderRepository orderRepository;
	@RequestMapping(value="", method= RequestMethod.GET)
	public String pizzaGet (@PathVariable Long orderId,ModelMap model){
		model.put("pizzaSizes", PizzaSizeEnum.values());
		model.put("pizzaCrusts",PizzaCrustEnum.values());
		model.put("toppings", toppingRepo.findAll());
		
		Pizza pizza = new Pizza();
		model.put("pizza", pizza);
		return "pizzas";
	}
	
	@RequestMapping(value="", method=RequestMethod.POST)
	public String pizzaPost(@ModelAttribute Pizza pizza, @PathVariable Long orderId, ModelMap model){
		Order order = orderRepository.findOne(orderId);		//Para guardar un registro de pizza es necesario guardar a la relación padre
		
		for(Topping topping: pizza.getToppings()){
			topping.getPizzas().add(pizza);
		}
		
		
		pizza.setOrder(order);
		order.getPizzas().add(pizza);
		
		orderRepository.save(order);
		return "redirect:/orders/"+orderId;
	}
	@Autowired
	public void setToppingRepo(ToppingRepository toppingRepo) {
		this.toppingRepo = toppingRepo;
	}
	@Autowired
	public void setOrderRepository(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}
	
}
