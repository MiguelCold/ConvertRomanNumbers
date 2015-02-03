package co.edu.udea.convertromannumberswebapp.service.rest;

import co.edu.udea.convertromannumberswebapp.model.Converter;
import co.edu.udea.convertromannumberswebapp.model.Response;

public interface IConvertWebService {

	public Response ConverterToRomanNumber(String number);
}
