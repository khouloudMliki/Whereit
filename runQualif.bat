mvn test -P Qualif
set "dummy="
set /p DUMMY=Hit ENTER to continue...
if defined dummy (echo not just ENTER was pressed) else (echo just ENTER was pressed)