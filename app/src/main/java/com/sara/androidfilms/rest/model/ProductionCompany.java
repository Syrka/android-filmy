package com.sara.androidfilms.rest.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class ProductionCompany {

@SerializedName("name")
@Expose
private String name;
@SerializedName("id")
@Expose
private Integer id;

/**
* No args constructor for use in serialization
*
*/
public ProductionCompany() {
}

/**
*
* @param id
* @param name
*/
public ProductionCompany(String name, Integer id) {
this.name = name;
this.id = id;
}

/**
*
* @return
* The name
*/
public String getName() {
return name;
}

/**
*
* @param name
* The name
*/
public void setName(String name) {
this.name = name;
}

public ProductionCompany withName(String name) {
this.name = name;
return this;
}

/**
*
* @return
* The id
*/
public Integer getId() {
return id;
}

/**
*
* @param id
* The id
*/
public void setId(Integer id) {
this.id = id;
}

public ProductionCompany withId(Integer id) {
this.id = id;
return this;
}

}