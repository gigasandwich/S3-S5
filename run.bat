cls
@echo off
javac -sourcepath "WEB-INF\src" -d "WEB-INF\classes" -cp "WEB-INF\lib\*" WEB-INF\src\Test\TestOrdinateur.java
java -cp "WEB-INF\classes;WEB-INF\lib\*" test.TestOrdinateur