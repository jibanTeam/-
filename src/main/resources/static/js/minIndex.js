$(document).ready(function () {
    $(".collapse-position").click(function () {
        if($(this).css("color")!=="rgb(255, 0, 0)") {
            if($(".evenFalse").length>4){
                $("#art").css("color","red");
                return false;
            }
            $(this).css("color", "red");
            $("#positionTitle").append(" <button type='button' class='am-btn am-btn-success am-btn-xs am-round evenFalse'  data-id-i='" + $(this).attr('data-id') + "' style='margin:5px 0 0 15px;'>" + $(this).text() + "<i style='margin-left: 5px' class='am-icon-close'></i> </button>")
        }else {
            $(this).css("color","#666");
            $("[data-id-i='"+$(this).attr('data-id')+"']").remove();
        }
    });

    $("#positionTitle").on("click","button",function (e) {
        $("#art").css("color","black");
        $(this).remove();
        $("[data-id='"+$(this).attr('data-id-i')+"']").css("color","#666");
        return false;
    })

    $(".collapse-other").click(function () {
        var that=$(this);
        var id=that.attr("data-id");
        $("[data-id-i='"+id+"']").remove();
        $("#otherTitle").append(" <button type='button' class='am-btn am-btn-warning am-btn-xs am-round otherEn'  data-id-i='" + id+ "' style='margin:5px 0 0 15px;'>" + that.text() + "<i style='margin-left: 5px' class='am-icon-close'></i> </button>");
        $("[data-id='"+id+"']").css("color","#666");
        that.css("color","red");

    });

    $("#otherTitle").on("click","button",function (e) {
        $(this).remove();
        $("[data-id='"+$(this).attr('data-id-i')+"']").css("color","#666");
        return false;
    })
    
    $(".callback").click(function () {
        $('body,html').animate({
                scrollTop: 0
            });
    })
});
