package com.waveface.pojo;


/**
 * 
 * @author lmichael
 *
 */
public class FilePOJO {

	/**
	 * uniqueIdentifier
	 */
	private String id;
	/**
	 * uniqueIdentifierOfAnUserEntity
	 */
	private String creator_id;
    /**
     * uniqueIdentifierOfAnArticleEntity
     */
    private String article_id; 
   
    private String timestamp;
    /**
     * representedResourceURL
     */
    private String url;
    /**
     * representedImageThumbnailURL
     */
    private String thumbnail_url;
    /**
     * anUTIType
     */
    private String type;
    /**
     * contentText
     */
    private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCreator_id() {
		return creator_id;
	}
	public void setCreator_id(String creator_id) {
		this.creator_id = creator_id;
	}
	public String getArticle_id() {
		return article_id;
	}
	public void setArticle_id(String article_id) {
		this.article_id = article_id;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	} 
}
