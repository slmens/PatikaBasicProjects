## İlk Ödev

#### İlk Query : "SELECT * FROM film WHERE title LIKE '%n' ORDER BY length DESC LIMIT 5;"
#### İkinci Query : "SELECT * FROM film WHERE title LIKE '%n' ORDER BY length ASC OFFSET 5 LIMIT 5;"
#### Üçüncü Query : "SELECT * FROM customer WHERE store_id = 1 ORDER BY last_name DESC;"

## İkinci Ödev

#### İlk Query : "SELECT AVG(rental_rate) FROM film;"
#### İkinci Query : "SELECT COUNT(*) FROM film WHERE title LIKE 'C%';"
#### Üçüncü Query : "SELECT MAX(length) FROM film WHERE rental_rate = 0.99;"
#### Dördüncü Query : "SELECT COUNT(DISTINCT replacement_cost) FROM film WHERE length > 150;"

## Üçüncü Ödev

#### İlk Query : "SELECT rating FROM film GROUP BY rating;"
#### İkinci Query : "SELECT replacement_cost, COUNT() FROM film GROUP BY replacement_cost HAVING COUNT() > 50;"
#### Üçüncü Query : "SELECT store_id, COUNT(*) FROM customer GROUP BY store_id;"
#### Dördüncü Query : "SELECT country_id,COUNT(*) FROM city GROUP BY country_id ORDER BY count DESC limit 1;"



