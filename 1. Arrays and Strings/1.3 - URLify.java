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



public void URLify(char[] c, int trueLength){
	int count = 0, index = 0;
	for(int i = 0; i < trueLength; i++){
		if(c[i] == ' '){
			count++;
		}
	}
	indexOfURL = trueLength + count * 2 - 1;
	for(int i = trueLength; i >= 0; i--){
		if(c[i] != ' '){
			c[indexOfURL] = c[i];
			indexOfURL--;
		}
		else{
			c[indexOfURL] = '0';
			c[indexOfURL - 1] = '2';
			c[indexOfURL - 2] = '%';
			indexOfURL -= 3;
		}
	}
}