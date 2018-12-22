<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ page session="false"%>
<html>
<head>
<title>Layout</title>
</head>
<body>
	<h1>Apache Tiles and Spring Boot Integration!!!</h1>
	<tiles:insertAttribute name="content" />
	<P>Copyright by Huong Dan Java</P>
</body>
</html>