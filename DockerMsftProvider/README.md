# DockerMsftProvider

## Requirements
* Windows Server 2019

### DockerMsftProvider Installation (Using Powershell)
* Run Powershell as Administrator
* [Net.ServicePointManager]::SecurityProtocol = [Net.SecurityProtocolType]::Tls12
* Set-ExecutionPolicy Bypass 
* Install-PackageProvider -Name NuGet
* Install-Module -Name DockerMsftProvider
* Install-Package -Name docker -ProviderName DockerMsftProvider
* Restart the Server 

### Pulling Test Image (Empty IIS)

* docker pull mcr.microsoft.com/windows/servercore/iis:windowsservercore-ltsc2019

### Run Image as Container (To test the instllation of docker )
* docker run --name ContainerName -it -p 80:80 ImageName
* Example : docker run --name iis -it -p 80:80 3005bb4c3a00
