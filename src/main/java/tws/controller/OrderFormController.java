package tws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tws.entity.Employee;
import tws.entity.OrderForm;
import tws.repository.OrderFormMapper;

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

}
