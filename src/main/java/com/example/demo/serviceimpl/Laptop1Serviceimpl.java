package com.example.demo.serviceimpl;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Laptop1;
import com.example.demo.repository.Laptop1Repository;
import com.example.demo.service.Laptop1Service;

@Service
public class Laptop1Serviceimpl implements Laptop1Service {
	@Autowired
	Laptop1Repository laptop1Repository;
	public List<Laptop1> getLaptop1() {
		return laptop1Repository.findAll();
	}
//	public Laptop1 postLaptop1(Laptop1 laptop1) {
//		Laptop1 l = laptop1Repository.save(laptop1);
//		return l;
//	}
//	public String deleteLaptop1ById(Integer id) {
//		laptop1Repository.deleteById(id);
//		return "Delete sucess";
//	}
//
//
//	public String updateLaptop1ById(Integer id, Laptop1 updatinglaptop1) {
//		//get the record from DB
//		Optional<Laptop1> existingLaptop1 = laptop1Repository.findById(id);
//		if(existingLaptop1.isPresent())
//		{
//
//			//modify in app layer
//			Laptop1 laptop1 = existingLaptop1.get();
//			laptop1.setName(updatinglaptop1.getName());
//
//			//save the updated record
//			laptop1Repository.save(laptop1);
//
//			return "Updtae sucess";
//		}
//		else {
//			return "record not found";
//		}
//	}
//	@Override
//	public Laptop1 getLaptop1ByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}
}
