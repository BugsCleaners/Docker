# Docker

### Pulling Test Image (Empty IIS)

* docker pull mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019

### Run Image as Container (To test the instllation of docker )
* docker run --name ContainerName -it -p 80:80 ImageName
* Example : docker run --name iis -it -p 80:80 3005bb4c3a00
