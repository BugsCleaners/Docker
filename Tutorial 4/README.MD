

### Create Repo at Dockerhub :
* Create Free Account on Docker Hub
  * https://hub.docker.com/
  
### Bulid Your New Image with tag :
```
* docker build -t <Username>/<RepoName>:<tag>
    * docker build -t bugscleaners/dockertutorial:<tag> .
* docker tag <existing-image> <Username>/<RepoName>:<tag>
    * docker tag docker-tutorial bugscleaners/dockertutorial:version1
* docker commit <existing-container> <hub-user>/<repo-name>:<tag>
    * docker commit springboot-docker-demo bugscleaners/dockertutorial:version1
### Now you can push this repository to the registry designated by its name or tag:
* docker push <Username>/<RepoName>:<tag>
  * docker push bugscleaners/dockertutorial:version1
```
