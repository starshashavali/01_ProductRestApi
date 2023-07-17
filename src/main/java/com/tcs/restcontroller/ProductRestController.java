package com.tcs.restcontroller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.binding.Product;

@RestController
public class ProductRestController {
	@PostMapping("/product")
	public String saveProduct(@RequestBody Product p) {
		return "Product is saved";
	}
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable Integer pid) {
		Product p=null;
		if(pid==100) {
		 p=new Product(100,"Box",99.9);
		}else if(pid==101) {
			 p=new Product(101,"Mouse",999.9);
		}
		return p ;
	
	}
	@GetMapping("/products")
	public List<Product> getProduct(){
		Product p1=new Product(100,"Box",99.9);
		Product p2=new Product(101,"Mouse",999.9);
		
		return Arrays.asList(p1,p2);
	}
	

}
