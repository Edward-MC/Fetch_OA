# Running the Fetch_OA Application with Docker

## Prerequisites
- **Docker** installed
- **Java JDK** installed (Please use openJDK 20 in this project)

## Running the Application
### 1. Build the Docker Image
Run the following command to generate docker image:
```sh
docker build -t fetch-oa-app .
```

### 2. Run the container
Run the following command to run the application(Please make sure 8080 port is not used already):
```sh
docker run -p 8080:8080 fetch-oa-app
```
