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

    $.ajax({
        url: "../../taskList/queryTask",
        data: {page: 1, count: 10, keyword: "list"},
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
                        "<td><span>"+data[i].typeId+"</span></td>" +
                        "<td><span>"+data[i].title+"</span></td>" +
                        "<td><span>"+data[i].publishTime+"</span></td>" +
                        "<td><span>"+data[i].userName+"</span></td>" +
                        "<td><span>"+(data[i].deptName==3?'公事':'私事')+"</span></td>" +
                        "<td><span class='label label-primary'>"+data[i].statusId+"</span></td>" +
                        "<td>" +
						"<span class='labels'> ";
						if(data[i].statusId == 1){
						    d+= "<label><input type='checkbox' name='top' class='val' checked disabled><i>✓</i></label>" ;
						}else{
							d+= "<label><input type='checkbox' name='top' class='val' disabled><i></i></label>";
						}
					d+="</span>"+
						"</td>"+
                        "<td>"+
						"<a  href='../../templates/taskmanage/taskedit.html'class='label xiugai'>"+
						"<span class=\"glyphicon glyphicon-edit\"></span>修改 "+
						"</a>"+
						"<a href='tasksee.html?id=51' class='label xiugai'>"+
						"<span class='glyphicon glyphicon-search'></span> 查看"+
						"</a>"+
                        "<a href='shanchu?id=51' onclick='{return confirm(\"删除该记录将不能恢复，确定删除吗？\";};' class='label shanchu'>"+
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


            }

        }
    });
				
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