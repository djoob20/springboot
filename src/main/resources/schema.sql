DROP TABLE IF EXISTS courses;
DROP TABLE IF EXISTS articles;
 
CREATE TABLE courses (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  c_number INT AUTO_INCREMENT,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250),
  content VARCHAR(700),
  created_at DATE NOT NULL,
  views INT
);

CREATE TABLE articles (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  c_number INT AUTO_INCREMENT,
  title VARCHAR(250) NOT NULL,
  description VARCHAR(250),
  content VARCHAR(700),
  created_at DATE NOT NULL,
  views INT
);
 
