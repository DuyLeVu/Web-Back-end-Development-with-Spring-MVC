<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Calculator</title>
</head>
<body>
<h2>Calculator</h2>

<form action="/cal" method="get">
  <input type="text" name="number1">
  <input type="text" name="number2"><br><br>
 <button name="operator" value="add">Addition(+)</button>
  <button name="operator" value="sub">Subtraction(-)</button>
  <button name="operator" value="mul">Multiplication(*)</button>
  <button name="operator" value="div">Divition(/)</button>
</form>
<h2>Result Division: ${result}</h2>
</body>
</html>
