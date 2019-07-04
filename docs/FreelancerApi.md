# FreelancerApi

All URIs are relative to *http://127.0.0.1:8082/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFreelancers**](FreelancerApi.md#getFreelancers) | **GET** /freelancers | 
[**getFreelancersById**](FreelancerApi.md#getFreelancersById) | **GET** /freelancers/{freelancerId} | 


<a name="getFreelancers"></a>
# **getFreelancers**
> List&lt;Freelancer&gt; getFreelancers()



### Example
```java
// Import classes:
//import com.redhat.homework.freelancerservice.client.invoker.ApiException;
//import com.redhat.homework.freelancerservice.client.api.FreelancerApi;


FreelancerApi apiInstance = new FreelancerApi();
try {
    List<Freelancer> result = apiInstance.getFreelancers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FreelancerApi#getFreelancers");
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
 - **Accept**: Not defined

<a name="getFreelancersById"></a>
# **getFreelancersById**
> Freelancer getFreelancersById(freelancerId)



### Example
```java
// Import classes:
//import com.redhat.homework.freelancerservice.client.invoker.ApiException;
//import com.redhat.homework.freelancerservice.client.api.FreelancerApi;


FreelancerApi apiInstance = new FreelancerApi();
Integer freelancerId = 56; // Integer | 
try {
    Freelancer result = apiInstance.getFreelancersById(freelancerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FreelancerApi#getFreelancersById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **freelancerId** | **Integer**|  |

### Return type

[**Freelancer**](Freelancer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

