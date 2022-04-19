

### Create Repo at Dockerhub :
* Create Free Account on Docker Hub
  * https://hub.docker.com/
  
### Bulid Your New Image with tag :
```
* docker build -t <Username>/<RepoName>:<tag> .
    *  ex: docker build -t bugscleaners/dockertutorial:<tag> .
* docker tag <ImageName> <Username>/<RepoName>:<tag>
    *  ex: docker tag docker-tutorial bugscleaners/dockertutorial:version1
* docker commit <ImageName> <hub-user>/<repo-name>:<tag>
    *  ex:  docker commit springboot-docker-demo bugscleaners/dockertutorial:version1

```
### Now you can push this repository to the registry designated by its name or tag:
```
* docker push <Username>/<RepoName>:<tag>
  *  ex:docker push bugscleaners/dockertutorial:version1
```

### Resources
## Dockerhub
* https://hub.docker.com/repository/docker/bugscleaners/dockertutorial
