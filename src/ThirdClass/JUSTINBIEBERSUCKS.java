package ThirdClass;

public class JUSTINBIEBERSUCKS {
public static void main(String[] args) {
	 int a=2;
	for (int i = 0; i < 3; i++) {
		speak("Baby");
		}
	 if(a==2){
		 speak("oh");
	 }
for (int j = 0; j < 3; j++) {
	
speak("Baby");
}
}
static void speak(String words) {
  	 try {
  		 Runtime.getRuntime().exec("say " + words).waitFor();
  	 } catch (Exception e) {
  		 e.printStackTrace();
  	 }
}
}
