public boolean oneAway(String s, String t){
	if(s.length() - t.length() == 1 || s.length == t.length){
		return checkOneAway(s, t);
	}
	else if(t.length() - s.length() == 1){
		return checkOneAway(t, s);
	}
	else{
		return false;
	}
}

boolean checkOneAway(String s, String t){
	int index1 = 0, index2 = 0, count = 0;
	while(index2 < t.length() && index1 < s.length()){
		if(count < 2){
			if(s.charAt(index1) == t.charAt(index2)){
				index1++;
				index2++;
			}
			else{
				index2++;
				count++;
			}
		}
		else{
			return false;
		}
	}
	return true;
}