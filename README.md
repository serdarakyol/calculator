# Calculator API
I have tried to follow as much as possible DRY and KISS principles for this project. The reason is not to have boilerplate code and is easy to understand for other developers. It helps a lot to the new developer for this project. I have chosen Java 17 and spring boot 3x for the project because they are one of the most updated programming language and framework. Implemented unit tests up to %79. And included logging for if the suppose client will have some problem. Like this they can directly send me the logging file and I can debug their problem.

# How it works
You can run the application with `mvn spring-boot:run` or alternatively run `./calculator code-run`. In both case, you can send below example request to `http://localhost:8080/api/v1/ArithmeticOperations` and you will have the response.
### Request example
```json
{
  "firstNumber": "5.1233123123123123",
  "secondNumber": "6.1231231231231123",
  "operation": "+"
}
```

## Requirements
Only docker will be enought to run that application.

# calculator binary file example
```bash
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
 You can find JAR file, report file and unit test coverage file in [here](https://github.com/serdarakyol/calculator/actions/runs/4753422158). It can stay there max 1 day. If you would like to generate these, you can directly run `calculator` helper script.
