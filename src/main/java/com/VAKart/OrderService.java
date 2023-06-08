package com.VAKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
@Autowired
OrderDao od;
public String addvalue(OrderEntity o) {
	return od.addvalue(o);
}
public String addallvalue(List<OrderEntity> o) {
	return od.addallvalue(o);
}
public List<Object> getvalue() {
	return od.getvalue();
}
}
