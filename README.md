
[![Build Status](https://travis-ci.org/e-ucm/rage-analytics-realtime.svg?branch=main)](https://travis-ci.org/e-ucm/rage-analytics-realtime) [![Coverage Status](https://coveralls.io/repos/github/brainonboard/calc/badge.svg?branch=master)](https://coveralls.io/github/brainonboard/calc?branch=main)

# Calc Rest Service Project

Calculator as Spring Boot Service(API)

Requested functionalities: sum and subtract

Use:
     REST API : ```GET /api/calcula?first=10&second=3&operation=A```)

## Pre-requisites
	A working Maven version. Tested with 3.8.5
	A Working Java version (>=Java 8)


## Steps:
	1. Maven installation of provided local libraries must be made using mvn cli:
			mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile=src/main/resources/tracer-1.0.0.jar
	2. Download repository
	```git clone https://github.com/brainonboard/calc.git´´´
	3. Run maven validation from root folder
	```mvn validate´´´
	4. Run maven validation from root folder
	```mvn verify´´´
	5. Do a maven clean install
	```mvn clean install´´´	
	6. Run calc-service/target/calc-service-0.0.1-SNAPSHOT.jar: 
	```java -jar calc-service/target/calc-service-0.0.1-SNAPSHOT.jar´´´
	7. check the REST API:
	```GET http://localhost:8080/api/calculate?first=1&segundo=1&operation=A` 
	
	Valid Parameters are:
	- first: a number
	- second: a number
	- Operation:
		A for ADD 
		S for SUBTRACT
