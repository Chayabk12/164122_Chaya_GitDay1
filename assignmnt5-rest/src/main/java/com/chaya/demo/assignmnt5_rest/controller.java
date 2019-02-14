package com.chaya.demo.assignmnt5_rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/controller")
public class controller 
{
	@GET
    @Produces({ MediaType.APPLICATION_JSON })
    public List<Employee> getEmployees_JSON() {
        List<Employee> list = empResource.getAllEmployees();
        return list;
    }
 
	 @GET
	    @Path("/{empid}")
	    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	    public Employee getEmployee(@PathParam("empNo") int empid) {
	        return empResource.getEmployee(empid);
	    }
}