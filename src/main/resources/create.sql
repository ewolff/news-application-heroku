-- CREATE DATABASE news;
-- USE news;

DROP TABLE IF EXISTS t_news;
CREATE TABLE t_news (
  --newsid INT AUTO_INCREMENT PRIMARY KEY,
  newsid      serial primary key,
  title VARCHAR(100) NOT NULL,
  text VARCHAR(500) NOT NULL
);

INSERT INTO t_news (title, text) VALUES ('Continuous Delivery', 'Hand auf''s Herz: Wer von Ihnen hat die Apple-Keynote mitverfolgt, sich angestellt, um das neue iPhone 5c/s zu erwerben, und wer ist bereits Early Adopter von iOS 7? Die Euphorie um das Release neuer iOS-Versionen und den Zeremonialcharakter der Bekanntmachung sucht seinesgleichen in der IT-Welt. ...');
INSERT INTO t_news (title, text) VALUES ('Auf dem Weg zur polyglotten VM', '"Java und JavaScript haben ungefaehr so viel gemeinsam wie Ei und Eiffelturm", sagte einst ein Speaker auf der JAX. Und das, obwohl ironischerweise beides eingetragene Marken der Firma Oracle sind historisch gewachsen durch die Uebernahme von Sun Microsystems (das Patent fuer die Marke "JavaScript" findet sich unter http://1.usa.gov/Q3Vi1C). ...'); 
INSERT INTO t_news (title, text) VALUES ('Android First?', 'Endlich ist es wieder soweit: nach drei Jahren Abstinenz hat es Android wieder auf das Cover des Java Magazins geschafft. Die damals gestellte Frage "Wie hebt sich Android von Java ME ab?" kann mittlerweile leicht beantwortet werden: Android hatte Erfolg. ...');