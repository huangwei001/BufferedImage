<%@page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<html>
<head>
<script src="js/jquery/jquery-1.7.1.js"></script>
<script type="text/javascript">


    $(document).ready(function () {

    });

    function checkNode() {
        document.getElementById("password").src = "/servlet/BuffImage?d=" +Math.random();
    }

</script>
</head>
<body>
<form action="/servlet/CheckServlet">
        验证码<input id="validateCode" name="validateCode">
        <img src="/servlet/BuffImage" id="password" onclick="checkNode()">
        <a href="javascript:void(0)" onclick="checkNode()">看不清，换一张</a>
        </br>
        <input type="submit" value="提交">
</form>
</body>

</html>