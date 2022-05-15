# Guide

## DockerMsftProvider
* Windows
* Installing DockerMsftProvider into Windows Server 2019.

## Tutorial 1
* Windows
* Testing Docker installation by running empty IIS container.


## Tutorial 2
* Windows 
* Add HTML Project/Page inside with IIS Docker 
*  {HTML Page + IIS Image} = New Custom Image

## Tutorial 3
* Spring initializr
  * https://start.spring.io/
* Simple Springboot WebAPI 
 * HTTP Get Method



## Tutorial 4
* Add Springboot inside with docker container
* {Springboot API + Docker Image (openjdk:11)} = New Custom Image
* Uploaded to docker hub https://hub.docker.com/repository/docker/bugscleaners/tutorial4
## Tutorial 5
* Springboot with MongoDB


## Tutorial 6
* Springboot & Monogodb
* HTTP (Get/Post/Delete)

## Tutorial 7
* 1- Springboot & Monogodb
  * HTTP (Get/Post/Delete)
* 2- Springboot 
  * HTTP (Get)
* Docker Compose 

## Tutorial 8
* Springboot Reading from Application.properties 

## Tutorial 9
* Springboot Reading from file

## Tutorial 10
* Springboot Reading from file Volume
 
# Helper 
## Generate Jar File 
* `./mvnw package`
* `java -jar ./target/(your-project-name)-(<version> at pom.xml).jar`
* Ex:  `java -jar target/Tutorial5-springboot-mongodb-0.0.1-SNAPSHOT.jar `

### Create Repo at Dockerhub :
* Create Free Account on Docker Hub
  * https://hub.docker.com/
  
### Bulid Your New Image with tag :
```
* docker build -t <Username>/<RepoName>:<tag> .
    *  ex:  docker build -t bugscleaners/tutorial4:v1 .
```
### Now you can push this repository to the registry designated by its name or tag:
```
* docker push <Username>/<RepoName>:<tag>
  *  ex:docker push bugscleaners/tutorial4:version1
```

