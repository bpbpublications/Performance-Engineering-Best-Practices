{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red147\green0\blue147;\red0\green0\blue0;\red50\green94\blue238;
\red133\green85\blue4;\red178\green113\blue6;\red66\green147\blue62;}
{\*\expandedcolortbl;;\cssrgb\c65098\c14902\c64314;\cssrgb\c0\c0\c0;\cssrgb\c25098\c47059\c94902;
\cssrgb\c59608\c40784\c392;\cssrgb\c75686\c51765\c392;\cssrgb\c31373\c63137\c30980;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import\cf3 \'a0org.apache.http.HttpEntity;\
\cf2 import\cf3 \'a0org.apache.http.HttpResponse;\
\cf2 import\cf3 \'a0org.apache.http.client.methods.HttpGet;\
\cf2 import\cf3 \'a0org.apache.http.impl.client.CloseableHttpClient;\
\cf2 import\cf3 \'a0org.apache.http.impl.client.HttpClients;\
\cf2 import\cf3 \'a0org.openjdk.jmh.annotations.*;\
\cf2 import\cf3 \'a0java.io.IOException;\
\cf2 import\cf3 \'a0java.util.concurrent.TimeUnit;\
\'a0\'a0\'a0\'a0\'a0\
\cf4 @BenchmarkMode\cf3 (Mode.Throughput)\
\cf4 @Warmup\cf3 (iterations\'a0=\'a0\cf5 2\cf3 ,\'a0time\'a0=\'a0\cf5 5\cf3 ,\'a0timeUnit\'a0=\'a0TimeUnit.SECONDS)\
\cf4 @Measurement\cf3 (iterations\'a0=\'a0\cf5 5\cf3 ,\'a0time\'a0=\'a0\cf5 10\cf3 ,\'a0timeUnit\'a0=\'a0TimeUnit.SECONDS)\
\cf4 @Threads\cf3 (\cf5 100\cf3 )\
\cf4 @Fork\cf3 (\cf5 2\cf3 )\
\cf2 public\cf3 \'a0\cf2 class\cf3 \'a0\cf6 BenchmarkRestAPI\cf3 \'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 private\cf3 \'a0\cf2 static\cf3 \'a0\cf2 final\cf3 \'a0String\'a0API_URL\'a0=\'a0\cf7 "your\'a0app\'a0url"\cf3 ;\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf4 @Benchmark\cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 public\cf3 \'a0\cf2 void\cf3 \'a0\cf4 restApiRequest\cf3 ()\'a0\cf2 throws\cf3 \'a0IOException\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 try\cf3 \'a0(CloseableHttpClient\'a0httpCl\'a0=\'a0HttpClients.createDefault())\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0HttpGet\'a0httpGet\'a0=\'a0\cf2 new\cf3 \'a0HttpGet(API_URL);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0HttpResponse\'a0response\'a0=\'a0httpCl.execute(httpGet);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0HttpEntity\'a0entity\'a0=\'a0response.getEntity();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf2 public\cf3 \'a0\cf2 static\cf3 \'a0\cf2 void\cf3 \'a0\cf4 main\cf3 (String[]\'a0args)\'a0\cf2 throws\cf3 \'a0Exception\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0org.openjdk.jmh.Main.main(args);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
}