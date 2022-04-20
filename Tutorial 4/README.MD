

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

### Resources
### Dockerhub
* https://hub.docker.com/repository/docker/bugscleaners/tutorial4
