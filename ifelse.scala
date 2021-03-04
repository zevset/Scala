val amount = 2.143
if (amount >0){
	"greater"
}else if (amount <0){
	"lesser"
}else{
	"same"
}
amount match{
	case x if x>0 => "greater"
	case x if x<0 => "lesser"
	case x => "same"
}
