//variables
function variableExample() {
    var x = 5;
    var y = 6;
    window.alert("x is : "+x+ " and y is : "+ y);
    console.log("The type of x : " + typeof(x) + " and of y is : " + typeof(y));
    var z = x + y;
    var text = "z is :" + z;
    //return statment
    return text;
  }

  //arrays and objects
  function arraysObject(){
    //object
    var person = {
        firstName:"Ram",
        lastName:"Krishna",
        age:15,
        //array inside object
        subjects:["English","Hindi","Maths","Science"]};

    console.log("Full Name : " + person.firstName + " " + person.lastName);
    console.log("Age : " + person.age);
    console.log("Subjects : " + person.subjects);
    //array
    var grades = ["A","A","B","B+"];
    //loops (for)
    for(var i=0; i < person.subjects.length; ++i){
        console.log("Subject : " + person.subjects[i] + " Grade :" + grades[i]);
        //if else
        if(grades[i]>="B+"){ console.log("Excelent");}
        else {console.log("Good");}
    }

  }

  function myName() {
    var person = prompt("Please enter your name");
    if (person != null) {
      document.getElementById("lable").innerHTML =
      "Hello " + person +"<br> Kindly enter a number in the textbox bellow to get it's table : ";
      document.getElementById("num").style.visibility = "visible";
      document.getElementById("generate").style.visibility = "visible";
    }
  }

  function showTable() {
      var number = document.getElementById("num").value;
      var result = document.getElementById("result");
      var i = 1;
      result.innerHTML = "";
      if (!isNaN(number)) {
        number = parseFloat(number);
        while( i <= 10) {
          var resultValue = number * i;
          result.innerHTML += number + " * " + i + " = " + resultValue + "<br>";
          i++;
        }
      } else {
        // Display an error message if the input is not a valid number
        result.innerHTML = "Please enter a valid number.";
      }
  }
  //function call
var message = variableExample();
window.alert(message);
console.log("The type of return is : " + typeof(message));
arraysObject();
