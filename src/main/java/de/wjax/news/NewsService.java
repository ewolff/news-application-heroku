package de.wjax.news;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

@Component
public class NewsService {
	@PersistenceContext
	private EntityManager em;

	public List<NewsEntity> getAllNews() {
		return em.createNamedQuery("News.selectAll", NewsEntity.class)
				.getResultList();
	}
}