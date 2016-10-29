public String URLify(String str, int trueLength){
	int spaces = spaceCount(str, trueLength);
	int indexOfURL = trueLength + (spaces * 2);
	StringBuffer sb = new StringBuffer(indexOfURL);
	for(int i = 0; i < trueLength; i++){
		if(str.charAt(i) != ' '){
			sb.append(str.charAt(i));
		}
		else{
			sb.append("%20");
		}
	}
	return sb.toString();
}

public int spaceCount(String str, int trueLength){
	int count = 0;
	for(int i = 0; i < trueLength; i++){
		if(str.charAt(i) == ' '){
			count++;
		}
	}
	return count;
}