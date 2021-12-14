<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>Sandwich Condiments</title>
</head>
<body>
<h2>Sandwich Condiments</h2>

<form action="saveCondiment" method="get">
  <input type="checkbox" id="lettuce" name="condiment" value="Lettuce">
  <label for="lettuce">Lettuce</label>
  <input type="checkbox" id="tomato" name="condiment" value="Tomato">
  <label for="tomato">Tomato</label>
  <input type="checkbox" id="mustard" name="condiment" value="Mustard">
  <label for="mustard">Mustard</label>
  <input type="checkbox" id="sprouts" name="condiment" value="Sprouts">
  <label for="sprouts">Sprouts</label>
  <hr>
  <input type="submit" value="Save">
</form>
<h2>Pick up: </h2>
<span>
<c:forEach var="result" items="${condiment}">
  ${result}
</c:forEach></span>
</body>
</html>
