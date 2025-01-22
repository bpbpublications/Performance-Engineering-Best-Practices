{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import io.cucumber.java.en.Given;\
import io.cucumber.java.en.When;\
import io.cucumber.java.en.Then;\
\'a0\
public class PerformanceTestStepDefinition \{\
\'a0\
\'a0\'a0\'a0 @Given("Given the system is under heavy concurrency")\
\'a0\'a0\'a0 public void givenSystemIsReady() \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Setup actions\
\'a0\'a0\'a0 \}\
\'a0\
\'a0\'a0\'a0 @When("\{int\} When I send X number of requests concurrently ")\
\'a0\'a0\'a0 public void whenUsersAccessApplication(int numberOfThreads) \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Use JMeter or JMH to simulate user load with the specified \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // number of users\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // We may call JMeter/JMH APIs here to execute the load test\
\'a0\'a0\'a0 \}\
\'a0\
\'a0\'a0\'a0 @Then("Then the average response time should be below Y milliseconds")\
\'a0\'a0\'a0 public void thenResponseTimeWithinRequirements() \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Perform assertions on response times, possibly using JMeter results\
\'a0\'a0\'a0 \}\
\}\
}