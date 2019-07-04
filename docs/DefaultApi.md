# DefaultApi

All URIs are relative to *http://127.0.0.1:8082/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFreelancers**](DefaultApi.md#getFreelancers) | **GET** /freelancers | 
[**getFreelancersById**](DefaultApi.md#getFreelancersById) | **GET** /freelancers/{freelancerId} | 

<a name="getFreelancers"></a>
# **getFreelancers**
> List&lt;Freelancer&gt; getFreelancers()



### Example
```java
// Import classes:
//import com.redhat.homework.freelancerservice.client.invoker.ApiException;
//import com.redhat.homework.freelancerservice.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
try {
    List<Freelancer> result = apiInstance.getFreelancers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getFreelancers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Freelancer&gt;**](Freelancer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFreelancersById"></a>
# **getFreelancersById**
> getFreelancersById(freelancerId)



### Example
```java
// Import classes:
//import com.redhat.homework.freelancerservice.client.invoker.ApiException;
//import com.redhat.homework.freelancerservice.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String freelancerId = "freelancerId_example"; // String | 
try {
    apiInstance.getFreelancersById(freelancerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getFreelancersById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **freelancerId** | **String**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

