function showDoc(){
    var doc = this;
    console.log(doc);
}

function showDocElementByTag(){
    var docTag= document.getElementsByTagName("p");
    for(var i = 0; i < docTag.length; i++){
        docTag[i].style.background = "#93e9f1";
    }
    console.log(docTag);
}

function showDocElementByClass(){
    var docClass = document.getElementsByClassName("example");
    for(var i = 0; i < docClass.length; i++){
        docClass[i].style.color = "#be4815";
    }
    console.log(docClass);
}

function showDocElementById(){
    var docId = document.getElementById("text");
    docId.style.background = "#3f0d41";
    docId.style.color = " #e6af51";
    console.log(docId);
}

function showDocElementsByName(){
    var docName = document.getElementsByName("description");
    for(var i = 0; i < docName.length; i++){
        docName[i].style.fontSize = "125%";
    }
    console.log(docName);
}

function showDocquerySelector(){
    var docQueryTag = document.querySelector("p");
    var docQueryClass = document.querySelector(".example");
    var docQueryId = document.querySelector("#text2");
    
    docQueryTag.style.fontFamily = "Lucida Handwriting, Cursive";
    docQueryClass.style.background = "#402d0c";
    docQueryId.style.color = "#e83535";

    console.log(docQueryTag,docQueryClass,docQueryId);
}

function showDocquerySelectorAll(){
    var docQueryAllTag = document.querySelectorAll("button");
    var docQueryAllClass = document.querySelectorAll(".example");
    var docQueryAllId = document.querySelectorAll("#text3");

    for(var i = 0; i < docQueryAllTag.length; i++){
        docQueryAllTag[i].style.background = "#334143";
    }
    for(i = 0; i < docQueryAllClass.length; i++){
        docQueryAllClass[i].style.color = "#2e8d2a";
    }
    for(i = 0; i < docQueryAllId.length; i++){
        docQueryAllId[i].style.fontFamily = "Papyrus, Fantasy";
    }

    console.log(docQueryAllTag,docQueryAllClass,docQueryAllId);
}
