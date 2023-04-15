package com.USDAFoodDataCentralAPI.impl;


import javax.ws.rs.core.Response;
import com.USDAFoodDataCentralAPI.models.*;
import com.USDAFoodDataCentralAPI.resources.V1Resource;
import com.USDAFoodDataCentralAPI.services.V1Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

    import com.USDAFoodDataCentralAPI.models.v1.*;
public class Usda implements V1Service extends Main {
// Implement your logic here

    
  /**
   * Retrieves a single food item by an FDC ID. Optional format a...
   *
   * @param fdcId FDC id of the food to retrieve
   * @param format Optional. &apos;abridged&apos; for an abridged set of elements, &apos;full&apos;...
   * @param nutrients Optional. List of up to 25 nutrient numbers. Only the nutrie...
   */
  @Override
  public Response GetFood(GetFoodParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * Retrieves a list of food items by a list of up to 20 FDC IDs...
   *
   * @param fdcIds List of multiple FDC ID&apos;s. Should be comma separated list (e...
   * @param format Optional. &apos;abridged&apos; for an abridged set of elements, &apos;full&apos;...
   * @param nutrients Optional. List of up to 25 nutrient numbers. Only the nutrie...
   */
  @Override
  public Response GetFoods(GetFoodsParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }
          /**
   * Retrieves a list of food items by a list of up to 20 FDC IDs...
   *
   */
  @Override
  public Response PostFoods() {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * Retrieves a paged list of foods. Use the pageNumber paramete...
   *
   * @param dataType Optional. Filter on a specific data type; specify one or mor...
   * @param pageNumber Optional. Page number to retrieve. The offset into the overa...
   * @param pageSize Optional. Maximum number of results to return for the curren...
   * @param sortBy Optional. Specify one of the possible values to sort by that...
   * @param sortOrder Optional. The sort direction for the results. Only applicabl...
   */
  @Override
  public Response GetFoodsList(GetFoodsListParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }
          /**
   * Retrieves a paged list of foods. Use the pageNumber paramete...
   *
   */
  @Override
  public Response PostFoodsList() {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * Search for foods using keywords. Results can be filtered by ...
   *
   * @param brandOwner Optional. Filter results based on the brand owner of the foo...
   * @param dataType Optional. Filter on a specific data type; specify one or mor...
   * @param pageNumber Optional. Page number to retrieve. The offset into the overa...
   * @param pageSize Optional. Maximum number of results to return for the curren...
   * @param query One or more search terms.  The string may include [search op...
   * @param sortBy Optional. Specify one of the possible values to sort by that...
   * @param sortOrder Optional. The sort direction for the results. Only applicabl...
   */
  @Override
  public Response GetFoodsSearch(GetFoodsSearchParams params) {
    // Your code here


    return Response.status(200).build();                                                                 
  }
          /**
   * Search for foods using keywords. Results can be filtered by ...
   *
   */
  @Override
  public Response PostFoodsSearch() {
    // Your code here


    return Response.status(200).build();                                                                 
  }            
  /**
   * The OpenAPI 3.0 specification for the FDC API rendered as JS...
   *
   */
  @Override
  public Response GetJsonSpec() {
    // Your code here

    return Response.status(default).build(); 
  }            
  /**
   * The OpenAPI 3.0 specification for the FDC API rendered as YA...
   *
   */
  @Override
  public Response GetYamlSpec() {
    // Your code here

    return Response.status(default).build(); 
  }        }




    
