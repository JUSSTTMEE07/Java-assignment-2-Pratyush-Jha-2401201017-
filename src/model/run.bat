@echo off
setlocal
set ROOT=%~dp0\..\..
pushd "%ROOT%"

if not exist bin mkdir bin

javac -d bin src/model/Person.java src/model/Student.java src/service/RecordActions.java src/service/StudentManager.java src/MainApp.java
if errorlevel 1 goto :end

java -cp bin MainApp

:end
popd
pause
