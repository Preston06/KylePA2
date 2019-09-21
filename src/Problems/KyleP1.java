package Problems;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

public class KyleP1 {

public static int getEncryptedNumber(int input){

int result = 0;

for(int i=0; i<4; i++){

int a = input % 10;

a = a + 7;

a = a % 10;

input = input/10;

result = result+ (a*(int)Math.pow(10, i));

}

result = getSwappedResult(result);

return result;

}

private static int getSwappedResult(int result) {

String input = Integer.toString(result);

char[] charInput = input.toCharArray();

for(int i=0; i<2; i++){

int j = i + 2;

char temp = charInput[i];

charInput[i] = charInput[j];

charInput[j] = temp;

}

StringBuffer sb = new StringBuffer();

for(int i=0; i<4; i++)

sb.append(charInput[i]);

return Integer.parseInt(sb.toString());

}



public static void main(String args[])throws IOException

{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

while(true){

System.out.println("Please input a 4 digit number: ");

int input = Integer.parseInt(br.readLine());

System.out.println("Your encrypted number is: "+getEncryptedNumber(input));

System.out.print("Do you wish to continue? (y/n): ");

String cont = br.readLine();

if(cont.charAt(0)=='y' || cont.charAt(0)=='Y')

continue;

else

System.exit(0);

}

}

}