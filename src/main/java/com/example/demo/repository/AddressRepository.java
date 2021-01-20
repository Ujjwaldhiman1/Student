package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.*;
@Repository
public interface AddressRepository extends JpaRepository<Address, Long> 
 {

	Address findByUser(User a);
	//Address getAddressById();

}
