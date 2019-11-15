# testnginheritancepoc
This repository contains a small PoC using TestNG 6.4.13 &amp; 7.0.0 to show a groups inheritance issue

## Build
 To build this project run
 
 ```bash
 ./gradlew build
 ```

## Running
To run the tests use provided shell script (only Linux):

- TestNG 6.14.3 with explicit test class 
```bash
./execute_test-single-6.14.3.sh
```

Output:
```bash
$ ./execute_test-single-6.14.3.sh 
TestClass - setUpAlways
TestClass - setUp
TestClass - mainTestMethod
TestClass - execute
TestClass - tearDownAlways
TestClass - tearDown

===============================================
Default Suite
Total tests run: 1, Failures: 0, Skips: 0
===============================================
```

- TestNG 6.14.3 using groups 
```bash
./execute_test-groups-6.14.3.sh
``` 

Output:
```bash
$ ./execute_test-groups-6.14.3.sh 

===============================================
Custom suite
Total tests run: 0, Failures: 0, Skips: 0
===============================================
```
- TestNG 7.0.0 with explicit test class 
```bash
./execute_test-single-7.0.0.sh
```

Output:
```bash
$ ./execute_test-single-7.0.0.sh 
TestClass - setUpAlways
TestClass - setUp
TestClass - mainTestMethod
TestClass - execute
TestClass - tearDownAlways
TestClass - tearDown

===============================================
Default Suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================
```
- TestNG 7.0.0 using groups  
```bash
./execute_test-groups-7.0.0.sh
``` 
Output:
```bash

$ ./execute_test-groups-7.0.0.sh 
TestClass - setUpAlways
TestClass - mainTestMethod
TestClass - execute
TestClass - tearDownAlways

===============================================
Custom suite
Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
===============================================
```

