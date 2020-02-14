## Client Deployment Instructions

### Pre-Requisites
- NPM

### Launch the Client
1.) Open directory AADClient/eksi `cd AADClient/eksi`
2.) Install Angular `npm install -g @angular/cli`
3.) Serve Angular `ng serve`
4.) Open http://localhost:4200

### To build as a static site
`ng build --prod`

### Set the Server IP:
1.) Click the Account Info Button in the top right corner of the page
2.) Change the IP, click save, and then click logout
3.) Then login to the new server 


## Server Deployment Instructions
### Pre-Requisites
- MySQL server
- Java jdk 1.8
- Maven

Database
1.) Setup MySQL Server
2.) Run dbSetup.sql on the server

1.) `git clone https://github.com/DanielRHolland/AADGroupProject.git` or download zip file.
2.) Open folder `cd AADGroupProject`
3.) Open file 
4.) Run Maven Install `mvn install`
5.) Open target folder `cd target`
6.) Run jar file `java - jar `

