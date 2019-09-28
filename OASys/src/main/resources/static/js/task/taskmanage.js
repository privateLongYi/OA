$(function () {

    query(0, 10, "");

    /**
     * 根据不同的内容，显示不同的颜色
     */
    /*$(".change-color").each(function(){
        var $val=$(this).text();
        if($val=="新任务"){
            $(this).addClass("label-warning");
        }else if($val=="已接收"){
            $(this).addClass("label-info");
        }else if($val=="进行中"){
            $(this).addClass("label-primary");
        }else if($val=="已提交"){
            $(this).addClass("label-danger");
        }
        else if($val=="已完成"){
            $(this).addClass("label-success");
        }

    })*/

})

//搜索
function search() {
    //获得每页条数
    var count = $("#count").val();
    //获得关键字
    var keyword = $("#keyword").val();
    query(0, count, keyword);
}

function query(page, count, keyword){
    //改变页码
    var pg = eval(page + "+" + 1);
    $("#nowPage").val(pg);

    $.ajax({
        url: "../taskList/queryTask",
        data: {page: page, count: count, keyword: keyword},
        async: false,
        success: function (data) {

            //数据
            var d = "<table class='table table-hover table-striped'>" +
                "<thead>"+
                "<tr>" +
                "<th scope='col' class='co commen '>类型<span class='block'></span></th>" +
                "<th scope='col'>标题</th>" +
                "<th scope='col' class='co commen '>发布时间<span class='block'></span></th>" +
                "<th scope='col'>发布人</th>" +
                "<th scope='col'>部门</th>"+
                "<th scope='col' class='co commen '>状态<span class='block'></span></th>" +
                "<th>置顶</th>"+
                "<th scope='col'>操作</th>"+
                "</tr>"+
                "</thead>";
            //判断是否有数据
            if (data.length > 0) {
                for (var i = 0; i < data.length; i++) {

                    d +="<tbody>"+
                        "<tr>" +
                        "<td><span>"+(data[i].typeId==3?'公事':'私事')+"</span></td>" +
                        "<td><span>"+data[i].title+"</span></td>" +
                        "<td><span>"+data[i].publishTime+"</span></td>" +
                        "<td><span>"+data[i].userName+"</span></td>" +
                        "<td><span>"+data[i].deptName+"</span></td>" +
                        "<td>";
                        if(data[i].statusId == 3){
                            d+= "<span class='label label-primary'>新任务</span>";
                        }else if(data[i].statusId == 4){
                            d+= "<span class='label label-primary'>已接受</span>";
                        }else if(data[i].statusId == 5){
                            d+= "<span class='label label-primary'>进行中</span>";
                        }else if(data[i].statusId == 3){
                            d+= "<span class='label label-primary'>已提交</span>";
                        }else{
                            d+= "<span class='label label-primary'>已完成</span>";
                        }
                        d+="</td>" +
                        "<td>" +
                        "<span class='labels'> ";
                    if(data[i].isTop == 1){
                        d+= "<label><input type='checkbox' name='top' class='val' checked disabled><i>✓</i></label>" ;
                    }else{
                        d+= "<label><input type='checkbox' name='top' class='val' disabled><i></i></label>";
                    }
                    d+="</span>"+
                        "</td>"+
                        "<td>"+
                        "<a  href='goUpdate?taskId="+data[i].taskId+"'class='label xiugai'>"+
                        "<span class=\"glyphicon glyphicon-edit\"></span>修改 "+
                        "</a>"+
                        "<a href='tasksee.html?id=51' class='label xiugai'>"+
                        "<span class='glyphicon glyphicon-search'></span> 查看"+
                        "</a>"+
                        "<a href='javascript:del("+data[i].taskId+");' class='label shanchu'>" +
                        "<span class='glyphicon glyphicon-remove'></span> 删除"+
                        "</a>"+
                        "</td>" +
                        "</tr>"+
                        "</tbody>";

                }

                d += "</table>";
                //给表格赋值
                $("#tab").html(d);

            } else {

                $("#tab").html("<p align='center'>暂时还没有数据哦~前往<a href='#' style='color: #2b669a'>添加</a></p>");

            }

        }
    });

    //根据条件查询总页码
    $.ajax({
        url: "../taskList/queryTaskByword",
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
        window.location.href="delTaskList?taskId="+id;
    }
}

$(function(){
				$(".commen").click(function(){
					//寻找指定兄弟节点并去除class
					var $else=$(this).addClass("mm").siblings(".commen").removeClass("mm");
					//点击变换字体颜色
					var $color=$(this).addClass("bl").removeClass("co").siblings(".commen").addClass("co").removeClass("bl");
					//切换img
					$("#img").appendTo(".mm span");	
					var $val=$(this).text();
					console.log("什么鬼？");
					 $(".thistable").load("paixu",{val:$val});

				})


				

			})