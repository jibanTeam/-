$(document).ready(function(){
    var encrypt = new JSEncrypt();
    encrypt.setPublicKey("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjzwjsGsfH8DXG4+NRdMhM3YDV+JRto9APrnacWUBtzdg+Cn9XcSn0qzS26H2cUe8UFdWmEsTOK3M9kcdXG3MZK8MgdjNFuWo8fbCSmgNGZpiI1k3b2mYGn8CqJvxZZ1cmNBfOBcze6kYYKiKQDjNWM+/rn5qfPHBCR3b57vF7ZkAzCzFiIU2xtdKE4+02479llNTxrIrg6BWs32MsmPBYuDN6hS3mkEB2S9qqualPFqsXeIDCnENjKktHi93HOsyHk4GWGt2MeYmlrxTwLqGJR7OCR3hwPvktL2KHs69KtPGyCR+6BiaX1cB44Ej5xVREz7W6jZZEhB16jrUPlrCKwIDAQAB");
    $("#head-textPas ").css({"color":"#1a1a1a","font-weight":"600","border-bottom":"#0d86c4 solid 3px"});
    var messDom=$(".message");
    $(".am-icon-spinner").hide();
    $(".index-head text").click(function(){
        messDom.text("");
        $(".index-head text").css({"color":"#444","font-weight":"normal","border":"none"});
        $("#register").hide();
        $("#noPassLogin").hide();
        $("#passwordLogin").hide();
        if($(this).attr('id')==="head-textEm"){
                    $(".emailTag").show();
                    $("#register").show();
        }else if($(this).attr('id')==="head-textPas") {
            $(".emailTag").show();
            $("#noPassLogin").show();
        }else {
            $(".emailTag").hide();
            $("#passwordLogin").show();
        }
        $(this).css({"color":"#1a1a1a","font-weight":"600","border-bottom":"#0d86c4 solid 3px"});


    });

    $(".am-close").click(function(){
        $(".am-alert").fadeOut("slow");
    });

   $(".sendCode").click(function() {
       var email;
       // email=encrypt.encrypt($(".emailLog").val());
       email=$(".emailLog").val();
       console.log(email);
       messDom.text("");
       $(".am-icon-spinner").show();
       $(".reShow").fadeOut("slow");
       $.ajax({url:"/login/emailSend?e="+email,success:function(result){
               $(".am-icon-spinner").hide();
               messDom.text(result.message);
               if(result.status==="false"){
                   messDom.css("color","#dd0001");
               }else {
                   messDom.css("color","#71716f");
               }
           }});
   });
    $("#resBut").click(function() {

        if($("#password-re").val()!==$("#passwordAg-re").val()){
            messDom.text("俩次密码不一致");
            messDom.css("color","red");
        }else {
            messDom.text("");
            $(".am-icon-spinner").show();
            $.post("/login/register",
                {
                    email: $(".emailLog").val(),
                    userName: $("#userName-re").val(),
                    password: $("#password-re").val()
                },
                function (data, status) {
                $(".am-icon-spinner").hide();
                if(data.status==="false"){
                    messDom.css("color","red");
                }else {
                    messDom.css("color","green");
                    window.location.href = "/public/homePage";
                }
                messDom.text(data.message);

            });
        }

    });
    $("#LoginBut").click(function() {

        messDom.text("");
        $(".am-icon-spinner").show();
        $.post("/login/rentLogin",
            {
                userName: $("#userName-us").val(),
                password: $("#password-us").val()
            },
            function (data, status) {

                $(".am-icon-spinner").hide();
                if(data.status==="false"){
                    messDom.css("color","red");
                }else {
                    messDom.css("color","green");
                    window.location.href = "/public/homePage";
                }
                messDom.text(data.message);

            });

    });

    $("#NoPasBut").click(function() {

            messDom.text("");
            $(".am-icon-spinner").show();
            $.ajax({url:"/login/emailLogin",success:function(result){
                    $(".am-icon-spinner").hide();
                    messDom.text(result.message);
                    if(result.status==="false"){
                        messDom.css("color","#dd0001");
                    }else {
                        messDom.css("color","#71716f");
                        window.location.href = "/public/homePage";
                    }

                }});

    });

    $(".showIndex").click(function() {
        window.location.href = "/public/homePage";
    });

    $('#code').bind('input propertychange', function()
    {

        $.ajax({url:"/login/VerificationCode?email="+$(".emailLog").val()+"&code="+$(this).val(),
            success:function(result){
                if(result.status==="false"){
                }
                else if (result.status==="timeOut"){
                    messDom.text(result.message);
                    messDom.css("color","red");
                    $(".reShow").fadeIn("slow");
                }
                else{
                    messDom.text(result.message);
                    messDom.css("color","green");
                    $(".reShow").fadeIn("slow");
                }
            }});
    })




});
