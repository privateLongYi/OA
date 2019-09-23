$(function () {

    $.ajax({
        url: "../../typeList/queryTypeListByModelOrName",
        data: {page: 1, count: 10, keyword: "list"},
        async: false,
        success: function (data) {

            //数据
            var d = "<table class='table table-hover'>" +
                        "<tr>" +
                            "<th scope='col'>模块</th>" +
                            "<th scope='col'>类型</th>" +
                            "<th scope='col'>排序值</th>" +
                            "<th scope='col'>操作</th>" +
                        "</tr>";
            //判断是否有数据
            if (data.length > 0) {

                for (var i = 0; i < data.length; i++) {

                    d += "<tr>" +
                            "<td><span>"+data[i].typeModel+"</span></td>" +
                            "<td><span>"+data[i].typeName+"</span></td>" +
                            "<td><span>"+data[i].sortValue+"</span></td>" +
                            "<td>" +
                                "<a href='../../../templates/sysmanage/typemanage/typeedit.html' class='label xiugai'>" +
                                    "<span class='glyphicon glyphicon-edit'></span>修改" +
                                "</a>" +
                                "<a title='查看详细信息' href='##' class='label xiugai'>" +
                                    "<span class='glyphicon glyphicon-search'></span> 查看" +
                                "</a> " +
                                "<a onclick='{return confirm('删除该记录将不能恢复，确定删除吗？');};'" +
                                    "href='deletetype?id=1' class='label shanchu'>" +
                                    "<span class='glyphicon glyphicon-remove'></span> 删除" +
                                "</a>" +
                            "</td>" +
                        "</tr>";

                }

                d += "</table>"
                //给表格赋值
                $("#tab").html(d);

            } else {


            }

        }
    });

})