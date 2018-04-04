echo Starting Selenium Hub (you must then start at least 1 webdriver node) ...

:: browserTimeout Controls how long the browser is allowed to hang (value in seconds)
:: timeout Controls how long the client is  is allowed to be gone before the session is reclaimed (value in seconds)
:: Please note that the "browserTimeout" is intended as a backup timeout mechanism when the ordinary timeout mechanism fails, which should be used mostly in grid/server environments to ensure that crashed/lost processes do not stay around for too long, polluting the runtime environment.

java -jar selenium-server-standalone-3.4.0.jar -role hub -timeout 120 -browserTimeout 160