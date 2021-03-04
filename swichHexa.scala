val color = "magenta"
color match{
	case "cyan" => "00ffff"
	case "magenta"=> "00ff00"
	case "yellow" => "ffff00"
	case x => {
		println(s"Didn´t expect $x !")
		"333333"
	}
}
