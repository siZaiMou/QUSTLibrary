var str_puffix="D46813934756865AE055000000000001_D468139347";
var str_suffix="865AE055000000000001_D469A877A4FD9170E055000000000001";
var num=89;
var str;
for(var i=0;i<18;i++)
{
	var num1=num+i;
	num1=num1.toString(16).toUpperCase();
	str=str_puffix+num1+str_suffix;
	document.getElementsByName(str)[0].checked=true;
}
document.getElementById("btn_xspj_tj").click();