<html>
<head>
    <title>hello springboot</title>
</head>
<body>
<ul list as freemakerFtlName>
    <#--freemaker语法-->
    <#--list是后端 存入Model.attribute中的key,as 是你定义的 接收遍历结果对象 名字-->
    <#list list as getUser>

    <#--要在其内部进行取值-->
        <li>${getUser.id}=>${getUser.username}=>${getUser.password}</li>
    </#list>
</ul>
<#--  ../ 表示跳出 本html所在层级根目录,后,在到目标位置访问,而static目录层级不用写-->
<img src="../staticResourceAccess/biu.gif"/>
</body>