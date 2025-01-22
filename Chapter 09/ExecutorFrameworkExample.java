{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red147\green0\blue147;\red0\green0\blue0;\red74\green74\blue74;
\red178\green113\blue6;\red50\green94\blue238;\red133\green85\blue4;\red66\green147\blue62;}
{\*\expandedcolortbl;;\cssrgb\c65098\c14902\c64314;\cssrgb\c0\c0\c0;\cssrgb\c36078\c36078\c36078;
\cssrgb\c75686\c51765\c392;\cssrgb\c25098\c47059\c94902;\cssrgb\c59608\c40784\c392;\cssrgb\c31373\c63137\c30980;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs28 \cf2 \expnd0\expndtw0\kerning0
import
\fs26\fsmilli13333 \cf3 \'a0java.util.concurrent.ExecutorService;\

\fs28 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0java.util.concurrent.Executors;\
\'a0\

\fs28 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs28 \cf2 class\cf4 \'a0\cf5 ExecutorFrameworkExample\cf4 \'a0\{
\fs26\fsmilli13333 \cf3 \
\'a0\
\'a0\'a0 \'a0
\fs28 \cf2 public\cf4 \'a0\cf2 static\cf4 \'a0\cf2 void\cf4 \'a0\cf6 main\cf4 (String[]\'a0args)\'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0\'a0\'a0ExecutorService\'a0executorService\'a0=\'a0Executors.newFixedThreadPool(
\fs28 \cf7 30
\fs26\fsmilli13333 \cf3 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs28 \cf2 for
\fs26\fsmilli13333 \cf3 \'a0(
\fs28 \cf2 int
\fs26\fsmilli13333 \cf3 \'a0i\'a0=\'a0
\fs28 \cf7 1
\fs26\fsmilli13333 \cf3 ;\'a0i\'a0<=\'a0
\fs28 \cf7 30
\fs26\fsmilli13333 \cf3 ;\'a0i++)\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs28 \cf2 int
\fs26\fsmilli13333 \cf3 \'a0taskNumber\'a0=\'a0i;\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 //delegate to thread in thread pool\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0executorService.submit(()\'a0->\'a0performTask(taskNumber));\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\}\
\'a0\
\'a0\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0
\fs28 \cf2 private\cf4 \'a0\cf2 static\cf4 \'a0\cf2 void\cf4 \'a0\cf6 performTask\cf4 (\cf2 int\cf4 \'a0taskNumber)\'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println(
\fs28 \cf8 "Task\'a0"
\fs26\fsmilli13333 \cf3 \'a0+\'a0taskNumber\'a0+\'a0
\fs28 \cf8 "\'a0is\'a0being\'a0performed\'a0by "
\fs26\fsmilli13333 \cf3 \'a0+\'a0Thread.currentThread().getName());\
\'a0\'a0\'a0\'a0\}\
\}\
}