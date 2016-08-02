package com.walmart.epf;

import javax.ws.rs.Path;
///http://localhost:8088/EPFRestConsumer/rest/UserService/users/
@Path("/UserService2")
public class UserService2 {/*

   @GET
   @Path("/users")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   public String getUsers(@QueryParam("eventID") String eventID){
	   System.out.println("Ranjan"+eventID);
	   String s="Ranjan";
	
	   
      return this.getAllUsers();
   }	
   
   String getAllUsers(){
	   System.out.println("UserList ");
	   List<String> s= new ArrayList<String>();
	   s.add("Ranjan");
	   return "Ranjan";
	   
	   
   }

   @GET
   @Path("/student")
   @Produces(MediaType.APPLICATION_JSON)
   @Consumes(MediaType.APPLICATION_JSON)
   public Student produceJSON( @QueryParam("name") String name ) {

		Student st = new Student(name, "Diaz",22,1);

		return st;

	}
   
   
    @POST
	@Path("/send")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response consumeJSON( Student student ) {

		String output = student.toString();

		return Response.status(200).entity(output).build();
	}

   
   asm.jar
   jersey-bundle.jar
   json.jar
   jersey-server.jar
*/}