[![Build Status](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode.svg?branch=master)](https://travis-ci.org/dat3startcode/rest-jpa-devops-startcode)

*This project is meant as start code for projects and exercises given in Flow-1+2 at http://cphbusiness.dk in the Study Program "AP degree in Computer Science"*

*Projects which are expected to use this start-code are projects that require all, or most of the following technologies:*
 - *JPA and REST*
- *Testing, including database test*
- *Testing, including tests of REST-API's*
- *CI and CONTINUOUS DELIVERY*

### Preconditions
*In order to use this code, you should have a local developer setup + a "matching" droplet on Digital Ocean as described in the 3. semester guidelines* 
# Getting Started

This document explains how to use this code (build, test and deploy), locally with maven, and remotely with maven controlled by Travis
 - [How to use](https://docs.google.com/document/d/1K6s6Tt65bzB8bCSE_NUE8alJrLRNTKCwax3GEm4OjOE/edit?usp=sharing)
# Startcode
The way I have used startcode to make my project.
I started by cloning the collective startcode that our group made and then making new repositories on github for it. While I made the repository for the backend I setup the secrets so they were ready.
Then I proceeded to open the backend in intellij and change the artifact, name and remote server to my own. Then I started setting up my mysql schemas, connecting the database to intellij and writing them into the persistence.
Once that was done I then setup my tomcat server connecting and changed the name of the war to something more manageable than war exploded. 
Once all this was done I started checking if my tests were running green and if they were I would continue to setup the CI-pipeline with github actions, so I copied a yaml file from a prior project and inserted it into the main.yaml file and then edited the interior to my new database.
Because my secrets were already set up I could then push my project and see if my actions worked as planned. It didn't quite work from the getgo but after some fidgetting and a helping hand it got up and running.
With everything now setup and ready I started utilizing the DTO classes that we had already created as a group as inspiration for what I would do next. 
I went on the api github and found 2 more apis that I wanted to add to my project and then made DTO classes for those api's.
Once they were added I went into "ourDTO" and added the new ones there as well before going to our urlfetcher.
In the urlfetcher I once again used what we had done as a group as inspiration and added the new url and dtos to the class with new callables.
With everything working it was time for me to go to the frontend. 
In the frontend the first thing I did was enter the style2.css and changing some of the colors to make the SPA look more like my own. I then entered the facade.js and corrected the url to allign with mine.
Then I started making my new components for the new apis I wanted to implement and once again used our groupwork for inspiration. With the components ready i went to the app.js where I started with importing my components.
With my components imported I now started setting up usestates and useeffects for both of my components and their api url. The next thiong was adding Navlinks to the router, and adding my two new routes to the switchcase.
When all this was done I started looking into deploying my project, I tried doing it with nginx but had some problems that were a bit tedious and I was running low on time, so I ended up just deploying it with surge.
To do that I used npm run build in the root of my frontend, followed by npm install- g surge. With that done I could then deploy it with surge --project ./build --domain A_DOMAIN_NAME.surge.sh where I just changed "A_DOMAIN_NAME" to whatever I desired.

# ca2-backend-startcode
# ca2-backend-project
