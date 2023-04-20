# Calculator API
I have tried to follow as much as possible DRY and KISS principles for this project. The reason is not to have boilerplate code and is easy to understand for other developers. It helps a lot to the new developer for this project. I have chosen Java 17 and spring boot 3x for the project because they are one of the most updated programming language and framework. Implemented unit tests up to %77. And included logging for if the suppose client will have some problem. Like this they can directly send me the logging file and I can debug their problem.

# How it works
There is no security for now. Therefore, after run `./calculator code-run`, you can just send below example request to `http://localhost:8080/api/v1/ArithmeticOperations` and you will have the response.
### Request example
```json
{
  "firstNumber": "5.1233123123123123",
  "secondNumber": "6.1231231231231123",
  "operation": "+"
}
```

## Requirements
Java 17 and Spring boot 3x
