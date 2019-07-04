# freelancer-api-client

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
    <groupId>com.redhat</groupId>
    <artifactId>freelancer-api-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.redhat:freelancer-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/freelancer-api-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.redhat.homework.freelancerservice.client.invoker.*;
import com.redhat.homework.freelancerservice.client.invoker.auth.*;
import com.redhat.homework.freelancerservice.client.invoker.model.*;
import com.redhat.homework.freelancerservice.client.api.FreelancerApi;

import java.io.File;
import java.util.*;

public class FreelancerApiExample {

    public static void main(String[] args) {
        
        FreelancerApi apiInstance = new FreelancerApi();
        try {
            List<Freelancer> result = apiInstance.getFreelancers();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FreelancerApi#getFreelancers");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://127.0.0.1:8082/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*FreelancerApi* | [**getFreelancers**](docs/FreelancerApi.md#getFreelancers) | **GET** /freelancers | 
*FreelancerApi* | [**getFreelancersById**](docs/FreelancerApi.md#getFreelancersById) | **GET** /freelancers/{freelancerId} | 


## Documentation for Models

 - [Freelancer](docs/Freelancer.md)
 - [Skill](docs/Skill.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



