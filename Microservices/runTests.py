import threading
import subprocess

def run_script(test_name):
    subprocess.run([test_name])

if __name__ == "__main__":
    test1_thread = threading.Thread(target=run_script, args=("./video-microservice/gradlew test",))
    test2_thread = threading.Thread(target=run_script, args=("./trending-hashtags-microservice/gradlew test",))
    test3_thread = threading.Thread(target=run_script, args=("./subscription-microservice/gradlew test",))

    test1_thread.start()
    test2_thread.start()
    test3_thread.start()

    test1_thread.join()
    test2_thread.join()
    test3_thread.join()

    print("all tests have finished executing.")