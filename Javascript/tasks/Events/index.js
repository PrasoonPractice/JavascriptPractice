function mouseoverevent(item){
    item.parentElement.style.background = "#8a8787";
}

function mouseoutevent(item){
    item.parentElement.style.background = "";
    item.parentElement.children[1].style.background = "";
    item.parentElement.children[2].style.background = "";
}

function clickevent(item){
    item.parentElement.children[1].style.background = "#36898f";
    item.parentElement.children[2].style.background = "#82368f";
}

function mousedownevent(item){
    item.parentElement.children[2].style.background = "#b46746";
    item.parentElement.children[0].style.background = "#b46746";
}

function mouseupevent(item){
    item.parentElement.children[2].style.background = "";
    item.parentElement.children[0].style.background = "";
}

function mousemoveevent(item){
    item.parentElement.style.background = "#800f0f";
}