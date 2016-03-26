<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en" class="app">
<head>
    <meta charset="utf-8"/>
    <title>超神必备接口说明文档</title>
    <meta name="description" content="app, web app, responsive, admin dashboard, admin, flat, flat ui, ui kit, off screen nav"/>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
    <link rel="stylesheet" href="/assets/css/bootstrap.css" type="text/css"/>
    <link rel="stylesheet" href="/assets/css/animate.css" type="text/css"/>
    <link rel="stylesheet" href="/assets/css/font-awesome.min.css" type="text/css"/>
    <link rel="stylesheet" href="/assets/css/simple-line-icons.css" type="text/css"/>
    <link rel="stylesheet" href="/assets/css/font.css" type="text/css"/>
    <link rel="stylesheet" href="/assets/css/app.css" type="text/css"/>
    <!--[if lt IE 9]>
    <script src="/assets/js/ie/html5shiv.js"></script>
    <script src="/assets/js/ie/respond.min.js"></script>
    <script src="/assets/js/ie/excanvas.js"></script>
    <![endif]-->
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
                        <li class="dropdown-header b-b b-light"><em>意见反馈</em></li>
                        <c:forEach items="${list}" var="doc">
                            <li><a href="#doc${doc.id}">${doc.name}</a></li>
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
                <section  id="docs">
                    <div class="clearfix padder">
                        <h3>说明</h3>
                        <h5 class="m-t-lg">该文档仅适用于超神必备意见反馈提模块相关接口说明描述.</h5>
                        <!--接口内容区域-->
                        <h3 id="isJoined" class="text-success">1 意见反馈提交</h3>
                        <p><strong>描述</strong></p>
                        <p>用户填写意见信息<p>
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
                            <tr>
                                <td>content</td>
                                <td>String</td>
                                <td>意见反馈的内容</td>
                            </tr>
                            </tbody>
                        </table>
                        <p><strong>返回结果</strong>：(JSON实例)</p>
			  <pre class="code_sample">[
    {
        "data": "保存成功"
    }
]</pre>
                        <p><strong>返回参数</strong></p>
                        <!--接口内容区域//END-->


                        <!-------------------------很邪恶的分割线-------------------------->
                    </div>
                </section>
            </section>
        </section>
    </section>
</section>
<!-- footer -->
<script src="/assets/js/jquery.min.js"></script>
<!-- Bootstrap -->
<script src="/assets/js/bootstrap.js"></script>
<!-- App -->
<script src="/assets/js/app.js"></script>
<script src="/assets/js/slimscroll/jquery.slimscroll.min.js"></script>
<script src="/assets/js/app.plugin.js"></script>

</body>
</html>