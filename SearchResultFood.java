package com.USDAFoodDataCentralAPI.models;

import java.lang.Object;

public class SearchResultFood extends Usda {
  // Any additional descriptions of the food.
  private String additionaldescriptions;
    
  // allHighlightFields
  private String allhighlightfields;
    
  // Brand owner for the food. Only applies to Branded Foods.
  private String brandowner;
    
  // The type of the food data.
  private String datatype;
    
  // The description of the food.
  private String description;
    
  // Unique ID of the food.
  private int fdcid;
    
  // Any A unique ID identifying the food within FNDDS.
  private String foodcode;
    
  private String[] foodnutrients;

  // GTIN or UPC code identifying the food. Only applies to Branded Foods.
  private String gtinupc;
    
  // The list of ingredients (as it appears on the product label). Only applies to Branded Foods.
  private String ingredients;
    
  // Unique number assigned for foundation foods. Only applies to Foundation and SRLegacy Foods.
  private int ndbnumber;
    
  // Date the item was published to FDC.
  private String publicationdate;
    
  // The scientific name of the food.
  private String scientificname;
    
  // Relative score indicating how well the food matches the search criteria.
  private float score;
    
  // Any additional descriptions of the food.
  public String getAdditionalDescriptions() {
        return this.additionaldescriptions;
  }

  // Any additional descriptions of the food.
  public void setAdditionalDescriptions(String additionaldescriptions) {
        this.additionaldescriptions = additionaldescriptions;
  }

  // allHighlightFields
  public String getAllHighlightFields() {
        return this.allhighlightfields;
  }

  // allHighlightFields
  public void setAllHighlightFields(String allhighlightfields) {
        this.allhighlightfields = allhighlightfields;
  }

  // Brand owner for the food. Only applies to Branded Foods.
  public String getBrandOwner() {
        return this.brandowner;
  }

  // Brand owner for the food. Only applies to Branded Foods.
  public void setBrandOwner(String brandowner) {
        this.brandowner = brandowner;
  }

  // The type of the food data.
  public String getDataType() {
        return this.datatype;
  }

  // The type of the food data.
  public void setDataType(String datatype) {
        this.datatype = datatype;
  }

  // The description of the food.
  public String getDescription() {
        return this.description;
  }

  // The description of the food.
  public void setDescription(String description) {
        this.description = description;
  }

  // Unique ID of the food.
  public int getFdcId() {
        return this.fdcid;
  }

  // Unique ID of the food.
  public void setFdcId(int fdcid) {
        this.fdcid = fdcid;
  }

  // Any A unique ID identifying the food within FNDDS.
  public String getFoodCode() {
        return this.foodcode;
  }

  // Any A unique ID identifying the food within FNDDS.
  public void setFoodCode(String foodcode) {
        this.foodcode = foodcode;
  }

  public String[] getFoodNutrients() {
    return this.foodnutrients;
  }

  public void setFoodNutrients(String[] foodnutrients) {
    this.foodnutrients = foodnutrients;
  }

  // GTIN or UPC code identifying the food. Only applies to Branded Foods.
  public String getGtinUpc() {
        return this.gtinupc;
  }

  // GTIN or UPC code identifying the food. Only applies to Branded Foods.
  public void setGtinUpc(String gtinupc) {
        this.gtinupc = gtinupc;
  }

  // The list of ingredients (as it appears on the product label). Only applies to Branded Foods.
  public String getIngredients() {
        return this.ingredients;
  }

  // The list of ingredients (as it appears on the product label). Only applies to Branded Foods.
  public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
  }

  // Unique number assigned for foundation foods. Only applies to Foundation and SRLegacy Foods.
  public int getNdbNumber() {
        return this.ndbnumber;
  }

  // Unique number assigned for foundation foods. Only applies to Foundation and SRLegacy Foods.
  public void setNdbNumber(int ndbnumber) {
        this.ndbnumber = ndbnumber;
  }

  // Date the item was published to FDC.
  public String getPublicationDate() {
        return this.publicationdate;
  }

  // Date the item was published to FDC.
  public void setPublicationDate(String publicationdate) {
        this.publicationdate = publicationdate;
  }

  // The scientific name of the food.
  public String getScientificName() {
        return this.scientificname;
  }

  // The scientific name of the food.
  public void setScientificName(String scientificname) {
        this.scientificname = scientificname;
  }

  // Relative score indicating how well the food matches the search criteria.
  public float getScore() {
        return this.score;
  }

  // Relative score indicating how well the food matches the search criteria.
  public void setScore(float score) {
        this.score = score;
  }
}
