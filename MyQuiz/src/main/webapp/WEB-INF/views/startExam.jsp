<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>
.content {
  max-width: 500px;
  margin: auto;
}



label, input {
  display: block; /* 1. oh noes, my inputs are styled as block... */
}
</style>
<meta charset="ISO-8859-1">
<title>Start Exam</title>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.js"></script>
   <script src="<c:url value="/js/home.js"/>" type="text/javascript"></script>
</head>
<body bgcolor=#ffffff>
<div class="content">
<h3>${examQuestions.examDescrption}</h3>

<input type="hidden" id="examId" value="${examId}">

<h4 id="question"></h4>
<div id="radioId">
<input type="radio"  name="ans" id="a1" style="display: inline-block; width: 20px;" value="a"><p style="display: inline-block;"  id="a"></p>

<br>
<input type="radio" name="ans" id="a2" style="display: inline-block; width: 20px;" value="b"><p style="display: inline-block; "id="b"></p>
<br>
<input type="radio" name="ans" id="a3" style="display: inline-block; width: 20px;" value="c"><p style="display: inline-block;" id="c"></p>
<br>
<input type="radio" name="ans" id="a4" style="display: inline-block; width: 20px;" value="d"><p style="display: inline-block;" id="d"></p><br>

</div>


<div id="textid">
<input type="text" name="correctAnswer" id="correctAnswer" >
<br>
</div>

<div id="booleanId">
<input type="radio" value="True" id="a5" name="bollen" style="display: inline-block; width: 20px;"> <p style="display: inline-block;">True</p><br>
<input type="radio" value="False"  id="a6" name="bollen" style="display: inline-block; width: 20px;"><p style="display: inline-block;" >Flase</p><br>

</div>
<input type="hidden" id="correctAnsId">
<input type="hidden" id="questionId">
<input type="hidden" id="typeofquestionId">

<input type="button" id="btnNextQuestion" value="Next Question"><br>
<input type="button" id="subtId" value="Submit" onclick="window.location.href='/submitExam'">

</body>
<script type="text/javascript">
$(document).ready(function() {

	debugger;
	var examId=$("#examId").val();
	getQuestions(0);
	
	
	$("#btnNextQuestion").click(function() {
		debugger;
		var questionId=$("#questionId").val();
		var correctAnswer=$("#correctAnsId").val();
		var userSelectdAnswer="";
		var typeofquestion=$("#typeofquestionId").val();
		if(typeofquestion=='MCQ'){
			 userSelectdAnswer = $("input[name='ans']:checked").val();
		}else if(typeofquestion=='TEXT'){
			 userSelectdAnswer=$("#correctAnswer").val();
		}else{
			userSelectdAnswer = $("input[name='bollen']:checked").val();
		}
		
		getQuestions(questionId,userSelectdAnswer,correctAnswer);
		
	});
	function getQuestions(questionId,userSelectdAnswer,correctAnswer){
		
		 formData = {
				 questionId : questionId,
				 userSelectdAns : userSelectdAnswer,
				 correctAns :correctAnswer,
				}
		
		var userAns = $("input[name='ans']:checked").val();
		userAns="";
		$.ajax({
			type : "POST",
			url : "/getQuestionsById",
			dataType : 'json',
			data : JSON.stringify(formData),
			contentType : "application/json;charset=UTF-8",
			xhrFields : {
				withCredentials : true
			},
			success : function(data) {
				clearData();
			 	if(data.typeOfQuestion=='MCQ'){ 
			 		$("#textid").hide()
			 		$("#booleanId").hide();
			 		$("#radioId").show();
			 		$("#question").text(data.questionText);
					$("#a").text(data.optionA);
					$("#b").text(data.optionB);
					$("#c").text(data.optionC);
					$("#d").text(data.optionD);
					
			 	}
			 	if(data.typeOfQuestion=='TEXT'){ 
			 		$("#radioId").hide();
			 		$("#booleanId").hide();
			 		$("#textid").show();
			 		$("#correctAnswer").val("");
				}
			 	
			 	if(data.typeOfQuestion=='BOOLEAN'){ 
			 		
			 		$("#radioId").hide();
			 		$("#textid").hide();
			 		$("#booleanId").show();
			 		
			 	}
			 	
			 	$("#correctAnsId").val(data.correctAnswer);
			 	$("#questionId").val(data.questionId);
			 	$("#question").text(data.questionText);
			 	$("#typeofquestionId").val(data.typeOfQuestion);
			},
			error : function(xhr, status, error) {
				$("#question").text("Exam Complted..Please Submit the Exam");
				$("#radioId").hide();
		 		$("#textid").hide();
		 		$("#booleanId").hide();
				$("#btnNextQuestion").hide();
			},
		});
	}
	
	function clearData(){
		$("#a1").prop("checked", false);
		$("#a2").prop("checked", false);
		$("#a3").prop("checked", false);
		$("#a4").prop("checked", false);
		$("#a5").prop("checked", false);
		$("#a6").prop("checked", false);
	}
});
</script>

</html>