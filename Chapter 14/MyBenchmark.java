{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import org.openjdk.jmh.annotations.*;\
\'a0\
@BenchmarkMode(Mode.AverageTime)\
@OutputTimeUnit(TimeUnit.MILLISECONDS)\
@State(Scope.Benchmark)\
public class MyBenchmark \{\
\'a0\'a0\'a0 \
\'a0\'a0\'a0 @Benchmark\
\'a0\'a0\'a0 public void measureResponseTime() \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Implement the logic to measure response time here\
\'a0\'a0\'a0 \}\
\}\
}