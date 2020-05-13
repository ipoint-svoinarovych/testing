CREATE TABLE workers (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  team VARCHAR(250) NOT NULL
);

INSERT INTO workers (first_name, last_name, team) VALUES
  ('Serhii', 'Voinarovych', 'IPCA'),
  ('Test', 'Test', 'SuHu'),
  ('Test1', 'Test1', 'IVCA');