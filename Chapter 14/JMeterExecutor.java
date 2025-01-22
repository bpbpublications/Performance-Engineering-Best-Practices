{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import org.apache.jmeter.engine.StandardJMeterEngine;\
import org.apache.jmeter.reporters.ResultCollector;\
import org.apache.jmeter.save.SaveService;\
import org.apache.jmeter.testelement.TestPlan;\
import org.apache.jmeter.util.JMeterUtils;\
\'a0\
public class JMeterExecutor \{\
\'a0\
\'a0\'a0\'a0 public static void executeTestPlan(String testPlanPath) throws Exception \{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Initialize JMeter\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 JMeterUtils.loadJMeterProperties("path/to/our/jmeter.properties");\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 JMeterUtils.initLocale();\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Load test plan\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 SaveService.loadProperties();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 TestPlan testPlan = SaveService.loadTree(new File(testPlanPath));\
\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 // Run the test plan\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 StandardJMeterEngine jmeter = new StandardJMeterEngine();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 jmeter.configure(testPlan);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 ResultCollector listener = new ResultCollector();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 jmeter.addTestListener(listener);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0 jmeter.run();\
\'a0\'a0\'a0 \}\
\}\
}