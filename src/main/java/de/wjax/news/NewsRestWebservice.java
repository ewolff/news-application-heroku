package de.wjax.news;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/news")
@SuppressWarnings("unchecked")
public class NewsRestWebservice {
	@Autowired
	NewsService newsService;

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllNews() {
		JSONArray jsonArray = new JSONArray();
		JSONObject jsonObject;

		for (NewsEntity news : newsService.getAllNews()) {
			jsonObject = new JSONObject();
			jsonObject.put("newsid", news.getNewsId());
			jsonObject.put("title", news.getTitle());
			jsonObject.put("text", news.getText());

			jsonArray.add(jsonObject);
		}

		return jsonArray.toJSONString();
	}
}
