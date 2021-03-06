# Mandatory access control

## Steps for launching this application on your computer

First of all, you must have at least `Java 11` installed on your computer.

1. Open terminal
2. Clone the repository into your local filesystem 
    ```shell script
    git clone https://github.com/mainmeatball/university.git
    ```
3. Go into computer systems security models module
    ```shell script
    cd university/computer-systems-security-models/
    ```
4. Build jar using gradle wrapper
    ```shell script
    ./gradlew build
    ```
5. Launch the application
    ```shell script
    java -jar build/libs/role_access_control-1.0.0.jar
    ```
   
## Application screenshots

![Initial state](../../../../../../demo/pics/lab5_init.png)

![Security tab](../../../../../../demo/pics/lab5_security_tab.png)
![Role tab](../../../../../../demo/pics/lab5_role_tab.png)
![User tab](../../../../../../demo/pics/lab5_user_tab.png)

![Full access](../../../../../../demo/pics/lab5_full.png)
![Guest access](../../../../../../demo/pics/lab5_guest.png)
![No access](../../../../../../demo/pics/lab5_no.png)





