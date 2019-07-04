<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>body{
    margin:0;
    padding:0;
    font-family:Arial;
}
a{
    text-decoration: none;
}.button {background-color: #EAECEE;} /* grey */
*{
  box-sizing:border-box;
}
/*
************************
   HEADER SECTION
************************
*/
header.header{
    padding:0px 50px;
    border-bottom:1px solid #777777;
    position:fixed;
    background-color:#fff;
    top:0;
  box-sizing:border-box;
  width:100%;
}

navbar{
    width:100%;
    display:flex;
    flex-direction: row;
    align-items:center;

}
navbar div.title a{
  right:0;
  position:absolute;
  margin-right:20px;
  font-weight:bold;
  padding:10px;
  border:1px solid #F9E79F;
  border-radius:5px;
  display:none;
}
navbar div.title a:hover{
  background-color:#F9E79F;
  color:#fff;
}
navbar div.title,navbr div.nav-menu {
   flex:1 1 auto;
}
navbar .nav-menu{
  display:block;
}
navbar .nav-menu ul{
    list-style:none;
    padding-left:0px;
}
navbar .nav-menu ul li{
    display:inline;
    padding:0px 10px;
}
navbar .nav-menu ul li a{
    text-decoration: none;
    color:#444444;
    font-weight:bold;
    font-size:16px;
}
navbar .nav-menu ul li a:hover,navbar .nav-menu ul li a:active{
  color:#F9E79F;
}
/*
************************
   HERO SECTION
************************
*/
section.hero{
  margin-top:80px;
    background-color:#F9E79F;
    display:flex;
    align-items: center;
    height:600px;
    text-align:center;
}
section.hero div{
    flex: 1;
    padding:0px 200px;
}
section.hero div h2{
    font-size:40px;
    margin-top:0px;
}
/*
************************
   SERVICES SECTION
************************
*/

section.services{
    padding:50px;
  
}
section.services h2{
    text-align:center;
    padding-bottom:10px;
    font-size:35px;
    margin-top:0px;
}
div.services_container{
    width:100%;
    display:flex;
    flex-direction: row;
    align-items:center;

}
.services_container .service{
    box-shadow:0px 0px 5px #444444;
    text-align:center;
    flex:1 1 auto;
    margin:5px;
    padding:20px;
}
.services_container .service:nth-child(1){
  background-color:#abc381
}
.services_container .service:nth-child(2){
  background-color:#cba381;
}
.services_container .service:nth-child(3){
  background-color:#abc;
}
.services_container .service:nth-child(4){
  background-color:#a389bc;
}
.services_container .service p{
  color:#444444;
}
.services_container .service:hover{
  background-color:#F9E79F;
  color:#fff;
}
/*
************************
   ABOUT US SECTION
************************
*/
section.about_us{
    padding:50px;
    background-color:#F9E79F;
    text-align:center;
}
section.about_us h2{
    text-align:center;
    padding-bottom:10px;
    font-size:35px;
    margin-top:0px;
}
/*
************************
   CONTACT US SECTION
************************
*/
section.contact_us{
    padding:50px;
    text-align:center;
}
section.contact_us h2{
    text-align:center;
    padding-bottom:10px;
    font-size:35px;
    margin-top:0px;
}
section.contact_us input,section.contact_us textarea,section.contact_us button{
    width:100%;
    max-width:768px !important;
    border:1px solid #444444;
    padding:20px;
    background-color:#fff;
    margin-bottom:10px;
    color:#444444;
    box-sizing: border-box;
}
section.contact_us input:focus,section.contact_us textarea:focus{
  border-color:#F9E79F;
}
section.contact_us .submit{
    background-color:#F9E79F;
    margin:0;
    margin-left:-10px;
    margin-right:-10px;
  cursor:pointer;
}
section.contact_us .submit:hover{
  background-color:#222222;
  color:#f0f0f0;
}
/*
************************
  FOOTER SECTION
************************
*/
footer{
    background-color:#222222;
    color:#ddd;
    text-align:center;
    padding:10px 0px;
}
@media(max-width:768px){
  header.header{
    padding:0px 20px;
  }
    navbar{
        display:block;
    }
  
   navbar .title,navbar .nav-menu{
        width:100%;

    }
  navbar div.title{
    display:flex;
    align-items:center;
    flex-direction:row;
  }
  navbar div.title a{
    display:block;
  }

  
  navbar .nav-menu{
    display:none;
  }
    navbar .nav-menu ul li{
        display:block;
        width:100%;
        padding:10px 5px;
      border-top:1px solid #444444;
    }
    section.hero{
        height:400px;
    }
    section.hero div{
        padding:0px 50px;

    }

    div.services_container {
        display:block;
    }
  div.services_container .service{
    margin-bottom:15px;
  }

 section.hero,section.services,section.about_us,section.contact_us{
        padding:50px 20px;
    }
}</style>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Landing Page</title>
     <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.js"></script>
   <script src="<c:url value="/js/home.js"/>" type="text/javascript"></script>

</head>
<body>
    <header class="header">
        <navbar class="navbar">
           <div class="title">
               <h1>WelCome to Quiz Manager</h1>
             <a href="#" class="nav-toggler" id="nav-toggler">Menu</a>
           </div>
          
           <div class="nav-menu">
              
               <ul>
                   <li><a href="#home">Home</a></li>
                   <li><a href="./addQuestions">Add Questions</a></li>
                   <!-- <li><a href="#why_us">Why us</a></li> -->
                   <li><a href="#about_us">Search Quiz</a></li>
                   <li><a ><input type="text" placeholder="Enter Quiz Name" id="searchText"></a></li>
                   <li><a><input type="button" value="Search" id="searchbtn"></a></li>   
               </ul>
           </div>
           
        </navbar>
    </header>
    
    <section class="hero" id="home">
        <div>
            <h2>Welcome to our Quiz!</h2>
            <h3>Free Online Mock Test</h3>
          <br>
           <c:forEach items="${examList}" var="entry">
           <h4>
           <a href="./startExam/${entry.examId}" >${entry.examDescrption} </a>  <input type="button" value="Export File" class="button" id="${entry.examId}">   <br><br></h4>
           <input type="hidden" value="${entry.examDescrption}" class="abc">
            </c:forEach>
         
          
        </div>
    </section>
</body>


<script type="text/javascript">
$(document).ready(function() {
	$("#searchbtn").click(function() {
		var serachward=$("#searchText").val();
		if(serachward==''){
			alert("Text blank");
		}else{
		debugger;
		$.ajax({
			type : "POST",
			url : "/getExamByserachward",
			dataType : 'json',
			data : JSON.stringify(serachward),
			contentType : "application/json;charset=UTF-8",
			xhrFields : {
				withCredentials : true
			},
			success : function(data) {
				if(data.length>0)
				{
				alert("Exam Found ..! Please Check Below ");
				}
				else
				{
					alert("No result Found ");
				}
			},
			error : function(xhr, status, error) {
				
			},
		});
		}
	});
	
	$('.button').on('click', function () {
		  var id=this.id;
	    $.ajax({
	        url: '/exportFile',
	        method: 'POST',
	        xhrFields: {
	        	withCredentials : true
	        },data : JSON.stringify(id),
	        contentType : "application/json;charset=UTF-8",
	        success: function (data) {
	            alert("Quiz Downloaded path "+data);
	        }
	    });
	});
	
	
	
	
});
</script>

</html>