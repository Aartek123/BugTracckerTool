package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductImage")
public class ProductImage 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ImageID")
	private Integer ImageID;
	
	@Column(name="ImageName")
	private String ImageName;
	
	@Column(name="Img_Path")
	private String Img_Path;
	

	public String getImg_Path() {
		return Img_Path;
	}
	public void setImg_Path(String img_Path) {
		Img_Path = img_Path;
	}
	public Integer getImageID() 
	{
		return ImageID;
	}
	public void setImageID(Integer imageID) {
		ImageID = imageID;
	}
	@Column(name="ImageSize")
	private Integer ImageSize;
	
	public String getImageName() {
		return ImageName;
	}
	public void setImageName(String imageName) {
		ImageName = imageName;
	}
	public Integer getImageSize() {
		return ImageSize;
	}
	public void setImageSize(Integer imageSize) {
		ImageSize = imageSize;
	}
	
	

}
