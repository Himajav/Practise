package com.walmart.epf;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.dao.SelectData;
///http://localhost:8088/EPFRestConsumer/rest/UserService/users/
@Path("/UserService")
public class UserService {
	   ProductBean bean= new ProductBean();
   @GET
   @Path("/users")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   public String getUsers(@QueryParam("productid") int productid,@QueryParam("productName") String productName){
	   System.out.println("++++++"+productid+"---->"+productid );
	
	   bean.setProductid(productid);
	   bean.setProductName(productName);
	   String s="Ranjan";
	  // String output = student.toString();

		//return Response.status(200).entity(output).build();
	   
      return this.getAllUsers(bean);
   }	
   
   String getAllUsers(ProductBean bean){
	  
	   SelectData data = new SelectData();
	   System.out.println("UserList ");
	   data.getEmpData(bean);
	   return "Avula";
	   
	   
   }
   /*
   asm.jar
   jersey-bundle.jar
   json.jar
   jersey-server.jar*/
}