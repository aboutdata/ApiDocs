<%--
  Created by IntelliJ IDEA.
  User: wangkun23
  Date: 2016/7/15
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="app">
<head>
    <meta charset="utf-8"/>
    <title>京东金融接口说明文档</title>
    <jsp:include page="/WEB-INF/views/commons/header.jsp"/>
</head>
<body class="bg-light dker">
<section class="panel panel-default">
    <header class="panel-heading font-bold">Basic form</header>
    <div class="panel-body">
        <form role="form">
            <div class="form-group">
                <label>接口名称</label>
                <input type="text" class="form-control">
            </div>
            <div class="form-group">
                <label>描述</label>
                <input type="text" class="form-control">
            </div>
            <div class="form-group">
                <label>请求方法</label>
                <div class="radio i-checks">
                    <label>
                        <input name="option1" value="option1" checked="" type="radio">
                        <i></i>
                        Option two checked
                    </label>
                </div>
                <div class="radio i-checks">
                    <label>
                        <input name="option1" value="option1"  type="radio">
                        <i></i>
                        Option three checked and disabled
                    </label>
                </div>
            </div>
            <div class="form-group">
                <label>请求地址</label>
                <input type="text" class="form-control">
            </div>

            <div class="form-group">
                <label>请求参数</label>

            </div>
            <section class="panel panel-default">
                <header class="panel-heading font-bold">
                    Inline form
                </header>
                <div class="panel-body">
                    <form class="form-inline" role="form">
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputEmail2">Email address</label>
                            <input class="form-control" id="exampleInputEmail2" placeholder="Enter email" type="email">
                        </div>
                        <div class="form-group">
                            <label class="sr-only" for="exampleInputPassword2">Password</label>
                            <input class="form-control" id="exampleInputPassword2" placeholder="Password" type="password">
                        </div>
                        <div class="checkbox m-l m-r-xs">
                            <label class="i-checks">
                                <input type="checkbox"><i></i> Remember me
                            </label>
                        </div>
                        <button type="submit" class="btn btn-default">Sign in</button>
                        <a href="#modal-form" class="btn btn-success" data-toggle="modal">Form in a modal</a>
                    </form>
                </div>
            </section>




            <button type="submit" class="btn btn-sm btn-default">Submit</button>
        </form>
    </div>
</section>

<!-- footer -->
<script src="${pageContext.servletContext.contextPath}/assets/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="${pageContext.servletContext.contextPath}/assets/js/bootstrap.js"></script>
<!-- App -->
<script src="${pageContext.servletContext.contextPath}/assets/js/app.js"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/slimscroll/jquery.slimscroll.min.js"></script>
<script src="${pageContext.servletContext.contextPath}/assets/js/app.plugin.js"></script>

</body>
</html>
