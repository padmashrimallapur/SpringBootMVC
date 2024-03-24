<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert Title</title>
</head>
<body>
   Welcome to Spring MVC
      <form action= "addCoder">
       Enter Coder Id : <input type="text" name="cid"><br>
       Enter Coder Name : <input type="text" name="name"><br>
       <input type="submit">
       </form>

          <form action= "getCoderByName" method="get">
              Enter Coder Name : <input type="text" name="name"><br>
              <input type="submit">
           </form>
</body>
</html>
