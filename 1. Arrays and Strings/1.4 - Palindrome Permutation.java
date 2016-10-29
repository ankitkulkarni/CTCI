public boolean isPermutationOfPalindrome(String str){
	int[] table = new table[character.getNumericValue('z') - character.getNumericValue('a') + 1];
	int countOdd = 0;
	for(int i = 0; i < str.length(); i++){
		int charValue = getNumericValue(str.charAt(i));
		if(charValue != -1){
			table[charValue]++;
			if(table[charValue] % 2 == 1){
				countOdd++;
			}
			else{
				countOdd--;
			}
		}
	}
	return (charValue <= 1);
}

int getNumericValue(char c){
	int z = character.getNumericValue('z');
	int a = character.getNumericValue('a');
	int c = character.getNumericValue('c');
	if(c => a && c <= z){
		return (c - a);
	}
	return -1;
}