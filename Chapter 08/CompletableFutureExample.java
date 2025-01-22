{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red147\green0\blue147;\red0\green0\blue0;\red74\green74\blue74;
\red178\green113\blue6;\red50\green94\blue238;\red133\green85\blue4;\red66\green147\blue62;\red143\green144\blue150;
}
{\*\expandedcolortbl;;\cssrgb\c65098\c14902\c64314;\cssrgb\c0\c0\c0;\cssrgb\c36078\c36078\c36078;
\cssrgb\c75686\c51765\c392;\cssrgb\c25098\c47059\c94902;\cssrgb\c59608\c40784\c392;\cssrgb\c31373\c63137\c30980;\cssrgb\c62745\c63137\c65490;
}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs28 \cf2 \expnd0\expndtw0\kerning0
import
\fs26\fsmilli13333 \cf3 \'a0java.util.concurrent.CompletableFuture;\

\fs28 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0java.util.concurrent.ExecutionException;\
\'a0\

\fs28 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs28 \cf2 class\cf4 \'a0\cf5 CompletableFutureExample\cf4 \'a0\{
\fs26\fsmilli13333 \cf3 \
\'a0\
\'a0\'a0\'a0
\fs28 \cf2 public\cf4 \'a0\cf2 static\cf4 \'a0\cf2 void\cf4 \'a0\cf6 main\cf4 (String[]\'a0args)\'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\
\'a0\'a0 
\fs28 \cf2 int
\fs26\fsmilli13333 \cf3 \'a0number\'a0=\'a0
\fs28 \cf7 34
\fs26\fsmilli13333 \cf3 ;\
\'a0\'a0\'a0\'a0
\fs28 \cf4 CompletableFuture<Integer>\'a0\cf5 future\cf4 \'a0
\fs26\fsmilli13333 \cf3 =\'a0CompletableFuture.supplyAsync(()\'a0->\'a0square(num));\'a0\'a0\
\'a0\'a0\'a0
\fs28 \cf5 future
\fs26\fsmilli13333 \cf3 .thenAccept(result\'a0->\'a0System.out.println(
\fs28 \cf8 "Result:\'a0"
\fs26\fsmilli13333 \cf3 \'a0+\'a0result));\
\'a0\'a0 
\fs28 \cf2 try
\fs26\fsmilli13333 \cf3 \'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs28 \cf5 future
\fs26\fsmilli13333 \cf3 .get();\'a0
\fs28 \cf9 //getting result
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\'a0
\fs28 \cf2 catch
\fs26\fsmilli13333 \cf3 \'a0(InterruptedException\'a0|\'a0ExecutionException\'a0e)\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0 \'a0e.printStackTrace();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\}\
\'a0\
\'a0\'a0\'a0\'a0
\fs28 \cf2 private\cf4 \'a0\cf2 static\cf4 \'a0\cf2 int\cf4 \'a0\cf6 square\cf4 (\cf2 int\cf4 \'a0num)\'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs28 \cf2 return
\fs26\fsmilli13333 \cf3 \'a0num\'a0*\'a0num;\
\'a0\'a0\'a0\'a0\}\
\}\
}