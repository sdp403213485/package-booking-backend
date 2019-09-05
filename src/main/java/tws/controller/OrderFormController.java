package tws.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;


import tws.entity.Employee;
import tws.entity.OrderForm;
import tws.repository.OrderFormMapper;


@CrossOrigin
@RestController
@RequestMapping("/")
public class OrderFormController {
	@Autowired
	private OrderFormMapper orderFormMapper;
	
	  @GetMapping("")
	    public ResponseEntity<List<OrderForm>> getAll() {
	        return ResponseEntity.ok(orderFormMapper.selectAll());
	    }
	  
	  @PostMapping("")
		public void addEmployee(@RequestBody OrderForm orderform) {
		  orderFormMapper.insertOrderForm(orderform);
		}

//	    @GetMapping("/status")
//	    public ResponseEntity<List<OrderForm>> getAllOrderTableByStatus(@RequestBody String status) {
//	        String status = map.get("status");
//	        if(status == null || "".equals(status)){
//	            status = "";
//	        }
//	    	return ResponseEntity.ok(orderFormMapper.selectAllByStatus(status));
//	        List<OrderForm> list = orderFormMapper.selectAllByStatus(status);
//	        return ResponseEntity.ok(list);
//	    }
}
