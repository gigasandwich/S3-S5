cls
@echo off
javac -sourcepath "WEB-INF\src" -d "WEB-INF\classes" -cp "WEB-INF\lib\*" WEB-INF\src\aff\Test.java
java -cp "WEB-INF\classes;WEB-INF\lib\*" aff.Test