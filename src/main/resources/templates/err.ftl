<!DOCTYPE html>
<html>
<head lang="en">
    <meta charseet="UTF-8"/>
    <title>捕获异常</title>
</head>
    <body>
<div>
    发生错误：
    <div th:text="${url}"> urls="${url}</div>
    <div th:text="${exception.message}">message="${exception.message}"</div>
</div>
    </body>
</html>