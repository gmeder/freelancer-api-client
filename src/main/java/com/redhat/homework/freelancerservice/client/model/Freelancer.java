/**
 * FreelancerAPI
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.redhat.homework.freelancerservice.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import com.redhat.homework.freelancerservice.client.model.Skill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


/**
 * Freelancer
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2019-07-04T14:38:57.082-05:00")
public class Freelancer   {
  @SerializedName("freelancerId")
  private Integer freelancerId = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("emailAddress")
  private String emailAddress = null;

  @SerializedName("skills")
  private List<Skill> skills = new ArrayList<Skill>();

  public Freelancer freelancerId(Integer freelancerId) {
    this.freelancerId = freelancerId;
    return this;
  }

   /**
   * Get freelancerId
   * @return freelancerId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getFreelancerId() {
    return freelancerId;
  }

  public void setFreelancerId(Integer freelancerId) {
    this.freelancerId = freelancerId;
  }

  public Freelancer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Freelancer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Freelancer emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmailAddress() {
    return emailAddress;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public Freelancer skills(List<Skill> skills) {
    this.skills = skills;
    return this;
  }

  public Freelancer addSkillsItem(Skill skillsItem) {
    this.skills.add(skillsItem);
    return this;
  }

   /**
   * Get skills
   * @return skills
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Skill> getSkills() {
    return skills;
  }

  public void setSkills(List<Skill> skills) {
    this.skills = skills;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Freelancer freelancer = (Freelancer) o;
    return Objects.equals(this.freelancerId, freelancer.freelancerId) &&
        Objects.equals(this.firstName, freelancer.firstName) &&
        Objects.equals(this.lastName, freelancer.lastName) &&
        Objects.equals(this.emailAddress, freelancer.emailAddress) &&
        Objects.equals(this.skills, freelancer.skills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(freelancerId, firstName, lastName, emailAddress, skills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Freelancer {\n");
    
    sb.append("    freelancerId: ").append(toIndentedString(freelancerId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
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

