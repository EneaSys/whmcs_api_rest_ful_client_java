
# RequestUpdateClientProduct

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceid** | **Integer** | The id of the client service to update | 
**pid** | **Integer** | The package id to associate with the service |  [optional]
**serverid** | **Integer** | The server id to associate with the service |  [optional]
**nextduedate** | **String** | The next due date of the service (Y-m-d) |  [optional]
**terminationDate** | **String** | Update the termination date of the service (Y-m-d) |  [optional]
**completedDate** | **String** | Update the completed date of the service (Y-m-d) |  [optional]
**domain** | **String** | The domain name to be changed to |  [optional]
**firstpaymentamount** | **Float** | The first payment amount on the service |  [optional]
**recurringamount** | **Float** | The recurring amount for automatic renewal invoices |  [optional]
**paymentmethod** | **String** | The payment method to associate in system format (eg paypal) |  [optional]
**subscriptionid** | **String** | The subscription ID to associate with the service |  [optional]
**status** | **String** | The status to change the service to |  [optional]
**notes** | **String** | The admin notes for the service |  [optional]
**serviceusername** | **String** | The service username |  [optional]
**servicepassword** | **String** | The service password |  [optional]
**overideautosuspend** | **String** | Should override auto suspend be provided (‘on’ or ‘off’) |  [optional]
**overidesuspenduntil** | **String** | Update the Override Suspend date of the service (Y-m-d) |  [optional]
**ns1** | **String** | Name server 1 (VPS/Dedicated servers only) |  [optional]
**ns2** | **String** | Name server 2 (VPS/Dedicated servers only) |  [optional]
**dedicatedip** | **String** | Dedicated ip of service |  [optional]
**assignedips** | **String** | IPs Assigned (VPS/Dedicated servers only) |  [optional]
**diskusage** | **Integer** | The disk usage in bytes |  [optional]
**disklimit** | **Integer** | The disk limit in bytes |  [optional]
**bwusage** | **Integer** | The bandwidth usage in bytes |  [optional]
**bwlimit** | **Integer** | The bandwidth limit in bytes |  [optional]
**suspendreason** | **String** | suspendreason |  [optional]
**promoid** | **Integer** | The promotion Id to associate |  [optional]
**unset** | **List&lt;String&gt;** | An array of items to unset. Can be one of: ‘domain’, ‘serviceusername’, ‘servicepassword’, ‘subscriptionid’, ‘ns1’, ‘ns2’, ‘dedicatedip’, ‘assignedips’, ‘notes’, ‘suspendreason’ |  [optional]
**autorecalc** | **Boolean** | Should the recurring amount of the service be automatically recalculated (this will ignore any passed $recurringamount) |  [optional]
**customfields** | **String** | Base64 encoded serialized array of custom field values - base64_encode(serialize(array(“1”&#x3D;&gt;“Yahoo”))); |  [optional]
**configoptions** | **String** | Base64 encoded serialized array of configurable option field values - base64_encode(serialize(array(configoptionid &#x3D;&gt; dropdownoptionid, XXX &#x3D;&gt; array(‘optionid’ &#x3D;&gt; YYY, ‘qty’ &#x3D;&gt; ZZZ)))) - XXX is the ID of the configurable option - YYY is the optionid found in tblhostingconfigoption.optionid - ZZZ is the quantity you want to use for that option |  [optional]



