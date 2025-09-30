$(document).ready(function () {


  $("#entry-mail, #entry-password").blur(function () {
    $(this).css({
      backgroundColor: "#e9e9e9ff",
    });
  }).focus(function () {
    $(this).css({
      backgroundColor: "white",
    });
  });


  $(".btn").css({
    backgroundColor: "#32c3d6ff",
    border: ".5px solid #009bafff",
    padding: "10px 15px",
    color: "#1d1d1dff",
    fontWeight: "500",
    cursor: "pointer",
  });



});

/**
 *  $("form").on("submit", function(e) {
 //e.preventDefault();
 window.open("/src/main/resources/static/app.html", "_blank");
 });
 */