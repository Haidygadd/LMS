CREATE SEQUENCE IF NOT EXISTS book_seq START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE IF NOT EXISTS patron_seq START WITH 1 INCREMENT BY 1;

INSERT INTO  Book (title,author,publication_Year,isbn)VALUES
('Book A','Author X ','2020','2155'),
('Book B','Author Y ','2021','2156'),
('Book C','Author Z ','2022','2157');

INSERT INTO Patron (name,contact_information)VALUES
('Patron 1','patron1@gmail.com'),
('Patron 2','patron2@gmail.com'),
('Patron 3','patron3@gmail.com');






