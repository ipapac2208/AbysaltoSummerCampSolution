# AbysaltoSummerCampSolution

Ovo je Spring Boot aplikacija koja prikazuje proizvode, omogućava pretragu, filtriranje po kategoriji i cijeni te prikaz detalja o pojedinom proizvodu. Podaci se dohvaćaju putem REST API-ja i prikazuju pomoću Thymeleaf template-a.

Tehnologije:
- Java 17
- Spring Boot
- Spring MVC
- Spring Web (RestClient)
- Thymeleaf
- PostgreSQL 18
- Hibernate / JPA
- Gradle 9.5.1

KONFIGURACIJA BAZE PODATAKA

Korištena je PostgreSQL 18 baza podataka. Za implementirati bazu podataka, ulogirajte se u PgAdmin 4, zatim desnim klikom na Databases, odaberite opciju "Create" i zatim "Databases" da stvorite novu bazu podataka nazvanu "AbysaltoSummerCampSolution". Zatim desnim klikom na novostvorenu bazu podataka odaberite opciju restore i odaberite .sql file u "db" folderu. Nakon toga u src/main/resources/application.properties trebate promijeniti spring.datasource.username i spring.datasource.password na Vaše korisničko ime i lozinku, te port na onaj koji je u PostgeSQL 18/Properties/Connection. 

POKRETANJE APLIKACIJE

Za Windows: gradlew.bat build
            gradlew.bat bootRun

Za Linux: ./gradlew build
          ./gradlew bootRun

TESTIRANJE APLIKACIJE

U URL baru nadopišite products-page.

PRETRAGA:
Unesite u tražilicu što želite pronaći. Ako postoji, kliknite na karticu proizvoda. Trebalo bi otvoriti /products-page/{id}. Kliknite na "back to Products".

Filtracije:
Unesite u zasebne tražilice kategoriju proizvoda koje želite prikazati i max cijenu proizvoda.

Korišteni AI alati:
Chat GPT, Google Gemini
