
# RequestAcceptOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderid** | **Integer** | The order id to be accepted | 
**serverid** | **Integer** | The specific server to assign to products within the order |  [optional]
**serviceusername** | **String** | The specific username to assign to products within the order |  [optional]
**servicepassword** | **String** | The specific password to assign to products within the order |  [optional]
**registrar** | **String** | The specific registrar to assign to domains within the order |  [optional]
**sendregistrar** | **Boolean** | Send the request to the registrar to register the domain. |  [optional]
**autosetup** | **Boolean** | Send the request to the product module to activate the service. This can override the product configuration. |  [optional]
**sendemail** | **Boolean** | Send any automatic emails. This can be Product Welcome, Domain Renewal, Domain Transfer etc. |  [optional]



