<%-- 
    Document   : basket
    Created on : Jan 19, 2012, 12:03:46 AM
    Author     : magda
--%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>E-basket</title>
        <link href="style.css" rel="stylesheet" type="text/css"/></head>
    
    <body>
        <div id="hdr">
          <h1>Welcome to Magda's e-basket 
            <bean:write name="LoginForm" property="name" /></h1>
        </div>
        <div id="basketWR">
          <html:form action="/basket">
            <table border="1" align="center">
              <thead>
                <tr>
                  <th>Item</th>
                  <th>Price</th>
                  <th>Quantity</th>
                  <th>Total</th>
                  </tr>
                </thead>
              <tbody>
                <tr>
                  <td>Cafe</td>
                  <td>18.50</td>
                  <td><html:text property="cafe" />
                    
                    </td>
                  <td> <bean:write name="BasketForm" property="totalCafe" /></td>
                  </tr>
                <tr>
                  <td>Sugar</td>
                  <td>6.95</td>
                  <td><html:text property="sugar" />
                    
                    </td>
                  <td><bean:write name="BasketForm" property="totalSugar" /></td>
                  </tr>
                <tr>
                  <td>Water</td>
                  <td>1.29</td>
                  <td><html:text property="water" /></td>
                  <td><bean:write name="BasketForm" property="totalWater" /></td>
                  </tr>
                <tr>
                  <td>Total</td>
                  <td></td>
                  <td></td>
                  <td><bean:write name="BasketForm" property="total" /></td>
                  </tr>
                
                </tbody>
            </table>
            <div id="submit">
              <html:submit value="Submit" />
            </div>
          </html:form>
        </div>
    </body>
</html>
