FROM clojure:lein-2.8.1-alpine

MAINTAINER tuddman <scott.tudd@gmail.com>

COPY . .

RUN lein uberjar

EXPOSE 8080                                                     

CMD ["java", "-jar", "target/employees-standalone.jar", "start"]
