package com.sara.androidfilms.rest.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Credits {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("cast")
@Expose
private List<Cast> cast = new ArrayList<Cast>();
@SerializedName("crew")
@Expose
private List<Crew> crew = new ArrayList<Crew>();

/**
* No args constructor for use in serialization
*
*/
public Credits() {
}

/**
*
* @param id
* @param cast
* @param crew
*/
public Credits(Integer id, List<Cast> cast, List<Crew> crew) {
this.id = id;
this.cast = cast;
this.crew = crew;
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

public Credits withId(Integer id) {
this.id = id;
return this;
}

/**
*
* @return
* The cast
*/
public List<Cast> getCast() {
return cast;
}

/**
*
* @param cast
* The cast
*/
public void setCast(List<Cast> cast) {
this.cast = cast;
}

public Credits withCast(List<Cast> cast) {
this.cast = cast;
return this;
}

/**
*
* @return
* The crew
*/
public List<Crew> getCrew() {
return crew;
}

/**
*
* @param crew
* The crew
*/
public void setCrew(List<Crew> crew) {
this.crew = crew;
}

public Credits withCrew(List<Crew> crew) {
this.crew = crew;
return this;
}

}