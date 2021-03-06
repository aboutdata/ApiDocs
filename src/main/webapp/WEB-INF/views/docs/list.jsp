<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="app">
    <head>
        <meta charset="utf-8"/>
        <title>京东金融接口说明文档</title>
        <jsp:include page="/WEB-INF/views/commons/header.jsp"/>
    </head>
    <body>
        <section class="hbox stretch">
            <!-- .aside -->
            <aside class="bg-light aside b-r animated fadeInLeftBig">
                <section class="vbox">
                    <header class="header b-b navbar">
                        <a class="btn btn-link pull-right visible-xs" data-toggle="class:show" data-target=".nav-primary">
                            <i class="fa fa-bars"></i>
                        </a>
                        <a class="navbar-brand">意见反馈接口</a>
                    </header>
                    <section class="scrollable">
                        <nav class="nav-primary hidden-xs nav-docs">
                            <ul class="nav">
                                <li class="dropdown-header b-b b-light">
                                    <em>意见反馈</em>
                                </li>
                                <c:forEach items="${list}" var="doc">
                                    <li>
                                        <a href="#doc${doc.id}">${doc.name}</a>
                                    </li>
                                </c:forEach>
                            </ul>
                        </nav>
                    </section>
                </section>
            </aside>
            <!-- /.aside -->
            <section id="feed">
                <section class="vbox">
                    <section class="scrollable bg-light lter" data-spy="scroll" data-target=".nav-primary">

                        <section  >
                            <div class="clearfix padder">
                                <h3>说明</h3>
                                <h5 class="m-t-lg">该文档仅适用于京东金融</h5>
                                <!--接口内容区域-->
                                <c:forEach items="${list}" var="doc" varStatus="idx">
                                    <h3 id="doc${doc.id}" class="text-success">${idx.index +1} ${doc.name}</h3>
                                    <p><strong>描述</strong></p>
                                    <p>${doc.description}<p>
                                    <p><strong>请求方法</strong></p>
                                    <code>POST /api/v1/feed/save</code>
                                    <h4 id="colors" class="m-t-lg">参数说明</h4>
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th style="width:70px;">参数</th>
                                                <th style="width:70px;">类型</th>
                                                <th>描述</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${doc.requestParameters}" var="requestParameter">
                                                <tr>
                                                    <td>${requestParameter.name}</td>
                                                    <td>${requestParameter.type}</td>
                                                    <td>${requestParameter.description}</td>
                                                </tr> 
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                    <p><strong>返回结果</strong>：(JSON实例)</p>
                                    <pre class="code_sample">[
    {
        "data": "保存成功"
    }
]</pre>
                                    <p><strong>返回参数</strong></p>
                                    <table class="table table-striped">
                                        <thead>
                                            <tr>
                                                <th style="width:70px;">参数</th>
                                                <th style="width:70px;">类型</th>
                                                <th>描述</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <c:forEach items="${doc.responseParameters}" var="responseParameter">
                                                <tr>
                                                    <td>${responseParameter.name}</td>
                                                    <td>${responseParameter.type}</td>
                                                    <td>${responseParameter.description}</td>
                                                </tr> 
                                            </c:forEach>
                                        </tbody>
                                    </table>
                                </c:forEach>
                                <!--接口内容区域//END-->
                                <!-------------------------很邪恶的分割线-------------------------->
                            </div>
                        </section>
                    </section>
                </section>
            </section>
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