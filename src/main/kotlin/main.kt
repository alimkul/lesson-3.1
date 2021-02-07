fun main(){
   val sec=86340
    agoToText(sec)
}
//82800
fun agoToText( sec:Int) {
when(sec){
    in 0 .. 60 -> print("был(а) в сети только что")
    in 61 .. 60 * 60 -> print("был(а) в сети ${sec/60} ${secondsToMinutesText(sec)} назад")
    in 60 * 60 + 1 .. 24 * 60 * 60 -> print("был(а) в сети "+secondsToHoursText(sec))
    in 24 * 60 *60 +1 .. 2 *24 * 60 *60 ->print("был(а) в сети сегодня")
    in  2 *24 * 60 * 60 + 1 .. 3 *24 * 60 *60 ->print("был(а) в сети вчера")
    else ->print("был(а) в сети давно")

}
    //18:04
}
fun secondsToMinutesText(sec: Int): String{
    var mess :String=""
    if(( sec/60)%10 ==0 || (sec/60)%10>=5  ||(sec/60)==11 )
        mess="минут"
else if( (sec/60)!=11 && (sec/60)%10<=1)
        mess="минуту"
else
        mess="минуты"

    return mess
}
fun secondsToHoursText(sec : Int):String{
    var mess :String=""
    if(sec/3600==1)mess==" час назад"
    else if(sec/3600==2 || sec/3600==3){
        mess="${sec/3600} часа назад"
    }
    else{
       val hours=sec/3600
        val minute:Int=(sec-hours*3600)/60;
        if(minute>=10)
            mess="${hours}:${minute}"
        else
            mess="${hours}:0${minute}"


    }

    return mess
}

