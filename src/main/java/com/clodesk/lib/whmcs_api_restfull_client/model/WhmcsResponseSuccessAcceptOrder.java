/*
 * WHMCS API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.clodesk.lib.whmcs_api_restfull_client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WhmcsResponseSuccessAcceptOrder
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-12T14:57:36.589Z")
public class WhmcsResponseSuccessAcceptOrder {
  @JsonProperty("result")
  private String result = null;

  public WhmcsResponseSuccessAcceptOrder result(String result) {
    this.result = result;
    return this;
  }

   /**
   * The result of the operation: success or error
   * @return result
  **/
  @ApiModelProperty(value = "The result of the operation: success or error")
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WhmcsResponseSuccessAcceptOrder whmcsResponseSuccessAcceptOrder = (WhmcsResponseSuccessAcceptOrder) o;
    return Objects.equals(this.result, whmcsResponseSuccessAcceptOrder.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhmcsResponseSuccessAcceptOrder {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

