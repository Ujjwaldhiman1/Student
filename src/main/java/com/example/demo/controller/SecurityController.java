package com.example.demo.controller;
  
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; 
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;  
import com.example.demo.Services.*; 
import com.example.demo.model.Security;

import io.swagger.annotations.Api;


@RestController 
@Api(value="securitycontroller", description="Security pertaining to products for User Safety")
public class SecurityController {
	@Autowired  
	SecurityServices SecurityServices ;
	//creating a get mapping that retrieves all the security detail from the database   
	@GetMapping("/security")  
	private List<Security> getAllSecurity()   
	{  
	return SecurityServices.getAllSecurity();
	} 
	/*
	//creating a get mapping that retrieves the detail of a specific security
	@ApiOperation(value = "View a id of available security",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value = "/id", method= RequestMethod.GET, produces = "application/json")
    public Iterable list(Model model){
        Iterable securityList = SecurityServices.listAllSecurity();
        return securityList;
    }
    */
	@GetMapping("/security/{id}")  
	private Security getSecurity(@PathVariable("id") int id)   
	{  
	return SecurityServices.getSecurityById(id);
	} 
	/*
	@ApiOperation(value = "Add a security")
    @RequestMapping(value = "/saveSecurity", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity saveProduct(@RequestBody Security security){
        SecurityServices.saveSecurity(security);
        return new ResponseEntity("Security saved successfully", HttpStatus.OK);
    }
	
	*/
	@PostMapping("/security")
	private int saveSecurity(@RequestBody Security security)
	{  
	SecurityServices.saveOrUpdate(security);
	return security.getId();
	}  
	//creating a delete mapping that deletes a specified security
	
	/*
    @ApiOperation(value = "Delete a security")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity delete(@PathVariable Integer id)
    {
       SecurityServices.deleteSecurity(id);
       return new ResponseEntity("Product deleted successfully", HttpStatus.OK);

            }
*/
	@DeleteMapping("/security/{id}")  
	private void deleteSecurity(@PathVariable("id") int id)
	{  
		SecurityServices.delete(id);
	} 
	
	/*@ApiOperation(value = "Update a product")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity updateProduct(@PathVariable Integer id, @RequestBody Security security){
        Security storedSecurity = SecurityServices.getSecurityById(id);
        storedSecurity.setGroupName(security.getGroupName());
        storedSecurity.setDelete(security.getDelete());
        storedSecurity.setEnable(security.getEnable());
        SecurityServices.saveOrUpdate(storedSecurity);
        return new ResponseEntity("Product updated successfully", HttpStatus.OK);
    }
	
	//creating put mapping that updates the security detail */  
	@PutMapping("/security/{id}")  
	private Security update(@RequestBody Security security)
	{  
		SecurityServices.saveOrUpdate(security);
	return security;
	}  

}