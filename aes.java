class aes{

//	static String [][] sboxes = {
//		{"63", "7C", "77", "7B", "F2","6B", "6F", "C5","30", "01", "67", "2B", "FE", "D7", "AB", "76",},
//		{"CA", "82", "C9", "7D", "FA", "59", "47", "F0", "AD", "D4", "A2", "AF", "9C", "A4", "72", "C0",},
//		{"B7", "FD", "93", "26", "36", "3F", "F7", "CC", "34", "A5", "E5", "F1", "71", "D8", "31", "15",},
//		{"04", "C7", "23", "C3", "18", "96", "05", "9A", "07", "12", "80", "E2", "EB", "27", "B2", "75",},
//		{"09", "83", "2C", "1A", "1B", "6E", "5A", "A0", "52", "3B", "D6", "B3", "29", "E3", "2F", "84",},
//		{"53", "D1", "00", "ED", "20", "FC", "B1", "5B", "6A", "CB", "BE", "39", "4A", "4C", "58", "CF",},
//		{"D0", "EF", "AA", "FB", "43", "4D", "33", "85", "45", "F9", "02", "7F", "50", "3C", "9F", "A8",},
//		{"51", "A3", "40", "8F", "92", "9D", "38", "F5", "BC", "B6", "DA", "21", "10", "FF", "F3", "D2",},
//		{"CD", "0C", "13", "EC", "5F", "97", "44", "17", "C4", "A7", "7E", "3D", "64", "5D", "19", "73",},
//		{"60", "81", "4F", "DC", "22", "2A", "90", "88", "46", "EE", "B8", "14", "DE", "5E", "0B", "DB",},
//		{"E0", "32", "3A", "0A", "49", "06", "24", "5C", "C2", "D3", "AC", "62", "91", "95", "E4", "79",},
//		{"E7", "C8", "37", "6D", "8D", "D5", "4E", "A9", "6C", "56", "F4", "EA", "65", "7A", "AE", "08",},
//		{"BA", "78", "25", "2E", "1C", "A6", "B4", "C6", "E8", "DD", "74", "1F", "4B", "BD", "8B", "8A",},
//		{"70", "3E", "B5", "66", "48", "03", "F6", "0E", "61", "35", "57", "B9", "86", "C1", "1D", "9E",},
//		{"E1", "F8", "98", "11", "69", "D9", "8E", "94", "9B", "1E", "87", "E9", "CE", "55", "28", "DF",},
//		{"8C", "A1", "89", "0D", "BF", "E6", "42", "68", "41", "99", "2D", "0F", "B0", "54", "BB", "16",},
//	};

	static String [][] sboxes = {
		{"63", "7C", "77", "7B", "F2","6B", "6F", "C5","30", "01", "67", "2B", "FE", "D7", "AB", "76",},
		{"CA", "82", "C9", "7D", "FA", "59", "47", "F0", "AD", "D4", "A2", "AF", "9C", "A4", "72", "C0",},
		{"B7", "FD", "93", "26", "36", "3F", "F7", "CC", "34", "A5", "E5", "F1", "71", "D8", "31", "15",},
		{"04", "C7", "23", "C3", "18", "96", "05", "9A", "07", "12", "80", "E2", "EB", "27", "B2", "75",},
		{"09", "83", "2C", "1A", "1B", "6E", "5A", "A0", "52", "3B", "D6", "B3", "29", "E3", "2F", "84",},
		{"53", "D1", "00", "ED", "20", "FC", "B1", "5B", "6A", "CB", "BE", "39", "4A", "4C", "58", "CF",},
		{"D0", "EF", "AA", "FB", "43", "4D", "33", "85", "45", "F9", "02", "7F", "50", "3C", "9F", "A8",},
		{"51", "A3", "40", "8F", "92", "9D", "38", "F5", "BC", "B6", "DA", "21", "10", "FF", "F3", "D2",},
		{"CD", "0C", "13", "EC", "5F", "97", "44", "17", "C4", "A7", "7E", "3D", "64", "5D", "19", "73",},
		{"60", "81", "4F", "DC", "22", "2A", "90", "88", "46", "EE", "B8", "14", "DE", "5E", "0B", "DB",},
		{"E0", "32", "3A", "0A", "49", "06", "24", "5C", "C2", "D3", "AC", "62", "91", "95", "E4", "79",},
		{"E7", "C8", "37", "6D", "8D", "D5", "4E", "A9", "6C", "56", "F4", "EA", "65", "7A", "AE", "08",},
		{"BA", "78", "25", "2E", "1C", "A6", "B4", "C6", "E8", "DD", "74", "1F", "4B", "BD", "8B", "8A",},
		{"70", "3E", "B5", "66", "48", "03", "F6", "0E", "61", "35", "57", "B9", "86", "C1", "1D", "9E",},
		{"E1", "F8", "98", "11", "69", "D9", "8E", "94", "9B", "1E", "87", "E9", "CE", "55", "28", "DF",},
		{"8C", "A1", "89", "0D", "BF", "E6", "42", "68", "41", "99", "2D", "0F", "B0", "54", "BB", "16",},
	};
	
	//CHANGE KEY HERE
	static String key = "7750f228896eb4561b9cd67497aad0b1";

	//ADD PLAINTEXT TO ARRAY HERE
	static String[] plaintext= {
	      "27153a16906ef425d078796f71569cbe",
              "b6f2d9b55d607b9a3e23cb4b9e133a18",
              "1a9d31f65a985ae9dfb6344cc90ec75b",
              "4e90a7cd0d8bce7285161377f0fd6fca"};


	static int [][] keySchedule = new int [44][4];

	//Converts hex bytes to decimal array
	static int[][] byte2array(String bytes){

		int [][] arr= new int[4][4];
		int index1=0;
		int index2=0;
		for(int i=0;i<32;i+=2){

			arr[index1][index2]=Integer.parseInt(bytes.substring(i,i+2),16);
			index2++;
			if(index2==4) {
				index1++;
				index2=0;
			}
		}
		return arr;
	}

	//Converts decimal values to hex String
	static String array2hex(int [][] array){
		String plaintext="";
		String temp="";

		for(int i=0;i<array.length;i++){

			for(int j=0;j<array[0].length;j++){

				temp=Integer.toHexString(array[i][j]);
				if(temp.length()==1) temp= "0"+temp;  //Padding to length 2
				plaintext+=temp;
			}
		}
		return plaintext;
	}

	static void print2darray(int [][]array){

		for(int i=0;i<array.length;i++){

			for(int j=0;j<array[0].length;j++){
				System.out.print(array[i][j]+" \t");
			}
			System.out.println("\n");
		}
	}

	//Convert decimal to bit String
	static String convertToBitString(int value){

		String binary = Integer.toBinaryString(value);
		for(int i=0;i<binary.length()%8;i++) binary="0"+binary; //Padding of 8
		return binary;
	}


	//Substituting bytes
	static int[][] substituteBytes(int [][] array){

		for(int i=0;i<array.length;i++){

			for(int j=0;j<array[0].length;j++){
				String binary= convertToBitString(array[i][j]);
				array[i][j]= Integer.parseInt(sboxes[Integer.parseInt(binary.substring(0,4),2)][Integer.parseInt(binary.substring(4,8),2)],16);
			}
		}
		return array;
	}

	//Shifting rows
	static int[][] shiftRows(int [][]array){

		array= swapMatrix(array);
		int [][] shiftedarray= new int [4][4];
		for(int i=0;i<array.length;i++){

			for(int j=0;j<array[0].length;j++){
				shiftedarray[i][j]=array[i][(j+i)% array[0].length];
			}
			
		}

		shiftedarray= swapMatrix(shiftedarray);

		return shiftedarray;

	}

	//Getting keySchedule
	static int[][] getKeySchedule(int [][] array){

		keySchedule[0]= array[0].clone();
		keySchedule[1]= array[1].clone();
		keySchedule[2]= array[2].clone();
		keySchedule[3]= array[3].clone();
		int [] unshiftedArray = new int [4];
		for(int i=4;i<keySchedule.length;i++){
			unshiftedArray=keySchedule[i-4];// -4 

			for(int j=0;j<keySchedule[0].length;j++){
				keySchedule[i][j]=unshiftedArray[(unshiftedArray.length-1+j)% unshiftedArray.length]; // rotating right by 1
			}
		}
		return keySchedule;
	}

	static int[][] addRoundKeys(int [][]array,int start){


		for(int i=0;i<4;i++){ // every word

			array[i]=xorWord(array[i],keySchedule[start]);
			start++;

		}

		return array;

	}

	//Gets the column of given index of a 2d array
	static int[] getColumn(int [][]array,int index){

		int [] columns= new int [array.length];

		for(int i=0;i<array[0].length;i++){
			columns[i]=array[i][index];
		}

		return columns;
	}

	//Xors word
	static int[] xorWord(int []array,int[] key){

		int xorWords [] = new int [array.length];

		for(int i=0;i<xorWords.length;i++){
			xorWords[i]=array[i]^key[i];
		}
		return xorWords;
	}

	//Swap rows and columns of matrix
	private static int[][] swapMatrix(int[][] array) {
	
	        int originalTotalRows = array.length;
	        int originalTotalColumns = array[0].length;
	
	        int[][] newMatrix = new int[originalTotalColumns][originalTotalRows];
	
	        for(int i=0; i< originalTotalRows; i++){
	            for(int j=0; j < originalTotalColumns; j++){

	                newMatrix[j][i] = array[i][j];
	            }
	        }
	        return newMatrix;
	    }



	public static void main(String[]args){


		for(int i=0;i<plaintext.length;i++){
			//GET KEY SCHEDULE
			keySchedule=getKeySchedule(byte2array(key));
			int [][] stateArray=(byte2array(plaintext[i]));
			//INITIAL ADD ROUND KEYS
			stateArray=addRoundKeys(stateArray,0);

			for(int j=1;j<11;j++){

				//SUBSTITUE
				stateArray=substituteBytes(stateArray);
				//SHIFT ROWS
				stateArray=shiftRows(stateArray);
				//ADD ROUND KEYS
				stateArray=addRoundKeys(stateArray,j*4);

			}

			System.out.println(array2hex(stateArray));
		}


	}
}
