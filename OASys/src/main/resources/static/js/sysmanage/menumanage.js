$(function () {

    query(0, 10, "");

})

//搜索
function search() {
    //获得每页条数
    var count = $("#count").val();
    //获得关键字
    var keyword = $("#keyword").val();
    query(0, count, keyword);
}

//分页查询
function query(page, count, keyword) {

    //改变页码
    var pg = eval(page + "+" + 1);
    $("#nowPage").val(pg);

    $.ajax({
        url: "../typeList/queryTypeListByModelOrName",
        data: {page: page, count: count, keyword: keyword},
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
                            "<a href='goUpdate?typeId="+data[i].typeId+"' class='label xiugai'>" +
                                "<span class='glyphicon glyphicon-edit'></span>修改" +
                            "</a>" +
                            "<a href='javascript:del("+data[i].typeId+");' class='label shanchu'>" +
                                "<span class='glyphicon glyphicon-remove'></span> 删除" +
                            "</a>" +
                            "</td>" +
                        "</tr>";

                }

                d += "</table>"
                //给表格赋值
                $("#tab").html(d);

            } else {

                $("#tab").html("<p align='center'>暂时还没有数据哦~前往<a href='#' style='color: #2b669a'>添加</a></p>");

            }

        }
    });

    //根据条件查询总页码
    $.ajax({
        url: "../typeList/queryTotalByModelOrName",
        data: {keyword: keyword},
        async: false,
        success: function (data) {
            $("#totalCount").text(data);
            if (data % count == 0){
                $("#totalPage").text(parseInt(data/count));
            } else {
                $("#totalPage").text(parseInt(data/count) + 1);
            }
        }
    });

    //是否禁用上一页和下一页
    if (page == 0){
        $("#previous").attr("disabled", "disabled");
    } else {
        $("#previous").removeAttr("disabled");
    }
    var totalPage = $("#totalPage").text();
    var pg = eval(totalPage + "-" + 1);
    if (page == pg){
        $("#next").attr("disabled", "disabled");
    } else {
        $("#next").removeAttr("disabled");
    }

}

//上一页
function previousPage() {
    //获得当前页码
    var page = $("#nowPage").val();
    if (page >= 2){
        page = page - 2;
    } else {
        page = page - 1;
    }
    //获得每页条数
    var count = $("#count").val();
    //获得关键字
    var keyword = $("#keyword").val();
    //查询
    query(page, count, keyword);
}

//下一页
function nextPage() {
    //获得当前页码
    var page = $("#nowPage").val();
    //获得每页条数
    var count = $("#count").val();
    //获得总页码
    var totalPage = $("#totalPage").text();
    if (page >= totalPage){
        page = page - 1;
    }
    //获得关键字
    var keyword = $("#keyword").val();
    //查询
    query(page, count, keyword);
}

//跳转页码
function skipPage() {
    //获得每页条数
    var count = $("#count").val();
    //获得当前页码
    var now = $("#nowPage").val();
    //获得总页码
    var total = $("#totalPage").text();
    //获得关键字
    var keyword = $("#keyword").val();
    //判断是否符合格式
    if (now == null || now == '' || isNaN(now)
        || now <= 0 || (now % 1) != 0 || now > total) {
        alert("页码填写错误，请填写正整数");
    } else {
        var page = eval(now + "-" + 1);
        query(page, count, keyword);
    }
}

//根据条件和每页条数查询
function sel() {
    //获得每页条数
    var count = $("#count").val();
    //获得关键字
    var keyword = $("#keyword").val();
    //查询
    query(0, count, keyword);
}

//删除
function del(id) {
    if (confirm("确认删除吗？删除的数据将不能再恢复！")){
        window.location.href="delTypeListByTypeId?typeId="+id;
    }
}

