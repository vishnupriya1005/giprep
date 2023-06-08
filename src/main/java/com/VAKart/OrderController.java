package com.VAKart;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {
	@Autowired
	OrderService os;
	@PostMapping(path="/addvalue")
	public String addvalue(@RequestBody OrderEntity o) {
		return os.addvalue(o);
	}
	@PostMapping(path="/addallvalue")
	public String addallvalue(@RequestBody List<OrderEntity> o) {
		return os.addallvalue(o);
	}
	@GetMapping(path="/getvalue")
	public List<Object> getvalue(){
		return os.getvalue();
	}

}
