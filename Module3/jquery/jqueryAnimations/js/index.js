
    $('#draggable').draggable();
    $('#droppable').droppable({
        drop:function(){
            $(this).find("p").html("dropped!!")
            $(this).css("background-color","yellow")
        }
    });
