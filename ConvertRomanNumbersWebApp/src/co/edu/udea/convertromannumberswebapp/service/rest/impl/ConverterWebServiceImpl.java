package co.edu.udea.convertromannumberswebapp.service.rest.impl;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.udea.convertromannumberswebapp.model.Converter;
import co.edu.udea.convertromannumberswebapp.service.rest.IConvertWebService;

@Path("/number")
@WebService(endpointInterface = "co.edu.udea.convertromannumberswebapp.service.rest.IConvertWebService")
public class ConverterWebServiceImpl implements IConvertWebService {

	private Converter converter;

	public ConverterWebServiceImpl() {
		converter = new Converter();
	}

	@GET
	@Override
	@Produces(value = { MediaType.APPLICATION_JSON })
	public String ConverterToRomanNumber(
			@QueryParam(value = "number") String number) {
		return converter.ConverterToRomanNumber(number);
	}
}
