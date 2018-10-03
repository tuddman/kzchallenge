# kzchallenge

a simple RESTful Server to demonstrate basic API abilities.

# Setup

## Directly 

#### Prerequisites :

* presumes JAVA 1.8+ is installed
* [leiningen](https://leiningen.org/) is installed

```bash
cd kzchallenge 
lein uberjar
java -jar target/employees-standalone.jar start 
```

or 

## Dockerized

```bash
cd kzchallenge 
docker build -t kzchallenge:employees . 
docker run --name employeeserver kzhallenge:employees
```

# Usage

Install [postman](https://www.getpostman.com/apps) to have easy access to ALL of the possible REST calls.  Postman collection is included in `dev-resources/employees.json`

Import the collection.

You can:

* Create an Employee record
* Update an Employee record
* Delete an Employee record
* Get an Employee record, by id
* Get ALL Employee records
* Get an Authorization Header Token 
* Set an Employee's status to 'INACTIVE' (requires an Authorization Header Token)


## Explanation

### What's Going On Inside?

ok, peek into `./src/kzchallenge`  and you'll see the following files:

##### server.clj

This is the actual http server.  It has some stuff to handle http requests, notably some Ring-style middleware, which has become a de-facto standard for handling web requests.

##### handlers.clj

All of the REST endpoints and routing are defined in here.

##### db.clj

A 'backend' database, implemented in SQLite for simplicty here.
