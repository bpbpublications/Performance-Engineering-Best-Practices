{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red147\green0\blue147;\red0\green0\blue0;\red74\green74\blue74;
\red178\green113\blue6;\red133\green85\blue4;\red66\green147\blue62;}
{\*\expandedcolortbl;;\cssrgb\c65098\c14902\c64314;\cssrgb\c0\c0\c0;\cssrgb\c36078\c36078\c36078;
\cssrgb\c75686\c51765\c392;\cssrgb\c59608\c40784\c392;\cssrgb\c31373\c63137\c30980;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\sa133\partightenfactor0

\f0\fs24 \cf2 \expnd0\expndtw0\kerning0
import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.By;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.WebDriver;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.WebElement;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.chrome.ChromeDriver;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.chrome.ChromeOptions;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.devtools.DevTools;\

\fs24 \cf2 import
\fs26\fsmilli13333 \cf3 \'a0org.openqa.selenium.devtools.v98.performance.Performance;\
\'a0\

\fs24 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf2 class\cf4 \'a0\cf5 WebPageLCPMeasurement\cf4 \'a0
\fs26\fsmilli13333 \cf3 \{\
\'a0\'a0\'a0\'a0
\fs24 \cf2 public
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf2 static
\fs26\fsmilli13333 \cf3 \'a0void\'a0main(
\fs24 \cf6 String
\fs26\fsmilli13333 \cf3 []\'a0args)\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 System
\fs26\fsmilli13333 \cf3 .setProperty(
\fs24 \cf7 "webdriver.chrome.driver"
\fs26\fsmilli13333 \cf3 ,\'a0
\fs24 \cf7 "/path/to/chromedriver"
\fs26\fsmilli13333 \cf3 );\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 ChromeOptions
\fs26\fsmilli13333 \cf3 \'a0options\'a0=\'a0new\'a0
\fs24 \cf6 ChromeOptions
\fs26\fsmilli13333 \cf3 ();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0options.addArguments(
\fs24 \cf7 "--headless"
\fs26\fsmilli13333 \cf3 );\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 WebDriver
\fs26\fsmilli13333 \cf3 \'a0driver\'a0=\'a0new\'a0
\fs24 \cf6 ChromeDriver
\fs26\fsmilli13333 \cf3 (options);\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0
\fs24 \cf6 DevTools
\fs26\fsmilli13333 \cf3 \'a0devTools\'a0=\'a0(
\fs24 \cf6 DevTools
\fs26\fsmilli13333 \cf3 )\'a0driver;\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0devTools.createSession();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0devTools.send(
\fs24 \cf6 Performance
\fs26\fsmilli13333 \cf3 .enable());\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0driver.
\fs24 \cf2 get
\fs26\fsmilli13333 \cf3 (
\fs24 \cf7 "https://yourwebpage\'94);\'a0
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0try\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0Thread.sleep(5000);\'a0//\'a0Sleep\'a0for\'a05\'a0seconds\'a0(adjust\'a0as\'a0needed)\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\'a0catch\'a0(InterruptedException\'a0e)\'a0\{\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0e.printStackTrace();\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\}\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0//\'a0Retrieve\'a0LCP\'a0value\'a0from\'a0performance\'a0metrics\
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0WebElement\'a0lcpElement\'a0=\'a0driver.findElement(By.cssSelector("your-lcp-element-selector
\fs24 \cf7 "));
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0double\'a0lcpValue\'a0=\'a0Double.parseDouble(lcpElement.getAttribute("data-timestamp
\fs24 \cf7 "));
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0System.out.println("
\fs24 \cf6 LCP
\fs26\fsmilli13333 \cf3 \'a0(
\fs24 \cf6 Largest
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf6 Contentful
\fs26\fsmilli13333 \cf3 \'a0
\fs24 \cf6 Paint
\fs26\fsmilli13333 \cf3 ):\'a0
\fs24 \cf7 "\'a0+\'a0lcpValue\'a0+\'a0"
\fs26\fsmilli13333 \cf3 \'a0milliseconds
\fs24 \cf7 ");
\fs26\fsmilli13333 \cf3 \
\'a0\'a0\'a0\'a0\'a0\'a0\'a0\'a0driver.quit();\
\'a0\'a0\'a0\'a0\}\
\}\
}