package com.walmart.epf;

import javax.ws.rs.Consumes;
//http://localhost:8088/EPFRestConsumer/rest/epfService/input/?eventID=adsadsadsa&eventCountryCode=dssdsads&eventInstanceID=12321&eventClientID=dsads&eventPayload=param2&systemCode=wewr
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
  //   http://localhost:8088/EPFRestConsumer/rest/epfService/input/?eventID=adsadsadsa&eventCountryCode=dssdsads&eventInstanceID=12321&eventClientID=dsads&eventPayload=param2&systemCode=12321
@Path("/epfService")
public class EPFRestConsumer {
	Response response = null;
	EventProcessBean bean = null;
	final static Logger logger = Logger.getLogger(EPFRestConsumer.class);

	@POST
	@Path("/input")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_HTML)
	public Response getMsg(@QueryParam("eventID") String eventID,
			@QueryParam("eventCountryCode") String eventCountryCode,
			@QueryParam("eventInstanceID") String eventInstanceID, @QueryParam("eventClientID") String eventClientID,
			@QueryParam("eventPayload") String eventPayload, @QueryParam("systemCode") String systemCode) {

		logger.info(" EPFRestConsumer ::  ");
		logger.info(" Input parameters ::  \n eventCountryCode : " + eventCountryCode + "\n eventCountryCode ::"
				+ eventCountryCode + "\n eventInstanceID ::" + eventInstanceID + "\n eventClientID ::" + eventClientID
				+ "\n eventPayload ::" + eventPayload + "\n systemCode :: " + systemCode);

		if (eventID != null && eventCountryCode != null && eventInstanceID != null && eventPayload != null
				&& systemCode != null) {
			bean = new EventProcessBean();
			bean.setEventID(eventID);
			bean.setEventCountryCode(eventCountryCode);
			bean.setEventInstanceID(Integer.valueOf(eventInstanceID));
			bean.setEventPayload(eventPayload);
			bean.setSystemCode(systemCode);

			// add logic here and use this bean includes input values.

			int statusCodes = 200;
			response = getResponseCode(statusCodes);

		} else {
			int statusCodes = 400;
			response = getResponseCode(statusCodes);
			logger.info(" Error message :: Invalide input request !! ");
		}

		return response;

	}

	// Get response codes from the service..

	private Response getResponseCode(int responseCode) {

		String responseMsg = null;
		if (responseCode == 200) {
			responseMsg = "SUCCESS";
		} else if (responseCode == 400) {
			responseMsg = "Bad Request";
		} else if (responseCode == 204) {
			responseMsg = "204: No Content";
		} else {
			responseMsg = "204: No Content";
		}
		String msg = "ResponseMsg :: " + responseMsg + "  :: ResponseCode::" + responseCode;
		logger.info("ResponseMsg :: " + msg);
		Response.status(responseCode).entity(responseMsg).build();
		return Response.status(responseCode).entity(responseMsg).build();
	}
}