{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import io.cucumber.junit.Cucumber;\
import io.cucumber.junit.CucumberOptions;\
import org.junit.runner.RunWith;\
\'a0\
@RunWith(Cucumber.class)\
@CucumberOptions(features = "src/test/resources/features", glue = "path.to.your.step.definitions")\
public class CucumberJMeterRunner \{\
\'a0\'a0\'a0 // This class serves as a runner for our Cucumber tests\
\}\
}