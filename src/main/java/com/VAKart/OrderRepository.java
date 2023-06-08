package com.VAKart;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface OrderRepository extends JpaRepository<OrderEntity,Integer> {
	@Query(value="select vakart_order.city ,vakart_product.name from vakart_order join vakart_product on vakart_order.order_id=vakart_product.order_id_fk",nativeQuery= true)
	

	public List<Object> getvalue();


}
