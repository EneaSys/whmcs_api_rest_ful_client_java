# whmcs-api-restfull-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.clodesk.lib</groupId>
    <artifactId>whmcs-api-restfull-client</artifactId>
    <version>0.1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.clodesk.lib:whmcs-api-restfull-client:0.0.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/whmcs-api-restfull-client-0.0.1.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.clodesk.lib.whmcs_api_restfull_client.invoker.*;
import com.clodesk.lib.whmcs_api_restfull_client.invoker.auth.*;
import com.clodesk.lib.whmcs_api_restfull_client.model.*;
import com.clodesk.lib.whmcs_api_restfull_client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        RequestAddOrder apiParameters = new RequestAddOrder(); // RequestAddOrder | 
        try {
            WhmcsResponseSuccessAddOrder result = apiInstance.addOrder(apiParameters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addOrder");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://www.sm-host.com/modules/addons/rest_ful*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addOrder**](docs/DefaultApi.md#addOrder) | **POST** /AddOrder | Add order
*DefaultApi* | [**updateClientProduct**](docs/DefaultApi.md#updateClientProduct) | **POST** /UpdateClientProduct | Update client Product


## Documentation for Models

 - [RequestAddOrder](docs/RequestAddOrder.md)
 - [RequestUpdateClientProduct](docs/RequestUpdateClientProduct.md)
 - [WhmcsResponseGeneric](docs/WhmcsResponseGeneric.md)
 - [WhmcsResponseSuccessAddOrder](docs/WhmcsResponseSuccessAddOrder.md)
 - [WhmcsResponseSuccessUpdateClientProduct](docs/WhmcsResponseSuccessUpdateClientProduct.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



