<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Organizer</title>
    <link rel="stylesheet" type="text/css" href="/css/style.x60084.css"/>
</head>
<body>
<h1>Car ShowRoom</h1>
<h3>Add cars to list</h3>
<form action="/add" method="post">
    <table border="1px">
        <tr>
            <td>
                <label>Name</label>
                <input type="text" name="name">
            </td>
            <td>
                <label>Description</label>
                <input type="text" name="color">
            </td>
            <td>
                <label>date release</label>
                <input type="date" name="date">
            </td>
            <td>
                <input type="submit" value="add cars">
            </td>
        </tr>

    </table>
</form>
<br>
<h2>Cars list(cars count : ${carsCount})</h2>
<h3><a href = "/filter/removeAll">Сбросить фильтры</a></h3>
<table border="1px">
    <tr>
        <td><a href="/filter/id">Id></a></td>
        <td><a href="/filter/name">name</a></td>
        <td><a href="/filter/color">color</a></td>
        <td><a href="/filter/date">Date</a></td>
        <td>Delete from list</td>
    </tr>
    <#list carsList as car>
    <tr>
        <td>${car.id}</td>
        <td>${car.name}</td>
        <td>${car.color}</td>
        <td>${car.date}</td>
        <td><a href="${'/delete/'+car.id}">Delete</a></td>
    </tr>
    </#list>
</table>
</body>
</html>
