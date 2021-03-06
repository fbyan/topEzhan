package com.topaiebiz.goods.brand.dto;


import java.util.Date;
import javax.validation.constraints.NotNull;


/**
 * Description 商品品牌dto。  
 * 
 * Author Hedda 
 *    
 * Date 2017年9月23日 下午7:57:41 
 * 
 * Copyright Cognieon technology group co.LTD. All rights reserved.
 * 
 * Notice 本内容仅限于授权后使用，禁止非授权传阅以及私自用于其他商业目的。
 *
 */
public class BrandDto {
	
	/** 全局唯一主键标识符 （本字段是业务无关性的，仅用于关联）。 */
	private Long id;

	/** 唯一编码 （本字段是从业务角度考虑的，相当于全局的唯一业务主键）。 */
	@NotNull(message = "{validation.brand.brandCode}")
	private String brandCode;

	/** 品牌名称。 */
	@NotNull(message = "{validation.brand.name}")
	private String name;
	
	/** 英文名称。 */
	private String englishName;

	/** 品牌图片。 */
	@NotNull(message = "{validation.brand.brandImage}")
	private String brandImage;
	
	/** 品牌故事。*/
	private String brandStory;
	
	/** 备注。用于备注其他信息。 */
	private String memo;
	
	/** 创建时间。默认取值为系统的当前时间。 */
	private Date createdTime;

	/** 最后修改时间。默认取值为null，当发生修改时取系统的当前时间。 */
	private Date lastModifiedTime;
	
	/** 店铺id。*/
	private Long belongStore;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getBrandImage() {
		return brandImage;
	}

	public void setBrandImage(String brandImage) {
		this.brandImage = brandImage;
	}

	public String getBrandStory() {
		return brandStory;
	}

	public void setBrandStory(String brandStory) {
		this.brandStory = brandStory;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getLastModifiedTime() {
		return lastModifiedTime;
	}

	public void setLastModifiedTime(Date lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}

	public Long getBelongStore() {
		return belongStore;
	}

	public void setBelongStore(Long belongStore) {
		this.belongStore = belongStore;
	}
	
}
