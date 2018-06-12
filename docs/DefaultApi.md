# DefaultApi

All URIs are relative to *https://www.sm-host.com/modules/addons/rest_ful*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptOrder**](DefaultApi.md#acceptOrder) | **POST** /AcceptOrder | Accepts a pending order
[**addOrder**](DefaultApi.md#addOrder) | **POST** /AddOrder | Add order
[**updateClientProduct**](DefaultApi.md#updateClientProduct) | **POST** /UpdateClientProduct | Update client Product


<a name="acceptOrder"></a>
# **acceptOrder**
> WhmcsResponseSuccessAcceptOrder acceptOrder(apiParameters)

Accepts a pending order

Accepts a pending order

### Example
```java
// Import classes:
//import com.clodesk.lib.whmcs_api_restfull_client.invoker.ApiException;
//import com.clodesk.lib.whmcs_api_restfull_client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
RequestAcceptOrder apiParameters = new RequestAcceptOrder(); // RequestAcceptOrder | 
try {
    WhmcsResponseSuccessAcceptOrder result = apiInstance.acceptOrder(apiParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#acceptOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiParameters** | [**RequestAcceptOrder**](RequestAcceptOrder.md)|  |

### Return type

[**WhmcsResponseSuccessAcceptOrder**](WhmcsResponseSuccessAcceptOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addOrder"></a>
# **addOrder**
> WhmcsResponseSuccessAddOrder addOrder(apiParameters)

Add order

Adds an order to a client.

### Example
```java
// Import classes:
//import com.clodesk.lib.whmcs_api_restfull_client.invoker.ApiException;
//import com.clodesk.lib.whmcs_api_restfull_client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
RequestAddOrder apiParameters = new RequestAddOrder(); // RequestAddOrder | 
try {
    WhmcsResponseSuccessAddOrder result = apiInstance.addOrder(apiParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addOrder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiParameters** | [**RequestAddOrder**](RequestAddOrder.md)|  |

### Return type

[**WhmcsResponseSuccessAddOrder**](WhmcsResponseSuccessAddOrder.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClientProduct"></a>
# **updateClientProduct**
> WhmcsResponseSuccessUpdateClientProduct updateClientProduct(apiParameters)

Update client Product

Updates a Client Service

### Example
```java
// Import classes:
//import com.clodesk.lib.whmcs_api_restfull_client.invoker.ApiException;
//import com.clodesk.lib.whmcs_api_restfull_client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
RequestUpdateClientProduct apiParameters = new RequestUpdateClientProduct(); // RequestUpdateClientProduct | 
try {
    WhmcsResponseSuccessUpdateClientProduct result = apiInstance.updateClientProduct(apiParameters);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#updateClientProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiParameters** | [**RequestUpdateClientProduct**](RequestUpdateClientProduct.md)|  |

### Return type

[**WhmcsResponseSuccessUpdateClientProduct**](WhmcsResponseSuccessUpdateClientProduct.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

