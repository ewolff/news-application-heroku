package de.wjax.news;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@Entity(name = "News")
@Table(name = "t_news")
@NamedQuery(name = "News.selectAll", query = "SELECT ne FROM News ne")
@XmlRootElement(name = "news")
@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings("serial")
public class NewsEntity implements Serializable {
	@Id @GeneratedValue
	@XmlAttribute
	private Integer newsId;
	
	@XmlAttribute
	private String title;
	
	@XmlAttribute
	private String text;

	public Integer getNewsId() {
		return this.newsId;
	}

	public void setNewsId(Integer newsId) {
		this.newsId = newsId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}
}