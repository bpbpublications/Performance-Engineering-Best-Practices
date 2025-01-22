{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red147\green0\blue147;\red0\green0\blue0;\red74\green74\blue74;
\red178\green113\blue6;\red133\green85\blue4;\red66\green147\blue62;\red143\green144\blue150;}
{\*\expandedcolortbl;;\cssrgb\c65098\c14902\c64314;\cssrgb\c0\c0\c0;\cssrgb\c36078\c36078\c36078;
\cssrgb\c75686\c51765\c392;\cssrgb\c59608\c40784\c392;\cssrgb\c31373\c63137\c30980;\cssrgb\c62745\c63137\c65490;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.control.LoopController;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.engine.StandardJMeterEngine;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.protocol.http.config.gui.HttpDefaultsGui;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.protocol.http.control.CookieManager;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.protocol.http.control.HeaderManager;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.protocol.http.sampler.HTTPSampler;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.testelement.TestElement;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.testelement.TestPlan;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.threads.SetupThreadGroup;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.util.JMeterUtils;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.util.SSLManager;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jmeter.util.TestPlanGui;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.apache.jorphan.collections.HashTree;\
\'a0\

\fs24 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf2 class\cf4 \'a0\cf5 JMeterWebLoginTest\cf4 \'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\
\'a0\'a0\'a0\'a0
\fs24 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf2 static
\fs26\fsmilli13333 \cf3 \'a0void\'a0main(
\fs24 \cf6 String
\fs26\fsmilli13333 \cf3 []\'a0args)\'a0\{\
\'a0\'a0\'a0\'a0
\fs24 \cf2 try
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 JMeterUtils
\fs26\fsmilli13333 \cf3 .loadJMeterProperties(
\fs24 \cf7 "path\'a0to\'a0jmeter.properties"
\fs26\fsmilli13333 \cf3 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 HashTree
\fs26\fsmilli13333 \cf3 \'a0testPlanTaxonomy\'a0=\'a0new\'a0
\fs24 \cf6 HashTree
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 TestPlan
\fs26\fsmilli13333 \cf3 \'a0testPlan\'a0=\'a0new\'a0
\fs24 \cf6 TestPlan
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTaxonomy.add(testPlan);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 HttpDefaultsGui
\fs26\fsmilli13333 \cf3 \'a0httpConfig\'a0=\'a0new\'a0
\fs24 \cf6 HttpDefaultsGui
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTree.getTree(testPlan).add(httpConfig);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 LoopController
\fs26\fsmilli13333 \cf3 \'a0loopController\'a0=\'a0new\'a0
\fs24 \cf6 LoopController
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loopController.setLoops(
\fs24 \cf6 1
\fs26\fsmilli13333 \cf3 );\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 SetupThreadGroup
\fs26\fsmilli13333 \cf3 \'a0threadGroup\'a0=\'a0new\'a0
\fs24 \cf6 SetupThreadGroup
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0threadGroup.setNumThreads(
\fs24 \cf6 1
\fs26\fsmilli13333 \cf3 );\'a0
\fs24 \cf8 //concurrency
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0threadGroup.setRampUp(
\fs24 \cf6 1
\fs26\fsmilli13333 \cf3 );\'a0
\fs24 \cf8 //ramp\'a0up\'a0amount
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0threadGroup.setSamplerController(loopController);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTaxonomy.getTree(testPlan).add(threadGroup);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 HTTPSampler
\fs26\fsmilli13333 \cf3 \'a0loginSampler\'a0=\'a0new\'a0
\fs24 \cf6 HTTPSampler
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.setDomain(\'93yourdomaingoeshere.com
\fs24 \cf7 ");\'a0
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.setPort(80);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.setPath("/loginpathtologinuser);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.setMethod(
\fs24 \cf7 "POST"
\fs26\fsmilli13333 \cf3 );\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.addArgument(
\fs24 \cf7 "username"
\fs26\fsmilli13333 \cf3 ,\'a0
\fs24 \cf7 "your_username"
\fs26\fsmilli13333 \cf3 );\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0loginSampler.addArgument(
\fs24 \cf7 "password"
\fs26\fsmilli13333 \cf3 ,\'a0
\fs24 \cf7 "your_password"
\fs26\fsmilli13333 \cf3 );\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTaxonomy.getTree(threadGroup).add(loginSampler);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 CookieManager
\fs26\fsmilli13333 \cf3 \'a0cookieManager\'a0=\'a0new\'a0
\fs24 \cf6 CookieManager
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0cookieManager.setName(
\fs24 \cf7 "Cookie\'a0Manager"
\fs26\fsmilli13333 \cf3 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTree.getTree(threadGroup).add(cookieManager);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 HeaderManager
\fs26\fsmilli13333 \cf3 \'a0headerManager\'a0=\'a0new\'a0
\fs24 \cf6 HeaderManager
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0headerManager.setName(
\fs24 \cf7 "Header\'a0Manager"
\fs26\fsmilli13333 \cf3 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0testPlanTaxonomy.getTree(threadGroup).add(headerManager);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 StandardJMeterEngine
\fs26\fsmilli13333 \cf3 \'a0jmeter\'a0=\'a0new\'a0
\fs24 \cf6 StandardJMeterEngine
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 SSLManager
\fs26\fsmilli13333 \cf3 \'a0sslManager\'a0=\'a0
\fs24 \cf6 SSLManager
\fs26\fsmilli13333 \cf3 .getInstance();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0sslManager.setContext(jmeter.getDefaultSSLContext());\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0jmeter.configure(testPlanTaxonomy);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0jmeter.run();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}
\fs24 \cf2 catch
\fs26\fsmilli13333 \cf3 (
\fs24 \cf6 Exception
\fs26\fsmilli13333 \cf3 \'a0e)\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 System
\fs26\fsmilli13333 \cf3 .out.
\fs24 \cf5 println
\fs26\fsmilli13333 \cf3 (e.printStackTrace());\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\}\
\}\
}