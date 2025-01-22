{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import io.restassured.RestAssured;\
import io.restassured.response.Response;\
import org.openjdk.jmh.annotations.*;\
\'a0\
import java.util.concurrent.TimeUnit;\
\'a0\
@BenchmarkMode(Mode.Throughput)\
@Warmup(iterations = 10, time = 10)\
@Measurement(iterations = 10, time = 10)\
@Fork(2)\
@State(Scope.Benchmark)\
public class RestAssuredBenchmark \{\
\'a0\
\'a0\'a0\'a0 private static final String OUR_URL = "https://api.ourapi.com";\
\'a0\'a0\'a0 private static final String ENDPOINT = "/our/api/endpoint";\
\'a0\
\'a0\'a0\'a0 @Setup\
\'a0\'a0\'a0 public void setup() \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Setup configurations for RestAssured\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 RestAssured.baseURI = OUR_URL;\
\'a0\'a0\'a0 \}\
\'a0\
\'a0\'a0\'a0 @Benchmark\
\'a0\'a0\'a0 public void restAssuredAPICall() \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Make the API request using RestAssured\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 Response response = RestAssured.given()\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 .when()\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 .get(ENDPOINT);\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Optionally, perform assertions on the response if needed\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 response.then().statusCode(200);\
\'a0\'a0\'a0 \}\
\'a0\
\'a0\'a0\'a0 public static void main(String[] args) throws Exception \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 org.openjdk.jmh.Main.main(args);\
\'a0\'a0\'a0 \}\
\}\
}