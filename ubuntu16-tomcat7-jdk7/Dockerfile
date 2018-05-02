#Install from ubuntu base image
FROM ubuntu:16.04

MAINTAINER jit

#Download the latest version of 7.x
#Verify the version exists here or else change it: http://apache.rediris.es/tomcat/tomcat-7
ENV TOMCAT_VERSION 7.0.86

# Run an update to get all the security patches
RUN apt-get -y update && apt-get -y upgrade

#RUN use this to run the command in the terminal
#Update the ubuntu to latest fixes and patches
RUN apt-get update && apt-get install -y python-software-properties software-properties-common

#Install CURL and VIM editors
RUN apt-get -y install curl wget vim iputils-ping top free

# OPEN JDK Installation repository 
RUN add-apt-repository ppa:openjdk-r/ppa

# after the repository has been added.
RUN apt-get update -y

# only after update
RUN apt-get install -y openjdk-7-jdk

ENV JAVA_HOME /usr/lib/jvm/java-1.7.0-openjdk-amd64

# Get Tomcat, same RUN command across multiple lines
RUN wget --quiet --no-cookies http://apache.rediris.es/tomcat/tomcat-7/v${TOMCAT_VERSION}/bin/apache-tomcat-${TOMCAT_VERSION}.tar.gz -O /tmp/tomcat.tgz && tar xzvf /tmp/tomcat.tgz -C /opt
RUN mv /opt/apache-tomcat-${TOMCAT_VERSION} /opt/tomcat

#remove temporary and unwanted folders
RUN rm /tmp/tomcat.tgz && rm -rf /opt/tomcat/webapps/examples && rm -rf /opt/tomcat/webapps/docs

#RUN rm -rf /opt/tomcat/webapps/ROOT