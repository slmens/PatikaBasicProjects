## İlk Ödev
#### İlk Query : "SELECT title,description FROM film"
#### İkinci Query : "SELECT * FROM film WHERE (length BETWEEN 60 AND 75) AND (length<75) "
#### Üçüncü Query : "SELECT * FROM film WHERE (rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99)) "
#### Dördüncü Query : "SELECT last_name FROM customer WHERE first_name = 'Mary'"
#### Beşinci Query : "SELECT * FROM film WHERE (length <= 50) AND NOT (rental_rate = 2.99 OR rental_rate = 4.99)"


## İkinci Ödev
#### İlk Query : "SELECT * FROM film WHERE (replacement_cost BETWEEN 12.99 AND 16.99) AND replacement_cost<16.99"
#### İkinci Query : "SELECT first_name,last_name FROM actor WHERE first_name IN ('Penelope','Nick','Ed')"
#### Üçüncü Query : "SELECT * FROM film WHERE (rental_rate IN (0.99,2.99,4.99)) AND (replacement_cost IN (12.99,15.99,28.99))"


## Üçüncü Ödev
#### İlk Query : "SELECT * FROM country WHERE country LIKE 'A%a' "
#### İkinci Query : "SELECT country FROM country WHERE LENGTH(country) >= 6 AND country LIKE ('%n')"
#### Üçüncü Query : "SELECT title FROM film WHERE LENGTH(REPLACE(title, 't', '')) < LENGTH(title) - 4;"
#### Dördüncü Query : "SELECT * FROM film WHERE title LIKE ('C%') AND length > 90 AND rental_rate = 2.99"

## Dördüncü Ödev
#### İlk Query : "SELECT DISTINCT replacement_cost FROM film"
#### İkinci Query : "SELECT COUNT(DISTINCT replacement_cost) FROM film"
#### Üçüncü Query : "SELECT COUNT(*) FROM film WHERE title LIKE ('T%') AND rating = ('G')"
#### Dördündü Query : "SELECT COUNT(*) FROM country WHERE LENGTH(country) = 5"
#### Beşinci Query : "SELECT COUNT(*) FROM city WHERE city ILIKE ('r%') "