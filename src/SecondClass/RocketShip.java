package SecondClass;

import java.io.IOException;

public class RocketShip {
public static void main(String[] args) throws InterruptedException, IOException {
for (int i = 10; i >=0 ; i--) {
	Runtime.getRuntime().exec("say " + i).waitFor();	

if (i==0){
	String Blastoff= "Blastoff! SHUT UP!";
	Runtime.getRuntime().exec("say " + Blastoff).waitFor();	
}
	
}
}





}


