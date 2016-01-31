package com.sara.androidfilms.rest.model;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class FilmDetail {

@SerializedName("adult")
@Expose
private Boolean adult;
@SerializedName("backdrop_path")
@Expose
private String backdropPath;
@SerializedName("belongs_to_collection")
@Expose
private BelongsToCollection belongsToCollection;
@SerializedName("budget")
@Expose
private Integer budget;
@SerializedName("genres")
@Expose
private List<Genre> genres = new ArrayList<Genre>();
@SerializedName("homepage")
@Expose
private String homepage;
@SerializedName("id")
@Expose
private Integer id;
@SerializedName("imdb_id")
@Expose
private String imdbId;
@SerializedName("original_language")
@Expose
private String originalLanguage;
@SerializedName("original_title")
@Expose
private String originalTitle;
@SerializedName("overview")
@Expose
private String overview;
@SerializedName("popularity")
@Expose
private Double popularity;
@SerializedName("poster_path")
@Expose
private String posterPath;
@SerializedName("production_companies")
@Expose
private List<ProductionCompany> productionCompanies = new ArrayList<ProductionCompany>();
@SerializedName("production_countries")
@Expose
private List<ProductionCountry> productionCountries = new ArrayList<ProductionCountry>();
@SerializedName("release_date")
@Expose
private String releaseDate;
@SerializedName("revenue")
@Expose
private Integer revenue;
@SerializedName("runtime")
@Expose
private Integer runtime;
@SerializedName("spoken_languages")
@Expose
private List<SpokenLanguage> spokenLanguages = new ArrayList<SpokenLanguage>();
@SerializedName("status")
@Expose
private String status;
@SerializedName("tagline")
@Expose
private String tagline;
@SerializedName("title")
@Expose
private String title;
@SerializedName("video")
@Expose
private Boolean video;
@SerializedName("vote_average")
@Expose
private Double voteAverage;
@SerializedName("vote_count")
@Expose
private Integer voteCount;

/**
* No args constructor for use in serialization
*
*/
public FilmDetail() {
}

/**
*
* @param budget
* @param genres
* @param spokenLanguages
* @param runtime
* @param backdropPath
* @param voteCount
* @param id
* @param title
* @param releaseDate
* @param posterPath
* @param originalTitle
* @param voteAverage
* @param video
* @param popularity
* @param revenue
* @param productionCountries
* @param status
* @param originalLanguage
* @param adult
* @param imdbId
* @param homepage
* @param overview
* @param belongsToCollection
* @param productionCompanies
* @param tagline
*/
public FilmDetail(Boolean adult, String backdropPath, BelongsToCollection belongsToCollection, Integer budget, List<Genre> genres, String homepage, Integer id, String imdbId, String originalLanguage, String originalTitle, String overview, Double popularity, String posterPath, List<ProductionCompany> productionCompanies, List<ProductionCountry> productionCountries, String releaseDate, Integer revenue, Integer runtime, List<SpokenLanguage> spokenLanguages, String status, String tagline, String title, Boolean video, Double voteAverage, Integer voteCount) {
this.adult = adult;
this.backdropPath = backdropPath;
this.belongsToCollection = belongsToCollection;
this.budget = budget;
this.genres = genres;
this.homepage = homepage;
this.id = id;
this.imdbId = imdbId;
this.originalLanguage = originalLanguage;
this.originalTitle = originalTitle;
this.overview = overview;
this.popularity = popularity;
this.posterPath = posterPath;
this.productionCompanies = productionCompanies;
this.productionCountries = productionCountries;
this.releaseDate = releaseDate;
this.revenue = revenue;
this.runtime = runtime;
this.spokenLanguages = spokenLanguages;
this.status = status;
this.tagline = tagline;
this.title = title;
this.video = video;
this.voteAverage = voteAverage;
this.voteCount = voteCount;
}

/**
*
* @return
* The adult
*/
public Boolean getAdult() {
return adult;
}

/**
*
* @param adult
* The adult
*/
public void setAdult(Boolean adult) {
this.adult = adult;
}

public FilmDetail withAdult(Boolean adult) {
this.adult = adult;
return this;
}

/**
*
* @return
* The backdropPath
*/
public String getBackdropPath() {
return backdropPath;
}

/**
*
* @param backdropPath
* The backdrop_path
*/
public void setBackdropPath(String backdropPath) {
this.backdropPath = backdropPath;
}

public FilmDetail withBackdropPath(String backdropPath) {
this.backdropPath = backdropPath;
return this;
}

/**
*
* @return
* The belongsToCollection
*/
public BelongsToCollection getBelongsToCollection() {
return belongsToCollection;
}

/**
*
* @param belongsToCollection
* The belongs_to_collection
*/
public void setBelongsToCollection(BelongsToCollection belongsToCollection) {
this.belongsToCollection = belongsToCollection;
}

public FilmDetail withBelongsToCollection(BelongsToCollection belongsToCollection) {
this.belongsToCollection = belongsToCollection;
return this;
}

/**
*
* @return
* The budget
*/
public Integer getBudget() {
return budget;
}

/**
*
* @param budget
* The budget
*/
public void setBudget(Integer budget) {
this.budget = budget;
}

public FilmDetail withBudget(Integer budget) {
this.budget = budget;
return this;
}

/**
*
* @return
* The genres
*/
public List<Genre> getGenres() {
return genres;
}

/**
*
* @param genres
* The genres
*/
public void setGenres(List<Genre> genres) {
this.genres = genres;
}

public FilmDetail withGenres(List<Genre> genres) {
this.genres = genres;
return this;
}

/**
*
* @return
* The homepage
*/
public String getHomepage() {
return homepage;
}

/**
*
* @param homepage
* The homepage
*/
public void setHomepage(String homepage) {
this.homepage = homepage;
}

public FilmDetail withHomepage(String homepage) {
this.homepage = homepage;
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

public FilmDetail withId(Integer id) {
this.id = id;
return this;
}

/**
*
* @return
* The imdbId
*/
public String getImdbId() {
return imdbId;
}

/**
*
* @param imdbId
* The imdb_id
*/
public void setImdbId(String imdbId) {
this.imdbId = imdbId;
}

public FilmDetail withImdbId(String imdbId) {
this.imdbId = imdbId;
return this;
}

/**
*
* @return
* The originalLanguage
*/
public String getOriginalLanguage() {
return originalLanguage;
}

/**
*
* @param originalLanguage
* The original_language
*/
public void setOriginalLanguage(String originalLanguage) {
this.originalLanguage = originalLanguage;
}

public FilmDetail withOriginalLanguage(String originalLanguage) {
this.originalLanguage = originalLanguage;
return this;
}

/**
*
* @return
* The originalTitle
*/
public String getOriginalTitle() {
return originalTitle;
}

/**
*
* @param originalTitle
* The original_title
*/
public void setOriginalTitle(String originalTitle) {
this.originalTitle = originalTitle;
}

public FilmDetail withOriginalTitle(String originalTitle) {
this.originalTitle = originalTitle;
return this;
}

/**
*
* @return
* The overview
*/
public String getOverview() {
return overview;
}

/**
*
* @param overview
* The overview
*/
public void setOverview(String overview) {
this.overview = overview;
}

public FilmDetail withOverview(String overview) {
this.overview = overview;
return this;
}

/**
*
* @return
* The popularity
*/
public Double getPopularity() {
return popularity;
}

/**
*
* @param popularity
* The popularity
*/
public void setPopularity(Double popularity) {
this.popularity = popularity;
}

public FilmDetail withPopularity(Double popularity) {
this.popularity = popularity;
return this;
}

/**
*
* @return
* The posterPath
*/
public String getPosterPath() {
return posterPath;
}

/**
*
* @param posterPath
* The poster_path
*/
public void setPosterPath(String posterPath) {
this.posterPath = posterPath;
}

public FilmDetail withPosterPath(String posterPath) {
this.posterPath = posterPath;
return this;
}

/**
*
* @return
* The productionCompanies
*/
public List<ProductionCompany> getProductionCompanies() {
return productionCompanies;
}

/**
*
* @param productionCompanies
* The production_companies
*/
public void setProductionCompanies(List<ProductionCompany> productionCompanies) {
this.productionCompanies = productionCompanies;
}

public FilmDetail withProductionCompanies(List<ProductionCompany> productionCompanies) {
this.productionCompanies = productionCompanies;
return this;
}

/**
*
* @return
* The productionCountries
*/
public List<ProductionCountry> getProductionCountries() {
return productionCountries;
}

/**
*
* @param productionCountries
* The production_countries
*/
public void setProductionCountries(List<ProductionCountry> productionCountries) {
this.productionCountries = productionCountries;
}

public FilmDetail withProductionCountries(List<ProductionCountry> productionCountries) {
this.productionCountries = productionCountries;
return this;
}

/**
*
* @return
* The releaseDate
*/
public String getReleaseDate() {
return releaseDate;
}

/**
*
* @param releaseDate
* The release_date
*/
public void setReleaseDate(String releaseDate) {
this.releaseDate = releaseDate;
}

public FilmDetail withReleaseDate(String releaseDate) {
this.releaseDate = releaseDate;
return this;
}

/**
*
* @return
* The revenue
*/
public Integer getRevenue() {
return revenue;
}

/**
*
* @param revenue
* The revenue
*/
public void setRevenue(Integer revenue) {
this.revenue = revenue;
}

public FilmDetail withRevenue(Integer revenue) {
this.revenue = revenue;
return this;
}

/**
*
* @return
* The runtime
*/
public Integer getRuntime() {
return runtime;
}

/**
*
* @param runtime
* The runtime
*/
public void setRuntime(Integer runtime) {
this.runtime = runtime;
}

public FilmDetail withRuntime(Integer runtime) {
this.runtime = runtime;
return this;
}

/**
*
* @return
* The spokenLanguages
*/
public List<SpokenLanguage> getSpokenLanguages() {
return spokenLanguages;
}

/**
*
* @param spokenLanguages
* The spoken_languages
*/
public void setSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
this.spokenLanguages = spokenLanguages;
}

public FilmDetail withSpokenLanguages(List<SpokenLanguage> spokenLanguages) {
this.spokenLanguages = spokenLanguages;
return this;
}

/**
*
* @return
* The status
*/
public String getStatus() {
return status;
}

/**
*
* @param status
* The status
*/
public void setStatus(String status) {
this.status = status;
}

public FilmDetail withStatus(String status) {
this.status = status;
return this;
}

/**
*
* @return
* The tagline
*/
public String getTagline() {
return tagline;
}

/**
*
* @param tagline
* The tagline
*/
public void setTagline(String tagline) {
this.tagline = tagline;
}

public FilmDetail withTagline(String tagline) {
this.tagline = tagline;
return this;
}

/**
*
* @return
* The title
*/
public String getTitle() {
return title;
}

/**
*
* @param title
* The title
*/
public void setTitle(String title) {
this.title = title;
}

public FilmDetail withTitle(String title) {
this.title = title;
return this;
}

/**
*
* @return
* The video
*/
public Boolean getVideo() {
return video;
}

/**
*
* @param video
* The video
*/
public void setVideo(Boolean video) {
this.video = video;
}

public FilmDetail withVideo(Boolean video) {
this.video = video;
return this;
}

/**
*
* @return
* The voteAverage
*/
public Double getVoteAverage() {
return voteAverage;
}

/**
*
* @param voteAverage
* The vote_average
*/
public void setVoteAverage(Double voteAverage) {
this.voteAverage = voteAverage;
}

public FilmDetail withVoteAverage(Double voteAverage) {
this.voteAverage = voteAverage;
return this;
}

/**
*
* @return
* The voteCount
*/
public Integer getVoteCount() {
return voteCount;
}

/**
*
* @param voteCount
* The vote_count
*/
public void setVoteCount(Integer voteCount) {
this.voteCount = voteCount;
}

public FilmDetail withVoteCount(Integer voteCount) {
this.voteCount = voteCount;
return this;
}

}