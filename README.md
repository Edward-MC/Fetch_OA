# Running the Fetch_OA Application with Docker

## Prerequisites
- **Docker** installed
- **Java JDK** installed (Please use openJDK 20 in this project)

##  Find Related Run Files
- All the source code are under **/src/main/java/com/oa/fetch_oa**.
- Please find the jar file and Dockerfile under the **/target**.

## Running the Application
### 1. Build the Docker Image
Please go to the folder where the Dockerfile is under, and run the following command to generate docker image:
```sh
docker build -t fetch-oa-app .
```

### 2. Run the container
Run the following command to run the application(Please make sure 8080 port is not used already):
```sh
docker run -p 8080:8080 fetch-oa-app
```
