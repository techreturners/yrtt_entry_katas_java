# Java Entry Katas

This repository contains tasks for you to undertake to secure and prepare you for a place on the Tech Returners course. We will be checking over your solutions, so please ensure you push to GitHub regularly (little and often is key). 

You may find these exercises challenging but they give you the opportunity to showcase your growth mindset and commitment to learning, programming, and trying your best. You can always come to us if you are having any trouble.

We cover Java on the Your Return to Tech course, so it's really important your problem solving skills are fresh. 

If you need reminding of any key Java concepts to solve these tasks we recommend the 'Codecademy: Learn Java' (free) course: https://www.codecademy.com/learn/learn-java

**NOTE: You are not required to purchase any PRO content from Codecademy.**

We also recommend this visual guide if you are unfamiliar with GitHub: https://agripongit.vincenttunru.com/

Remember to break down problems to help you solve them and that Google is your friend!

### Instructions

To complete these challenges you will need to have Java and Maven installed on your computer.

Follow this link and to download and install the Java SE Development Kit for your laptop:

https://www.oracle.com/uk/java/technologies/javase/javase-jdk8-downloads.html

(If you already have Java installed, please make sure you are running version 8)

You'll also need Maven installed for managing dependencies.

Maven is used to manage the dependencies (similar to NPM in the Javascript world or PIP in a Python world)

Maven can be download and install by following the different link here:

https://maven.apache.org/index.html

Download: https://maven.apache.org/download.cgi Install: https://maven.apache.org/install.html

There are also a number of videos online guiding you through installation.

Once you've got Java and Maven installed you can make a start!

### Completing the tasks

When first cloning this repository, install its dependencies:

    mvn clean install

If you look inside the **tasks** directory you will find a file of functions to implement.

To understand how these functions work, take a look in the corresponding test file where the desired functionality is described.

To run the tests, run

    mvn test

Work through each test 1 by 1 until you have them all passing. Initially, you'll have a lot of failing tests and a lot of output on the console. To focus on a single test, you can enter into the terminal mvn test -Dtest= followed by the class name:
    
    mvn test -Dtest=Exercise001


# The tasks

You can see the first task in [exercise001.js](./tasks/exercise001)
