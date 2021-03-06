// Copyright 2018-2020 Polyaxon, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/*
 * Polyaxon SDKs and REST API specification.
 * Polyaxon SDKs and REST API specification.
 *
 * OpenAPI spec version: 1.0.71
 * Contact: contact@polyaxon.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1Container;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1ArtifactsType;
import io.swagger.client.model.V1DockerfileType;
import io.swagger.client.model.V1GitType;
import java.io.IOException;

/**
 * V1Init
 */

public class V1Init {
  @SerializedName("artifacts")
  private V1ArtifactsType artifacts = null;

  @SerializedName("git")
  private V1GitType git = null;

  @SerializedName("dockerfile")
  private V1DockerfileType dockerfile = null;

  @SerializedName("connection")
  private String connection = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("container")
  private V1Container container = null;

  public V1Init artifacts(V1ArtifactsType artifacts) {
    this.artifacts = artifacts;
    return this;
  }

   /**
   * Get artifacts
   * @return artifacts
  **/
  @ApiModelProperty(value = "")
  public V1ArtifactsType getArtifacts() {
    return artifacts;
  }

  public void setArtifacts(V1ArtifactsType artifacts) {
    this.artifacts = artifacts;
  }

  public V1Init git(V1GitType git) {
    this.git = git;
    return this;
  }

   /**
   * Get git
   * @return git
  **/
  @ApiModelProperty(value = "")
  public V1GitType getGit() {
    return git;
  }

  public void setGit(V1GitType git) {
    this.git = git;
  }

  public V1Init dockerfile(V1DockerfileType dockerfile) {
    this.dockerfile = dockerfile;
    return this;
  }

   /**
   * Get dockerfile
   * @return dockerfile
  **/
  @ApiModelProperty(value = "")
  public V1DockerfileType getDockerfile() {
    return dockerfile;
  }

  public void setDockerfile(V1DockerfileType dockerfile) {
    this.dockerfile = dockerfile;
  }

  public V1Init connection(String connection) {
    this.connection = connection;
    return this;
  }

   /**
   * Get connection
   * @return connection
  **/
  @ApiModelProperty(value = "")
  public String getConnection() {
    return connection;
  }

  public void setConnection(String connection) {
    this.connection = connection;
  }

  public V1Init path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @ApiModelProperty(value = "")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public V1Init container(V1Container container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public V1Container getContainer() {
    return container;
  }

  public void setContainer(V1Container container) {
    this.container = container;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1Init v1Init = (V1Init) o;
    return Objects.equals(this.artifacts, v1Init.artifacts) &&
        Objects.equals(this.git, v1Init.git) &&
        Objects.equals(this.dockerfile, v1Init.dockerfile) &&
        Objects.equals(this.connection, v1Init.connection) &&
        Objects.equals(this.path, v1Init.path) &&
        Objects.equals(this.container, v1Init.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifacts, git, dockerfile, connection, path, container);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1Init {\n");
    
    sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
    sb.append("    git: ").append(toIndentedString(git)).append("\n");
    sb.append("    dockerfile: ").append(toIndentedString(dockerfile)).append("\n");
    sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

