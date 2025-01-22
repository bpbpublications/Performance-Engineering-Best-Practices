{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;\red147\green0\blue147;\red50\green94\blue238;
\red178\green113\blue6;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;\cssrgb\c65098\c14902\c64314;\cssrgb\c25098\c47059\c94902;
\cssrgb\c75686\c51765\c392;}
\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
//Test Program to showcase JMH testing in PDD\'a0\'a0\'a0\'a0\'a0\
\pard\pardeftab720\sa133\partightenfactor0
\cf3 import\cf2 \'a0java.io;\
\cf3 import\cf2 \'a0org.openjdk.jmh.annotations.Benchmark;\
\cf3 import\cf2 \'a0org.openjdk.jmh.annotations.BenchmarkMode;\
\cf3 import\cf2 \'a0org.openjdk.jmh.annotations.Mode;\
\cf3 import\cf2 \'a0org.openjdk.jmh.annotations.OutputTimeUnit;\
\'a0\'a0\'a0\
\cf3 import\cf2 \'a0java.util.concurrent.TimeUnit;\
\'a0\'a0\'a0\
\'a0\cf4 @BenchmarkMode\cf2 (Mode.Throughput)\
\'a0\cf4 @OutputTimeUnit\cf2 (TimeUnit.MILLISECONDS)\
\'a0\cf3 public\cf2 \'a0\cf3 class\cf2 \'a0\cf5 BenchmarkMethodExample\cf2 \'a0\{\
\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf4 @Benchmark\cf2 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf3 public\cf2 \'a0\cf3 void\cf2 \'a0\cf4 benchmarkMethod\cf2 ()\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(\'93This\'a0is\'a0a\'a0test\'94);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\cf3 public\cf2 \'a0\cf3 static\cf2 \'a0\cf3 void\cf2 \'a0\cf4 main\cf2 (String[]\'a0args)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0org.openjdk.jmh.Main.main(args);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\}\
}