{\rtf1\ansi\ansicpg1252\cocoartf2639
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;\red0\green0\blue0;}
{\*\expandedcolortbl;;\cssrgb\c0\c0\c0;}
\margl1440\margr1440\vieww50700\viewh27380\viewkind0
\deftab720
\pard\pardeftab720\li1920\sa133\partightenfactor0

\f0\fs26\fsmilli13333 \cf2 \expnd0\expndtw0\kerning0
import java.util.concurrent.*;\uc0\u8232 \'a0\u8232 public class BasicCacheExample \{\u8232 \'a0 private final ConcurrentHashMap cache = new ConcurrentHashMap<>();\u8232 \u8232 \'a0 public Object getFromCache(String key) \{\u8232 \'a0\'a0\'a0 return cache.get(key);\u8232 \'a0 \}\u8232 \u8232 \'a0 public void addToCache(String key, Object value) \{\u8232 \'a0\'a0\'a0 cache.put(key, value);\u8232 \'a0 \}\u8232 \u8232 \'a0 public void removeFromCache(String key) \{\u8232 \'a0\'a0\'a0 cache.remove(key);\u8232 \'a0 \}\u8232 \}\
}