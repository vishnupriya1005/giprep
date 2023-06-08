package com.VAKart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
@Autowired
OrderRepository or;
public String addvalue(OrderEntity o) {
	 or.save(o);
	 return "Saved";
}
public String addallvalue(List<OrderEntity> o) {
	or.saveAll(o);
	return "saved all";
}
public List<Object> getvalue() {
	return or.getvalue();
}
}
