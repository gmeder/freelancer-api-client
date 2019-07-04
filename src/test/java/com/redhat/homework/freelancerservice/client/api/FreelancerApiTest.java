/*
 * FreelancerAPI
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.redhat.homework.freelancerservice.client.api;

import com.redhat.homework.freelancerservice.client.invoker.ApiException;
import com.redhat.homework.freelancerservice.client.model.Freelancer;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FreelancerApi
 */
@Ignore
public class FreelancerApiTest {

    private final FreelancerApi api = new FreelancerApi();

    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFreelancersTest() throws ApiException {
        List<Freelancer> response = api.getFreelancers();

        // TODO: test validations
    }
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFreelancersByIdTest() throws ApiException {
        String freelancerId = null;
        api.getFreelancersById(freelancerId);

        // TODO: test validations
    }
}
