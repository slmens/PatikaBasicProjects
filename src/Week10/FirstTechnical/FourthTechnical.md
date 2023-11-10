## İlk Ödev:

#### İlk Query : "SELECT city,country FROM city JOIN country ON city.country_id = country.country_id;"
#### İkinci Query : "SELECT payment_id,first_name,last_name FROM customer JOIN payment ON customer.customer_id = payment.customer_id;"
#### Üçüncü Query : "SELECT rental_id,first_name,last_name FROM customer JOIN rental ON customer.customer_id = rental.customer_id;"

## İkinci Ödev:

#### İlk Query : "SELECT city,country FROM country LEFT JOIN city ON city.country_id = country.country_id"
#### İkinci Query : "SELECT payment_id,first_name,last_name FROM payment Right JOIN customer ON customer.customer_id = payment.payment_id;"
#### Üçüncü Query : "SELECT rental_id,first_name,last_name FROM rental FULL JOIN customer ON customer.customer_id = rental.customer_id;"

## Üçüncü Ödev:
#### İlk Query : "(SELECT first_name FROM actor) UNION (SELECT first_name FROM customer)"
#### İkinci Query : "(SELECT first_name FROM actor) INTERSECT (SELECT first_name FROM customer)"
#### Üçüncü Query : "(SELECT first_name FROM actor) EXCEPT (SELECT first_name FROM customer)"
#### Dördüncü Query : "(SELECT first_name FROM actor) UNION ALL (SELECT first_name FROM customer)"