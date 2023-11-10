## İlk Ödev

#### İlk Query : "SELECT COUNT(*) FROM film WHERE length > (SELECT AVG(length) FROM film);"
#### İkinci Query : "SELECT COUNT(*) FROM film WHERE rental_rate = (SELECT MAX(rental_rate) FROM film );"
#### Üçüncü Query : "SELECT * FROM film WHERE rental_rate = (SELECT MIN(rental_rate) FROM film ) AND replacement_cost = (SELECT MIN(replacement_cost) FROM film);"
#### Dördüncü Query : "SELECT first_name FROM customer WHERE customer_id = ANY (SELECT customer_id FROM payment WHERE amount = (SELECT MAX(amount) FROM payment));"