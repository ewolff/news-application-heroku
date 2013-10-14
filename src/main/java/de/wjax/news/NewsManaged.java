package de.wjax.news;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("appNews")
public class NewsManaged {

	@Autowired
	NewsService newsService;

	public List<NewsEntity> getAllNews() {
		return newsService.getAllNews();
	}
}