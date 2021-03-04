def descTime(epochMs: Long) ={
	val secs = epochMs / 1000
	val days = secs / 86400
	val hours = (secs % 86400)/3600
	val minutes = (secs % 3600)/60
	val seconds = secs%60
	s"$days days,$hours hours,$minutes minutes, $seconds seconds"
}
descTime(123456789000L)
