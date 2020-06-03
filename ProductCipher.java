import java.util.*;

class ProductCipher
{
	 
	public static void main(String args[]){
		String input,output,input2,decrypt;
		output="";
		int num;
		char[][] matrix = new char[10][10];
		System.out.println();
		System.out.println("Encrytion Process:");
		System.out.println();
		System.out.println("Enter an input:");

		Scanner sc=new Scanner(System.in);
		
		input=sc.nextLine();
		System.out.println();
		System.out.println("Enter key value:");
		input2=input.toLowerCase();
		num=sc.nextInt();

		for (int i=0;i<input2.length() ;i++ ) {
			if(input2.charAt(i)+num>122){
				output+=(char)(input2.charAt(i)+num-26);

			}
			else{
				output+=(char)((input2.charAt(i)+num));
			}}
		


		int matrixSize = (int)Math.sqrt(output.length())+1;
		int k=0;
		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		       if(k<output.length())     {
		       	 matrix[i][j] = output.charAt(k);
		       }
		       else   {
		       	matrix[i][j]='{';
		       }
		        k++;


		    }
		}
		char[][] matrixT = new char[10][10];

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		    	matrixT[i][j]=matrix[j][i];
		    }}
		System.out.println();
		System.out.println("Matrix representation:");
		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}
		System.out.println();
		System.out.println("Transpose of matrix:");

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		        System.out.print(matrixT[i][j]);
		    }
		    System.out.println();
		}
		System.out.println();
		System.out.println("The Encrypted message is as follows:");

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		    	System.out.print(matrixT[i][j]);
		       
		    }
		}
		System.out.println();
		System.out.println();
		System.out.println("Decryption:");

		System.out.println("Enter the encrypted string");
		Scanner sc2=new Scanner(System.in);
		decrypt=sc2.nextLine();
		k=0;
		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		       if(k<decrypt.length())    {
		       	 matrix[i][j] = decrypt.charAt(k);
		       }
		       else		       {
		       	matrix[i][j]='{';
		       }
		        k++;
		    }}

		System.out.println("Matrix representation:");
		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		        System.out.print(matrix[i][j]);
		    }
		    System.out.println();
		}

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		    	matrixT[i][j]=matrix[j][i];
		    }
		}

		System.out.println("Transpose of matrix:");

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		        System.out.print(matrixT[i][j]);
		    }
		    System.out.println();
		}
		output="";

		for(int i = 0; i<matrixSize; i++) {
		    for(int j = 0; j<matrixSize; j++){
		    	if(matrixT[i][j]!='{'){
		        output+=(char)(matrixT[i][j]-num);
		}}}
		System.out.println("The decrypted message is:");
		System.out.println(output);
	}}
