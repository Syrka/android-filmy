package com.sara.androidfilms.rest.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Genre {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("name")
@Expose
private String name;

/**
* No args constructor for use in serialization
*
*/
public Genre() {
}

/**
*
* @param id
* @param name
*/
public Genre(Integer id, String name) {
this.id = id;
this.name = name;
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

public Genre withId(Integer id) {
this.id = id;
return this;
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

public Genre withName(String name) {
this.name = name;
return this;
}

}
