package tws.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.OrderForm;


@Mapper
public interface OrderFormMapper {

	@Select("select * from orderform")
	List<OrderForm> selectAll();
	
	@Insert("insert into orderform (orderNumber,reciverName,reciverTel,weight) values (#{orderform.orderNumber},#{orderform.reciverName},#{orderform.reciverTel},#{orderform.weight})")
	void insertOrderForm(@Param("orderform") OrderForm orderform);
}


