package com.api.filters;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class LoggingFilters implements Filter{
	
	private static final Logger logger = LogManager.getLogger(LoggingFilters.class);
    public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec, FilterContext ctx) {
    	Response response=ctx.next(requestSpec, responseSpec); //Request is executed and next is going to send me response
    	LogResponse(response);
    	return response;} // return response for assertion tests
    
    public void LogRequest(FilterableRequestSpecification requestSpec){
    	logger.info("BASEURI"+requestSpec.getBaseUri());
    	logger.info("Request Header "+requestSpec.getHeaders());
    	logger.info("Request Payload "+requestSpec.getBody());
    	logger.info("Path Param"+requestSpec.getPathParams());
     	logger.info("Query Param"+requestSpec.getQueryParams());

    }
    public void LogResponse(Response response ) {
    	logger.info("Request Header "+response.getHeaders());
    	logger.info("Request Payload "+response.getBody().prettyPrint());
     	logger.info("Status Code "+response.getStatusCode());
    }

}
