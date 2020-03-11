$(function () {
    $("#btn").click(function () {
        $.ajax({
            url: "/examControl/getAllExam",
            type: "post",
            dataType: "json",
            success: function (data) {
                console.log(data);
            }
        })
    });
})