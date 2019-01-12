# memory-consumer
Sample project to demonstrate memory consumption

#Build

```
gradle clean build
docker build -t uday1bhanu/memory-consumer:1.0.0 .
```

#Run in Standalone

```
java -jar build/libs/memory-consumer-0.0.1-SNAPSHOT.jar
```

#Run in Docker

```
docker run -it -m 1.5g -p 8081:8081 uday1bhanu/memory-consumer:1.0.0
```

#Examples
* ##### /consume
    ```
    curl 'http://localhost:8081/consume' \
        -H 'Connection: keep-alive' \
        -H 'Cache-Control: max-age=0' \
        -H 'Upgrade-Insecure-Requests: 1' \
        -H 'User-Agent: commandline' \
        --compressed
    ```
    
* ##### /release
    ```
    curl 'http://localhost:8081/release' \
        -H 'Connection: keep-alive' \
        -H 'Cache-Control: max-age=0' \
        -H 'Upgrade-Insecure-Requests: 1' \
        -H 'User-Agent: commandline' \
        --compressed
    ```