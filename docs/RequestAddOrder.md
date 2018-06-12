
# RequestAddOrder

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clientid** | **Long** |  | 
**paymentmethod** | **String** | The payment method for the order in the system format. eg.,mailin | 
**pid** | **List&lt;Integer&gt;** | The array of product ids to add the order for |  [optional]
**domain** | **List&lt;String&gt;** | The array of domain names associated with the products/domains |  [optional]
**billingcycle** | **List&lt;String&gt;** | The array of billing cycles for the products |  [optional]
**domaintype** | **List&lt;String&gt;** | For domain registrations, an array of register or transfer values |  [optional]
**regperiod** | **List&lt;Integer&gt;** | For domain registrations, the registration periods for the domains in the order |  [optional]
**eppcode** | **List&lt;String&gt;** | For domain transfers. The epp codes for the domains being transferred in the order |  [optional]
**nameserver1** | **String** | The first nameserver to apply to all domains in the order |  [optional]
**nameserver2** | **String** | The second nameserver to apply to all domains in the order |  [optional]
**nameserver3** | **String** | The third nameserver to apply to all domains in the order |  [optional]
**nameserver4** | **String** | The fourth nameserver to apply to all domains in the order |  [optional]
**nameserver5** | **String** | The fifth nameserver to apply to all domains in the order |  [optional]
**customfields** | **List&lt;String&gt;** | The array of domain names associated with the products/domains |  [optional]
**configoptions** | **List&lt;String&gt;** | The array of domain names associated with the products/domains |  [optional]
**priceoverride** | **List&lt;String&gt;** | The array of domain names associated with the products/domains |  [optional]
**promocode** | **String** | The promotion code to apply to the order |  [optional]
**promooverride** | **Boolean** | Should the promotion apply to the order even without matching promotional products |  [optional]
**affid** | **Integer** | The affiliate id to associate with the order |  [optional]
**noinvoice** | **Boolean** | Set to true to suppress the invoice generating for the whole order |  [optional]
**noinvoiceemail** | **Boolean** | Set to try to suppress the Invoice Created email being sent for the order |  [optional]
**noemail** | **Boolean** | Set to true to suppress the Order Confirmation email being sent |  [optional]
**addons** | **List&lt;String&gt;** | A comma separated list of addons to create on order with the products |  [optional]
**hostname** | **List&lt;String&gt;** | The hostname of the server for VPS/Dedicated Server orders |  [optional]
**ns1prefix** | **List&lt;String&gt;** | The first nameserver prefix for the VPS/Dedicated server. Eg. ns1 in ns1.hostname.com |  [optional]
**ns2prefix** | **List&lt;String&gt;** | The second nameserver prefix for the VPS/Dedicated server. Eg. ns2 in ns2.hostname.com |  [optional]
**rootpw** | **List&lt;String&gt;** | The second nameserver prefix for the VPS/Dedicated server. Eg. ns2 in ns2.hostname.com |  [optional]



