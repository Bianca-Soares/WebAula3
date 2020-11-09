package servletsExerc;

import java.sql.Time;
import java.util.Date;

public class Msg {
private String text;
private String data;
private String time;

public Msg(String text, String date, String time) {
	this.text = text;
	this.data = date;
	this.time = time;
}


public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}


public String getData() {
	return data;
}


public void setData(String data) {
	this.data = data;
}


public String getTime() {
	return time;
}


public void setTime(String time) {
	this.time = time;
}




}
