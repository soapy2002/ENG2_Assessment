import threading
import subprocess
import os

def run_script1():
    subprocess.run("video-microservice/gradlew -p video-microservice test", shell=True, check=True)

def run_script2():
    subprocess.run("trending-hashtags-microservice/gradlew -p trending-hashtags-microservice test", shell=True, check=True)

def run_script3():
    subprocess.run("subscription-microservice/gradlew -p subscription-microservice test", shell=True, check=True)

if __name__ == "__main__":
    test1_thread = threading.Thread(target=run_script1)
    test2_thread = threading.Thread(target=run_script2)
    test3_thread = threading.Thread(target=run_script3)

    test1_thread.start()
    test2_thread.start()
    test3_thread.start()

    test1_thread.join()
    test2_thread.join()
    test3_thread.join()

    print("all tests have finished executing.")