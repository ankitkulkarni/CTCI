public boolean oneAway(String s, String t){
	if(s.length() == t.length()){
		return checkReplace(s, t);
	}
	else if(s.length() - t.length() == 1){
		return checkOneEdit(s, t);
	}
	else if(t.length() - s.length() == 1){
		return checkOneEdit(t, s);
	}
	else{
		return false;
	}
}

boolean checkReplace(String s, String t){
	int count = 0;
	for(int i = 0; i < s.length(); i++){
		if(count < 2){
			if(s.charAt(i) == t.charAt(i)){
				continue;
			}
			else{
				count++;
			}
		}
		else{
			return false;
		}
	}
	return true;
}

boolean checkOneEdit(String s, String t){
	int index1 = 0, index2 = 0, count = 0;
	for(int i = 0; i < s.length(); i++){
		if(count < 2){
			if(s.charAt(i) == t.charAt(i)){
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