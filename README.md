# Calculator API
I have tried to follow as much as possible DRY and KISS and SOLID principles for this project. The reason is not to have boilerplate code and is easy to understand for other developers. It helps a lot to the new developer for this project. I have chosen Java 17 and spring boot 3x for the project because they are one of the most updated programming language and framework. Implemented unit tests up to %86. And included logging for if the suppose client will have some problem. Like this they can directly send me the logging file and I can debug their problem.

# How it works
Before run the application you should install custom dependencies. To do this, please run below command

```bash
mvn install:install-file -Dfile=libs/tracer-1.0.0.jar -DgroupId=io.corp.calculator -DartifactId=tracer -Dversion=1.0.0 -Dpackaging=jar
```

 Then you can run the application with `mvn spring-boot:run` or alternatively run `./calculator code-run`. In both case, you can send below example request to `http://localhost:8080/api/v1/ArithmeticOperations/sum` or `http://localhost:8080/api/v1/ArithmeticOperations/subtract` (depending your wishes) and you will have the response.
### Request example
```json
{
  "firstNumber": "5.1233123123123123",
  "secondNumber": "6.1231231231231123",
}
```
If you would like to see the swagger UI, please go to `http://localhost:8080/docs.html` after run the application.

## Requirements
Only docker will be enought to run that application.

# calculator binary file example
```text
Usage: ./calculator <command>
<command>:
    help
        Display this help message.
    build-jar
        Build jar file
    code-run
        Runs containerized app
    test-coverage-report
        Shows unit test coverage reports
    prepare-report
        Prepares the report to send the developer for debugging
```
 That tool helps to developers to run the application without any problem.

 # Extra
 You can find JAR file, report file and unit test coverage file in [here](https://github.com/serdarakyol/calculator/actions/runs/4772866045). It can stay there max 5 day. If you would like to generate these, you can directly run `calculator` helper script.

# How to implement new feature to API (SOLID comparetion)
1. Each class has a single responsibility like sum and subtract classes. Not all in one
2. If in the future will need to change some operations, that would be quite easy because each task is separately defined.
3. All classes are separated into small pieces to implement easily from the base class. Like this, each class takes inheritance from the parent class and uses that
4. The interface has not been used unnecessarily. I needed a calculation method in an interface and implemented that interface to sum and subtraction. 
5. Sum and subtraction are not depended on one another
