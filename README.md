Demo Application for WJAX PaaS Parade for Heroku
==================================================


# Uses

* Spring for Dependency Injection
* Hibernate for JPA
* MyFaces for JSF
* JAX RS (Jersey) for REST
* PostgreSQL as database


# Run

* Install Maven
* Create an account at Heroku: <http://heroku.com/>
* Install the Heroku toolbelt <https://toolbelt.heroku.com/>
* Package up the application `mvn package`
* Use `heroku create` to create a new application on Heroku
* `heroku addons:add heroku-postgresql:dev` adds the PostgreSQL PlugIn
* `heroku deploy:war --war target/news.war` deploys the application

Go to http://your-app.herokuapp.com/ for a list of news entries using JSF and http://your-app.herokuapp.com/rest/news/all to get all news entries as JSON.

Note: This approach uses Tomcat 7 and WAR deployment. There is a different way using an embedded Jetty container, see <https://devcenter.heroku.com/articles/getting-started-with-spring-mvc-hibernate> .

