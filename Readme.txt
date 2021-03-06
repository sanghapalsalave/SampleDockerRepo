/* Author - Sanghapal Salave  */

Follow the below commands to use this docker project
1 ) Create springboot application using STS add Dockerfile to your project refer SampleDocker/Dockerfile
1) Download the docker software from docker officiale website.
2) Install the docker
3) Check the Virtualization enabled Task Manager->Performance->CPU->Virtualization its is enabled by default if not then enable it
4) Enable the Hyper V using windows power shell,command come bydefault when install docker
   Command to enable the hyper -v : 
   Enable-WindowsOptionalFeature -Online -FeatureName Microsoft-Hyper-V -All
5) Switch the docker from linux container to Windows container
  Right click on docker icon on taskbar -> Switch to windows
6) Create account with docker hub 
7) Login in installed docker using docker username and password
8) Create repository
9) open cmd with admin mode go to your project where docker file(Dockerfile) is located and insert below commands

  docker login
--------------------------------------------------
  This command is used to login in docker hub. if logged in docker software it will login automatically else insert your docker username and password.
 
 docker images
 -------------------------------------------------
 This command is used to chek the list of docker images in your repository
 
 docker build -t sample_docker_repo .
 --------------------------------------------------
 This command is used to build the docker image file
 
 docker tag sample_docker_repo sanghapalsalave/sample_docker_repo
 ------------------------------------------------------------------
 This command is used to tag your docker repository to docker hub repository
 
 docker push sanghapalsalave/sample_docker_repo
-------------------------------------------------------------------------
 This command is used to push your local docker repository to docker hub repository 
 
 docker rmi sample_docker_repo sanghapalsalave/sample_docker_repo
 ----------------------------------------------------------------
 This command is used to remove your repository from local or docker hub
 
 docker run -p 8085:8085 sanghapalsalave/sample_docker_repo
 ----------------------------------------------------------
 This command is used to run docker image file on specified port
 
 