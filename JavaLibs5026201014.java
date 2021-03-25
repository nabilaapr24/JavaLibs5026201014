import javax.swing.JOptionPane;

public class JavaLibs5026201014 {
	public static void main(String[] args){
		int MathAge, MathFamily, MathSalary, YourAge, YourNumber,YourSalary;
		double MathScore, YourGrade;
		String YourRole, HouseRole;
		HouseRole = "Wife";
		JOptionPane.showMessageDialog(null, "Hello, I'm Arry, your future planner. But I can't plan it alone, I need you to help");
		String YourName = JOptionPane.showInputDialog(null, "First of all, what is your name?");
		String[] acceptableValues = {"Male", "Female"};
		YourRole = (String)JOptionPane.showInputDialog(null, "Please select your gender below", "Future Plan",2,null,acceptableValues,acceptableValues[1]);
		if (YourRole == "Female") {
			HouseRole = "wife"; }
		else if (YourRole == "Male"){
			HouseRole = "husband"; }
		YourAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Before we continue, I need to know your age first."));
		String YourCollege = JOptionPane.showInputDialog(null, "Whoa, that's a good age to learn, " + YourName + ". Now, I want to know where do you study at?");
		String YourMajor = JOptionPane.showInputDialog(null, "Such a good campus to study. Hmm, then what's your major?");
		YourGrade = Double.parseDouble(JOptionPane.showInputDialog(null, "Wow! I've always want to go there. Now, it's maybe a secret, but from 1 to 4, how high your expecting GPA will be?"));
		MathScore = YourGrade * 25;
		JOptionPane.showMessageDialog(null, "Cool! Now, we shall move on to the future plan section.");
		String YourDreamJob = JOptionPane.showInputDialog(null, "I'm pretty curious, after graduating from " + YourMajor + " of " + YourCollege + ", what will your dream job be?");
		String YourDreamCompany = (String)JOptionPane.showInputDialog(null, "Wow, I can't wait to see! But, where will you work at?","Future Plan",2,null,null, "Please tell me your dream company...");
		YourSalary = Integer.parseInt(JOptionPane.showInputDialog(null, "Fantastic! You have such a big dream! Now I'm curious how much should the company pay you in IDR?"));
		JOptionPane.showMessageDialog(null, "Thank you for letting me know! Now, the final section about you and your future family.");
		String YourCrush = JOptionPane.showInputDialog(null, "First thing you need to build a family is to have a partner. Please name me someone that you think would be your LOML?");
		YourNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Such a lovely couple! But, how many child(ren) you guys are going to have?"));
		String YourHouse = JOptionPane.showInputDialog(null, "Interesting, could you now describe your dream house in a sentence?");
		String YourMessage = JOptionPane.showInputDialog(null, "Almost done. Now, please write some message for your future self!");
		MathAge = YourAge + 15;
		MathFamily = YourNumber + 2;
		MathSalary = YourSalary / 100 * 225 * 12;
		JOptionPane.showMessageDialog(null, "Great Job! Your future planner is set.");
		JOptionPane.showMessageDialog(null, "Hey, don't leave yet! My system got a new message!");
		JOptionPane.showMessageDialog(null,"Hello, this is " + YourName + ", the future " + MathAge + "-years-old you,"
		+ "\n" + "No one knows, but your future now is exactly the same with your answer today, surprised yet!?"
		+ "\n" + "Because of your answer, now I live in " + YourHouse + " as a happy " + HouseRole + " of your all time crush, " + YourCrush + ", with " + YourNumber + " child(ren)."
		+ "\n" + "Our family is now consists of " + MathFamily + " persons."
		+ "\n" + "After graduating from " + YourMajor + " of " + YourCollege + ", I work as a " + YourDreamJob + " on " + YourDreamCompany + " with more than IDR " + MathSalary + " per years."
		+ "\n" + "I am very happy to let you know that our first child's math score is " + MathScore + ", thanks to your grade."
		+ "\n" + "Anyway, thanks for your message, " + YourMessage + ", I remember it always and succeeded in avoiding unwanted things."
		+ "\n" + "Thanks for planning such a good future, myself. I love you!");
		
		}
		
}