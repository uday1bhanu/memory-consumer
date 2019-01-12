# memory-consumer
Sample project to demonstrate memory consumption

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