<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Nam_Phuong
  Date: 2019-04-21
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>


      <form:form modelAttribute="calculator" action="/isCalculator" method="post">
          <form:input path="firstNumber"/>
          <form:input path="secondeNumber"/><br/>
          <button type="submit" name="operator" value="add">+</button>
          <button type="submit" name="operator" value="sub">-</button>
          <button type="submit" name="operator" value="multi">x</button>
          <button type="submit" name="operator" value="div">/</button>
      </form:form>
        <h3> Result: ${result}</h3>
  </body>
</html>
