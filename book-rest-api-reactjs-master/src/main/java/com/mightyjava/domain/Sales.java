package com.mightyjava.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_skidki")
public class Sales {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private String type_product;//author

	@Column(nullable = false)
	private String coverPhotoURL;

	@Column(nullable = false)
	private Long isbnNumber;

	@Column(nullable = false)
	private Double old_price;//price

	@Column(nullable = false)
	private Double new_price;//не было

	@Column(nullable = false)
	private String language;

	@Column(nullable = false)
	private String genre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getType_product() {
		return type_product;
	}

	public void setType_product(String type_product) {
		this.type_product = type_product;
	}

	public String getCoverPhotoURL() {
		return coverPhotoURL;
	}

	public void setCoverPhotoURL(String coverPhotoURL) {
		this.coverPhotoURL = coverPhotoURL;
	}

	public Long getIsbnNumber() {
		return isbnNumber;
	}

	public void setIsbnNumber(Long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}

	public Double getOld_price() {
		return old_price;
	}

	public void setOld_price(Double old_price) {
		this.old_price = old_price;
	}

	public Double getNew_price() {
		return new_price;
	}

	public void setNew_price(Double new_price) {
		this.new_price = new_price;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
}
