import os
os.system('cd ./video-microservice')
os.system('./gradlew run --args="add-book "Hello World" 2023"')
os.system('./gradlew run --args="get-books"')
