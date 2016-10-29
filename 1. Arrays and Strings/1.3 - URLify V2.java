public void URLifyV2(char[] c, int trueLength){
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