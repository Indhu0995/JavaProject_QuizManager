$("a.nav-toggler").on('click',function(e){
  e.preventDefault();

    $("navbar .nav-menu").slideToggle('slow');
  
});
$(document).ready(function() {
    // Optimalisation: Store the references outside the event handler:
    var $window = $(window);

    function checkWidth() {
        var windowsize = $window.width();
        if (windowsize > 768) {
           $("navbar .nav-menu").show();
            
        }else if(windowsize <768){
          $("navbar .nav-menu").hide();
        }
    }
    // Execute on load
    checkWidth();
    // Bind event listener
    $(window).resize(checkWidth);
});